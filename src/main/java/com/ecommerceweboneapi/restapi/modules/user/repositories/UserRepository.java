package com.ecommerceweboneapi.restapi.modules.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceweboneapi.restapi.modules.user.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
    User findByUsername(String username);

}
