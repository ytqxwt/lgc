package com.example.demo.util;

import com.example.demo.domain.entity.Power;
import com.example.demo.repos.PowerRepos;
import com.example.demo.repos.UserPowerRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PowerUtil {
  private final PowerRepos powerRepos;

  @Autowired
  public PowerUtil(PowerRepos powerRepos) {
    this.powerRepos = powerRepos;
  }

  public Integer getPower(Integer uId) {
    Power p = powerRepos.findByUserId(String.valueOf(uId));
    if (p == null) {
      return null;
    }
    return p.getId();
  }

  public boolean checkSuperAdmin(Integer uId) {
    Power p = powerRepos.findByUserId(String.valueOf(uId));
    if (p == null) {
      return false;
    }
    return p.getId() == 1;
  }

  public boolean checkAdmin(Integer uId) {
    Power p = powerRepos.findByUserId(String.valueOf(uId));
    if (p == null) {
      return false;
    }
    return p.getId() == 1 || p.getId() == 2;
  }

}
