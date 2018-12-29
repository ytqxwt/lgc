package com.example.demo.domain.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.util.Objects;

@Entity

@Table(name = "user", schema = "Retirement_management_system", catalog = "")
public class User {
  private int id;
  private String name;
  private String password;
  private String createTime;
  private String phone;
  private String able;
  private String type;
  private String remark;

  public User() {
  }

  public User(int id, String name, String password, String createTime, String phone, String able, String type, String remark) {
    this.id = id;
    this.name = name;
    this.password = password;
    this.createTime = createTime;
    this.phone = phone;
    this.able = able;
    this.type = type;
    this.remark = remark;
  }

  @Id
  @Column(name = "id", nullable = false)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Basic
  @Column(name = "name", nullable = true, length = 45)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Basic
  @Column(name = "password", nullable = true, length = 45)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Basic
  @Column(name = "create_time", nullable = true, length = 45)
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  @Basic
  @Column(name = "phone", nullable = true, length = 45)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Basic
  @Column(name = "able", nullable = true, length = 45)
  public String getAble() {
    return able;
  }

  public void setAble(String able) {
    this.able = able;
  }

  @Basic
  @Column(name = "type", nullable = true, length = 45)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Basic
  @Column(name = "remark", nullable = true, length = 45)
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return id == user.id &&
        Objects.equals(name, user.name) &&
        Objects.equals(password, user.password) &&
        Objects.equals(createTime, user.createTime) &&
        Objects.equals(phone, user.phone) &&
        Objects.equals(able, user.able) &&
        Objects.equals(type, user.type) &&
        Objects.equals(remark, user.remark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, password, createTime, phone, able, type, remark);
  }

  @Override
  public String toString() {
    try {
      return new ObjectMapper().writeValueAsString(this);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return null;
  }
}
