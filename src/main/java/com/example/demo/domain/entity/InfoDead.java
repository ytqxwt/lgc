package com.example.demo.domain.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "info_dead", schema = "Retirement_management_system", catalog = "")
public class InfoDead {
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
  private String deadTime;

  @Id
  @Column(name = "id")
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Basic
  @Column(name = "base_photo_url")
  public String getBasePhotoUrl() {
    return basePhotoUrl;
  }

  public void setBasePhotoUrl(String basePhotoUrl) {
    this.basePhotoUrl = basePhotoUrl;
  }

  @Basic
  @Column(name = "base_name")
  public String getBaseName() {
    return baseName;
  }

  public void setBaseName(String baseName) {
    this.baseName = baseName;
  }

  @Basic
  @Column(name = "base_sex")
  public String getBaseSex() {
    return baseSex;
  }

  public void setBaseSex(String baseSex) {
    this.baseSex = baseSex;
  }

  @Basic
  @Column(name = "work_kai_shi_gong_zuo")
  public String getWorkKaiShiGongZuo() {
    return workKaiShiGongZuo;
  }

  public void setWorkKaiShiGongZuo(String workKaiShiGongZuo) {
    this.workKaiShiGongZuo = workKaiShiGongZuo;
  }

  @Basic
  @Column(name = "base_ji_guan")
  public String getBaseJiGuan() {
    return baseJiGuan;
  }

  public void setBaseJiGuan(String baseJiGuan) {
    this.baseJiGuan = baseJiGuan;
  }

  @Basic
  @Column(name = "base_sheng_ri")
  public String getBaseShengRi() {
    return baseShengRi;
  }

  public void setBaseShengRi(String baseShengRi) {
    this.baseShengRi = baseShengRi;
  }

  @Basic
  @Column(name = "work_dao_xiao_shi_jian")
  public String getWorkDaoXiaoShiJian() {
    return workDaoXiaoShiJian;
  }

  public void setWorkDaoXiaoShiJian(String workDaoXiaoShiJian) {
    this.workDaoXiaoShiJian = workDaoXiaoShiJian;
  }

  @Basic
  @Column(name = "base_shen_fen_zheng")
  public String getBaseShenFenZheng() {
    return baseShenFenZheng;
  }

  public void setBaseShenFenZheng(String baseShenFenZheng) {
    this.baseShenFenZheng = baseShenFenZheng;
  }

  @Basic
  @Column(name = "base_min_zu")
  public String getBaseMinZu() {
    return baseMinZu;
  }

  public void setBaseMinZu(String baseMinZu) {
    this.baseMinZu = baseMinZu;
  }

  @Basic
  @Column(name = "base_xue_li")
  public String getBaseXueLi() {
    return baseXueLi;
  }

  public void setBaseXueLi(String baseXueLi) {
    this.baseXueLi = baseXueLi;
  }

  @Basic
  @Column(name = "base_xue_wei")
  public String getBaseXueWei() {
    return baseXueWei;
  }

  public void setBaseXueWei(String baseXueWei) {
    this.baseXueWei = baseXueWei;
  }

  @Basic
  @Column(name = "work_bian_zhi_lei_xing")
  public String getWorkBianZhiLeiXing() {
    return workBianZhiLeiXing;
  }

  public void setWorkBianZhiLeiXing(String workBianZhiLeiXing) {
    this.workBianZhiLeiXing = workBianZhiLeiXing;
  }

  @Basic
  @Column(name = "work_zhi_wu")
  public String getWorkZhiWu() {
    return workZhiWu;
  }

  public void setWorkZhiWu(String workZhiWu) {
    this.workZhiWu = workZhiWu;
  }

  @Basic
  @Column(name = "work_zhi_wu_ji_bie")
  public String getWorkZhiWuJiBie() {
    return workZhiWuJiBie;
  }

  public void setWorkZhiWuJiBie(String workZhiWuJiBie) {
    this.workZhiWuJiBie = workZhiWuJiBie;
  }

