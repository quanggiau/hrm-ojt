package com.brycen.hrm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brycen.hrm.entity.RoleEntity;

public interface RoleEntityIRepository extends JpaRepository<RoleEntity, Long> {
    List<RoleEntity> findByRoleName(String roleName);
}
