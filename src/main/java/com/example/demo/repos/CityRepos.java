package com.example.demo.repos;

import com.example.demo.domain.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepos extends JpaRepository<City, Integer> {
  @Query(value = "select * from Retirement_management_system.city where level=?1",nativeQuery = true)
  List<City> findAllByLevelEquals(Integer level);
  List<City> findAllByParentidEquals(Integer parentid);

}
