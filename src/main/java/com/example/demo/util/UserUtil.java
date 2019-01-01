package com.example.demo.util;

import com.example.demo.domain.entity.User;
import com.example.demo.repos.UserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;

@Service
public class UserUtil {
  private final UserRepos userRepos;

  @Autowired
  public UserUtil(UserRepos userRepos) {
    this.userRepos = userRepos;
  }

  @Transactional
  public Boolean checkAdmin(String token) {
    System.out.println(token);
    User u = userRepos.getOne(Integer.parseInt(token));
    return u.getType().equals("admin");
  }
}
