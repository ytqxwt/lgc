package com.example.demo.repos;

import com.example.demo.domain.entity.BaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BaseInfoRepos extends JpaRepository<BaseInfo, String>, JpaSpecificationExecutor<BaseInfo> {
}