  @Basic
  @Column(name = "work_zhi_cheng")
  public String getWorkZhiCheng() {
    return workZhiCheng;
  }

  public void setWorkZhiCheng(String workZhiCheng) {
    this.workZhiCheng = workZhiCheng;
  }

  @Basic
  @Column(name = "work_zhi_cheng_ji_bie")
  public String getWorkZhiChengJiBie() {
    return workZhiChengJiBie;
  }

  public void setWorkZhiChengJiBie(String workZhiChengJiBie) {
    this.workZhiChengJiBie = workZhiChengJiBie;
  }

  @Basic
  @Column(name = "work_ti_qian_tui_xiu")
  public String getWorkTiQianTuiXiu() {
    return workTiQianTuiXiu;
  }

  public void setWorkTiQianTuiXiu(String workTiQianTuiXiu) {
    this.workTiQianTuiXiu = workTiQianTuiXiu;
  }

  @Basic
  @Column(name = "work_zheng_shi_tui_xiu")
  public String getWorkZhengShiTuiXiu() {
    return workZhengShiTuiXiu;
  }

  public void setWorkZhengShiTuiXiu(String workZhengShiTuiXiu) {
    this.workZhengShiTuiXiu = workZhengShiTuiXiu;
  }

  @Basic
  @Column(name = "work_tui_xiu_bu_men")
  public String getWorkTuiXiuBuMen() {
    return workTuiXiuBuMen;
  }

  public void setWorkTuiXiuBuMen(String workTuiXiuBuMen) {
    this.workTuiXiuBuMen = workTuiXiuBuMen;
  }

  @Basic
  @Column(name = "base_zheng_zhi_mian_mao")
  public String getBaseZhengZhiMianMao() {
    return baseZhengZhiMianMao;
  }

  public void setBaseZhengZhiMianMao(String baseZhengZhiMianMao) {
    this.baseZhengZhiMianMao = baseZhengZhiMianMao;
  }

  @Basic
  @Column(name = "work_zhuan_ye_he_gong_zhong")
  public String getWorkZhuanYeHeGongZhong() {
    return workZhuanYeHeGongZhong;
  }

  public void setWorkZhuanYeHeGongZhong(String workZhuanYeHeGongZhong) {
    this.workZhuanYeHeGongZhong = workZhuanYeHeGongZhong;
  }

  @Basic
  @Column(name = "now_suo_shu_zhi_bu")
  public String getNowSuoShuZhiBu() {
    return nowSuoShuZhiBu;
  }

  public void setNowSuoShuZhiBu(String nowSuoShuZhiBu) {
    this.nowSuoShuZhiBu = nowSuoShuZhiBu;
  }

  @Basic
  @Column(name = "his_jia_ru_zu_zhi")
  public String getHisJiaRuZuZhi() {
    return hisJiaRuZuZhi;
  }

  public void setHisJiaRuZuZhi(String hisJiaRuZuZhi) {
    this.hisJiaRuZuZhi = hisJiaRuZuZhi;
  }

  @Basic
  @Column(name = "his_zheng_fu_jin_tie")
  public String getHisZhengFuJinTie() {
    return hisZhengFuJinTie;
  }

  public void setHisZhengFuJinTie(String hisZhengFuJinTie) {
    this.hisZhengFuJinTie = hisZhengFuJinTie;
  }

  @Basic
  @Column(name = "his_zheng_fu_jin_tie_deng_ji")
  public String getHisZhengFuJinTieDengJi() {
    return hisZhengFuJinTieDengJi;
  }

  public void setHisZhengFuJinTieDengJi(String hisZhengFuJinTieDengJi) {
    this.hisZhengFuJinTieDengJi = hisZhengFuJinTieDengJi;
  }

  @Basic
  @Column(name = "his_fu_zhuan_tui_jun_ren")
  public String getHisFuZhuanTuiJunRen() {
    return hisFuZhuanTuiJunRen;
  }

