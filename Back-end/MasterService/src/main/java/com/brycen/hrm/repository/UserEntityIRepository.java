package com.brycen.hrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brycen.hrm.entity.UserEntity;

public interface UserEntityIRepository extends JpaRepository<UserEntity, Long>{
    UserEntity findByUserID(Long userID);
}
