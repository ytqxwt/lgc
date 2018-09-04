package com.example.demo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class UserPowerPK implements Serializable {
  private int uId;
  private int pId;

  @Column(name = "u_id", nullable = false)
  @Id
  public int getuId() {
    return uId;
  }

  public void setuId(int uId) {
    this.uId = uId;
  }

  @Column(name = "p_id", nullable = false)
  @Id
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
    UserPowerPK that = (UserPowerPK) o;
    return uId == that.uId &&
        pId == that.pId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(uId, pId);
  }
}
