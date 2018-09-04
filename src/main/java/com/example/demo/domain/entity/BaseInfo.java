package com.example.demo.domain.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class BaseInfo {
  //51
  //67-16
  private String idCard;
  private String name;
  private String photoUrl;
  private String sex;
  private String nativePlace;
  private String startWorkDate;
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
  private String adressChildren;
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

  @Override
  public String toString() {
    try {
      return new ObjectMapper().writeValueAsString(this);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return null;
  }

  @Id
  @Column(name = "id_card", nullable = false, length = 45)
  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }

  @Basic
  @Column(name = "name", nullable = false, length = 45)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Basic
  @Column(name = "photo_url",  length = 45)
  public String getPhotoUrl() {
    return photoUrl;
  }

  public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }

  @Basic
  @Column(name = "sex",  length = 45)
  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  @Basic
  @Column(name = "native_place",  length = 45)
  public String getNativePlace() {
    return nativePlace;
  }

  public void setNativePlace(String nativePlace) {
    this.nativePlace = nativePlace;
  }

  @Basic
  @Column(name = "start_work_date",  length = 45)
  public String getStartWorkDate() {
    return startWorkDate;
  }

  public void setStartWorkDate(String startWorkDate) {
    this.startWorkDate = startWorkDate;
  }

  @Basic
  @Column(name = "formation_type",  length = 45)
  public String getFormationType() {
    return formationType;
  }

  public void setFormationType(String formationType) {
    this.formationType = formationType;
  }

  @Basic
  @Column(name = "to_school_date",  length = 45)
  public String getToSchoolDate() {
    return toSchoolDate;
  }

  public void setToSchoolDate(String toSchoolDate) {
    this.toSchoolDate = toSchoolDate;
  }

  @Basic
  @Column(name = "retire_date", length = 45)
  public String getRetireDate() {
    return retireDate;
  }

  public void setRetireDate(String retireDate) {
    this.retireDate = retireDate;
  }

  @Basic
  @Column(name = "retire_type",  length = 45)
  public String getRetireType() {
    return retireType;
  }

  public void setRetireType(String retireType) {
    this.retireType = retireType;
  }

  @Basic
  @Column(name = "retire_in_department",  length = 45)
  public String getRetireInDepartment() {
    return retireInDepartment;
  }

  public void setRetireInDepartment(String retireInDepartment) {
    this.retireInDepartment = retireInDepartment;
  }

  @Basic
  @Column(name = "job",  length = 45)
  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  @Basic
  @Column(name = "job_level",  length = 45)
  public String getJobLevel() {
    return jobLevel;
  }

  public void setJobLevel(String jobLevel) {
    this.jobLevel = jobLevel;
  }

  @Basic
  @Column(name = "title",  length = 45)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Basic
  @Column(name = "title_level",  length = 45)
  public String getTitleLevel() {
    return titleLevel;
  }

  public void setTitleLevel(String titleLevel) {
    this.titleLevel = titleLevel;
  }

  @Basic
  @Column(name = "major_or_work",  length = 45)
  public String getMajorOrWork() {
    return majorOrWork;
  }

  public void setMajorOrWork(String majorOrWork) {
    this.majorOrWork = majorOrWork;
  }

  @Basic
  @Column(name = "salary_number",  length = 45)
  public String getSalaryNumber() {
    return salaryNumber;
  }

  public void setSalaryNumber(String salaryNumber) {
    this.salaryNumber = salaryNumber;
  }

  @Basic
  @Column(name = "political_outlook",  length = 45)
  public String getPoliticalOutlook() {
    return politicalOutlook;
  }

  public void setPoliticalOutlook(String politicalOutlook) {
    this.politicalOutlook = politicalOutlook;
  }

  @Basic
  @Column(name = "present_branch",  length = 45)
  public String getPresentBranch() {
    return presentBranch;
  }

  public void setPresentBranch(String presentBranch) {
    this.presentBranch = presentBranch;
  }

  @Basic
  @Column(name = "government_allowance",  length = 45)
  public String getGovernmentAllowance() {
    return governmentAllowance;
  }

  public void setGovernmentAllowance(String governmentAllowance) {
    this.governmentAllowance = governmentAllowance;
  }

  @Basic
  @Column(name = "once_in_army",  length = 45)
  public String getOnceInArmy() {
    return onceInArmy;
  }

  public void setOnceInArmy(String onceInArmy) {
    this.onceInArmy = onceInArmy;
  }

  @Basic
  @Column(name = "disabled",  length = 45)
  public String getDisabled() {
    return disabled;
  }

  public void setDisabled(String disabled) {
    this.disabled = disabled;
  }

  @Basic
  @Column(name = "army_family",  length = 45)
  public String getArmyFamily() {
    return armyFamily;
  }

  public void setArmyFamily(String armyFamily) {
    this.armyFamily = armyFamily;
  }

  @Basic
  @Column(name = "exploit",  length = 45)
  public String getExploit() {
    return exploit;
  }

  public void setExploit(String exploit) {
    this.exploit = exploit;
  }

  @Basic
  @Column(name = "model_worker",  length = 45)
  public String getModelWorker() {
    return modelWorker;
  }

  public void setModelWorker(String modelWorker) {
    this.modelWorker = modelWorker;
  }

  @Basic
  @Column(name = "health_current",  length = 45)
  public String getHealthCurrent() {
    return healthCurrent;
  }

  public void setHealthCurrent(String healthCurrent) {
    this.healthCurrent = healthCurrent;
  }

  @Basic
  @Column(name = "disease_chronic",  length = 45)
  public String getDiseaseChronic() {
    return diseaseChronic;
  }

  public void setDiseaseChronic(String diseaseChronic) {
    this.diseaseChronic = diseaseChronic;
  }

  @Basic
  @Column(name = "phone",  length = 45)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Basic
  @Column(name = "home_phone",  length = 45)
  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  @Basic
  @Column(name = "qq_number",  length = 45)
  public String getQqNumber() {
    return qqNumber;
  }

  public void setQqNumber(String qqNumber) {
    this.qqNumber = qqNumber;
  }

  @Basic
  @Column(name = "wx_number",  length = 45)
  public String getWxNumber() {
    return wxNumber;
  }

  public void setWxNumber(String wxNumber) {
    this.wxNumber = wxNumber;
  }

  @Basic
  @Column(name = "live_with_children",  length = 45)
  public String getLiveWithChildren() {
    return liveWithChildren;
  }

  public void setLiveWithChildren(String liveWithChildren) {
    this.liveWithChildren = liveWithChildren;
  }

  @Basic
  @Column(name = "address_current",  length = 45)
  public String getAddressCurrent() {
    return addressCurrent;
  }

  public void setAddressCurrent(String addressCurrent) {
    this.addressCurrent = addressCurrent;
  }

  @Basic
  @Column(name = "zip_code",  length = 45)
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  @Basic
  @Column(name = "account_address_current",  length = 45)
  public String getAccountAddressCurrent() {
    return accountAddressCurrent;
  }

  public void setAccountAddressCurrent(String accountAddressCurrent) {
    this.accountAddressCurrent = accountAddressCurrent;
  }

  @Basic
  @Column(name = "family_email",  length = 45)
  public String getFamilyEmail() {
    return familyEmail;
  }

  public void setFamilyEmail(String familyEmail) {
    this.familyEmail = familyEmail;
  }

  @Basic
  @Column(name = "adress_children",  length = 45)
  public String getAdressChildren() {
    return adressChildren;
  }

  public void setAdressChildren(String adressChildren) {
    this.adressChildren = adressChildren;
  }

  @Basic
  @Column(name = "name_link_man",  length = 45)
  public String getNameLinkMan() {
    return nameLinkMan;
  }

  public void setNameLinkMan(String nameLinkMan) {
    this.nameLinkMan = nameLinkMan;
  }

  @Basic
  @Column(name = "department_link_man",  length = 45)
  public String getDepartmentLinkMan() {
    return departmentLinkMan;
  }

  public void setDepartmentLinkMan(String departmentLinkMan) {
    this.departmentLinkMan = departmentLinkMan;
  }

  @Basic
  @Column(name = "address_link_man",  length = 45)
  public String getAddressLinkMan() {
    return addressLinkMan;
  }

  public void setAddressLinkMan(String addressLinkMan) {
    this.addressLinkMan = addressLinkMan;
  }

  @Basic
  @Column(name = "phone_link_man",  length = 45)
  public String getPhoneLinkMan() {
    return phoneLinkMan;
  }

  public void setPhoneLinkMan(String phoneLinkMan) {
    this.phoneLinkMan = phoneLinkMan;
  }

  @Basic
  @Column(name = "activity_group",  length = 45)
  public String getActivityGroup() {
    return activityGroup;
  }

  public void setActivityGroup(String activityGroup) {
    this.activityGroup = activityGroup;
  }

  @Basic
  @Column(name = "marital_status",  length = 45)
  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  @Basic
  @Column(name = "name_mate",  length = 45)
  public String getNameMate() {
    return nameMate;
  }

  public void setNameMate(String nameMate) {
    this.nameMate = nameMate;
  }

  @Basic
  @Column(name = "phone_mate",  length = 45)
  public String getPhoneMate() {
    return phoneMate;
  }

  public void setPhoneMate(String phoneMate) {
    this.phoneMate = phoneMate;
  }

  @Basic
  @Column(name = "health_mate",  length = 45)
  public String getHealthMate() {
    return healthMate;
  }

  public void setHealthMate(String healthMate) {
    this.healthMate = healthMate;
  }

  @Basic
  @Column(name = "email_mate",  length = 45)
  public String getEmailMate() {
    return emailMate;
  }

  public void setEmailMate(String emailMate) {
    this.emailMate = emailMate;
  }

  @Basic
  @Column(name = "sport",  length = 45)
  public String getSport() {
    return sport;
  }

  public void setSport(String sport) {
    this.sport = sport;
  }

  @Basic
  @Column(name = "favorite_hobby",  length = 45)
  public String getFavoriteHobby() {
    return favoriteHobby;
  }

  public void setFavoriteHobby(String favoriteHobby) {
    this.favoriteHobby = favoriteHobby;
  }

  @Basic
  @Column(name = "double_worker",  length = 45)
  public String getDoubleWorker() {
    return doubleWorker;
  }

  public void setDoubleWorker(String doubleWorker) {
    this.doubleWorker = doubleWorker;
  }

  @Basic
  @Column(name = "duty_in_social_group",  length = 45)
  public String getDutyInSocialGroup() {
    return dutyInSocialGroup;
  }

  public void setDutyInSocialGroup(String dutyInSocialGroup) {
    this.dutyInSocialGroup = dutyInSocialGroup;
  }

  @Basic
  @Column(name = "browse_website",  length = 45)
  public String getBrowseWebsite() {
    return browseWebsite;
  }

  public void setBrowseWebsite(String browseWebsite) {
    this.browseWebsite = browseWebsite;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BaseInfo baseInfo = (BaseInfo) o;
    return Objects.equals(idCard, baseInfo.idCard) &&
        Objects.equals(name, baseInfo.name) &&
        Objects.equals(photoUrl, baseInfo.photoUrl) &&
        Objects.equals(sex, baseInfo.sex) &&
        Objects.equals(nativePlace, baseInfo.nativePlace) &&
        Objects.equals(startWorkDate, baseInfo.startWorkDate) &&
        Objects.equals(formationType, baseInfo.formationType) &&
        Objects.equals(toSchoolDate, baseInfo.toSchoolDate) &&
        Objects.equals(retireDate, baseInfo.retireDate) &&
        Objects.equals(retireType, baseInfo.retireType) &&
        Objects.equals(retireInDepartment, baseInfo.retireInDepartment) &&
        Objects.equals(job, baseInfo.job) &&
        Objects.equals(jobLevel, baseInfo.jobLevel) &&
        Objects.equals(title, baseInfo.title) &&
        Objects.equals(titleLevel, baseInfo.titleLevel) &&
        Objects.equals(majorOrWork, baseInfo.majorOrWork) &&
        Objects.equals(salaryNumber, baseInfo.salaryNumber) &&
        Objects.equals(politicalOutlook, baseInfo.politicalOutlook) &&
        Objects.equals(presentBranch, baseInfo.presentBranch) &&
        Objects.equals(governmentAllowance, baseInfo.governmentAllowance) &&
        Objects.equals(onceInArmy, baseInfo.onceInArmy) &&
        Objects.equals(disabled, baseInfo.disabled) &&
        Objects.equals(armyFamily, baseInfo.armyFamily) &&
        Objects.equals(exploit, baseInfo.exploit) &&
        Objects.equals(modelWorker, baseInfo.modelWorker) &&
        Objects.equals(healthCurrent, baseInfo.healthCurrent) &&
        Objects.equals(diseaseChronic, baseInfo.diseaseChronic) &&
        Objects.equals(phone, baseInfo.phone) &&
        Objects.equals(homePhone, baseInfo.homePhone) &&
        Objects.equals(qqNumber, baseInfo.qqNumber) &&
        Objects.equals(wxNumber, baseInfo.wxNumber) &&
        Objects.equals(liveWithChildren, baseInfo.liveWithChildren) &&
        Objects.equals(addressCurrent, baseInfo.addressCurrent) &&
        Objects.equals(zipCode, baseInfo.zipCode) &&
        Objects.equals(accountAddressCurrent, baseInfo.accountAddressCurrent) &&
        Objects.equals(familyEmail, baseInfo.familyEmail) &&
        Objects.equals(adressChildren, baseInfo.adressChildren) &&
        Objects.equals(nameLinkMan, baseInfo.nameLinkMan) &&
        Objects.equals(departmentLinkMan, baseInfo.departmentLinkMan) &&
        Objects.equals(addressLinkMan, baseInfo.addressLinkMan) &&
        Objects.equals(phoneLinkMan, baseInfo.phoneLinkMan) &&
        Objects.equals(activityGroup, baseInfo.activityGroup) &&
        Objects.equals(maritalStatus, baseInfo.maritalStatus) &&
        Objects.equals(nameMate, baseInfo.nameMate) &&
        Objects.equals(phoneMate, baseInfo.phoneMate) &&
        Objects.equals(healthMate, baseInfo.healthMate) &&
        Objects.equals(emailMate, baseInfo.emailMate) &&
        Objects.equals(sport, baseInfo.sport) &&
        Objects.equals(favoriteHobby, baseInfo.favoriteHobby) &&
        Objects.equals(doubleWorker, baseInfo.doubleWorker) &&
        Objects.equals(dutyInSocialGroup, baseInfo.dutyInSocialGroup) &&
        Objects.equals(browseWebsite, baseInfo.browseWebsite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCard, name, photoUrl, sex, nativePlace, startWorkDate, formationType, toSchoolDate, retireDate, retireType, retireInDepartment, job, jobLevel, title, titleLevel, majorOrWork, salaryNumber, politicalOutlook, presentBranch, governmentAllowance, onceInArmy, disabled, armyFamily, exploit, modelWorker, healthCurrent, diseaseChronic, phone, homePhone, qqNumber, wxNumber, liveWithChildren, addressCurrent, zipCode, accountAddressCurrent, familyEmail, adressChildren, nameLinkMan, departmentLinkMan, addressLinkMan, phoneLinkMan, activityGroup, maritalStatus, nameMate, phoneMate, healthMate, emailMate, sport, favoriteHobby, doubleWorker, dutyInSocialGroup, browseWebsite);
  }
}
