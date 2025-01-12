package com.Budget.Blaze.repository;

import com.Budget.Blaze.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String role);
}
