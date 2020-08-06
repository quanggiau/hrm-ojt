package com.brycen.hrm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.brycen.hrm.common.base.BaseEntity;

/**
 * [Description]:ScopeWork Entity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "scope_work")
public class ScopeWorkEntity extends BaseEntity {
    /**
     * Scope Work Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scope_work_id")
    private Long scopeWorkID;

    /**
     * Scope Work Name
     */
    @Column(name = "scope_work_name")
    private String scopeWorkName;

    /**
     * Scope Work Code
     */
    @Column(name = "scope_work_code")
    private String scopeWorkCode;

    
    
    public ScopeWorkEntity() {

    }

    public ScopeWorkEntity(String scopeWorkName, String scopeWorkCode) {
        this.scopeWorkName = scopeWorkName;
        this.scopeWorkCode = scopeWorkCode;
    }

    public Long getScopeWorkID() {
        return scopeWorkID;
    }

    public void setScopeWorkID(Long scopeWorkID) {
        this.scopeWorkID = scopeWorkID;
    }

    public String getScopeWorkName() {
        return scopeWorkName;
    }

    public void setScopeWorkName(String scopeWorkName) {
        this.scopeWorkName = scopeWorkName;
    }

    public String getScopeWorkCode() {
        return scopeWorkCode;
    }

    public void setScopeWorkCode(String scopeWorkCode) {
        this.scopeWorkCode = scopeWorkCode;
    }
    
     
}
