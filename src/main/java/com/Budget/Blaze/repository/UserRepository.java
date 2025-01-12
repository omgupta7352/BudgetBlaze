package com.Budget.Blaze.repository;

import com.Budget.Blaze.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByUserName(String username);
}
