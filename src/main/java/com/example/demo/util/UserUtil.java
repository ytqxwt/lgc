package com.example.demo.util;

import com.example.demo.domain.entity.User;
import com.example.demo.repos.UserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserUtil {
  private final UserRepos userRepos;

  @Autowired
  public UserUtil(UserRepos userRepos) {
    this.userRepos = userRepos;
  }

  public Boolean checkAdmin(String token) {
    User u = userRepos.findByNameEquals(token);
    return u.getType().equals("admin");
  }
}