  public void setHisFuZhuanTuiJunRen(String hisFuZhuanTuiJunRen) {
    this.hisFuZhuanTuiJunRen = hisFuZhuanTuiJunRen;
  }

  @Basic
  @Column(name = "his_shang_can")
  public String getHisShangCan() {
    return hisShangCan;
  }

  public void setHisShangCan(String hisShangCan) {
    this.hisShangCan = hisShangCan;
  }

  @Basic
  @Column(name = "his_shang_can_deng_ji")
  public String getHisShangCanDengJi() {
    return hisShangCanDengJi;
  }

  public void setHisShangCanDengJi(String hisShangCanDengJi) {
    this.hisShangCanDengJi = hisShangCanDengJi;
  }

  @Basic
  @Column(name = "his_li_zhan_gong")
  public String getHisLiZhanGong() {
    return hisLiZhanGong;
  }

  public void setHisLiZhanGong(String hisLiZhanGong) {
    this.hisLiZhanGong = hisLiZhanGong;
  }

  @Basic
  @Column(name = "his_la_zhan_gong_deng_ji")
  public String getHisLaZhanGongDengJi() {
    return hisLaZhanGongDengJi;
  }

  public void setHisLaZhanGongDengJi(String hisLaZhanGongDengJi) {
    this.hisLaZhanGongDengJi = hisLaZhanGongDengJi;
  }

  @Basic
  @Column(name = "base_du_sheng_zi_nv")
  public String getBaseDuShengZiNv() {
    return baseDuShengZiNv;
  }

  public void setBaseDuShengZiNv(String baseDuShengZiNv) {
    this.baseDuShengZiNv = baseDuShengZiNv;
  }

  @Basic
  @Column(name = "his_lao_mo")
  public String getHisLaoMo() {
    return hisLaoMo;
  }

  public void setHisLaoMo(String hisLaoMo) {
    this.hisLaoMo = hisLaoMo;
  }

  @Basic
  @Column(name = "his_lao_mo_deng_ji")
  public String getHisLaoMoDengJi() {
    return hisLaoMoDengJi;
  }

  public void setHisLaoMoDengJi(String hisLaoMoDengJi) {
    this.hisLaoMoDengJi = hisLaoMoDengJi;
  }

  @Basic
  @Column(name = "now_gong_zi_hao")
  public String getNowGongZiHao() {
    return nowGongZiHao;
  }

  public void setNowGongZiHao(String nowGongZiHao) {
    this.nowGongZiHao = nowGongZiHao;
  }

  @Basic
  @Column(name = "now_yi_ka_tong")
  public String getNowYiKaTong() {
    return nowYiKaTong;
  }

  public void setNowYiKaTong(String nowYiKaTong) {
    this.nowYiKaTong = nowYiKaTong;
  }

  @Basic
  @Column(name = "now_man_xing_ji_bing")
  public String getNowManXingJiBing() {
    return nowManXingJiBing;
  }

  public void setNowManXingJiBing(String nowManXingJiBing) {
    this.nowManXingJiBing = nowManXingJiBing;
  }

  @Basic
  @Column(name = "now_jian_kang_zhuang_kuang")
  public String getNowJianKangZhuangKuang() {
    return nowJianKangZhuangKuang;
  }

  public void setNowJianKangZhuangKuang(String nowJianKangZhuangKuang) {
    this.nowJianKangZhuangKuang = nowJianKangZhuangKuang;
  }

  @Basic
  @Column(name = "conn_xian_hu_kou_di_zhi")
  public String getConnXianHuKouDiZhi() {
    return connXianHuKouDiZhi;
  }

  public void setConnXianHuKouDiZhi(String connXianHuKouDiZhi) {
    this.connXianHuKouDiZhi = connXianHuKouDiZhi;
  }

  @Basic
  @Column(name = "conn_yu_zi_nv_sheng_huo")
  public String getConnYuZiNvShengHuo() {
    return connYuZiNvShengHuo;
  }

