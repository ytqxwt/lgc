package com.example.demo.controller.baseController;

import com.example.demo.domain.entity.InfoNew;
import com.example.demo.domain.vo.JsonResult;
import com.example.demo.domain.vo.MultipleRegex;
import com.example.demo.repos.InfoNewRegexSpecification;
import com.example.demo.repos.InfoNewRepos;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/baseInfo")
@ResponseBody
public class InfoNewController {
    private final InfoNewRepos infoNewRepos;


    @Autowired
    public InfoNewController(InfoNewRepos infoNewRepos) {
        this.infoNewRepos = infoNewRepos;
    }


    @RequestMapping(value = "/set", produces = {"application/json"})
    public String set(InfoNew baseInfo) {
        System.out.println(baseInfo.toString());
        infoNewRepos.save(baseInfo);

        return new JsonResult(0, "").toString();
    }

    @RequestMapping(value = "/findByPage", produces = {"application/json"})
    public String findByPage(@RequestParam("page") int page,
                             @RequestParam("limit") int limit) {
        System.out.println(page + "," + limit);
        Page<InfoNew> p = infoNewRepos.findAll(new PageRequest(page - 1, limit));
        List<InfoNew> baseInfoList = p.getContent();
        System.out.println("size:" + baseInfoList.size());
        JSONArray jsonArray = new JSONArray();
        for (InfoNew baseInfo : baseInfoList) {
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
        Page<InfoNew> p = infoNewRepos.findAll(new InfoNewRegexSpecification(params, mr), new PageRequest(page - 1, limit));
        List<InfoNew> baseInfoList = p.getContent();
        System.out.println("size:" + baseInfoList.size());
        JSONArray jsonArray = new JSONArray();
        for (InfoNew baseInfo : baseInfoList) {
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
