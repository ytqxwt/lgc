package com.example.demo.repos;

import com.example.demo.domain.entity.UserPower;
import com.example.demo.domain.entity.UserPowerPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPowerRepos extends JpaRepository<UserPower, UserPowerPK> {
}
