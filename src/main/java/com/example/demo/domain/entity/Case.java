package com.example.demo.domain.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Case {
  private String name;
  private String salaryNumber;
  private String hospitalStart;
  private String hospitalEnd;
  private String reason;
  private String visitTimes;
  private String visitDetails;

  @Id
  @Column(name = "name", nullable = false, length = 45)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Basic
  @Column(name = "salary_number", nullable = true, length = 45)
  public String getSalaryNumber() {
    return salaryNumber;
  }

  public void setSalaryNumber(String salaryNumber) {
    this.salaryNumber = salaryNumber;
  }

  @Basic
  @Column(name = "hospital_start", nullable = true, length = 45)
  public String getHospitalStart() {
    return hospitalStart;
  }

  public void setHospitalStart(String hospitalStart) {
    this.hospitalStart = hospitalStart;
  }

  @Basic
  @Column(name = "hospital_end", nullable = true, length = 45)
  public String getHospitalEnd() {
    return hospitalEnd;
  }

  public void setHospitalEnd(String hospitalEnd) {
    this.hospitalEnd = hospitalEnd;
  }

  @Basic
  @Column(name = "reason", nullable = true, length = 45)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Basic
  @Column(name = "visit_times", nullable = true, length = 45)
  public String getVisitTimes() {
    return visitTimes;
  }

  public void setVisitTimes(String visitTimes) {
    this.visitTimes = visitTimes;
  }

  @Basic
  @Column(name = "visit_details", nullable = true, length = 45)
  public String getVisitDetails() {
    return visitDetails;
  }

  public void setVisitDetails(String visitDetails) {
    this.visitDetails = visitDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Case aCase = (Case) o;

    if (name != null ? !name.equals(aCase.name) : aCase.name != null) return false;
    if (salaryNumber != null ? !salaryNumber.equals(aCase.salaryNumber) : aCase.salaryNumber != null) return false;
    if (hospitalStart != null ? !hospitalStart.equals(aCase.hospitalStart) : aCase.hospitalStart != null) return false;
    if (hospitalEnd != null ? !hospitalEnd.equals(aCase.hospitalEnd) : aCase.hospitalEnd != null) return false;
    if (reason != null ? !reason.equals(aCase.reason) : aCase.reason != null) return false;
    if (visitTimes != null ? !visitTimes.equals(aCase.visitTimes) : aCase.visitTimes != null) return false;
    if (visitDetails != null ? !visitDetails.equals(aCase.visitDetails) : aCase.visitDetails != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (salaryNumber != null ? salaryNumber.hashCode() : 0);
    result = 31 * result + (hospitalStart != null ? hospitalStart.hashCode() : 0);
    result = 31 * result + (hospitalEnd != null ? hospitalEnd.hashCode() : 0);
    result = 31 * result + (reason != null ? reason.hashCode() : 0);
    result = 31 * result + (visitTimes != null ? visitTimes.hashCode() : 0);
    result = 31 * result + (visitDetails != null ? visitDetails.hashCode() : 0);
    return result;
  }
}
