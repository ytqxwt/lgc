package com.example.demo.repos;

import com.example.demo.domain.entity.Power;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface PowerRepos extends JpaRepository<Power, String> {
  @Query(value = "select * from Retirement_management_system.power where id in " +
      "(select p_id from Retirement_management_system.user_power where u_id =?1)", nativeQuery = true)
  List<Power> findAllByUserId(String uid);

  @Query(value = "select * from Retirement_management_system.power where id not in " +
      "(select p_id from Retirement_management_system.user_power where u_id =?1)", nativeQuery = true)
  List<Power> findOtherByUserId(String uid);

  @Query(value = "select id from Retirement_management_system.power", nativeQuery = true)
  List<Integer> findAllId();

  @Query(value = "select * from Retirement_management_system.power where id in " +
      "(select p_id from Retirement_management_system.user_power where u_id =?1)", nativeQuery = true)
  Power findByUserId(String uid);

}