  public void setConnYuZiNvShengHuo(String connYuZiNvShengHuo) {
    this.connYuZiNvShengHuo = connYuZiNvShengHuo;
  }

  @Basic
  @Column(name = "conn_yu_shui_sheng_huo")
  public String getConnYuShuiShengHuo() {
    return connYuShuiShengHuo;
  }

  public void setConnYuShuiShengHuo(String connYuShuiShengHuo) {
    this.connYuShuiShengHuo = connYuShuiShengHuo;
  }

  @Basic
  @Column(name = "conn_xian_ju_zhu_di_zhi")
  public String getConnXianJuZhuDiZhi() {
    return connXianJuZhuDiZhi;
  }

  public void setConnXianJuZhuDiZhi(String connXianJuZhuDiZhi) {
    this.connXianJuZhuDiZhi = connXianJuZhuDiZhi;
  }

  @Basic
  @Column(name = "conn_zhu_zhai_dian_hua")
  public String getConnZhuZhaiDianHua() {
    return connZhuZhaiDianHua;
  }

  public void setConnZhuZhaiDianHua(String connZhuZhaiDianHua) {
    this.connZhuZhaiDianHua = connZhuZhaiDianHua;
  }

  @Basic
  @Column(name = "conn_shou_ji_hao_ma")
  public String getConnShouJiHaoMa() {
    return connShouJiHaoMa;
  }

  public void setConnShouJiHaoMa(String connShouJiHaoMa) {
    this.connShouJiHaoMa = connShouJiHaoMa;
  }

  @Basic
  @Column(name = "conn_li_shi_hao_ma")
  public String getConnLiShiHaoMa() {
    return connLiShiHaoMa;
  }

  public void setConnLiShiHaoMa(String connLiShiHaoMa) {
    this.connLiShiHaoMa = connLiShiHaoMa;
  }

  @Basic
  @Column(name = "conn_email_or_qq")
  public String getConnEmailOrQq() {
    return connEmailOrQq;
  }

  public void setConnEmailOrQq(String connEmailOrQq) {
    this.connEmailOrQq = connEmailOrQq;
  }

  @Basic
  @Column(name = "conn_pei_ou_huo_zi_nv_email")
  public String getConnPeiOuHuoZiNvEmail() {
    return connPeiOuHuoZiNvEmail;
  }

  public void setConnPeiOuHuoZiNvEmail(String connPeiOuHuoZiNvEmail) {
    this.connPeiOuHuoZiNvEmail = connPeiOuHuoZiNvEmail;
  }

  @Basic
  @Column(name = "mate_hun_yin_zhuang_kuang")
  public String getMateHunYinZhuangKuang() {
    return mateHunYinZhuangKuang;
  }

  public void setMateHunYinZhuangKuang(String mateHunYinZhuangKuang) {
    this.mateHunYinZhuangKuang = mateHunYinZhuangKuang;
  }

  @Basic
  @Column(name = "mate_pei_ou_name")
  public String getMatePeiOuName() {
    return matePeiOuName;
  }

  public void setMatePeiOuName(String matePeiOuName) {
    this.matePeiOuName = matePeiOuName;
  }

  @Basic
  @Column(name = "mate_pei_ou_phone")
  public String getMatePeiOuPhone() {
    return matePeiOuPhone;
  }

  public void setMatePeiOuPhone(String matePeiOuPhone) {
    this.matePeiOuPhone = matePeiOuPhone;
  }

  @Basic
  @Column(name = "mate_pei_ou_jian_kang")
  public String getMatePeiOuJianKang() {
    return matePeiOuJianKang;
  }

  public void setMatePeiOuJianKang(String matePeiOuJianKang) {
    this.matePeiOuJianKang = matePeiOuJianKang;
  }

  @Basic
  @Column(name = "lian_xi_ren_name")
  public String getLianXiRenName() {
    return lianXiRenName;
  }

