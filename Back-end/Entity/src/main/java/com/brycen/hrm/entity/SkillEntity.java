package com.brycen.hrm.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.brycen.hrm.common.base.BaseEntity;

/**
 * [Description]:Skill Entity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "skill")
public class SkillEntity extends BaseEntity {
    /**
     * Skill Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private Long skillID;

    /**
     * Skill Name
     */
    @Column(name = "skill_name")
    private String skillName;

    /**
     * Skill Code
     */
    @Column(name = "skill_code")
    private String skillCode;
    
    /**
     * Skill Description
     */
    @Column(name = "skill_description")
    private String skillDescription;

    /**
     * List Employee Skill
     */
    @OneToMany(mappedBy = "skill", cascade = CascadeType.ALL)
    private List<EmployeeSkillEntity> empSkills;
    
    public SkillEntity() {

    }

    public SkillEntity(String skillName, String skillCode, String skillDescription) {
        this.skillName = skillName;
        this.skillCode = skillCode;
        this.skillDescription = skillDescription;
    }

    public Long getSkillID() {
        return skillID;
    }

    public void setSkillID(Long skillID) {
        this.skillID = skillID;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillCode() {
        return skillCode;
    }

    public void setSkillCode(String skillCode) {
        this.skillCode = skillCode;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }
}
