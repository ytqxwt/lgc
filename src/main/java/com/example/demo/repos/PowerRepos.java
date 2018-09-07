package com.example.demo.repos;

import com.example.demo.domain.entity.Power;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PowerRepos extends JpaRepository<Power, String> {
  @Query(value = "select * from Retirement_management_system.power where id in " +
      "(select p_id from Retirement_management_system.user_power where u_id =" +
      "(select id from Retirement_management_system.user where name=?1))", nativeQuery = true)
  List<Power> findAllByName(String name);
  @Query(value = "select * from Retirement_management_system.power where id not in " +
      "(select p_id from Retirement_management_system.user_power where u_id =" +
      "(select id from Retirement_management_system.user where name=?1))", nativeQuery = true)
  List<Power> findOtherByName(String name);
//  @Modifying
//  @Query(value = "",nativeQuery = true)
//  int addPower()

}
