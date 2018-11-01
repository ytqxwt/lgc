package com.example.demo.repos;

import com.example.demo.domain.entity.InfoDead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.beans.Transient;

public interface InfoDeadRepos extends JpaRepository<InfoDead, Integer>, JpaSpecificationExecutor<InfoDead> {
  @Query(value = "SELECT * FROM Retirement_management_system.info_dead WHERE base_shen_fen_zheng=?", nativeQuery = true)
  InfoDead findByXueHao(String id);
  //INSERT INTO `Retirement_management_system`.`info_dead` (`id`, `base_photo_url`, `base_name`, `base_sex`, `work_kai_shi_gong_zuo`, `base_ji_guan`, `base_sheng_ri`, `work_dao_xiao_shi_jian`, `base_shen_fen_zheng`, `base_min_zu`, `base_xue_li`, `base_xue_wei`, `work_bian_zhi_lei_xing`, `work_zhi_wu`, `work_zhi_wu_ji_bie`, `work_zhi_cheng`, `work_zhi_cheng_ji_bie`, `work_ti_qian_tui_xiu`, `work_zheng_shi_tui_xiu`, `work_tui_xiu_bu_men`, `base_zheng_zhi_mian_mao`, `work_zhuan_ye_he_gong_zhong`, `now_suo_shu_zhi_bu`, `his_jia_ru_zu_zhi`, `his_zheng_fu_jin_tie`, `his_zheng_fu_jin_tie_deng_ji`, `his_fu_zhuan_tui_jun_ren`, `his_shang_can`, `his_shang_can_deng_ji`, `his_li_zhan_gong`, `his_la_zhan_gong_deng_ji`, `base_du_sheng_zi_nv`, `his_lao_mo`, `his_lao_mo_deng_ji`, `now_gong_zi_hao`, `now_yi_ka_tong`, `now_man_xing_ji_bing`, `now_jian_kang_zhuang_kuang`, `conn_xian_hu_kou_di_zhi`, `conn_yu_zi_nv_sheng_huo`, `conn_yu_shui_sheng_huo`, `conn_xian_ju_zhu_di_zhi`, `conn_zhu_zhai_dian_hua`, `conn_shou_ji_hao_ma`, `conn_li_shi_hao_ma`, `conn_email_or_qq`, `conn_pei_ou_huo_zi_nv_email`, `mate_hun_yin_zhuang_kuang`, `mate_pei_ou_name`, `mate_pei_ou_phone`, `mate_pei_ou_jian_kang`, `lian_xi_ren_name`, `lian_xi_ren_guan_xi`, `lian_xi_ren_phone`, `his_shuang_zhi_gong`, `children_zi_nv_name`, `children_zi_nv_address`, `children_zi_nv_dan_wei`, `children_zi_nv_phone`, `now_ai_hao_xiang_mu`, `now_jian_chi_jian_shen`, `xiao_nei_name`, `xiao_nei_guan_xi`, `xiao_nei_phone`, `xiao_nei_bu_men`, `xiao_nei_address`, `now_lao_nian_ti_xie_zu`, `now_liu_lan_website`, `now_xiao_wai_tuan_ti_zhi_wu`, `his_jun_shu_jun_lie`, `remark`, `his_union_group`, `tian_biao_shi_jian`, `dead_time`) VALUES ('1', '', '谭敏', '女', '1998-08', '四川宜宾', '1998-08-24', '2016-09', '511524199808244869', '汉族', '本科', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '2099-09-24');

