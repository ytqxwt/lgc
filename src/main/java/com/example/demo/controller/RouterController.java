package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Objects;

@Controller
@RequestMapping("/")
public class RouterController {
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index() {
    return "login";
  }

//  @RequestMapping(value = "", method = RequestMethod.GET)
//  public String index2() {
//    return "login";
//  }

  @RequestMapping("login")
  public String login() {
    return "login";
  }

  @RequestMapping("manage")
  public String manage(HttpSession session,
                       @RequestParam("random") Integer random) {
    if (Objects.equals(session.getAttribute("random"), random)) {
      return "manage";
    } else {
      return "login";
    }
  }

}
