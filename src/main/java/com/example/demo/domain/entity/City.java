package com.example.demo.domain.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class City {
  private int id;
  private String areaname;
  private Integer parentid;
  private Integer level;
  private String position;
  private Integer sort;

  @Id
  @Column(name = "id", nullable = false)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Basic
  @Column(name = "areaname", nullable = true, length = 255)
  public String getAreaname() {
    return areaname;
  }

  public void setAreaname(String areaname) {
    this.areaname = areaname;
  }

  @Basic
  @Column(name = "parentid", nullable = true)
  public Integer getParentid() {
    return parentid;
  }

  public void setParentid(Integer parentid) {
    this.parentid = parentid;
  }

  @Basic
  @Column(name = "level", nullable = true)
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  @Basic
  @Column(name = "position", nullable = true, length = 255)
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  @Basic
  @Column(name = "sort", nullable = true)
  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    City city = (City) o;
    return id == city.id &&
        Objects.equals(areaname, city.areaname) &&
        Objects.equals(parentid, city.parentid) &&
        Objects.equals(level, city.level) &&
        Objects.equals(position, city.position) &&
        Objects.equals(sort, city.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, areaname, parentid, level, position, sort);
  }
}
