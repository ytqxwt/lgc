package com.example.demo.repos;

import com.example.demo.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepos extends JpaRepository<User,Integer> {
  User findByNameEquals(String name);
}
