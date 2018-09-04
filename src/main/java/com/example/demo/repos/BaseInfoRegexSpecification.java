package com.example.demo.repos;

import com.example.demo.domain.entity.BaseInfo;
import com.example.demo.domain.vo.MultipleRegex;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class BaseInfoRegexSpecification implements Specification<BaseInfo> {
  private String[] params;
  private MultipleRegex mr;

  public BaseInfoRegexSpecification(String[] params, MultipleRegex mr) {
    this.params = params;
    this.mr = mr;
  }

  @Override
  public Predicate toPredicate(Root<BaseInfo> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
    List<Predicate> predicates = new ArrayList<Predicate>();
    for (String param : params) {
      switch (param) {
        case "name":
          predicates.add(cb.like(root.get("name").as(String.class), "%" + mr.getName() + "%"));
          break;
        case "idCard":
          predicates.add(cb.like(root.get("idCard").as(String.class), "%" + mr.getIdCard() + "%"));
          break;
        case "sex":
          predicates.add(cb.like(root.get("sex").as(String.class), "%" + mr.getSex() + "%"));
          break;
        case "nativePlace":
          predicates.add(cb.like(root.get("nativePlace").as(String.class), "%" + mr.getNativePlace() + "%"));
          break;
        case "startWorkDate":
          predicates.add(cb.like(root.get("startWorkDate").as(String.class), "%" + mr.getStartWorkDate() + "%"));
          break;
        case "formationType":
          predicates.add(cb.like(root.get("formationType").as(String.class), "%" + mr.getFormationType() + "%"));
          break;
        case "toSchoolDate":
          predicates.add(cb.like(root.get("toSchoolDate").as(String.class), "%" + mr.getToSchoolDate() + "%"));
          break;
        case "retireDate":
          predicates.add(cb.like(root.get("retireDate").as(String.class), "%" + mr.getRetireDate() + "%"));
          break;
        case "retireType":
          predicates.add(cb.like(root.get("retireType").as(String.class), "%" + mr.getRetireType() + "%"));
          break;
        case "retireInDepartment":
          predicates.add(cb.like(root.get("retireInDepartment").as(String.class), "%" + mr.getRetireInDepartment() + "%"));
          break;
        case "job":
          predicates.add(cb.like(root.get("job").as(String.class), "%" + mr.getJob() + "%"));
          break;
        case "jobLevel":
          predicates.add(cb.like(root.get("jobLevel").as(String.class), "%" + mr.getJobLevel() + "%"));
          break;
        case "majorOrWork":
          predicates.add(cb.like(root.get("majorOrWork").as(String.class), "%" + mr.getMajorOrWork() + "%"));
          break;
        case "salaryNumber":
          predicates.add(cb.like(root.get("salaryNumber").as(String.class), "%" + mr.getSalaryNumber() + "%"));
          break;
        case "politicalOutlook":
          predicates.add(cb.like(root.get("politicalOutlook").as(String.class), "%" + mr.getPoliticalOutlook() + "%"));
          break;
        case "presentBranch":
          predicates.add(cb.like(root.get("presentBranch").as(String.class), "%" + mr.getPresentBranch() + "%"));
          break;
        case "governmentAllowance":
          predicates.add(cb.like(root.get("governmentAllowance").as(String.class), "%" + mr.getGovernmentAllowance() + "%"));
          break;
        case "onceInArmy":
          predicates.add(cb.like(root.get("onceInArmy").as(String.class), "%" + mr.getOnceInArmy() + "%"));
          break;
        case "disabled":
          predicates.add(cb.like(root.get("disabled").as(String.class), "%" + mr.getDisabled() + "%"));
          break;
        case "armyFamily":
          predicates.add(cb.like(root.get("armyFamily").as(String.class), "%" + mr.getArmyFamily() + "%"));
          break;
        case "exploit":
          predicates.add(cb.like(root.get("exploit").as(String.class), "%" + mr.getExploit() + "%"));
          break;
        case "modelWorker":
          predicates.add(cb.like(root.get("modelWorker").as(String.class), "%" + mr.getModelWorker() + "%"));
          break;
        case "healthCurrent":
          predicates.add(cb.like(root.get("healthCurrent").as(String.class), "%" + mr.getHealthCurrent() + "%"));
          break;
        case "diseaseChronic":
          predicates.add(cb.like(root.get("diseaseChronic").as(String.class), "%" + mr.getDiseaseChronic() + "%"));
          break;
        case "phone":
          predicates.add(cb.like(root.get("phone").as(String.class), "%" + mr.getPhone() + "%"));
          break;
        case "homePhone":
          predicates.add(cb.like(root.get("homePhone").as(String.class), "%" + mr.getHomePhone() + "%"));
          break;
        case "qqNumber":
          predicates.add(cb.like(root.get("qqNumber").as(String.class), "%" + mr.getQqNumber() + "%"));
          break;
        case "wxNumber":
          predicates.add(cb.like(root.get("wxNumber").as(String.class), "%" + mr.getWxNumber() + "%"));
          break;
        case "liveWithChildren":
          predicates.add(cb.like(root.get("liveWithChildren").as(String.class), "%" + mr.getLiveWithChildren() + "%"));
          break;
        case "addressCurrent":
          predicates.add(cb.like(root.get("addressCurrent").as(String.class), "%" + mr.getAddressCurrent() + "%"));
          break;
        case "zipCode":
          predicates.add(cb.like(root.get("zipCode").as(String.class), "%" + mr.getZipCode() + "%"));
          break;
        case "accountAddressCurrent":
          predicates.add(cb.like(root.get("accountAddressCurrent").as(String.class), "%" + mr.getAccountAddressCurrent() + "%"));
          break;
        case "familyEmail":
          predicates.add(cb.like(root.get("familyEmail").as(String.class), "%" + mr.getFamilyEmail() + "%"));
          break;
        case "addressChildren":
          predicates.add(cb.like(root.get("addressChildren").as(String.class), "%" + mr.getAddressChildren() + "%"));
          break;
        case "nameLinkMan":
          predicates.add(cb.like(root.get("nameLinkMan").as(String.class), "%" + mr.getNameLinkMan() + "%"));
          break;
        case "departmentLinkMan":
          predicates.add(cb.like(root.get("departmentLinkMan").as(String.class), "%" + mr.getDepartmentLinkMan() + "%"));
          break;
        case "addressLinkMan":
          predicates.add(cb.like(root.get("addressLinkMan").as(String.class), "%" + mr.getAddressLinkMan() + "%"));
          break;
        case "phoneLinkMan":
          predicates.add(cb.like(root.get("phoneLinkMan").as(String.class), "%" + mr.getPhoneLinkMan() + "%"));
          break;
        case "activityGroup":
          predicates.add(cb.like(root.get("activityGroup").as(String.class), "%" + mr.getActivityGroup() + "%"));
          break;
        case "maritalStatus":
          predicates.add(cb.like(root.get("maritalStatus").as(String.class), "%" + mr.getMaritalStatus() + "%"));
          break;
        case "nameMate":
          predicates.add(cb.like(root.get("nameMate").as(String.class), "%" + mr.getNameMate() + "%"));
          break;
        case "phoneMate":
          predicates.add(cb.like(root.get("phoneMate").as(String.class), "%" + mr.getPhoneMate() + "%"));
          break;
        case "healthMate":
          predicates.add(cb.like(root.get("healthMate").as(String.class), "%" + mr.getHealthMate() + "%"));
          break;
        case "emailMate":
          predicates.add(cb.like(root.get("emailMate").as(String.class), "%" + mr.getEmailMate() + "%"));
          break;
        case "sport":
          predicates.add(cb.like(root.get("sport").as(String.class), "%" + mr.getSport() + "%"));
          break;
        case "favoriteHobby":
          predicates.add(cb.like(root.get("favoriteHobby").as(String.class), "%" + mr.getFavoriteHobby() + "%"));
          break;
        case "doubleWorker":
          predicates.add(cb.like(root.get("doubleWorker").as(String.class), "%" + mr.getDoubleWorker() + "%"));
          break;
        case "dutyInSocialGroup":
          predicates.add(cb.like(root.get("dutyInSocialGroup").as(String.class), "%" + mr.getDutyInSocialGroup() + "%"));
          break;
        case "browseWebsite":
          predicates.add(cb.like(root.get("browseWebsite").as(String.class), "%" + mr.getBrowseWebsite() + "%"));
          break;
        case "":
          break;
        default:
          break;
      }
    }
    query.where(predicates.toArray(new Predicate[0]));
    return null;
  }
}
