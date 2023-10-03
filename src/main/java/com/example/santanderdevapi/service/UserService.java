package com.example.santanderdevapi.service;

import com.example.santanderdevapi.model.User;

public interface UserService {

    User findById(Long id);
    User creatUser(User userToCreat);
    
}
