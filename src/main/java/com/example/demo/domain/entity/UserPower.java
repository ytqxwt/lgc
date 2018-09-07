package com.example.demo.domain.entity;

import com.example.demo.repos.UserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Objects;

@Component
@Entity
@Table(name = "user_power", schema = "Retirement_management_system", catalog = "")
@IdClass(UserPowerPK.class)
public class UserPower {
  @Autowired
  private UserRepos userRepos;
  private int uId;
  private int pId;

  public UserPower() {
  }

  public UserPower(int pId, String name) {
    this.pId = pId;
    this.uId = userRepos.findByNameEquals(name).getId();
  }

  @Id
  @Column(name = "u_id", nullable = false)
  public int getuId() {
    return uId;
  }

  public void setuId(int uId) {
    this.uId = uId;
  }

  @Id
  @Column(name = "p_id", nullable = false)
  public int getpId() {
    return pId;
  }

  public void setpId(int pId) {
    this.pId = pId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UserPower userPower = (UserPower) o;
    return uId == userPower.uId &&
        pId == userPower.pId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(uId, pId);
  }
}
