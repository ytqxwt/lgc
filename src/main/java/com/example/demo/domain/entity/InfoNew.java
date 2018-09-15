package com.example.demo.domain.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;

@Entity
@Table(name = "info_new", schema = "Retirement_management_system", catalog = "")
public class InfoNew {
  @Override
  public String toString() {
    try {
      return new ObjectMapper().writeValueAsString(this);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return null;
  }

  private int id;
  private String basePhotoUrl;
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
  private String tianBiaoShiJian;

  @Id
  @Column(name = "id", nullable = false)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Basic
  @Column(name = "base_photo_url", nullable = true, length = 45)
  public String getBasePhotoUrl() {
    return basePhotoUrl;
  }

  public void setBasePhotoUrl(String basePhotoUrl) {
    this.basePhotoUrl = basePhotoUrl;
  }

  @Basic
  @Column(name = "base_name", nullable = true, length = 45)
  public String getBaseName() {
    return baseName;
  }

  public void setBaseName(String baseName) {
    this.baseName = baseName;
  }

  @Basic
  @Column(name = "base_sex", nullable = true, length = 45)
  public String getBaseSex() {
    return baseSex;
  }

  public void setBaseSex(String baseSex) {
    this.baseSex = baseSex;
  }

  @Basic
  @Column(name = "work_kai_shi_gong_zuo", nullable = true, length = 45)
  public String getWorkKaiShiGongZuo() {
    return workKaiShiGongZuo;
  }

  public void setWorkKaiShiGongZuo(String workKaiShiGongZuo) {
    this.workKaiShiGongZuo = workKaiShiGongZuo;
  }

  @Basic
  @Column(name = "base_ji_guan", nullable = true, length = 45)
  public String getBaseJiGuan() {
    return baseJiGuan;
  }

  public void setBaseJiGuan(String baseJiGuan) {
    this.baseJiGuan = baseJiGuan;
  }

  @Basic
  @Column(name = "base_sheng_ri", nullable = true, length = 45)
  public String getBaseShengRi() {
    return baseShengRi;
  }

  public void setBaseShengRi(String baseShengRi) {
    this.baseShengRi = baseShengRi;
  }

  @Basic
  @Column(name = "work_dao_xiao_shi_jian", nullable = true, length = 45)
  public String getWorkDaoXiaoShiJian() {
    return workDaoXiaoShiJian;
  }

  public void setWorkDaoXiaoShiJian(String workDaoXiaoShiJian) {
    this.workDaoXiaoShiJian = workDaoXiaoShiJian;
  }

  @Basic
  @Column(name = "base_shen_fen_zheng", nullable = true, length = 45)
  public String getBaseShenFenZheng() {
    return baseShenFenZheng;
  }

  public void setBaseShenFenZheng(String baseShenFenZheng) {
    this.baseShenFenZheng = baseShenFenZheng;
  }

  @Basic
  @Column(name = "base_min_zu", nullable = true, length = 45)
  public String getBaseMinZu() {
    return baseMinZu;
  }

  public void setBaseMinZu(String baseMinZu) {
    this.baseMinZu = baseMinZu;
  }

  @Basic
  @Column(name = "base_xue_li", nullable = true, length = 45)
  public String getBaseXueLi() {
    return baseXueLi;
  }

  public void setBaseXueLi(String baseXueLi) {
    this.baseXueLi = baseXueLi;
  }

  @Basic
  @Column(name = "base_xue_wei", nullable = true, length = 45)
  public String getBaseXueWei() {
    return baseXueWei;
  }

  public void setBaseXueWei(String baseXueWei) {
    this.baseXueWei = baseXueWei;
  }

  @Basic
  @Column(name = "work_bian_zhi_lei_xing", nullable = true, length = 45)
  public String getWorkBianZhiLeiXing() {
    return workBianZhiLeiXing;
  }

  public void setWorkBianZhiLeiXing(String workBianZhiLeiXing) {
    this.workBianZhiLeiXing = workBianZhiLeiXing;
  }

  @Basic
  @Column(name = "work_zhi_wu", nullable = true, length = 45)
  public String getWorkZhiWu() {
    return workZhiWu;
  }

  public void setWorkZhiWu(String workZhiWu) {
    this.workZhiWu = workZhiWu;
  }

  @Basic
  @Column(name = "work_zhi_wu_ji_bie", nullable = true, length = 45)
  public String getWorkZhiWuJiBie() {
    return workZhiWuJiBie;
  }

  public void setWorkZhiWuJiBie(String workZhiWuJiBie) {
    this.workZhiWuJiBie = workZhiWuJiBie;
  }

  @Basic
  @Column(name = "work_zhi_cheng", nullable = true, length = 45)
  public String getWorkZhiCheng() {
    return workZhiCheng;
  }

  public void setWorkZhiCheng(String workZhiCheng) {
    this.workZhiCheng = workZhiCheng;
  }

  @Basic
  @Column(name = "work_zhi_cheng_ji_bie", nullable = true, length = 45)
  public String getWorkZhiChengJiBie() {
    return workZhiChengJiBie;
  }

  public void setWorkZhiChengJiBie(String workZhiChengJiBie) {
    this.workZhiChengJiBie = workZhiChengJiBie;
  }

  @Basic
  @Column(name = "work_ti_qian_tui_xiu", nullable = true, length = 45)
  public String getWorkTiQianTuiXiu() {
    return workTiQianTuiXiu;
  }

  public void setWorkTiQianTuiXiu(String workTiQianTuiXiu) {
    this.workTiQianTuiXiu = workTiQianTuiXiu;
  }

  @Basic
  @Column(name = "work_zheng_shi_tui_xiu", nullable = true, length = 45)
  public String getWorkZhengShiTuiXiu() {
    return workZhengShiTuiXiu;
  }

  public void setWorkZhengShiTuiXiu(String workZhengShiTuiXiu) {
    this.workZhengShiTuiXiu = workZhengShiTuiXiu;
  }

  @Basic
  @Column(name = "work_tui_xiu_bu_men", nullable = true, length = 45)
  public String getWorkTuiXiuBuMen() {
    return workTuiXiuBuMen;
  }

  public void setWorkTuiXiuBuMen(String workTuiXiuBuMen) {
    this.workTuiXiuBuMen = workTuiXiuBuMen;
  }

  @Basic
  @Column(name = "base_zheng_zhi_mian_mao", nullable = true, length = 45)
  public String getBaseZhengZhiMianMao() {
    return baseZhengZhiMianMao;
  }

  public void setBaseZhengZhiMianMao(String baseZhengZhiMianMao) {
    this.baseZhengZhiMianMao = baseZhengZhiMianMao;
  }

  @Basic
  @Column(name = "work_zhuan_ye_he_gong_zhong", nullable = true, length = 45)
  public String getWorkZhuanYeHeGongZhong() {
    return workZhuanYeHeGongZhong;
  }

  public void setWorkZhuanYeHeGongZhong(String workZhuanYeHeGongZhong) {
    this.workZhuanYeHeGongZhong = workZhuanYeHeGongZhong;
  }

  @Basic
  @Column(name = "now_suo_shu_zhi_bu", nullable = true, length = 45)
  public String getNowSuoShuZhiBu() {
    return nowSuoShuZhiBu;
  }

  public void setNowSuoShuZhiBu(String nowSuoShuZhiBu) {
    this.nowSuoShuZhiBu = nowSuoShuZhiBu;
  }

  @Basic
  @Column(name = "his_jia_ru_zu_zhi", nullable = true, length = 45)
  public String getHisJiaRuZuZhi() {
    return hisJiaRuZuZhi;
  }

  public void setHisJiaRuZuZhi(String hisJiaRuZuZhi) {
    this.hisJiaRuZuZhi = hisJiaRuZuZhi;
  }

  @Basic
  @Column(name = "his_zheng_fu_jin_tie", nullable = true, length = 45)
  public String getHisZhengFuJinTie() {
    return hisZhengFuJinTie;
  }

  public void setHisZhengFuJinTie(String hisZhengFuJinTie) {
    this.hisZhengFuJinTie = hisZhengFuJinTie;
  }

  @Basic
  @Column(name = "his_zheng_fu_jin_tie_deng_ji", nullable = true, length = 45)
  public String getHisZhengFuJinTieDengJi() {
    return hisZhengFuJinTieDengJi;
  }

  public void setHisZhengFuJinTieDengJi(String hisZhengFuJinTieDengJi) {
    this.hisZhengFuJinTieDengJi = hisZhengFuJinTieDengJi;
  }

  @Basic
  @Column(name = "his_fu_zhuan_tui_jun_ren", nullable = true, length = 45)
  public String getHisFuZhuanTuiJunRen() {
    return hisFuZhuanTuiJunRen;
  }

  public void setHisFuZhuanTuiJunRen(String hisFuZhuanTuiJunRen) {
    this.hisFuZhuanTuiJunRen = hisFuZhuanTuiJunRen;
  }

  @Basic
  @Column(name = "his_shang_can", nullable = true, length = 45)
  public String getHisShangCan() {
    return hisShangCan;
  }

  public void setHisShangCan(String hisShangCan) {
    this.hisShangCan = hisShangCan;
  }

  @Basic
  @Column(name = "his_shang_can_deng_ji", nullable = true, length = 45)
  public String getHisShangCanDengJi() {
    return hisShangCanDengJi;
  }

  public void setHisShangCanDengJi(String hisShangCanDengJi) {
    this.hisShangCanDengJi = hisShangCanDengJi;
  }

  @Basic
  @Column(name = "his_li_zhan_gong", nullable = true, length = 45)
  public String getHisLiZhanGong() {
    return hisLiZhanGong;
  }

  public void setHisLiZhanGong(String hisLiZhanGong) {
    this.hisLiZhanGong = hisLiZhanGong;
  }

  @Basic
  @Column(name = "his_la_zhan_gong_deng_ji", nullable = true, length = 45)
  public String getHisLaZhanGongDengJi() {
    return hisLaZhanGongDengJi;
  }

  public void setHisLaZhanGongDengJi(String hisLaZhanGongDengJi) {
    this.hisLaZhanGongDengJi = hisLaZhanGongDengJi;
  }

  @Basic
  @Column(name = "base_du_sheng_zi_nv", nullable = true, length = 45)
  public String getBaseDuShengZiNv() {
    return baseDuShengZiNv;
  }

  public void setBaseDuShengZiNv(String baseDuShengZiNv) {
    this.baseDuShengZiNv = baseDuShengZiNv;
  }

  @Basic
  @Column(name = "his_lao_mo", nullable = true, length = 225)
  public String getHisLaoMo() {
    return hisLaoMo;
  }

  public void setHisLaoMo(String hisLaoMo) {
    this.hisLaoMo = hisLaoMo;
  }

  @Basic
  @Column(name = "his_lao_mo_deng_ji", nullable = true, length = 225)
  public String getHisLaoMoDengJi() {
    return hisLaoMoDengJi;
  }

  public void setHisLaoMoDengJi(String hisLaoMoDengJi) {
    this.hisLaoMoDengJi = hisLaoMoDengJi;
  }

  @Basic
  @Column(name = "now_gong_zi_hao", nullable = true, length = 45)
  public String getNowGongZiHao() {
    return nowGongZiHao;
  }

  public void setNowGongZiHao(String nowGongZiHao) {
    this.nowGongZiHao = nowGongZiHao;
  }

  @Basic
  @Column(name = "now_yi_ka_tong", nullable = true, length = 45)
  public String getNowYiKaTong() {
    return nowYiKaTong;
  }

  public void setNowYiKaTong(String nowYiKaTong) {
    this.nowYiKaTong = nowYiKaTong;
  }

  @Basic
  @Column(name = "now_man_xing_ji_bing", nullable = true, length = 45)
  public String getNowManXingJiBing() {
    return nowManXingJiBing;
  }

  public void setNowManXingJiBing(String nowManXingJiBing) {
    this.nowManXingJiBing = nowManXingJiBing;
  }

  @Basic
  @Column(name = "now_jian_kang_zhuang_kuang", nullable = true, length = 45)
  public String getNowJianKangZhuangKuang() {
    return nowJianKangZhuangKuang;
  }

  public void setNowJianKangZhuangKuang(String nowJianKangZhuangKuang) {
    this.nowJianKangZhuangKuang = nowJianKangZhuangKuang;
  }

  @Basic
  @Column(name = "conn_xian_hu_kou_di_zhi", nullable = true, length = 45)
  public String getConnXianHuKouDiZhi() {
    return connXianHuKouDiZhi;
  }

  public void setConnXianHuKouDiZhi(String connXianHuKouDiZhi) {
    this.connXianHuKouDiZhi = connXianHuKouDiZhi;
  }

  @Basic
  @Column(name = "conn_yu_zi_nv_sheng_huo", nullable = true, length = 45)
  public String getConnYuZiNvShengHuo() {
    return connYuZiNvShengHuo;
  }

  public void setConnYuZiNvShengHuo(String connYuZiNvShengHuo) {
    this.connYuZiNvShengHuo = connYuZiNvShengHuo;
  }

  @Basic
  @Column(name = "conn_yu_shui_sheng_huo", nullable = true, length = 45)
  public String getConnYuShuiShengHuo() {
    return connYuShuiShengHuo;
  }

  public void setConnYuShuiShengHuo(String connYuShuiShengHuo) {
    this.connYuShuiShengHuo = connYuShuiShengHuo;
  }

  @Basic
  @Column(name = "conn_xian_ju_zhu_di_zhi", nullable = true, length = 45)
  public String getConnXianJuZhuDiZhi() {
    return connXianJuZhuDiZhi;
  }

  public void setConnXianJuZhuDiZhi(String connXianJuZhuDiZhi) {
    this.connXianJuZhuDiZhi = connXianJuZhuDiZhi;
  }

  @Basic
  @Column(name = "conn_zhu_zhai_dian_hua", nullable = true, length = 45)
  public String getConnZhuZhaiDianHua() {
    return connZhuZhaiDianHua;
  }

  public void setConnZhuZhaiDianHua(String connZhuZhaiDianHua) {
    this.connZhuZhaiDianHua = connZhuZhaiDianHua;
  }

  @Basic
  @Column(name = "conn_shou_ji_hao_ma", nullable = true, length = 45)
  public String getConnShouJiHaoMa() {
    return connShouJiHaoMa;
  }

  public void setConnShouJiHaoMa(String connShouJiHaoMa) {
    this.connShouJiHaoMa = connShouJiHaoMa;
  }

  @Basic
  @Column(name = "conn_li_shi_hao_ma", nullable = true, length = 45)
  public String getConnLiShiHaoMa() {
    return connLiShiHaoMa;
  }

  public void setConnLiShiHaoMa(String connLiShiHaoMa) {
    this.connLiShiHaoMa = connLiShiHaoMa;
  }

  @Basic
  @Column(name = "conn_email_or_qq", nullable = true, length = 45)
  public String getConnEmailOrQq() {
    return connEmailOrQq;
  }

  public void setConnEmailOrQq(String connEmailOrQq) {
    this.connEmailOrQq = connEmailOrQq;
  }

  @Basic
  @Column(name = "conn_pei_ou_huo_zi_nv_email", nullable = true, length = 45)
  public String getConnPeiOuHuoZiNvEmail() {
    return connPeiOuHuoZiNvEmail;
  }

  public void setConnPeiOuHuoZiNvEmail(String connPeiOuHuoZiNvEmail) {
    this.connPeiOuHuoZiNvEmail = connPeiOuHuoZiNvEmail;
  }

  @Basic
  @Column(name = "mate_hun_yin_zhuang_kuang", nullable = true, length = 45)
  public String getMateHunYinZhuangKuang() {
    return mateHunYinZhuangKuang;
  }

  public void setMateHunYinZhuangKuang(String mateHunYinZhuangKuang) {
    this.mateHunYinZhuangKuang = mateHunYinZhuangKuang;
  }

  @Basic
  @Column(name = "mate_pei_ou_name", nullable = true, length = 45)
  public String getMatePeiOuName() {
    return matePeiOuName;
  }

  public void setMatePeiOuName(String matePeiOuName) {
    this.matePeiOuName = matePeiOuName;
  }

  @Basic
  @Column(name = "mate_pei_ou_phone", nullable = true, length = 45)
  public String getMatePeiOuPhone() {
    return matePeiOuPhone;
  }

  public void setMatePeiOuPhone(String matePeiOuPhone) {
    this.matePeiOuPhone = matePeiOuPhone;
  }

  @Basic
  @Column(name = "mate_pei_ou_jian_kang", nullable = true, length = 45)
  public String getMatePeiOuJianKang() {
    return matePeiOuJianKang;
  }

  public void setMatePeiOuJianKang(String matePeiOuJianKang) {
    this.matePeiOuJianKang = matePeiOuJianKang;
  }

  @Basic
  @Column(name = "lian_xi_ren_name", nullable = true, length = 45)
  public String getLianXiRenName() {
    return lianXiRenName;
  }

  public void setLianXiRenName(String lianXiRenName) {
    this.lianXiRenName = lianXiRenName;
  }

  @Basic
  @Column(name = "lian_xi_ren_guan_xi", nullable = true, length = 45)
  public String getLianXiRenGuanXi() {
    return lianXiRenGuanXi;
  }

  public void setLianXiRenGuanXi(String lianXiRenGuanXi) {
    this.lianXiRenGuanXi = lianXiRenGuanXi;
  }

  @Basic
  @Column(name = "lian_xi_ren_phone", nullable = true, length = 45)
  public String getLianXiRenPhone() {
    return lianXiRenPhone;
  }

  public void setLianXiRenPhone(String lianXiRenPhone) {
    this.lianXiRenPhone = lianXiRenPhone;
  }

  @Basic
  @Column(name = "his_shuang_zhi_gong", nullable = true, length = 45)
  public String getHisShuangZhiGong() {
    return hisShuangZhiGong;
  }

  public void setHisShuangZhiGong(String hisShuangZhiGong) {
    this.hisShuangZhiGong = hisShuangZhiGong;
  }

  @Basic
  @Column(name = "children_zi_nv_name", nullable = true, length = 45)
  public String getChildrenZiNvName() {
    return childrenZiNvName;
  }

  public void setChildrenZiNvName(String childrenZiNvName) {
    this.childrenZiNvName = childrenZiNvName;
  }

  @Basic
  @Column(name = "children_zi_nv_address", nullable = true, length = 45)
  public String getChildrenZiNvAddress() {
    return childrenZiNvAddress;
  }

  public void setChildrenZiNvAddress(String childrenZiNvAddress) {
    this.childrenZiNvAddress = childrenZiNvAddress;
  }

  @Basic
  @Column(name = "children_zi_nv_dan_wei", nullable = true, length = 45)
  public String getChildrenZiNvDanWei() {
    return childrenZiNvDanWei;
  }

  public void setChildrenZiNvDanWei(String childrenZiNvDanWei) {
    this.childrenZiNvDanWei = childrenZiNvDanWei;
  }

  @Basic
  @Column(name = "children_zi_nv_phone", nullable = true, length = 45)
  public String getChildrenZiNvPhone() {
    return childrenZiNvPhone;
  }

  public void setChildrenZiNvPhone(String childrenZiNvPhone) {
    this.childrenZiNvPhone = childrenZiNvPhone;
  }

  @Basic
  @Column(name = "now_ai_hao_xiang_mu", nullable = true, length = 45)
  public String getNowAiHaoXiangMu() {
    return nowAiHaoXiangMu;
  }

  public void setNowAiHaoXiangMu(String nowAiHaoXiangMu) {
    this.nowAiHaoXiangMu = nowAiHaoXiangMu;
  }

  @Basic
  @Column(name = "now_jian_chi_jian_shen", nullable = true, length = 45)
  public String getNowJianChiJianShen() {
    return nowJianChiJianShen;
  }

  public void setNowJianChiJianShen(String nowJianChiJianShen) {
    this.nowJianChiJianShen = nowJianChiJianShen;
  }

  @Basic
  @Column(name = "xiao_nei_name", nullable = true, length = 255)
  public String getXiaoNeiName() {
    return xiaoNeiName;
  }

  public void setXiaoNeiName(String xiaoNeiName) {
    this.xiaoNeiName = xiaoNeiName;
  }

  @Basic
  @Column(name = "xiao_nei_guan_xi", nullable = true, length = 45)
  public String getXiaoNeiGuanXi() {
    return xiaoNeiGuanXi;
  }

  public void setXiaoNeiGuanXi(String xiaoNeiGuanXi) {
    this.xiaoNeiGuanXi = xiaoNeiGuanXi;
  }

  @Basic
  @Column(name = "xiao_nei_phone", nullable = true, length = 45)
  public String getXiaoNeiPhone() {
    return xiaoNeiPhone;
  }

  public void setXiaoNeiPhone(String xiaoNeiPhone) {
    this.xiaoNeiPhone = xiaoNeiPhone;
  }

  @Basic
  @Column(name = "xiao_nei_bu_men", nullable = true, length = 45)
  public String getXiaoNeiBuMen() {
    return xiaoNeiBuMen;
  }

  public void setXiaoNeiBuMen(String xiaoNeiBuMen) {
    this.xiaoNeiBuMen = xiaoNeiBuMen;
  }

  @Basic
  @Column(name = "xiao_nei_address", nullable = true, length = 45)
  public String getXiaoNeiAddress() {
    return xiaoNeiAddress;
  }

  public void setXiaoNeiAddress(String xiaoNeiAddress) {
    this.xiaoNeiAddress = xiaoNeiAddress;
  }

  @Basic
  @Column(name = "now_lao_nian_ti_xie_zu", nullable = true, length = 45)
  public String getNowLaoNianTiXieZu() {
    return nowLaoNianTiXieZu;
  }

  public void setNowLaoNianTiXieZu(String nowLaoNianTiXieZu) {
    this.nowLaoNianTiXieZu = nowLaoNianTiXieZu;
  }

  @Basic
  @Column(name = "now_liu_lan_website", nullable = true, length = 45)
  public String getNowLiuLanWebsite() {
    return nowLiuLanWebsite;
  }

  public void setNowLiuLanWebsite(String nowLiuLanWebsite) {
    this.nowLiuLanWebsite = nowLiuLanWebsite;
  }

  @Basic
  @Column(name = "now_xiao_wai_tuan_ti_zhi_wu", nullable = true, length = 45)
  public String getNowXiaoWaiTuanTiZhiWu() {
    return nowXiaoWaiTuanTiZhiWu;
  }

  public void setNowXiaoWaiTuanTiZhiWu(String nowXiaoWaiTuanTiZhiWu) {
    this.nowXiaoWaiTuanTiZhiWu = nowXiaoWaiTuanTiZhiWu;
  }

  @Basic
  @Column(name = "his_jun_shu_jun_lie", nullable = true, length = 45)
  public String getHisJunShuJunLie() {
    return hisJunShuJunLie;
  }

  public void setHisJunShuJunLie(String hisJunShuJunLie) {
    this.hisJunShuJunLie = hisJunShuJunLie;
  }

  @Basic
  @Column(name = "remark", nullable = true, length = 225)
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  @Basic
  @Column(name = "his_union_group", nullable = true, length = 45)
  public String getHisUnionGroup() {
    return hisUnionGroup;
  }

  public void setHisUnionGroup(String hisUnionGroup) {
    this.hisUnionGroup = hisUnionGroup;
  }

  @Basic
  @Column(name = "tian_biao_shi_jian", nullable = true, length = 45)
  public String getTianBiaoShiJian() {
    return tianBiaoShiJian;
  }

  public void setTianBiaoShiJian(String tianBiaoShiJian) {
    this.tianBiaoShiJian = tianBiaoShiJian;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    InfoNew infoNew = (InfoNew) o;

    if (id != infoNew.id) return false;
    if (basePhotoUrl != null ? !basePhotoUrl.equals(infoNew.basePhotoUrl) : infoNew.basePhotoUrl != null) return false;
    if (baseName != null ? !baseName.equals(infoNew.baseName) : infoNew.baseName != null) return false;
    if (baseSex != null ? !baseSex.equals(infoNew.baseSex) : infoNew.baseSex != null) return false;
    if (workKaiShiGongZuo != null ? !workKaiShiGongZuo.equals(infoNew.workKaiShiGongZuo) : infoNew.workKaiShiGongZuo != null)
      return false;
    if (baseJiGuan != null ? !baseJiGuan.equals(infoNew.baseJiGuan) : infoNew.baseJiGuan != null) return false;
    if (baseShengRi != null ? !baseShengRi.equals(infoNew.baseShengRi) : infoNew.baseShengRi != null) return false;
    if (workDaoXiaoShiJian != null ? !workDaoXiaoShiJian.equals(infoNew.workDaoXiaoShiJian) : infoNew.workDaoXiaoShiJian != null)
      return false;
    if (baseShenFenZheng != null ? !baseShenFenZheng.equals(infoNew.baseShenFenZheng) : infoNew.baseShenFenZheng != null)
      return false;
    if (baseMinZu != null ? !baseMinZu.equals(infoNew.baseMinZu) : infoNew.baseMinZu != null) return false;
    if (baseXueLi != null ? !baseXueLi.equals(infoNew.baseXueLi) : infoNew.baseXueLi != null) return false;
    if (baseXueWei != null ? !baseXueWei.equals(infoNew.baseXueWei) : infoNew.baseXueWei != null) return false;
    if (workBianZhiLeiXing != null ? !workBianZhiLeiXing.equals(infoNew.workBianZhiLeiXing) : infoNew.workBianZhiLeiXing != null)
      return false;
    if (workZhiWu != null ? !workZhiWu.equals(infoNew.workZhiWu) : infoNew.workZhiWu != null) return false;
    if (workZhiWuJiBie != null ? !workZhiWuJiBie.equals(infoNew.workZhiWuJiBie) : infoNew.workZhiWuJiBie != null)
      return false;
    if (workZhiCheng != null ? !workZhiCheng.equals(infoNew.workZhiCheng) : infoNew.workZhiCheng != null) return false;
    if (workZhiChengJiBie != null ? !workZhiChengJiBie.equals(infoNew.workZhiChengJiBie) : infoNew.workZhiChengJiBie != null)
      return false;
    if (workTiQianTuiXiu != null ? !workTiQianTuiXiu.equals(infoNew.workTiQianTuiXiu) : infoNew.workTiQianTuiXiu != null)
      return false;
    if (workZhengShiTuiXiu != null ? !workZhengShiTuiXiu.equals(infoNew.workZhengShiTuiXiu) : infoNew.workZhengShiTuiXiu != null)
      return false;
    if (workTuiXiuBuMen != null ? !workTuiXiuBuMen.equals(infoNew.workTuiXiuBuMen) : infoNew.workTuiXiuBuMen != null)
      return false;
    if (baseZhengZhiMianMao != null ? !baseZhengZhiMianMao.equals(infoNew.baseZhengZhiMianMao) : infoNew.baseZhengZhiMianMao != null)
      return false;
    if (workZhuanYeHeGongZhong != null ? !workZhuanYeHeGongZhong.equals(infoNew.workZhuanYeHeGongZhong) : infoNew.workZhuanYeHeGongZhong != null)
      return false;
    if (nowSuoShuZhiBu != null ? !nowSuoShuZhiBu.equals(infoNew.nowSuoShuZhiBu) : infoNew.nowSuoShuZhiBu != null)
      return false;
    if (hisJiaRuZuZhi != null ? !hisJiaRuZuZhi.equals(infoNew.hisJiaRuZuZhi) : infoNew.hisJiaRuZuZhi != null)
      return false;
    if (hisZhengFuJinTie != null ? !hisZhengFuJinTie.equals(infoNew.hisZhengFuJinTie) : infoNew.hisZhengFuJinTie != null)
      return false;
    if (hisZhengFuJinTieDengJi != null ? !hisZhengFuJinTieDengJi.equals(infoNew.hisZhengFuJinTieDengJi) : infoNew.hisZhengFuJinTieDengJi != null)
      return false;
    if (hisFuZhuanTuiJunRen != null ? !hisFuZhuanTuiJunRen.equals(infoNew.hisFuZhuanTuiJunRen) : infoNew.hisFuZhuanTuiJunRen != null)
      return false;
    if (hisShangCan != null ? !hisShangCan.equals(infoNew.hisShangCan) : infoNew.hisShangCan != null) return false;
    if (hisShangCanDengJi != null ? !hisShangCanDengJi.equals(infoNew.hisShangCanDengJi) : infoNew.hisShangCanDengJi != null)
      return false;
    if (hisLiZhanGong != null ? !hisLiZhanGong.equals(infoNew.hisLiZhanGong) : infoNew.hisLiZhanGong != null)
      return false;
    if (hisLaZhanGongDengJi != null ? !hisLaZhanGongDengJi.equals(infoNew.hisLaZhanGongDengJi) : infoNew.hisLaZhanGongDengJi != null)
      return false;
    if (baseDuShengZiNv != null ? !baseDuShengZiNv.equals(infoNew.baseDuShengZiNv) : infoNew.baseDuShengZiNv != null)
      return false;
    if (hisLaoMo != null ? !hisLaoMo.equals(infoNew.hisLaoMo) : infoNew.hisLaoMo != null) return false;
    if (hisLaoMoDengJi != null ? !hisLaoMoDengJi.equals(infoNew.hisLaoMoDengJi) : infoNew.hisLaoMoDengJi != null)
      return false;
    if (nowGongZiHao != null ? !nowGongZiHao.equals(infoNew.nowGongZiHao) : infoNew.nowGongZiHao != null) return false;
    if (nowYiKaTong != null ? !nowYiKaTong.equals(infoNew.nowYiKaTong) : infoNew.nowYiKaTong != null) return false;
    if (nowManXingJiBing != null ? !nowManXingJiBing.equals(infoNew.nowManXingJiBing) : infoNew.nowManXingJiBing != null)
      return false;
    if (nowJianKangZhuangKuang != null ? !nowJianKangZhuangKuang.equals(infoNew.nowJianKangZhuangKuang) : infoNew.nowJianKangZhuangKuang != null)
      return false;
    if (connXianHuKouDiZhi != null ? !connXianHuKouDiZhi.equals(infoNew.connXianHuKouDiZhi) : infoNew.connXianHuKouDiZhi != null)
      return false;
    if (connYuZiNvShengHuo != null ? !connYuZiNvShengHuo.equals(infoNew.connYuZiNvShengHuo) : infoNew.connYuZiNvShengHuo != null)
      return false;
    if (connYuShuiShengHuo != null ? !connYuShuiShengHuo.equals(infoNew.connYuShuiShengHuo) : infoNew.connYuShuiShengHuo != null)
      return false;
    if (connXianJuZhuDiZhi != null ? !connXianJuZhuDiZhi.equals(infoNew.connXianJuZhuDiZhi) : infoNew.connXianJuZhuDiZhi != null)
      return false;
    if (connZhuZhaiDianHua != null ? !connZhuZhaiDianHua.equals(infoNew.connZhuZhaiDianHua) : infoNew.connZhuZhaiDianHua != null)
      return false;
    if (connShouJiHaoMa != null ? !connShouJiHaoMa.equals(infoNew.connShouJiHaoMa) : infoNew.connShouJiHaoMa != null)
      return false;
    if (connLiShiHaoMa != null ? !connLiShiHaoMa.equals(infoNew.connLiShiHaoMa) : infoNew.connLiShiHaoMa != null)
      return false;
    if (connEmailOrQq != null ? !connEmailOrQq.equals(infoNew.connEmailOrQq) : infoNew.connEmailOrQq != null)
      return false;
    if (connPeiOuHuoZiNvEmail != null ? !connPeiOuHuoZiNvEmail.equals(infoNew.connPeiOuHuoZiNvEmail) : infoNew.connPeiOuHuoZiNvEmail != null)
      return false;
    if (mateHunYinZhuangKuang != null ? !mateHunYinZhuangKuang.equals(infoNew.mateHunYinZhuangKuang) : infoNew.mateHunYinZhuangKuang != null)
      return false;
    if (matePeiOuName != null ? !matePeiOuName.equals(infoNew.matePeiOuName) : infoNew.matePeiOuName != null)
      return false;
    if (matePeiOuPhone != null ? !matePeiOuPhone.equals(infoNew.matePeiOuPhone) : infoNew.matePeiOuPhone != null)
      return false;
    if (matePeiOuJianKang != null ? !matePeiOuJianKang.equals(infoNew.matePeiOuJianKang) : infoNew.matePeiOuJianKang != null)
      return false;
    if (lianXiRenName != null ? !lianXiRenName.equals(infoNew.lianXiRenName) : infoNew.lianXiRenName != null)
      return false;
    if (lianXiRenGuanXi != null ? !lianXiRenGuanXi.equals(infoNew.lianXiRenGuanXi) : infoNew.lianXiRenGuanXi != null)
      return false;
    if (lianXiRenPhone != null ? !lianXiRenPhone.equals(infoNew.lianXiRenPhone) : infoNew.lianXiRenPhone != null)
      return false;
    if (hisShuangZhiGong != null ? !hisShuangZhiGong.equals(infoNew.hisShuangZhiGong) : infoNew.hisShuangZhiGong != null)
      return false;
    if (childrenZiNvName != null ? !childrenZiNvName.equals(infoNew.childrenZiNvName) : infoNew.childrenZiNvName != null)
      return false;
    if (childrenZiNvAddress != null ? !childrenZiNvAddress.equals(infoNew.childrenZiNvAddress) : infoNew.childrenZiNvAddress != null)
      return false;
    if (childrenZiNvDanWei != null ? !childrenZiNvDanWei.equals(infoNew.childrenZiNvDanWei) : infoNew.childrenZiNvDanWei != null)
      return false;
    if (childrenZiNvPhone != null ? !childrenZiNvPhone.equals(infoNew.childrenZiNvPhone) : infoNew.childrenZiNvPhone != null)
      return false;
    if (nowAiHaoXiangMu != null ? !nowAiHaoXiangMu.equals(infoNew.nowAiHaoXiangMu) : infoNew.nowAiHaoXiangMu != null)
      return false;
    if (nowJianChiJianShen != null ? !nowJianChiJianShen.equals(infoNew.nowJianChiJianShen) : infoNew.nowJianChiJianShen != null)
      return false;
    if (xiaoNeiName != null ? !xiaoNeiName.equals(infoNew.xiaoNeiName) : infoNew.xiaoNeiName != null) return false;
    if (xiaoNeiGuanXi != null ? !xiaoNeiGuanXi.equals(infoNew.xiaoNeiGuanXi) : infoNew.xiaoNeiGuanXi != null)
      return false;
    if (xiaoNeiPhone != null ? !xiaoNeiPhone.equals(infoNew.xiaoNeiPhone) : infoNew.xiaoNeiPhone != null) return false;
    if (xiaoNeiBuMen != null ? !xiaoNeiBuMen.equals(infoNew.xiaoNeiBuMen) : infoNew.xiaoNeiBuMen != null) return false;
    if (xiaoNeiAddress != null ? !xiaoNeiAddress.equals(infoNew.xiaoNeiAddress) : infoNew.xiaoNeiAddress != null)
      return false;
    if (nowLaoNianTiXieZu != null ? !nowLaoNianTiXieZu.equals(infoNew.nowLaoNianTiXieZu) : infoNew.nowLaoNianTiXieZu != null)
      return false;
    if (nowLiuLanWebsite != null ? !nowLiuLanWebsite.equals(infoNew.nowLiuLanWebsite) : infoNew.nowLiuLanWebsite != null)
      return false;
    if (nowXiaoWaiTuanTiZhiWu != null ? !nowXiaoWaiTuanTiZhiWu.equals(infoNew.nowXiaoWaiTuanTiZhiWu) : infoNew.nowXiaoWaiTuanTiZhiWu != null)
      return false;
    if (hisJunShuJunLie != null ? !hisJunShuJunLie.equals(infoNew.hisJunShuJunLie) : infoNew.hisJunShuJunLie != null)
      return false;
    if (remark != null ? !remark.equals(infoNew.remark) : infoNew.remark != null) return false;
    if (hisUnionGroup != null ? !hisUnionGroup.equals(infoNew.hisUnionGroup) : infoNew.hisUnionGroup != null)
      return false;
    if (tianBiaoShiJian != null ? !tianBiaoShiJian.equals(infoNew.tianBiaoShiJian) : infoNew.tianBiaoShiJian != null)
      return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (basePhotoUrl != null ? basePhotoUrl.hashCode() : 0);
    result = 31 * result + (baseName != null ? baseName.hashCode() : 0);
    result = 31 * result + (baseSex != null ? baseSex.hashCode() : 0);
    result = 31 * result + (workKaiShiGongZuo != null ? workKaiShiGongZuo.hashCode() : 0);
    result = 31 * result + (baseJiGuan != null ? baseJiGuan.hashCode() : 0);
    result = 31 * result + (baseShengRi != null ? baseShengRi.hashCode() : 0);
    result = 31 * result + (workDaoXiaoShiJian != null ? workDaoXiaoShiJian.hashCode() : 0);
    result = 31 * result + (baseShenFenZheng != null ? baseShenFenZheng.hashCode() : 0);
    result = 31 * result + (baseMinZu != null ? baseMinZu.hashCode() : 0);
    result = 31 * result + (baseXueLi != null ? baseXueLi.hashCode() : 0);
    result = 31 * result + (baseXueWei != null ? baseXueWei.hashCode() : 0);
    result = 31 * result + (workBianZhiLeiXing != null ? workBianZhiLeiXing.hashCode() : 0);
    result = 31 * result + (workZhiWu != null ? workZhiWu.hashCode() : 0);
    result = 31 * result + (workZhiWuJiBie != null ? workZhiWuJiBie.hashCode() : 0);
    result = 31 * result + (workZhiCheng != null ? workZhiCheng.hashCode() : 0);
    result = 31 * result + (workZhiChengJiBie != null ? workZhiChengJiBie.hashCode() : 0);
    result = 31 * result + (workTiQianTuiXiu != null ? workTiQianTuiXiu.hashCode() : 0);
    result = 31 * result + (workZhengShiTuiXiu != null ? workZhengShiTuiXiu.hashCode() : 0);
    result = 31 * result + (workTuiXiuBuMen != null ? workTuiXiuBuMen.hashCode() : 0);
    result = 31 * result + (baseZhengZhiMianMao != null ? baseZhengZhiMianMao.hashCode() : 0);
    result = 31 * result + (workZhuanYeHeGongZhong != null ? workZhuanYeHeGongZhong.hashCode() : 0);
    result = 31 * result + (nowSuoShuZhiBu != null ? nowSuoShuZhiBu.hashCode() : 0);
    result = 31 * result + (hisJiaRuZuZhi != null ? hisJiaRuZuZhi.hashCode() : 0);
    result = 31 * result + (hisZhengFuJinTie != null ? hisZhengFuJinTie.hashCode() : 0);
    result = 31 * result + (hisZhengFuJinTieDengJi != null ? hisZhengFuJinTieDengJi.hashCode() : 0);
    result = 31 * result + (hisFuZhuanTuiJunRen != null ? hisFuZhuanTuiJunRen.hashCode() : 0);
    result = 31 * result + (hisShangCan != null ? hisShangCan.hashCode() : 0);
    result = 31 * result + (hisShangCanDengJi != null ? hisShangCanDengJi.hashCode() : 0);
    result = 31 * result + (hisLiZhanGong != null ? hisLiZhanGong.hashCode() : 0);
    result = 31 * result + (hisLaZhanGongDengJi != null ? hisLaZhanGongDengJi.hashCode() : 0);
    result = 31 * result + (baseDuShengZiNv != null ? baseDuShengZiNv.hashCode() : 0);
    result = 31 * result + (hisLaoMo != null ? hisLaoMo.hashCode() : 0);
    result = 31 * result + (hisLaoMoDengJi != null ? hisLaoMoDengJi.hashCode() : 0);
    result = 31 * result + (nowGongZiHao != null ? nowGongZiHao.hashCode() : 0);
    result = 31 * result + (nowYiKaTong != null ? nowYiKaTong.hashCode() : 0);
    result = 31 * result + (nowManXingJiBing != null ? nowManXingJiBing.hashCode() : 0);
    result = 31 * result + (nowJianKangZhuangKuang != null ? nowJianKangZhuangKuang.hashCode() : 0);
    result = 31 * result + (connXianHuKouDiZhi != null ? connXianHuKouDiZhi.hashCode() : 0);
    result = 31 * result + (connYuZiNvShengHuo != null ? connYuZiNvShengHuo.hashCode() : 0);
    result = 31 * result + (connYuShuiShengHuo != null ? connYuShuiShengHuo.hashCode() : 0);
    result = 31 * result + (connXianJuZhuDiZhi != null ? connXianJuZhuDiZhi.hashCode() : 0);
    result = 31 * result + (connZhuZhaiDianHua != null ? connZhuZhaiDianHua.hashCode() : 0);
    result = 31 * result + (connShouJiHaoMa != null ? connShouJiHaoMa.hashCode() : 0);
    result = 31 * result + (connLiShiHaoMa != null ? connLiShiHaoMa.hashCode() : 0);
    result = 31 * result + (connEmailOrQq != null ? connEmailOrQq.hashCode() : 0);
    result = 31 * result + (connPeiOuHuoZiNvEmail != null ? connPeiOuHuoZiNvEmail.hashCode() : 0);
    result = 31 * result + (mateHunYinZhuangKuang != null ? mateHunYinZhuangKuang.hashCode() : 0);
    result = 31 * result + (matePeiOuName != null ? matePeiOuName.hashCode() : 0);
    result = 31 * result + (matePeiOuPhone != null ? matePeiOuPhone.hashCode() : 0);
    result = 31 * result + (matePeiOuJianKang != null ? matePeiOuJianKang.hashCode() : 0);
    result = 31 * result + (lianXiRenName != null ? lianXiRenName.hashCode() : 0);
    result = 31 * result + (lianXiRenGuanXi != null ? lianXiRenGuanXi.hashCode() : 0);
    result = 31 * result + (lianXiRenPhone != null ? lianXiRenPhone.hashCode() : 0);
    result = 31 * result + (hisShuangZhiGong != null ? hisShuangZhiGong.hashCode() : 0);
    result = 31 * result + (childrenZiNvName != null ? childrenZiNvName.hashCode() : 0);
    result = 31 * result + (childrenZiNvAddress != null ? childrenZiNvAddress.hashCode() : 0);
    result = 31 * result + (childrenZiNvDanWei != null ? childrenZiNvDanWei.hashCode() : 0);
    result = 31 * result + (childrenZiNvPhone != null ? childrenZiNvPhone.hashCode() : 0);
    result = 31 * result + (nowAiHaoXiangMu != null ? nowAiHaoXiangMu.hashCode() : 0);
    result = 31 * result + (nowJianChiJianShen != null ? nowJianChiJianShen.hashCode() : 0);
    result = 31 * result + (xiaoNeiName != null ? xiaoNeiName.hashCode() : 0);
    result = 31 * result + (xiaoNeiGuanXi != null ? xiaoNeiGuanXi.hashCode() : 0);
    result = 31 * result + (xiaoNeiPhone != null ? xiaoNeiPhone.hashCode() : 0);
    result = 31 * result + (xiaoNeiBuMen != null ? xiaoNeiBuMen.hashCode() : 0);
    result = 31 * result + (xiaoNeiAddress != null ? xiaoNeiAddress.hashCode() : 0);
    result = 31 * result + (nowLaoNianTiXieZu != null ? nowLaoNianTiXieZu.hashCode() : 0);
    result = 31 * result + (nowLiuLanWebsite != null ? nowLiuLanWebsite.hashCode() : 0);
    result = 31 * result + (nowXiaoWaiTuanTiZhiWu != null ? nowXiaoWaiTuanTiZhiWu.hashCode() : 0);
    result = 31 * result + (hisJunShuJunLie != null ? hisJunShuJunLie.hashCode() : 0);
    result = 31 * result + (remark != null ? remark.hashCode() : 0);
    result = 31 * result + (hisUnionGroup != null ? hisUnionGroup.hashCode() : 0);
    result = 31 * result + (tianBiaoShiJian != null ? tianBiaoShiJian.hashCode() : 0);
    return result;
  }
}
