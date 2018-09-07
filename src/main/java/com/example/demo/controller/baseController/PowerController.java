package com.example.demo.controller.baseController;

import com.example.demo.domain.entity.Power;
import com.example.demo.domain.entity.UserPower;
import com.example.demo.domain.entity.UserPowerPK;
import com.example.demo.domain.vo.JsonResult;
import com.example.demo.repos.PowerRepos;
import com.example.demo.repos.UserPowerRepos;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/power")
@ResponseBody
public class PowerController {
  private final PowerRepos powerRepos;
  private final UserPowerRepos userPowerRepos;

  @Autowired
  public PowerController(PowerRepos powerRepos, UserPowerRepos userPowerRepos) {
    this.powerRepos = powerRepos;
    this.userPowerRepos = userPowerRepos;
  }

  @RequestMapping(value = "/findOwnByUser")
  public String findOwnByUser(@RequestParam("name") String name) {
    List<Power> powerList = powerRepos.findAllByName(name);
    JSONArray jsonArray = new JSONArray();
    for (Power p : powerList) {
      jsonArray.put(new JSONObject(p.toString()));
    }
    return jsonArray.toString();
  }

  @RequestMapping(value = "/findAll", produces = {"application/json"})
  public String findAll() {
    List<Power> powerList = powerRepos.findAll();
    JSONArray jsonArray = new JSONArray();
    for (Power p : powerList) {
      jsonArray.put(new JSONObject(p.toString()));
    }
    return jsonArray.toString();
  }

  @RequestMapping(value = "/findOtherByUser", produces = {"application/json"})
  public String findOtherByUser(@RequestParam("name") String name) {
    List<Power> powerList = powerRepos.findOtherByName(name);
    JSONArray jsonArray = new JSONArray();
    for (Power p : powerList) {
      jsonArray.put(new JSONObject(p.toString()));
    }
    return jsonArray.toString();
  }

  @RequestMapping(value = "/update", produces = {"application/json"})
  public String update(@RequestParam("name") String name,
                       @RequestParam("selected[]") int[] selected) {
//    总1234
//    已选123
//    原234
    //
    List<Power> powers = powerRepos.findAll();
    for (Power p : powers) {
      for (int i : selected) {
        if (p.getId() != selected[i]) {
          System.out.println(p.getId());
          userPowerRepos.delete(new UserPower(p.getId(), name));
        }
      }
    }
    for (int j : selected) {
      for (Power p : powers) {
        if (j != p.getId()) {
          System.out.println(j);
          userPowerRepos.save(new UserPower(j, name));
        }
      }
    }
    return new JsonResult(0, "").toString();
  }
}
