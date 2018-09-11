package com.example.demo.repos;

import com.example.demo.domain.entity.InfoNew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InfoNewRepos extends JpaRepository<InfoNew, String>, JpaSpecificationExecutor<InfoNew> {
}
