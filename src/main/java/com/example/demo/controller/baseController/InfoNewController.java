package com.example.demo.controller.baseController;

import com.example.demo.domain.entity.InfoNew;
import com.example.demo.domain.vo.JsonResult;
import com.example.demo.domain.vo.MultipleRegex;
import com.example.demo.repos.InfoNewRegexSpecification;
import com.example.demo.repos.InfoNewRepos;
import org.apache.poi.hssf.usermodel.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
    @RequestMapping(value = "searchByNameOrId", produces = {"application/json"})
    public String searchByNameOrId( @RequestParam("baseName") String name,@RequestParam("baseShenFenZheng") String id) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs1 = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://120.79.68.208:3306/Retirement_management_system", "root", "dyz13125219151YT");
            if(!id.equals("")){
                rs1 = conn.createStatement().executeQuery("SELECT * FROM Retirement_management_system.info_new WHERE base_shen_fen_zheng='"+id+"'");

            }else {
                rs1=conn.createStatement().executeQuery("SELECT * FROM Retirement_management_system.info_new WHERE base_name='"+name+"'");
            }
            JSONArray jsonArray=new JSONArray();
            List<InfoNew> list=new ArrayList<InfoNew>();
            while (rs1.next()) {
                InfoNew infoNew=new InfoNew();
                infoNew.setBaseName(rs1.getString("base_name"));
                infoNew.setBaseSex(rs1.getString("base_sex"));
                infoNew.setBaseJiGuan(rs1.getString("base_ji_guan"));
                infoNew.setBaseShenFenZheng(rs1.getString("base_shen_fen_zheng"));
                infoNew.setConnShouJiHaoMa(rs1.getString("conn_shou_ji_hao_ma"));
                infoNew.setBasePhotoUrl(rs1.getString("base_photo_url"));
                list.add(infoNew);
            }
            for(InfoNew infoNews:list){
                JSONObject infor = new JSONObject(infoNews);
                jsonArray.put(infor);
            }
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("code", 200);
            jsonObject.put("msg", "sucess");
            jsonObject.put("count",rs1.getRow());
            jsonObject.put("data", jsonArray);
            return jsonObject.toString();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return "error";
        }
}