  public void setLianXiRenName(String lianXiRenName) {
    this.lianXiRenName = lianXiRenName;
  }

  @Basic
  @Column(name = "lian_xi_ren_guan_xi")
  public String getLianXiRenGuanXi() {
    return lianXiRenGuanXi;
  }

  public void setLianXiRenGuanXi(String lianXiRenGuanXi) {
    this.lianXiRenGuanXi = lianXiRenGuanXi;
  }

  @Basic
  @Column(name = "lian_xi_ren_phone")
  public String getLianXiRenPhone() {
    return lianXiRenPhone;
  }

  public void setLianXiRenPhone(String lianXiRenPhone) {
    this.lianXiRenPhone = lianXiRenPhone;
  }

  @Basic
  @Column(name = "his_shuang_zhi_gong")
  public String getHisShuangZhiGong() {
    return hisShuangZhiGong;
  }

  public void setHisShuangZhiGong(String hisShuangZhiGong) {
    this.hisShuangZhiGong = hisShuangZhiGong;
  }

  @Basic
  @Column(name = "children_zi_nv_name")
  public String getChildrenZiNvName() {
    return childrenZiNvName;
  }

  public void setChildrenZiNvName(String childrenZiNvName) {
    this.childrenZiNvName = childrenZiNvName;
  }

  @Basic
  @Column(name = "children_zi_nv_address")
  public String getChildrenZiNvAddress() {
    return childrenZiNvAddress;
  }

  public void setChildrenZiNvAddress(String childrenZiNvAddress) {
    this.childrenZiNvAddress = childrenZiNvAddress;
  }

  @Basic
  @Column(name = "children_zi_nv_dan_wei")
  public String getChildrenZiNvDanWei() {
    return childrenZiNvDanWei;
  }

  public void setChildrenZiNvDanWei(String childrenZiNvDanWei) {
    this.childrenZiNvDanWei = childrenZiNvDanWei;
  }

  @Basic
  @Column(name = "children_zi_nv_phone")
  public String getChildrenZiNvPhone() {
    return childrenZiNvPhone;
  }

  public void setChildrenZiNvPhone(String childrenZiNvPhone) {
    this.childrenZiNvPhone = childrenZiNvPhone;
  }

  @Basic
  @Column(name = "now_ai_hao_xiang_mu")
  public String getNowAiHaoXiangMu() {
    return nowAiHaoXiangMu;
  }

  public void setNowAiHaoXiangMu(String nowAiHaoXiangMu) {
    this.nowAiHaoXiangMu = nowAiHaoXiangMu;
  }

  @Basic
  @Column(name = "now_jian_chi_jian_shen")
  public String getNowJianChiJianShen() {
    return nowJianChiJianShen;
  }

  public void setNowJianChiJianShen(String nowJianChiJianShen) {
    this.nowJianChiJianShen = nowJianChiJianShen;
  }

  @Basic
  @Column(name = "xiao_nei_name")
  public String getXiaoNeiName() {
    return xiaoNeiName;
  }

  public void setXiaoNeiName(String xiaoNeiName) {
    this.xiaoNeiName = xiaoNeiName;
  }

  @Basic
  @Column(name = "xiao_nei_guan_xi")
  public String getXiaoNeiGuanXi() {
    return xiaoNeiGuanXi;
  }

  public void setXiaoNeiGuanXi(String xiaoNeiGuanXi) {
    this.xiaoNeiGuanXi = xiaoNeiGuanXi;
  }

  @Basic
  @Column(name = "xiao_nei_phone")
  public String getXiaoNeiPhone() {
    return xiaoNeiPhone;
  }

  public void setXiaoNeiPhone(String xiaoNeiPhone) {
    this.xiaoNeiPhone = xiaoNeiPhone;
  }

  @Basic
  @Column(name = "xiao_nei_bu_men")
  public String getXiaoNeiBuMen() {
    return xiaoNeiBuMen;
  }

