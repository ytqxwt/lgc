package com.example.demo.controller.baseController;

import com.example.demo.domain.entity.BaseInfo;
import com.example.demo.domain.vo.JsonResult;
import com.example.demo.domain.vo.MultipleRegex;
import com.example.demo.repos.BaseInfoRegexSpecification;
import com.example.demo.repos.BaseInfoRepos;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/baseInfo")
@ResponseBody
public class BaseInfoController {
  private final BaseInfoRepos baseInfoRepos;

  @Autowired
  public BaseInfoController(BaseInfoRepos baseInfoRepos) {
    this.baseInfoRepos = baseInfoRepos;
  }

  @RequestMapping(value = "/set", produces = {"application/json"})
  public String set(BaseInfo baseInfo) {
    System.out.println(baseInfo.toString());
    baseInfoRepos.save(baseInfo);
    return new JsonResult(0, "").toString();
  }

  @RequestMapping(value = "/findByPage", produces = {"application/json"})
  public String findByPage(@RequestParam("page") int page,
                           @RequestParam("limit") int limit) {
    System.out.println(page + "," + limit);
    Page<BaseInfo> p = baseInfoRepos.findAll(new PageRequest(page - 1, limit));
    List<BaseInfo> baseInfoList = p.getContent();
    System.out.println("size:" + baseInfoList.size());
    JSONArray jsonArray = new JSONArray();
    for (BaseInfo baseInfo : baseInfoList) {
      jsonArray.put(new JSONObject(baseInfo));
    }
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("code", 0);
    jsonObject.put("msg", "");
    jsonObject.put("count", p.getTotalElements());
    jsonObject.put("data", jsonArray);
    return jsonObject.toString();
  }

  @RequestMapping(value = "searchByMultipleRegex", produces = {"application/json"})
  public String searchByMultipleRegex(MultipleRegex mr,
                                      @RequestParam("page") int page,
                                      @RequestParam("limit") int limit) {
    System.out.println(mr);
    System.out.println(mr.getSelect());
    String[] params = mr.getSelect().split(",");
    Page<BaseInfo> p = baseInfoRepos.findAll(new BaseInfoRegexSpecification(params, mr), new PageRequest(page - 1, limit));
    List<BaseInfo> baseInfoList = p.getContent();
    System.out.println("size:" + baseInfoList.size());
    JSONArray jsonArray = new JSONArray();
    for (BaseInfo baseInfo : baseInfoList) {
      jsonArray.put(new JSONObject(baseInfo));
    }
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("code", 0);
    jsonObject.put("msg", "");
    jsonObject.put("count", p.getTotalElements());
    jsonObject.put("data", jsonArray);
    return jsonObject.toString();
  }
}
