package com.brycen.hrm.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.brycen.hrm.common.base.BaseEntity;

/**
 * [Description]:LevelSkill Entity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "level_skill")
public class LevelSkillEntity extends BaseEntity {
    /**
     * Level Skill Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "level_skill_id")
    private Long levelSkillID;

    /**
     * Level Skill Name
     */
    @Column(name = "level_skill_name")
    private String levelSkillName;

    /**
     * Level Skill Code
     */
    @Column(name = "level_skill_code")
    private String levelSkillCode;
    
    /**
     * Level Skill Description
     */
    @Column(name = "level_skill_description")
    private String levelSkillDescription;

    /**
     * List Employee Skill
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "levelSkill")
    private Set<EmployeeSkillEntity> listEmployeeSkill = new HashSet<>();

    public LevelSkillEntity() {

    }

    public LevelSkillEntity(String levelSkillName, String levelSkillCode, String levelSkillDescription) {
        this.levelSkillName = levelSkillName;
        this.levelSkillCode = levelSkillCode;
        this.levelSkillDescription = levelSkillDescription;
    }

    public Long getLevelSkillID() {
        return levelSkillID;
    }

    public void setLevelSkillID(Long levelSkillID) {
        this.levelSkillID = levelSkillID;
    }

    public String getLevelSkillName() {
        return levelSkillName;
    }

    public void setLevelSkillName(String levelSkillName) {
        this.levelSkillName = levelSkillName;
    }

    public String getLevelSkillCode() {
        return levelSkillCode;
    }

    public void setLevelSkillCode(String levelSkillCode) {
        this.levelSkillCode = levelSkillCode;
    }

    public String getLevelSkillDescription() {
        return levelSkillDescription;
    }

    public void setLevelSkillDescription(String levelSkillDescription) {
        this.levelSkillDescription = levelSkillDescription;
    }
    
    public Set<EmployeeSkillEntity> getListEmployeeSkill() {
        return listEmployeeSkill;
    }

    public void setListEmployeeSkill(Set<EmployeeSkillEntity> listEmployeeSkill) {
        this.listEmployeeSkill = listEmployeeSkill;
    }
} 
