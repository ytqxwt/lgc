package com.example.demo.domain.vo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MultipleRegex {
  private String baseName;
  private String baseSex;
  private String workKaiShiGongZuo;
  private String baseJiGuan;
  private String baseShengRi;
  private String workDaoXiaoShiJian;
  private String baseShenFenZheng;
  private String baseMinZu;
  private String baseXueLi;
  private String baseXueWei;
  private String workBianZhiLeiXing;
  private String workZhiWu;
  private String workZhiWuJiBie;
  private String workZhiCheng;
  private String workZhiChengJiBie;
  private String workTiQianTuiXiu;
  private String workZhengShiTuiXiu;
  private String workTuiXiuBuMen;
  private String baseZhengZhiMianMao;
  private String workZhuanYeHeGongZhong;
  private String nowSuoShuZhiBu;
  private String hisJiaRuZuZhi;
  private String hisZhengFuJinTie;
  private String hisZhengFuJinTieDengJi;
  private String hisFuZhuanTuiJunRen;
  private String hisShangCan;
  private String hisShangCanDengJi;
  private String hisLiZhanGong;
  private String hisLaZhanGongDengJi;
  private String baseDuShengZiNv;
  private String hisLaoMo;
  private String hisLaoMoDengJi;
  private String nowGongZiHao;
  private String nowYiKaTong;
  private String nowManXingJiBing;
  private String nowJianKangZhuangKuang;
  private String connXianHuKouDiZhi;
  private String connYuZiNvShengHuo;
  private String connYuShuiShengHuo;
  private String connXianJuZhuDiZhi;
  private String connZhuZhaiDianHua;
  private String connShouJiHaoMa;
  private String connLiShiHaoMa;
  private String connEmailOrQq;
  private String connPeiOuHuoZiNvEmail;
  private String mateHunYinZhuangKuang;
  private String matePeiOuName;
  private String matePeiOuPhone;
  private String matePeiOuJianKang;
  private String lianXiRenName;
  private String lianXiRenGuanXi;
  private String lianXiRenPhone;
  private String hisShuangZhiGong;
  private String childrenZiNvName;
  private String childrenZiNvAddress;
  private String childrenZiNvDanWei;
  private String childrenZiNvPhone;
  private String nowAiHaoXiangMu;
  private String nowJianChiJianShen;
  private String xiaoNeiName;
  private String xiaoNeiGuanXi;
  private String xiaoNeiPhone;
  private String xiaoNeiBuMen;
  private String xiaoNeiAddress;
  private String nowLaoNianTiXieZu;
  private String nowLiuLanWebsite;
  private String nowXiaoWaiTuanTiZhiWu;
  private String hisJunShuJunLie;
  private String remark;
  private String hisUnionGroup;
  private String select;

  public String getSelect() {
    return select;
  }

  public void setSelect(String select) {
    this.select = select;
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

  public String getBaseName() {
    return baseName;
  }

  public void setBaseName(String baseName) {
    this.baseName = baseName;
  }

  public String getBaseSex() {
    return baseSex;
  }

  public void setBaseSex(String baseSex) {
    this.baseSex = baseSex;
  }

  public String getWorkKaiShiGongZuo() {
    return workKaiShiGongZuo;
  }

  public void setWorkKaiShiGongZuo(String workKaiShiGongZuo) {
    this.workKaiShiGongZuo = workKaiShiGongZuo;
  }

  public String getBaseJiGuan() {
    return baseJiGuan;
  }

  public void setBaseJiGuan(String baseJiGuan) {
    this.baseJiGuan = baseJiGuan;
  }

  public String getBaseShengRi() {
    return baseShengRi;
  }

  public void setBaseShengRi(String baseShengRi) {
    this.baseShengRi = baseShengRi;
  }

  public String getWorkDaoXiaoShiJian() {
    return workDaoXiaoShiJian;
  }

  public void setWorkDaoXiaoShiJian(String workDaoXiaoShiJian) {
    this.workDaoXiaoShiJian = workDaoXiaoShiJian;
  }

  public String getBaseShenFenZheng() {
    return baseShenFenZheng;
  }

  public void setBaseShenFenZheng(String baseShenFenZheng) {
    this.baseShenFenZheng = baseShenFenZheng;
  }

  public String getBaseMinZu() {
    return baseMinZu;
  }

  public void setBaseMinZu(String baseMinZu) {
    this.baseMinZu = baseMinZu;
  }

  public String getBaseXueLi() {
    return baseXueLi;
  }

  public void setBaseXueLi(String baseXueLi) {
    this.baseXueLi = baseXueLi;
  }

  public String getBaseXueWei() {
    return baseXueWei;
  }

  public void setBaseXueWei(String baseXueWei) {
    this.baseXueWei = baseXueWei;
  }

  public String getWorkBianZhiLeiXing() {
    return workBianZhiLeiXing;
  }

  public void setWorkBianZhiLeiXing(String workBianZhiLeiXing) {
    this.workBianZhiLeiXing = workBianZhiLeiXing;
  }

  public String getWorkZhiWu() {
    return workZhiWu;
  }

  public void setWorkZhiWu(String workZhiWu) {
    this.workZhiWu = workZhiWu;
  }

  public String getWorkZhiWuJiBie() {
    return workZhiWuJiBie;
  }

  public void setWorkZhiWuJiBie(String workZhiWuJiBie) {
    this.workZhiWuJiBie = workZhiWuJiBie;
  }

  public String getWorkZhiCheng() {
    return workZhiCheng;
  }

  public void setWorkZhiCheng(String workZhiCheng) {
    this.workZhiCheng = workZhiCheng;
  }

  public String getWorkZhiChengJiBie() {
    return workZhiChengJiBie;
  }

  public void setWorkZhiChengJiBie(String workZhiChengJiBie) {
    this.workZhiChengJiBie = workZhiChengJiBie;
  }

  public String getWorkTiQianTuiXiu() {
    return workTiQianTuiXiu;
  }

  public void setWorkTiQianTuiXiu(String workTiQianTuiXiu) {
    this.workTiQianTuiXiu = workTiQianTuiXiu;
  }

  public String getWorkZhengShiTuiXiu() {
    return workZhengShiTuiXiu;
  }

  public void setWorkZhengShiTuiXiu(String workZhengShiTuiXiu) {
    this.workZhengShiTuiXiu = workZhengShiTuiXiu;
  }

  public String getWorkTuiXiuBuMen() {
    return workTuiXiuBuMen;
  }

  public void setWorkTuiXiuBuMen(String workTuiXiuBuMen) {
    this.workTuiXiuBuMen = workTuiXiuBuMen;
  }

  public String getBaseZhengZhiMianMao() {
    return baseZhengZhiMianMao;
  }

  public void setBaseZhengZhiMianMao(String baseZhengZhiMianMao) {
    this.baseZhengZhiMianMao = baseZhengZhiMianMao;
  }

  public String getWorkZhuanYeHeGongZhong() {
    return workZhuanYeHeGongZhong;
  }

  public void setWorkZhuanYeHeGongZhong(String workZhuanYeHeGongZhong) {
    this.workZhuanYeHeGongZhong = workZhuanYeHeGongZhong;
  }

  public String getNowSuoShuZhiBu() {
    return nowSuoShuZhiBu;
  }

  public void setNowSuoShuZhiBu(String nowSuoShuZhiBu) {
    this.nowSuoShuZhiBu = nowSuoShuZhiBu;
  }

  public String getHisJiaRuZuZhi() {
    return hisJiaRuZuZhi;
  }

  public void setHisJiaRuZuZhi(String hisJiaRuZuZhi) {
    this.hisJiaRuZuZhi = hisJiaRuZuZhi;
  }

  public String getHisZhengFuJinTie() {
    return hisZhengFuJinTie;
  }

  public void setHisZhengFuJinTie(String hisZhengFuJinTie) {
    this.hisZhengFuJinTie = hisZhengFuJinTie;
  }

  public String getHisZhengFuJinTieDengJi() {
    return hisZhengFuJinTieDengJi;
  }

  public void setHisZhengFuJinTieDengJi(String hisZhengFuJinTieDengJi) {
    this.hisZhengFuJinTieDengJi = hisZhengFuJinTieDengJi;
  }

  public String getHisFuZhuanTuiJunRen() {
    return hisFuZhuanTuiJunRen;
  }

  public void setHisFuZhuanTuiJunRen(String hisFuZhuanTuiJunRen) {
    this.hisFuZhuanTuiJunRen = hisFuZhuanTuiJunRen;
  }

  public String getHisShangCan() {
    return hisShangCan;
  }

  public void setHisShangCan(String hisShangCan) {
    this.hisShangCan = hisShangCan;
  }

  public String getHisShangCanDengJi() {
    return hisShangCanDengJi;
  }

  public void setHisShangCanDengJi(String hisShangCanDengJi) {
    this.hisShangCanDengJi = hisShangCanDengJi;
  }

  public String getHisLiZhanGong() {
    return hisLiZhanGong;
  }

  public void setHisLiZhanGong(String hisLiZhanGong) {
    this.hisLiZhanGong = hisLiZhanGong;
  }

  public String getHisLaZhanGongDengJi() {
    return hisLaZhanGongDengJi;
  }

  public void setHisLaZhanGongDengJi(String hisLaZhanGongDengJi) {
    this.hisLaZhanGongDengJi = hisLaZhanGongDengJi;
  }

  public String getBaseDuShengZiNv() {
    return baseDuShengZiNv;
  }

  public void setBaseDuShengZiNv(String baseDuShengZiNv) {
    this.baseDuShengZiNv = baseDuShengZiNv;
  }

  public String getHisLaoMo() {
    return hisLaoMo;
  }

  public void setHisLaoMo(String hisLaoMo) {
    this.hisLaoMo = hisLaoMo;
  }

  public String getHisLaoMoDengJi() {
    return hisLaoMoDengJi;
  }

  public void setHisLaoMoDengJi(String hisLaoMoDengJi) {
    this.hisLaoMoDengJi = hisLaoMoDengJi;
  }

  public String getNowGongZiHao() {
    return nowGongZiHao;
  }

  public void setNowGongZiHao(String nowGongZiHao) {
    this.nowGongZiHao = nowGongZiHao;
  }

  public String getNowYiKaTong() {
    return nowYiKaTong;
  }

  public void setNowYiKaTong(String nowYiKaTong) {
    this.nowYiKaTong = nowYiKaTong;
  }

  public String getNowManXingJiBing() {
    return nowManXingJiBing;
  }

  public void setNowManXingJiBing(String nowManXingJiBing) {
    this.nowManXingJiBing = nowManXingJiBing;
  }

  public String getNowJianKangZhuangKuang() {
    return nowJianKangZhuangKuang;
  }

  public void setNowJianKangZhuangKuang(String nowJianKangZhuangKuang) {
    this.nowJianKangZhuangKuang = nowJianKangZhuangKuang;
  }

  public String getConnXianHuKouDiZhi() {
    return connXianHuKouDiZhi;
  }

  public void setConnXianHuKouDiZhi(String connXianHuKouDiZhi) {
    this.connXianHuKouDiZhi = connXianHuKouDiZhi;
  }

  public String getConnYuZiNvShengHuo() {
    return connYuZiNvShengHuo;
  }

  public void setConnYuZiNvShengHuo(String connYuZiNvShengHuo) {
    this.connYuZiNvShengHuo = connYuZiNvShengHuo;
  }

  public String getConnYuShuiShengHuo() {
    return connYuShuiShengHuo;
  }

  public void setConnYuShuiShengHuo(String connYuShuiShengHuo) {
    this.connYuShuiShengHuo = connYuShuiShengHuo;
  }

  public String getConnXianJuZhuDiZhi() {
    return connXianJuZhuDiZhi;
  }

  public void setConnXianJuZhuDiZhi(String connXianJuZhuDiZhi) {
    this.connXianJuZhuDiZhi = connXianJuZhuDiZhi;
  }

  public String getConnZhuZhaiDianHua() {
    return connZhuZhaiDianHua;
  }

  public void setConnZhuZhaiDianHua(String connZhuZhaiDianHua) {
    this.connZhuZhaiDianHua = connZhuZhaiDianHua;
  }

  public String getConnShouJiHaoMa() {
    return connShouJiHaoMa;
  }

  public void setConnShouJiHaoMa(String connShouJiHaoMa) {
    this.connShouJiHaoMa = connShouJiHaoMa;
  }

  public String getConnLiShiHaoMa() {
    return connLiShiHaoMa;
  }

  public void setConnLiShiHaoMa(String connLiShiHaoMa) {
    this.connLiShiHaoMa = connLiShiHaoMa;
  }

  public String getConnEmailOrQq() {
    return connEmailOrQq;
  }

  public void setConnEmailOrQq(String connEmailOrQq) {
    this.connEmailOrQq = connEmailOrQq;
  }

  public String getConnPeiOuHuoZiNvEmail() {
    return connPeiOuHuoZiNvEmail;
  }

  public void setConnPeiOuHuoZiNvEmail(String connPeiOuHuoZiNvEmail) {
    this.connPeiOuHuoZiNvEmail = connPeiOuHuoZiNvEmail;
  }

  public String getMateHunYinZhuangKuang() {
    return mateHunYinZhuangKuang;
  }

  public void setMateHunYinZhuangKuang(String mateHunYinZhuangKuang) {
    this.mateHunYinZhuangKuang = mateHunYinZhuangKuang;
  }

  public String getMatePeiOuName() {
    return matePeiOuName;
  }

  public void setMatePeiOuName(String matePeiOuName) {
    this.matePeiOuName = matePeiOuName;
  }

  public String getMatePeiOuPhone() {
    return matePeiOuPhone;
  }

  public void setMatePeiOuPhone(String matePeiOuPhone) {
    this.matePeiOuPhone = matePeiOuPhone;
  }

  public String getMatePeiOuJianKang() {
    return matePeiOuJianKang;
  }

  public void setMatePeiOuJianKang(String matePeiOuJianKang) {
    this.matePeiOuJianKang = matePeiOuJianKang;
  }

  public String getLianXiRenName() {
    return lianXiRenName;
  }

  public void setLianXiRenName(String lianXiRenName) {
    this.lianXiRenName = lianXiRenName;
  }

  public String getLianXiRenGuanXi() {
    return lianXiRenGuanXi;
  }

  public void setLianXiRenGuanXi(String lianXiRenGuanXi) {
    this.lianXiRenGuanXi = lianXiRenGuanXi;
  }

  public String getLianXiRenPhone() {
    return lianXiRenPhone;
  }

  public void setLianXiRenPhone(String lianXiRenPhone) {
    this.lianXiRenPhone = lianXiRenPhone;
  }

  public String getHisShuangZhiGong() {
    return hisShuangZhiGong;
  }

  public void setHisShuangZhiGong(String hisShuangZhiGong) {
    this.hisShuangZhiGong = hisShuangZhiGong;
  }

  public String getChildrenZiNvName() {
    return childrenZiNvName;
  }

  public void setChildrenZiNvName(String childrenZiNvName) {
    this.childrenZiNvName = childrenZiNvName;
  }

  public String getChildrenZiNvAddress() {
    return childrenZiNvAddress;
  }

  public void setChildrenZiNvAddress(String childrenZiNvAddress) {
    this.childrenZiNvAddress = childrenZiNvAddress;
  }

  public String getChildrenZiNvDanWei() {
    return childrenZiNvDanWei;
  }

  public void setChildrenZiNvDanWei(String childrenZiNvDanWei) {
    this.childrenZiNvDanWei = childrenZiNvDanWei;
  }

  public String getChildrenZiNvPhone() {
    return childrenZiNvPhone;
  }

  public void setChildrenZiNvPhone(String childrenZiNvPhone) {
    this.childrenZiNvPhone = childrenZiNvPhone;
  }

  public String getNowAiHaoXiangMu() {
    return nowAiHaoXiangMu;
  }

  public void setNowAiHaoXiangMu(String nowAiHaoXiangMu) {
    this.nowAiHaoXiangMu = nowAiHaoXiangMu;
  }

  public String getNowJianChiJianShen() {
    return nowJianChiJianShen;
  }

  public void setNowJianChiJianShen(String nowJianChiJianShen) {
    this.nowJianChiJianShen = nowJianChiJianShen;
  }

  public String getXiaoNeiName() {
    return xiaoNeiName;
  }

  public void setXiaoNeiName(String xiaoNeiName) {
    this.xiaoNeiName = xiaoNeiName;
  }

  public String getXiaoNeiGuanXi() {
    return xiaoNeiGuanXi;
  }

  public void setXiaoNeiGuanXi(String xiaoNeiGuanXi) {
    this.xiaoNeiGuanXi = xiaoNeiGuanXi;
  }

  public String getXiaoNeiPhone() {
    return xiaoNeiPhone;
  }

  public void setXiaoNeiPhone(String xiaoNeiPhone) {
    this.xiaoNeiPhone = xiaoNeiPhone;
  }

  public String getXiaoNeiBuMen() {
    return xiaoNeiBuMen;
  }

  public void setXiaoNeiBuMen(String xiaoNeiBuMen) {
    this.xiaoNeiBuMen = xiaoNeiBuMen;
  }

  public String getXiaoNeiAddress() {
    return xiaoNeiAddress;
  }

  public void setXiaoNeiAddress(String xiaoNeiAddress) {
    this.xiaoNeiAddress = xiaoNeiAddress;
  }

  public String getNowLaoNianTiXieZu() {
    return nowLaoNianTiXieZu;
  }

  public void setNowLaoNianTiXieZu(String nowLaoNianTiXieZu) {
    this.nowLaoNianTiXieZu = nowLaoNianTiXieZu;
  }

  public String getNowLiuLanWebsite() {
    return nowLiuLanWebsite;
  }

  public void setNowLiuLanWebsite(String nowLiuLanWebsite) {
    this.nowLiuLanWebsite = nowLiuLanWebsite;
  }

  public String getNowXiaoWaiTuanTiZhiWu() {
    return nowXiaoWaiTuanTiZhiWu;
  }

  public void setNowXiaoWaiTuanTiZhiWu(String nowXiaoWaiTuanTiZhiWu) {
    this.nowXiaoWaiTuanTiZhiWu = nowXiaoWaiTuanTiZhiWu;
  }

  public String getHisJunShuJunLie() {
    return hisJunShuJunLie;
  }

  public void setHisJunShuJunLie(String hisJunShuJunLie) {
    this.hisJunShuJunLie = hisJunShuJunLie;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public String getHisUnionGroup() {
    return hisUnionGroup;
  }

  public void setHisUnionGroup(String hisUnionGroup) {
    this.hisUnionGroup = hisUnionGroup;
  }

}
