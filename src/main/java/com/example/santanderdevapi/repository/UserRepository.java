package com.example.santanderdevapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.santanderdevapi.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
