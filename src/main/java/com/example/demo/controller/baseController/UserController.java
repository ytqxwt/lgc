package com.example.demo.controller.baseController;

import com.example.demo.domain.vo.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/baseInfo")
@ResponseBody
public class UserController {
  @RequestMapping(value = "/login", produces = {"application/json"})
  public String login(@RequestParam("name") String name, @RequestParam("password") String password) {
    return new JsonResult(1, "").toString();
  }
}