  public void setXiaoNeiBuMen(String xiaoNeiBuMen) {
    this.xiaoNeiBuMen = xiaoNeiBuMen;
  }

  @Basic
  @Column(name = "xiao_nei_address")
  public String getXiaoNeiAddress() {
    return xiaoNeiAddress;
  }

  public void setXiaoNeiAddress(String xiaoNeiAddress) {
    this.xiaoNeiAddress = xiaoNeiAddress;
  }

  @Basic
  @Column(name = "now_lao_nian_ti_xie_zu")
  public String getNowLaoNianTiXieZu() {
    return nowLaoNianTiXieZu;
  }

  public void setNowLaoNianTiXieZu(String nowLaoNianTiXieZu) {
    this.nowLaoNianTiXieZu = nowLaoNianTiXieZu;
  }

  @Basic
  @Column(name = "now_liu_lan_website")
  public String getNowLiuLanWebsite() {
    return nowLiuLanWebsite;
  }

  public void setNowLiuLanWebsite(String nowLiuLanWebsite) {
    this.nowLiuLanWebsite = nowLiuLanWebsite;
  }

  @Basic
  @Column(name = "now_xiao_wai_tuan_ti_zhi_wu")
  public String getNowXiaoWaiTuanTiZhiWu() {
    return nowXiaoWaiTuanTiZhiWu;
  }

  public void setNowXiaoWaiTuanTiZhiWu(String nowXiaoWaiTuanTiZhiWu) {
    this.nowXiaoWaiTuanTiZhiWu = nowXiaoWaiTuanTiZhiWu;
  }

  @Basic
  @Column(name = "his_jun_shu_jun_lie")
  public String getHisJunShuJunLie() {
    return hisJunShuJunLie;
  }

  public void setHisJunShuJunLie(String hisJunShuJunLie) {
    this.hisJunShuJunLie = hisJunShuJunLie;
  }

  @Basic
  @Column(name = "remark")
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  @Basic
  @Column(name = "his_union_group")
  public String getHisUnionGroup() {
    return hisUnionGroup;
  }

  public void setHisUnionGroup(String hisUnionGroup) {
    this.hisUnionGroup = hisUnionGroup;
  }

  @Basic
  @Column(name = "tian_biao_shi_jian")
  public String getTianBiaoShiJian() {
    return tianBiaoShiJian;
  }

  public void setTianBiaoShiJian(String tianBiaoShiJian) {
    this.tianBiaoShiJian = tianBiaoShiJian;
  }

  @Basic
  @Column(name = "dead_time")
  public String getDeadTime() {
    return deadTime;
  }

