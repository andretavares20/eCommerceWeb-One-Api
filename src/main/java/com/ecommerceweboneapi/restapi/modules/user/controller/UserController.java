package com.ecommerceweboneapi.restapi.modules.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceweboneapi.restapi.modules.user.dto.CreateUserRoleDTO;
import com.ecommerceweboneapi.restapi.modules.user.model.User;
import com.ecommerceweboneapi.restapi.modules.user.service.CreateRoleUserService;
import com.ecommerceweboneapi.restapi.modules.user.service.CreateUserService;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    CreateUserService createUserService;

    @Autowired
    CreateRoleUserService createRoleUserService;

    @PostMapping("/create")
    public User create(@RequestBody User user){
        return createUserService.execute(user);
    }

    @PostMapping("/role")
    public User role(@RequestBody CreateUserRoleDTO createUserRoleDto){

        return createRoleUserService.execute(createUserRoleDto);

    }

}
