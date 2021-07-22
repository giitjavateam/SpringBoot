package com.udemy.learning.jpa.JPA.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.learning.jpa.JPA.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
