package com.example.demo.controller.baseController;


import com.example.demo.domain.entity.User;
import com.example.demo.domain.vo.JsonResult;
import com.example.demo.repos.UserRepos;
import com.example.demo.util.DESUtil;
import com.example.demo.util.UserUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
  private final UserRepos userRepos;
  private final UserUtil userUtil;

  @Autowired
  public UserController(UserRepos userRepos, UserUtil userUtil) {
    this.userRepos = userRepos;
    this.userUtil = userUtil;
  }


  @RequestMapping(value = "/set", produces = {"application/json"})
  public String set(@RequestParam("id") int id,
                    @RequestParam("name") String name,
                    @RequestParam("password") String password,
                    @RequestParam("phone") String phone,
                    @RequestParam("token") String token
  ) throws UnsupportedEncodingException {
    System.out.println(token);
    if (userUtil.checkAdmin(token)) {
      String pwd = DESUtil.encrypt(password, "12345678");
      userRepos.save(new User(id, name, pwd, new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()),
          phone, "true", "user", ""));
      return new JsonResult(0, "true").toString();
    } else {
      return new JsonResult(1, "权限不足").toString();
    }
  }
  @RequestMapping(value = "/change", produces = {"application/json"})
  public String update(@RequestParam("id") int id,
                    @RequestParam("name") String name,
                    @RequestParam("password") String password,
                    @RequestParam("phone") String phone,
                    @RequestParam("token") String token
  ) throws UnsupportedEncodingException {

    if (userUtil.checkAdmin(token)) {
      String pwd = DESUtil.encrypt(password, "12345678");
      userRepos.save(new User(id, name, pwd, new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()),
          phone, "true", "user", ""));
      return new JsonResult(0, "true").toString();
    } else {
      return new JsonResult(1, "权限不足").toString();
    }
  }
  @RequestMapping(value = "/del", produces = {"application/json"})
  public String del(@RequestParam("token") String token, @RequestParam("id") Integer id) throws UnsupportedEncodingException {
    if (userUtil.checkAdmin(token)) {
      userRepos.deleteById(id);
      return new JsonResult(0, "true").toString();
    } else {
      return new JsonResult(1, "权限不足").toString();
    }

  }

  @Transactional
  @RequestMapping(value = "/login", produces = {"application/json"})
  public void login(@RequestParam("name") String name,
                    @RequestParam("password") String password,
                    HttpServletResponse httpServletResponse,
                    HttpSession session
  ) throws Exception {
    User u = userRepos.getOne(Integer.parseInt(name));
    if (u == null) {
      httpServletResponse.sendRedirect("/login?code=2&msg=user not find");
      return;
    } else {
      if (u.getAble().equals("false")) {
        httpServletResponse.sendRedirect("/login?code=3&msg=user is unable");
        return;
      } else if (!password.equals(DESUtil.decrypt(u.getPassword(), "12345678"))) {
        httpServletResponse.sendRedirect("/login?code=1&msg=password or username is wrong");
        return;
      }
    }
    Integer random = new Random().nextInt();
    session.setAttribute("random", random);
    httpServletResponse.sendRedirect("/manage?token=" + URLEncoder.encode(name, "utf-8") + "&random=" + random);
  }

  @RequestMapping(value = "/findAllUser", produces = {"application/json"})
  public String findAllUser(@RequestParam("page") int page,
                            @RequestParam("limit") int limit) {
    System.out.println(page + "," + limit);
    Page<User> p = userRepos.findAll(new PageRequest(page - 1, limit));
    List<User> usersList = p.getContent();
    JSONArray jsonArray = new JSONArray();
    for (User user : usersList) {
      jsonArray.put(new JSONObject(user));
    }
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("code", 0);
    jsonObject.put("msg", "");
    jsonObject.put("count", p.getTotalElements());
    jsonObject.put("data", jsonArray);
    return jsonObject.toString();
  }

  @Transactional
  @RequestMapping(value = "/findById", produces = {"application/json"})
  public String findById(@RequestParam("id") String id) throws JsonProcessingException {
    User u = userRepos.getOne(Integer.parseInt(id));
    if (u != null) {
      return new JsonResult(0, u.toString()).toString();
    } else {
      return new JsonResult(1, "找不到此用户").toString();
    }
  }

  @Transactional
  @RequestMapping(value = "/update", produces = {"application/json"})
  public String update(@RequestParam("token") String token,
                       @RequestParam("id") Integer id,
                       @RequestParam("type") String type) throws UnsupportedEncodingException {
    if(Integer.parseInt(token)==id){
      return new JsonResult(2, "请勿给自己授权").toString();
    }
    if (userUtil.checkAdmin(token)) {
      User u = userRepos.getOne(id);
      u.setType(type);
      userRepos.save(u);
      return new JsonResult(0, "").toString();
    } else {
      return new JsonResult(1, "权限不足").toString();
    }
  }
}
