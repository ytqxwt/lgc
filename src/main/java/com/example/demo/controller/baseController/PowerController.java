package com.example.demo.controller.baseController;

import com.example.demo.domain.entity.Power;
import com.example.demo.domain.entity.UserPower;
import com.example.demo.domain.vo.JsonResult;
import com.example.demo.repos.PowerRepos;
import com.example.demo.repos.UserPowerRepos;
import com.example.demo.repos.UserRepos;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/power")
@ResponseBody
public class PowerController {
  private final PowerRepos powerRepos;
  private final UserPowerRepos userPowerRepos;
  private final UserRepos userRepos;

  @Autowired
  public PowerController(PowerRepos powerRepos, UserPowerRepos userPowerRepos, UserRepos userRepos) {
    this.powerRepos = powerRepos;
    this.userPowerRepos = userPowerRepos;
    this.userRepos = userRepos;
  }

  @RequestMapping(value = "/findOwnByUser", produces = {"application/json"})
  public String findOwnByUser(@RequestParam("name") String name) {
    List<Power> powerList = powerRepos.findAllByName(name);
    JSONArray jsonArray = new JSONArray();
    for (Power p : powerList) {
      jsonArray.put(new JSONObject(p.toString()));
    }
    return jsonArray.toString();
  }

  public List<Integer> findPowerListByUser(String name) {
    List<Power> powerList = powerRepos.findAllByName(name);
    List<Integer> list = new ArrayList<>();
    for (Power p : powerList) {
      list.add(p.getId());
    }
    return list;
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
    int uId = userRepos.findByNameEquals(name).getId();
    List<Integer> powers = powerRepos.findAllId();
    for (int p : powers) {
      for (int i : selected) {
        if (p != i) {
          System.out.println(p);
          userPowerRepos.save(new UserPower(uId, p));
        }
      }
    }
    for (int j : selected) {
      for (int p : powers) {
        if (j != p) {
          System.out.println(j);
          userPowerRepos.delete(new UserPower(uId, j));
        }
      }
    }
    return new JsonResult(0, "").toString();
  }
}
