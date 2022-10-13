// package com.ecommerceweboneapi.restapi.modules.user.service;

// import org.apache.catalina.User;
// import org.springframework.beans.factory.annotation.Autowired;

// public class CreateUserService {
    
//     @Autowired
//     UserRepository userRepository;

//     public User execute(User user){

//         User existsUser = userRepository.findByUsername(user.getUsername());

//         if(existsUser != null){
//             throw new Error("User already exists!");
//         }

//         User createdUser = userRepository.save(user);

//         return createdUser;

//     }

// }
