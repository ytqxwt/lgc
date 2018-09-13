package com.example.demo.domain.vo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MultipleRegex {
  private int id;
  private String idCard;
  private String name;
  //  private String photoUrl;
  private String sex;
  private String nativePlace;
  private String startWorkDate;
  //用,号隔开
  private String formationType;
  private String toSchoolDate;
  private String retireDate;
  private String retireType;
  private String retireInDepartment;
  private String job;
  private String jobLevel;
  private String title;
  private String titleLevel;
  private String majorOrWork;
  private String salaryNumber;
  private String politicalOutlook;
  private String presentBranch;
  private String governmentAllowance;
  private String onceInArmy;
  private String disabled;
  private String armyFamily;
  private String exploit;
  private String modelWorker;
  private String healthCurrent;
  private String diseaseChronic;
  private String phone;
  private String homePhone;
  private String qqNumber;
  private String wxNumber;
  private String liveWithChildren;
  private String addressCurrent;
  private String zipCode;
  private String accountAddressCurrent;
  private String familyEmail;
  private String addressChildren;
  private String nameLinkMan;
  private String departmentLinkMan;
  private String addressLinkMan;
  private String phoneLinkMan;
  private String activityGroup;
  private String maritalStatus;
  private String nameMate;
  private String phoneMate;
  private String healthMate;
  private String emailMate;
  private String sport;
  private String favoriteHobby;
  private String doubleWorker;
  private String dutyInSocialGroup;
  private String browseWebsite;
  private String select;

  public MultipleRegex(String name, String sex) {
    this.name = name;
    this.sex = sex;
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

  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getNativePlace() {
    return nativePlace;
  }

  public void setNativePlace(String nativePlace) {
    this.nativePlace = nativePlace;
  }

  public String getStartWorkDate() {
    return startWorkDate;
  }

  public void setStartWorkDate(String startWorkDate) {
    this.startWorkDate = startWorkDate;
  }

  public String getFormationType() {
    return formationType;
  }

  public void setFormationType(String formationType) {
    this.formationType = formationType;
  }

  public String getToSchoolDate() {
    return toSchoolDate;
  }

  public void setToSchoolDate(String toSchoolDate) {
    this.toSchoolDate = toSchoolDate;
  }

  public String getRetireDate() {
    return retireDate;
  }

  public void setRetireDate(String retireDate) {
    this.retireDate = retireDate;
  }

  public String getRetireType() {
    return retireType;
  }

  public void setRetireType(String retireType) {
    this.retireType = retireType;
  }

  public String getRetireInDepartment() {
    return retireInDepartment;
  }

  public void setRetireInDepartment(String retireInDepartment) {
    this.retireInDepartment = retireInDepartment;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public String getJobLevel() {
    return jobLevel;
  }

  public void setJobLevel(String jobLevel) {
    this.jobLevel = jobLevel;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitleLevel() {
    return titleLevel;
  }

  public void setTitleLevel(String titleLevel) {
    this.titleLevel = titleLevel;
  }

  public String getMajorOrWork() {
    return majorOrWork;
  }

  public void setMajorOrWork(String majorOrWork) {
    this.majorOrWork = majorOrWork;
  }

  public String getSalaryNumber() {
    return salaryNumber;
  }

  public void setSalaryNumber(String salaryNumber) {
    this.salaryNumber = salaryNumber;
  }

  public String getPoliticalOutlook() {
    return politicalOutlook;
  }

  public void setPoliticalOutlook(String politicalOutlook) {
    this.politicalOutlook = politicalOutlook;
  }

  public String getPresentBranch() {
    return presentBranch;
  }

  public void setPresentBranch(String presentBranch) {
    this.presentBranch = presentBranch;
  }

  public String getGovernmentAllowance() {
    return governmentAllowance;
  }

  public void setGovernmentAllowance(String governmentAllowance) {
    this.governmentAllowance = governmentAllowance;
  }

  public String getOnceInArmy() {
    return onceInArmy;
  }

  public void setOnceInArmy(String onceInArmy) {
    this.onceInArmy = onceInArmy;
  }

  public String getDisabled() {
    return disabled;
  }

  public void setDisabled(String disabled) {
    this.disabled = disabled;
  }

  public String getArmyFamily() {
    return armyFamily;
  }

  public void setArmyFamily(String armyFamily) {
    this.armyFamily = armyFamily;
  }

  public String getExploit() {
    return exploit;
  }

  public void setExploit(String exploit) {
    this.exploit = exploit;
  }

  public String getModelWorker() {
    return modelWorker;
  }

  public void setModelWorker(String modelWorker) {
    this.modelWorker = modelWorker;
  }

  public String getHealthCurrent() {
    return healthCurrent;
  }

  public void setHealthCurrent(String healthCurrent) {
    this.healthCurrent = healthCurrent;
  }

  public String getDiseaseChronic() {
    return diseaseChronic;
  }

  public void setDiseaseChronic(String diseaseChronic) {
    this.diseaseChronic = diseaseChronic;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public String getQqNumber() {
    return qqNumber;
  }

  public void setQqNumber(String qqNumber) {
    this.qqNumber = qqNumber;
  }

  public String getWxNumber() {
    return wxNumber;
  }

  public void setWxNumber(String wxNumber) {
    this.wxNumber = wxNumber;
  }

  public String getLiveWithChildren() {
    return liveWithChildren;
  }

  public void setLiveWithChildren(String liveWithChildren) {
    this.liveWithChildren = liveWithChildren;
  }

  public String getAddressCurrent() {
    return addressCurrent;
  }

  public void setAddressCurrent(String addressCurrent) {
    this.addressCurrent = addressCurrent;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getAccountAddressCurrent() {
    return accountAddressCurrent;
  }

  public void setAccountAddressCurrent(String accountAddressCurrent) {
    this.accountAddressCurrent = accountAddressCurrent;
  }

  public String getFamilyEmail() {
    return familyEmail;
  }

  public void setFamilyEmail(String familyEmail) {
    this.familyEmail = familyEmail;
  }

  public String getAddressChildren() {
    return addressChildren;
  }

  public void setAddressChildren(String addressChildren) {
    this.addressChildren = addressChildren;
  }

  public String getNameLinkMan() {
    return nameLinkMan;
  }

  public void setNameLinkMan(String nameLinkMan) {
    this.nameLinkMan = nameLinkMan;
  }

  public String getDepartmentLinkMan() {
    return departmentLinkMan;
  }

  public void setDepartmentLinkMan(String departmentLinkMan) {
    this.departmentLinkMan = departmentLinkMan;
  }

  public String getAddressLinkMan() {
    return addressLinkMan;
  }

  public void setAddressLinkMan(String addressLinkMan) {
    this.addressLinkMan = addressLinkMan;
  }

  public String getPhoneLinkMan() {
    return phoneLinkMan;
  }

  public void setPhoneLinkMan(String phoneLinkMan) {
    this.phoneLinkMan = phoneLinkMan;
  }

  public String getActivityGroup() {
    return activityGroup;
  }

  public void setActivityGroup(String activityGroup) {
    this.activityGroup = activityGroup;
  }

  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public String getNameMate() {
    return nameMate;
  }

  public void setNameMate(String nameMate) {
    this.nameMate = nameMate;
  }

  public String getPhoneMate() {
    return phoneMate;
  }

  public void setPhoneMate(String phoneMate) {
    this.phoneMate = phoneMate;
  }

  public String getHealthMate() {
    return healthMate;
  }

  public void setHealthMate(String healthMate) {
    this.healthMate = healthMate;
  }

  public String getEmailMate() {
    return emailMate;
  }

  public void setEmailMate(String emailMate) {
    this.emailMate = emailMate;
  }

  public String getSport() {
    return sport;
  }

  public void setSport(String sport) {
    this.sport = sport;
  }

  public String getFavoriteHobby() {
    return favoriteHobby;
  }

  public void setFavoriteHobby(String favoriteHobby) {
    this.favoriteHobby = favoriteHobby;
  }

  public String getDoubleWorker() {
    return doubleWorker;
  }

  public void setDoubleWorker(String doubleWorker) {
    this.doubleWorker = doubleWorker;
  }

  public String getDutyInSocialGroup() {
    return dutyInSocialGroup;
  }

  public void setDutyInSocialGroup(String dutyInSocialGroup) {
    this.dutyInSocialGroup = dutyInSocialGroup;
  }

  public String getBrowseWebsite() {
    return browseWebsite;
  }

  public void setBrowseWebsite(String browseWebsite) {
    this.browseWebsite = browseWebsite;
  }

  public String getSelect() {
    return select;
  }

  public void setSelect(String select) {
    this.select = select;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
