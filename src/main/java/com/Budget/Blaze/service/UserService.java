package com.Budget.Blaze.service;

import com.Budget.Blaze.DTO.WebUser;
import com.Budget.Blaze.entity.Users;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    Users findUserByUserName(String username);

    void save(WebUser webUser);
}
