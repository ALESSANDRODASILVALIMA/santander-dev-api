package com.example.santanderdevapi.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.example.santanderdevapi.model.User;
import com.example.santanderdevapi.repository.UserRepository;
import com.example.santanderdevapi.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(
            NoSuchElementException::new
        );        
    }

    @Override
    public User creatUser(User userToCreat) {
        
        if(userToCreat.getId()!=null && userRepository.existsById(userToCreat.getId())){
            throw new IllegalArgumentException("Ja existe ou veio nulo");
        }else{
            return userRepository.save(userToCreat);
        }
    }
    
}
