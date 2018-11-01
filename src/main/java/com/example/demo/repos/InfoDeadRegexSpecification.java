package com.example.demo.repos;

import com.example.demo.domain.entity.InfoDead;
import com.example.demo.domain.entity.InfoNew;
import com.example.demo.domain.vo.MultipleRegex;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class InfoDeadRegexSpecification implements Specification<InfoDead> {
  private String[] params;
  private MultipleRegex mr;

  public InfoDeadRegexSpecification(String[] params, MultipleRegex mr) {
    this.params = params;

    this.mr = mr;
  }

  @Override
  public Predicate toPredicate(Root<InfoDead> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
    List<Predicate> predicates = new ArrayList<Predicate>();
    for (String param : params) {
      switch (param) {
        case "baseName":
          predicates.add(cb.like(root.get("baseName").as(String.class), "%" + mr.getBaseName() + "%"));
          break;
        case "baseSex":
          predicates.add(cb.like(root.get("baseSex").as(String.class), "%" + mr.getBaseSex() + "%"));
          break;
        case "workKaiShiGongZuo":
          predicates.add(cb.greaterThanOrEqualTo(root.get("workKaiShiGongZuo").as(String.class), mr.getWorkKaiShiGongZuoStart()));
          predicates.add(cb.lessThanOrEqualTo(root.get("workKaiShiGongZuo").as(String.class), mr.getWorkKaiShiGongZuoEnd()));
          break;
        case "baseJiGuan":
          predicates.add(cb.like(root.get("baseJiGuan").as(String.class), "%" + mr.getBaseJiGuan() + "%"));
          break;
        case "baseShengRi":
          predicates.add(cb.greaterThanOrEqualTo(root.get("baseShengRi").as(String.class), mr.getBaseShengRiStart()));
          predicates.add(cb.lessThanOrEqualTo(root.get("baseShengRi").as(String.class), mr.getBaseShengRiEnd()));
          break;
        case "workDaoXiaoShiJian":
          predicates.add(cb.greaterThanOrEqualTo(root.get("workDaoXiaoShiJian").as(String.class), mr.getWorkDaoXiaoShiJianStart()));
          predicates.add(cb.lessThanOrEqualTo(root.get("workDaoXiaoShiJian").as(String.class), mr.getWorkDaoXiaoShiJianEnd()));
          break;
        case "baseShenFenZheng":
          predicates.add(cb.like(root.get("baseShenFenZheng").as(String.class), "%" + mr.getBaseShenFenZheng() + "%"));
          break;
        case "baseMinZu":
          predicates.add(cb.like(root.get("baseMinZu").as(String.class), "%" + mr.getBaseMinZu() + "%"));
          break;
        case "baseXueLi":
          predicates.add(cb.like(root.get("baseXueLi").as(String.class), "%" + mr.getBaseXueLi() + "%"));
          break;
        case "baseXueWei":
          predicates.add(cb.like(root.get("baseXueWei").as(String.class), "%" + mr.getBaseXueWei() + "%"));
          break;
        case "workBianZhiLeiXing":
          predicates.add(cb.like(root.get("workBianZhiLeiXing").as(String.class), "%" + mr.getWorkBianZhiLeiXing() + "%"));
          break;
        case "workZhiWu":
          predicates.add(cb.like(root.get("workZhiWu").as(String.class), "%" + mr.getWorkZhiWu() + "%"));
          break;
        case "workZhiWuJiBie":
          predicates.add(cb.like(root.get("workZhiWuJiBie").as(String.class), "%" + mr.getWorkZhiWuJiBie() + "%"));
          break;
        case "workZhiCheng":
          predicates.add(cb.like(root.get("workZhiCheng").as(String.class), "%" + mr.getWorkZhiCheng() + "%"));
          break;
        case "workZhiChengJiBie":
          predicates.add(cb.like(root.get("workZhiChengJiBie").as(String.class), "%" + mr.getWorkZhiChengJiBie() + "%"));
          break;
        case "workTiQianTuiXiu":
          predicates.add(cb.greaterThanOrEqualTo(root.get("workDaoXiaoShiJian").as(String.class), mr.getWorkTiQianTuiXiuStart()));
          predicates.add(cb.lessThanOrEqualTo(root.get("workDaoXiaoShiJian").as(String.class), mr.getWorkTiQianTuiXiuEnd()));
          break;
        case "workZhengShiTuiXiu":
          predicates.add(cb.greaterThanOrEqualTo(root.get("workDaoXiaoShiJian").as(String.class), mr.getWorkZhengShiTuiXiuStart()));
          predicates.add(cb.lessThanOrEqualTo(root.get("workDaoXiaoShiJian").as(String.class), mr.getWorkZhengShiTuiXiuEnd()));
          break;
        case "workTuiXiuBuMen":
          predicates.add(cb.like(root.get("workTuiXiuBuMen").as(String.class), "%" + mr.getWorkTuiXiuBuMen() + "%"));
          break;
        case "baseZhengZhiMianMao":
          predicates.add(cb.like(root.get("baseZhengZhiMianMao").as(String.class), "%" + mr.getBaseZhengZhiMianMao() + "%"));
          break;
        case "workZhuanYeHeGongZhong":
          predicates.add(cb.like(root.get("workZhuanYeHeGongZhong").as(String.class), "%" + mr.getWorkZhuanYeHeGongZhong() + "%"));
          break;
        case "nowSuoShuZhiBu":
          predicates.add(cb.like(root.get("nowSuoShuZhiBu").as(String.class), "%" + mr.getNowSuoShuZhiBu() + "%"));
          break;
        case "hisJiaRuZuZhi":
          predicates.add(cb.greaterThanOrEqualTo(root.get("workDaoXiaoShiJian").as(String.class), mr.getHisJiaRuZuZhiStart()));
          predicates.add(cb.lessThanOrEqualTo(root.get("workDaoXiaoShiJian").as(String.class), mr.getHisJiaRuZuZhiEnd()));
          break;
        case "hisZhengFuJinTie":
          predicates.add(cb.like(root.get("hisZhengFuJinTie").as(String.class), "%" + mr.getHisZhengFuJinTie() + "%"));
          break;
        case "hisZhengFuJinTieDengJi":
          predicates.add(cb.like(root.get("hisZhengFuJinTieDengJi").as(String.class), "%" + mr.getHisZhengFuJinTieDengJi() + "%"));
          break;
        case "hisFuZhuanTuiJunRen":
          predicates.add(cb.like(root.get("hisFuZhuanTuiJunRen").as(String.class), "%" + mr.getHisFuZhuanTuiJunRen() + "%"));
          break;
        case "hisShangCan":
          predicates.add(cb.like(root.get("hisShangCan").as(String.class), "%" + mr.getHisShangCan() + "%"));
          break;
        case "hisShangCanDengJi":
          predicates.add(cb.like(root.get("hisShangCanDengJi").as(String.class), "%" + mr.getHisShangCanDengJi() + "%"));
          break;
        case "hisLiZhanGong":
          predicates.add(cb.like(root.get("hisLiZhanGong").as(String.class), "%" + mr.getHisLiZhanGong() + "%"));
          break;
        case "hisLaZhanGongDengJi":
          predicates.add(cb.like(root.get("hisLaZhanGongDengJi").as(String.class), "%" + mr.getHisLaZhanGongDengJi() + "%"));
          break;
        case "baseDuShengZiNv":
          predicates.add(cb.like(root.get("baseDuShengZiNv").as(String.class), "%" + mr.getBaseDuShengZiNv() + "%"));
          break;
        case "hisLaoMo":
          predicates.add(cb.like(root.get("hisLaoMo").as(String.class), "%" + mr.getHisLaoMo() + "%"));
          break;
        case "hisLaoMoDengJi":
          predicates.add(cb.like(root.get("hisLaoMoDengJi").as(String.class), "%" + mr.getHisLaoMoDengJi() + "%"));
          break;
        case "nowGongZiHao":
          predicates.add(cb.like(root.get("nowGongZiHao").as(String.class), "%" + mr.getNowGongZiHao() + "%"));
          break;
        case "nowYiKaTong":
          predicates.add(cb.like(root.get("nowYiKaTong").as(String.class), "%" + mr.getNowYiKaTong() + "%"));
          break;
        case "nowManXingJiBing":
          predicates.add(cb.like(root.get("nowManXingJiBing").as(String.class), "%" + mr.getNowManXingJiBing() + "%"));
          break;
        case "nowJianKangZhuangKuang":
          predicates.add(cb.like(root.get("nowJianKangZhuangKuang").as(String.class), "%" + mr.getNowJianKangZhuangKuang() + "%"));
          break;
        case "connXianHuKouDiZhi":
          predicates.add(cb.like(root.get("connXianHuKouDiZhi").as(String.class), "%" + mr.getConnXianHuKouDiZhi() + "%"));
          break;
        case "connYuZiNvShengHuo":
          predicates.add(cb.like(root.get("connYuZiNvShengHuo").as(String.class), "%" + mr.getConnYuZiNvShengHuo() + "%"));
          break;
        case "connYuShuiShengHuo":
          predicates.add(cb.like(root.get("connYuShuiShengHuo").as(String.class), "%" + mr.getConnYuShuiShengHuo() + "%"));
          break;
        case "connXianJuZhuDiZhi":
          predicates.add(cb.like(root.get("connXianJuZhuDiZhi").as(String.class), "%" + mr.getConnXianJuZhuDiZhi() + "%"));
          break;
        case "connZhuZhaiDianHua":
          predicates.add(cb.like(root.get("connZhuZhaiDianHua").as(String.class), "%" + mr.getConnZhuZhaiDianHua() + "%"));
          break;
        case "connShouJiHaoMa":
          predicates.add(cb.like(root.get("connShouJiHaoMa").as(String.class), "%" + mr.getConnShouJiHaoMa() + "%"));
          break;
        case "connLiShiHaoMa":
          predicates.add(cb.like(root.get("connLiShiHaoMa").as(String.class), "%" + mr.getConnLiShiHaoMa() + "%"));
          break;
        case "connEmailOrQq":
          predicates.add(cb.like(root.get("connEmailOrQq").as(String.class), "%" + mr.getConnEmailOrQq() + "%"));
          break;
        case "connPeiOuHuoZiNvEmail":
          predicates.add(cb.like(root.get("connPeiOuHuoZiNvEmail").as(String.class), "%" + mr.getConnPeiOuHuoZiNvEmail() + "%"));
          break;
        case "mateHunYinZhuangKuang":
          predicates.add(cb.like(root.get("mateHunYinZhuangKuang").as(String.class), "%" + mr.getMateHunYinZhuangKuang() + "%"));
          break;
        case "matePeiOuName":
          predicates.add(cb.like(root.get("matePeiOuName").as(String.class), "%" + mr.getMatePeiOuName() + "%"));
          break;
        case "matePeiOuPhone":
          predicates.add(cb.like(root.get("matePeiOuPhone").as(String.class), "%" + mr.getMatePeiOuPhone() + "%"));
          break;
        case "matePeiOuJianKang":
          predicates.add(cb.like(root.get("matePeiOuJianKang").as(String.class), "%" + mr.getMatePeiOuJianKang() + "%"));
          break;
        case "lianXiRenName":
          predicates.add(cb.like(root.get("lianXiRenName").as(String.class), "%" + mr.getLianXiRenName() + "%"));
          break;
        case "lianXiRenGuanXi":
          predicates.add(cb.like(root.get("lianXiRenGuanXi").as(String.class), "%" + mr.getLianXiRenGuanXi() + "%"));
          break;
        case "lianXiRenPhone":
          predicates.add(cb.like(root.get("lianXiRenPhone").as(String.class), "%" + mr.getLianXiRenPhone() + "%"));
          break;
        case "hisShuangZhiGong":
          predicates.add(cb.like(root.get("hisShuangZhiGong").as(String.class), "%" + mr.getHisShuangZhiGong() + "%"));
          break;
        case "childrenZiNvName":
          predicates.add(cb.like(root.get("childrenZiNvName").as(String.class), "%" + mr.getChildrenZiNvName() + "%"));
          break;
        case "childrenZiNvAddress":
          predicates.add(cb.like(root.get("childrenZiNvAddress").as(String.class), "%" + mr.getChildrenZiNvAddress() + "%"));
          break;
        case "childrenZiNvDanWei":
          predicates.add(cb.like(root.get("childrenZiNvDanWei").as(String.class), "%" + mr.getChildrenZiNvDanWei() + "%"));
          break;
        case "childrenZiNvPhone":
          predicates.add(cb.like(root.get("childrenZiNvPhone").as(String.class), "%" + mr.getChildrenZiNvPhone() + "%"));
          break;
        case "nowAiHaoXiangMu":
          predicates.add(cb.like(root.get("nowAiHaoXiangMu").as(String.class), "%" + mr.getNowAiHaoXiangMu() + "%"));
          break;
        case "nowJianChiJianShen":
          predicates.add(cb.like(root.get("nowJianChiJianShen").as(String.class), "%" + mr.getNowJianChiJianShen() + "%"));
          break;
        case "xiaoNeiName":
          predicates.add(cb.like(root.get("xiaoNeiName").as(String.class), "%" + mr.getXiaoNeiName() + "%"));
          break;
        case "xiaoNeiGuanXi":
          predicates.add(cb.like(root.get("xiaoNeiGuanXi").as(String.class), "%" + mr.getXiaoNeiGuanXi() + "%"));
          break;
        case "xiaoNeiPhone":
          predicates.add(cb.like(root.get("xiaoNeiPhone").as(String.class), "%" + mr.getXiaoNeiPhone() + "%"));
          break;
        case "xiaoNeiBuMen":
          predicates.add(cb.like(root.get("xiaoNeiBuMen").as(String.class), "%" + mr.getXiaoNeiBuMen() + "%"));
          break;
        case "xiaoNeiAddress":
          predicates.add(cb.like(root.get("xiaoNeiAddress").as(String.class), "%" + mr.getXiaoNeiAddress() + "%"));
          break;
        case "nowLaoNianTiXieZu":
          predicates.add(cb.like(root.get("nowLaoNianTiXieZu").as(String.class), "%" + mr.getNowLaoNianTiXieZu() + "%"));
          break;
        case "nowLiuLanWebsite":
          predicates.add(cb.like(root.get("nowLiuLanWebsite").as(String.class), "%" + mr.getNowLiuLanWebsite() + "%"));
          break;
        case "nowXiaoWaiTuanTiZhiWu":
          predicates.add(cb.like(root.get("nowXiaoWaiTuanTiZhiWu").as(String.class), "%" + mr.getNowXiaoWaiTuanTiZhiWu() + "%"));
          break;
        case "hisJunShuJunLie":
          predicates.add(cb.like(root.get("hisJunShuJunLie").as(String.class), "%" + mr.getHisJunShuJunLie() + "%"));
          break;
        case "remark":
          predicates.add(cb.like(root.get("remark").as(String.class), "%" + mr.getRemark() + "%"));
          break;
        case "hisUnionGroup":
          predicates.add(cb.like(root.get("hisUnionGroup").as(String.class), "%" + mr.getHisUnionGroup() + "%"));
          break;
        case "tianBiaoShiJian":
          predicates.add(cb.greaterThanOrEqualTo(root.get("tianBiaoShiJian").as(String.class), mr.getTianBiaoShiJianStart()));
          predicates.add(cb.lessThanOrEqualTo(root.get("tianBiaoShiJian").as(String.class), mr.getTianBiaoShiJianEnd()));
          break;
        case "deadTime":
          predicates.add(cb.greaterThanOrEqualTo(root.get("deadTime").as(String.class), mr.getDiedDateStart()));
          predicates.add(cb.lessThanOrEqualTo(root.get("deadTime").as(String.class), mr.getDiedDateEnd()));
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