  public void setDeadTime(String deadTime) {
    this.deadTime = deadTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InfoDead infoDead = (InfoDead) o;
    return id == infoDead.id &&
        Objects.equals(basePhotoUrl, infoDead.basePhotoUrl) &&
        Objects.equals(baseName, infoDead.baseName) &&
        Objects.equals(baseSex, infoDead.baseSex) &&
        Objects.equals(workKaiShiGongZuo, infoDead.workKaiShiGongZuo) &&
        Objects.equals(baseJiGuan, infoDead.baseJiGuan) &&
        Objects.equals(baseShengRi, infoDead.baseShengRi) &&
        Objects.equals(workDaoXiaoShiJian, infoDead.workDaoXiaoShiJian) &&
        Objects.equals(baseShenFenZheng, infoDead.baseShenFenZheng) &&
        Objects.equals(baseMinZu, infoDead.baseMinZu) &&
        Objects.equals(baseXueLi, infoDead.baseXueLi) &&
        Objects.equals(baseXueWei, infoDead.baseXueWei) &&
        Objects.equals(workBianZhiLeiXing, infoDead.workBianZhiLeiXing) &&
        Objects.equals(workZhiWu, infoDead.workZhiWu) &&
        Objects.equals(workZhiWuJiBie, infoDead.workZhiWuJiBie) &&
        Objects.equals(workZhiCheng, infoDead.workZhiCheng) &&
        Objects.equals(workZhiChengJiBie, infoDead.workZhiChengJiBie) &&
        Objects.equals(workTiQianTuiXiu, infoDead.workTiQianTuiXiu) &&
        Objects.equals(workZhengShiTuiXiu, infoDead.workZhengShiTuiXiu) &&
        Objects.equals(workTuiXiuBuMen, infoDead.workTuiXiuBuMen) &&
        Objects.equals(baseZhengZhiMianMao, infoDead.baseZhengZhiMianMao) &&
        Objects.equals(workZhuanYeHeGongZhong, infoDead.workZhuanYeHeGongZhong) &&
        Objects.equals(nowSuoShuZhiBu, infoDead.nowSuoShuZhiBu) &&
        Objects.equals(hisJiaRuZuZhi, infoDead.hisJiaRuZuZhi) &&
        Objects.equals(hisZhengFuJinTie, infoDead.hisZhengFuJinTie) &&
        Objects.equals(hisZhengFuJinTieDengJi, infoDead.hisZhengFuJinTieDengJi) &&
        Objects.equals(hisFuZhuanTuiJunRen, infoDead.hisFuZhuanTuiJunRen) &&
        Objects.equals(hisShangCan, infoDead.hisShangCan) &&
        Objects.equals(hisShangCanDengJi, infoDead.hisShangCanDengJi) &&
        Objects.equals(hisLiZhanGong, infoDead.hisLiZhanGong) &&
        Objects.equals(hisLaZhanGongDengJi, infoDead.hisLaZhanGongDengJi) &&
        Objects.equals(baseDuShengZiNv, infoDead.baseDuShengZiNv) &&
        Objects.equals(hisLaoMo, infoDead.hisLaoMo) &&
        Objects.equals(hisLaoMoDengJi, infoDead.hisLaoMoDengJi) &&
        Objects.equals(nowGongZiHao, infoDead.nowGongZiHao) &&
        Objects.equals(nowYiKaTong, infoDead.nowYiKaTong) &&
        Objects.equals(nowManXingJiBing, infoDead.nowManXingJiBing) &&
        Objects.equals(nowJianKangZhuangKuang, infoDead.nowJianKangZhuangKuang) &&
        Objects.equals(connXianHuKouDiZhi, infoDead.connXianHuKouDiZhi) &&
        Objects.equals(connYuZiNvShengHuo, infoDead.connYuZiNvShengHuo) &&
        Objects.equals(connYuShuiShengHuo, infoDead.connYuShuiShengHuo) &&
        Objects.equals(connXianJuZhuDiZhi, infoDead.connXianJuZhuDiZhi) &&
        Objects.equals(connZhuZhaiDianHua, infoDead.connZhuZhaiDianHua) &&
        Objects.equals(connShouJiHaoMa, infoDead.connShouJiHaoMa) &&
        Objects.equals(connLiShiHaoMa, infoDead.connLiShiHaoMa) &&
        Objects.equals(connEmailOrQq, infoDead.connEmailOrQq) &&
        Objects.equals(connPeiOuHuoZiNvEmail, infoDead.connPeiOuHuoZiNvEmail) &&
        Objects.equals(mateHunYinZhuangKuang, infoDead.mateHunYinZhuangKuang) &&
        Objects.equals(matePeiOuName, infoDead.matePeiOuName) &&
        Objects.equals(matePeiOuPhone, infoDead.matePeiOuPhone) &&
        Objects.equals(matePeiOuJianKang, infoDead.matePeiOuJianKang) &&
        Objects.equals(lianXiRenName, infoDead.lianXiRenName) &&
        Objects.equals(lianXiRenGuanXi, infoDead.lianXiRenGuanXi) &&
        Objects.equals(lianXiRenPhone, infoDead.lianXiRenPhone) &&
        Objects.equals(hisShuangZhiGong, infoDead.hisShuangZhiGong) &&
        Objects.equals(childrenZiNvName, infoDead.childrenZiNvName) &&
        Objects.equals(childrenZiNvAddress, infoDead.childrenZiNvAddress) &&
        Objects.equals(childrenZiNvDanWei, infoDead.childrenZiNvDanWei) &&
        Objects.equals(childrenZiNvPhone, infoDead.childrenZiNvPhone) &&
        Objects.equals(nowAiHaoXiangMu, infoDead.nowAiHaoXiangMu) &&
        Objects.equals(nowJianChiJianShen, infoDead.nowJianChiJianShen) &&
        Objects.equals(xiaoNeiName, infoDead.xiaoNeiName) &&
        Objects.equals(xiaoNeiGuanXi, infoDead.xiaoNeiGuanXi) &&
        Objects.equals(xiaoNeiPhone, infoDead.xiaoNeiPhone) &&
        Objects.equals(xiaoNeiBuMen, infoDead.xiaoNeiBuMen) &&
        Objects.equals(xiaoNeiAddress, infoDead.xiaoNeiAddress) &&
        Objects.equals(nowLaoNianTiXieZu, infoDead.nowLaoNianTiXieZu) &&
        Objects.equals(nowLiuLanWebsite, infoDead.nowLiuLanWebsite) &&
        Objects.equals(nowXiaoWaiTuanTiZhiWu, infoDead.nowXiaoWaiTuanTiZhiWu) &&
        Objects.equals(hisJunShuJunLie, infoDead.hisJunShuJunLie) &&
        Objects.equals(remark, infoDead.remark) &&
        Objects.equals(hisUnionGroup, infoDead.hisUnionGroup) &&
        Objects.equals(tianBiaoShiJian, infoDead.tianBiaoShiJian) &&
        Objects.equals(deadTime, infoDead.deadTime);
  }

