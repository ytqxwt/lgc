package com.example.demo.repos;

import com.example.demo.domain.entity.InfoNew;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface InfoNewRepos extends JpaRepository<InfoNew, Integer>, JpaSpecificationExecutor<InfoNew> {
    InfoNew findByBaseShenFenZhengEquals(String s);

}
