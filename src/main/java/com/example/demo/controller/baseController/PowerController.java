package com.example.demo.controller.baseController;

import com.example.demo.domain.entity.Power;
import com.example.demo.repos.PowerRepos;
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

  @Autowired
  public PowerController(PowerRepos powerRepos) {
    this.powerRepos = powerRepos;
  }

  @RequestMapping(value = "/findAllByUser",produces = {"application/json"})
  private String findAllByUser(@RequestParam("name") String name) {
    List<Power> powerList = powerRepos.findAllByName(name);
    JSONArray jsonArray = new JSONArray();
    for (Power p : powerList) {
      jsonArray.put(new JSONObject(p.toString()));
    }
    return jsonArray.toString();
  }

  @RequestMapping(value = "/findOtherByUser",produces = {"application/json"})
  private String findOtherByUser(@RequestParam("name") String name) {
    List<Power> powerList = powerRepos.findOtherByName(name);
    JSONArray jsonArray = new JSONArray();
    for (Power p : powerList) {
      jsonArray.put(new JSONObject(p.toString()));
    }
    return jsonArray.toString();
  }

}
