package com.example.demo.controller.baseController;

import com.example.demo.domain.entity.User;
import com.example.demo.domain.vo.JsonResult;
import com.example.demo.repos.UserRepos;
import com.example.demo.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
  private final UserRepos userRepos;

  @Autowired
  public UserController(UserRepos userRepos) {
    this.userRepos = userRepos;
  }

  @RequestMapping(value = "/set", produces = {"application/json"})
  public String set(@RequestParam("name") String name,
                    @RequestParam("password") String password) throws Exception {
    MD5Utils.encrypt(password, "12345678");
    System.out.println(MD5Utils.encrypt(password, "12345678"));
    return new JsonResult(1, "").toString();
  }

  @RequestMapping(value = "/login", produces = {"application/json"})
  public String login(@RequestParam("name") String name,
                      @RequestParam("password") String password) throws Exception {
    User u = userRepos.findByNameEquals(name);
    if (u == null) {
      return new JsonResult(2, "用户不存在").toString();
    }
    if (u.getAble().equals("否")) {
      return new JsonResult(3, "用户被禁止").toString();
    }
    if (!password.equals(MD5Utils.decrypt(u.getPassword(), "12345678"))) {
      return new JsonResult(1, "密码错误").toString();
    }
    return new JsonResult(0, "").toString();
  }
}