  @Override
  public int hashCode() {

    return Objects.hash(id, basePhotoUrl, baseName, baseSex, workKaiShiGongZuo, baseJiGuan, baseShengRi, workDaoXiaoShiJian, baseShenFenZheng, baseMinZu, baseXueLi, baseXueWei, workBianZhiLeiXing, workZhiWu, workZhiWuJiBie, workZhiCheng, workZhiChengJiBie, workTiQianTuiXiu, workZhengShiTuiXiu, workTuiXiuBuMen, baseZhengZhiMianMao, workZhuanYeHeGongZhong, nowSuoShuZhiBu, hisJiaRuZuZhi, hisZhengFuJinTie, hisZhengFuJinTieDengJi, hisFuZhuanTuiJunRen, hisShangCan, hisShangCanDengJi, hisLiZhanGong, hisLaZhanGongDengJi, baseDuShengZiNv, hisLaoMo, hisLaoMoDengJi, nowGongZiHao, nowYiKaTong, nowManXingJiBing, nowJianKangZhuangKuang, connXianHuKouDiZhi, connYuZiNvShengHuo, connYuShuiShengHuo, connXianJuZhuDiZhi, connZhuZhaiDianHua, connShouJiHaoMa, connLiShiHaoMa, connEmailOrQq, connPeiOuHuoZiNvEmail, mateHunYinZhuangKuang, matePeiOuName, matePeiOuPhone, matePeiOuJianKang, lianXiRenName, lianXiRenGuanXi, lianXiRenPhone, hisShuangZhiGong, childrenZiNvName, childrenZiNvAddress, childrenZiNvDanWei, childrenZiNvPhone, nowAiHaoXiangMu, nowJianChiJianShen, xiaoNeiName, xiaoNeiGuanXi, xiaoNeiPhone, xiaoNeiBuMen, xiaoNeiAddress, nowLaoNianTiXieZu, nowLiuLanWebsite, nowXiaoWaiTuanTiZhiWu, hisJunShuJunLie, remark, hisUnionGroup, tianBiaoShiJian, deadTime);
  }
}
