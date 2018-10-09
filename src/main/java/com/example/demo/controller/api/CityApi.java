package com.example.demo.controller.api;

import com.example.demo.domain.entity.City;
import com.example.demo.repos.CityRepos;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/city")
@ResponseBody
public class CityApi {
  private final CityRepos cityRepos;

  @Autowired
  public CityApi(CityRepos cityRepos) {
    this.cityRepos = cityRepos;
  }

  @RequestMapping(value = "/getCityToNativePlace", produces = {"application/json"})
  public String getCityToNativePlace() {
    JSONArray dataArray = new JSONArray();
    List<City> provinceList = cityRepos.findAllByLevelEquals(1);
    for (City c : provinceList) {
      JSONObject provinceObject = new JSONObject();
      provinceObject.put("name", c.getAreaname());
      provinceObject.put("value", String.valueOf(c.getId()));
      if (isDirectCity(c.getAreaname())) {
        provinceObject.put("children", new JSONArray());
      } else {
        JSONArray cityArray = new JSONArray();
        List<City> cityList = cityRepos.findAllByParentidEquals(c.getId());
        for (City city : cityList) {
          JSONObject o = new JSONObject();
          o.put("children", new JSONArray());
          o.put("name", city.getAreaname());
          o.put("value", String.valueOf(city.getId()));
          cityArray.put(o);
        }
        provinceObject.put("children", cityArray);
      }
      dataArray.put(provinceObject);
    }
    JSONObject result = new JSONObject();
    result.put("code", 0);
    result.put("msg", "success");
    result.put("data", dataArray);
    return result.toString();
  }

  private boolean isDirectCity(String city) {
    return city.equals("北京") || city.equals("天津") || city.equals("上海") || city.equals("重庆");
  }


}