  @Modifying
  @Query(value = "INSERT INTO Retirement_management_system.info_dead (`base_photo_url`, `base_name`, `base_sex`, `work_kai_shi_gong_zuo`, `base_ji_guan`, `base_sheng_ri`, `work_dao_xiao_shi_jian`, `base_shen_fen_zheng`, `base_min_zu`, `base_xue_li`, `base_xue_wei`, `work_bian_zhi_lei_xing`, `work_zhi_wu`, `work_zhi_wu_ji_bie`, `work_zhi_cheng`, `work_zhi_cheng_ji_bie`, `work_ti_qian_tui_xiu`, `work_zheng_shi_tui_xiu`, `work_tui_xiu_bu_men`, `base_zheng_zhi_mian_mao`, `work_zhuan_ye_he_gong_zhong`, `now_suo_shu_zhi_bu`, `his_jia_ru_zu_zhi`, `his_zheng_fu_jin_tie`, `his_zheng_fu_jin_tie_deng_ji`, `his_fu_zhuan_tui_jun_ren`, `his_shang_can`, `his_shang_can_deng_ji`, `his_li_zhan_gong`, `his_la_zhan_gong_deng_ji`, `base_du_sheng_zi_nv`, `his_lao_mo`, `his_lao_mo_deng_ji`, `now_gong_zi_hao`, `now_yi_ka_tong`, `now_man_xing_ji_bing`, `now_jian_kang_zhuang_kuang`, `conn_xian_hu_kou_di_zhi`, `conn_yu_zi_nv_sheng_huo`, `conn_yu_shui_sheng_huo`, `conn_xian_ju_zhu_di_zhi`, `conn_zhu_zhai_dian_hua`, `conn_shou_ji_hao_ma`, `conn_li_shi_hao_ma`, `conn_email_or_qq`, `conn_pei_ou_huo_zi_nv_email`, `mate_hun_yin_zhuang_kuang`, `mate_pei_ou_name`, `mate_pei_ou_phone`, `mate_pei_ou_jian_kang`, `lian_xi_ren_name`, `lian_xi_ren_guan_xi`, `lian_xi_ren_phone`, `his_shuang_zhi_gong`, `children_zi_nv_name`, `children_zi_nv_address`, `children_zi_nv_dan_wei`, `children_zi_nv_phone`, `now_ai_hao_xiang_mu`, `now_jian_chi_jian_shen`, `xiao_nei_name`, `xiao_nei_guan_xi`, `xiao_nei_phone`, `xiao_nei_bu_men`, `xiao_nei_address`, `now_lao_nian_ti_xie_zu`, `now_liu_lan_website`, `now_xiao_wai_tuan_ti_zhi_wu`, `his_jun_shu_jun_lie`, `remark`, `his_union_group`, `tian_biao_shi_jian`, `dead_time`)" +
      "VALUES(?1,?2,?3,?4)", nativeQuery = true)
  void InfoDead(String basePhotoUrl,
                  String baseName,
                  String baseSex,
                  String workKaiShiGongZuo,
                  String baseJiGuan,
                  String baseShengRi,
                  String workDaoXiaoShiJian,
                  String baseShenFenZheng,
                  String baseMinZu,
                  String baseXueLi,
                  String baseXueWei,
                  String workBianZhiLeiXing,
                  String workZhiWu,
                  String workZhiWuJiBie,
                  String workZhiCheng,
                  String workZhiChengJiBie,
                  String workTiQianTuiXiu,
                  String workZhengShiTuiXiu,
                  String workTuiXiuBuMen,
                  String baseZhengZhiMianMao,
                  String workZhuanYeHeGongZhong,
                  String nowSuoShuZhiBu,
                  String hisJiaRuZuZhi,
                  String hisZhengFuJinTie,
                  String hisZhengFuJinTieDengJi,
                  String hisFuZhuanTuiJunRen,
                  String hisShangCan,
                  String hisShangCanDengJi,
                  String hisLiZhanGong,
                  String hisLaZhanGongDengJi,
                  String baseDuShengZiNv,
                  String hisLaoMo,
                  String hisLaoMoDengJi,
                  String nowGongZiHao,
                  String nowYiKaTong,
                  String nowManXingJiBing,
                  String nowJianKangZhuangKuang,
                  String connXianHuKouDiZhi,
                  String connYuZiNvShengHuo,
                  String connYuShuiShengHuo,
                  String connXianJuZhuDiZhi,
                  String connZhuZhaiDianHua,
                  String connShouJiHaoMa,
                  String connLiShiHaoMa,
                  String connEmailOrQq,
                  String connPeiOuHuoZiNvEmail,
                  String mateHunYinZhuangKuang,
                  String matePeiOuName,
                  String matePeiOuPhone,
                  String matePeiOuJianKang,
                  String lianXiRenName,
                  String lianXiRenGuanXi,
                  String lianXiRenPhone,
                  String hisShuangZhiGong,
                  String childrenZiNvName,
                  String childrenZiNvAddress,
                  String childrenZiNvDanWei,
                  String childrenZiNvPhone,
                  String nowAiHaoXiangMu,
                  String nowJianChiJianShen,
                  String xiaoNeiName,
                  String xiaoNeiGuanXi,
                  String xiaoNeiPhone,
                  String xiaoNeiBuMen,
                  String xiaoNeiAddress,
                  String nowLaoNianTiXieZu,
                  String nowLiuLanWebsite,
                  String nowXiaoWaiTuanTiZhiWu,
                  String hisJunShuJunLie,
                  String remark,
                  String hisUnionGroup,
                  String tianBiaoShiJian,
                  String deadTime);

}
