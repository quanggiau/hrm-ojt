package com.brycen.hrm.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.brycen.hrm.entity.EmployeeEntity;

public interface EmployeeIRepository extends JpaRepository<EmployeeEntity, Long> {
  
}
