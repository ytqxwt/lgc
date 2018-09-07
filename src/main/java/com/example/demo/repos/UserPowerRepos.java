package com.example.demo.repos;

import com.example.demo.domain.entity.Power;
import com.example.demo.domain.entity.UserPower;
import com.example.demo.domain.entity.UserPowerPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserPowerRepos extends JpaRepository<UserPower, UserPowerPK> {

}
