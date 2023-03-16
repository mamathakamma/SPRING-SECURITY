package com.spring.security.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.example.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);

}
