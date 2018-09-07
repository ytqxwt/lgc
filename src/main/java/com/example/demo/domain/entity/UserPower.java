package com.example.demo.domain.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_power", schema = "Retirement_management_system", catalog = "")
@IdClass(UserPowerPK.class)
public class UserPower {
  private int uId;
  private int pId;

  public UserPower(int uId, int pId) {
    this.uId = uId;
    this.pId = pId;
  }

  public UserPower() {
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
