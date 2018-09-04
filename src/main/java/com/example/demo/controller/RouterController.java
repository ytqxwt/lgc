package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class RouterController {
  @RequestMapping(value = "", method = RequestMethod.GET)
  public String index() {
    return "index.html";
  }

  @RequestMapping(value = "base_add", method = RequestMethod.GET)
  public String base_add() {
    return "base_add.html";
  }
}
