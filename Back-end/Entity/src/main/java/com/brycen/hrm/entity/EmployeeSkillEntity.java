package com.brycen.hrm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brycen.hrm.common.PrimaryKeyEmpSkill;
import com.brycen.hrm.common.base.BaseEntity;

/**
 * [Description]:EmployeeSkill Entity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "employee_skill")
@IdClass(PrimaryKeyEmpSkill.class)
public class EmployeeSkillEntity extends BaseEntity {

    /**
     * Employee ID
     */
    @Id
    @ManyToOne 
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;
    
    /**
     * Skill Id
     */
    @Id
    @ManyToOne 
    @JoinColumn(name = "skill_id")
    private SkillEntity skill;
    
    /**
     * Level Skill Id
     */
    @ManyToOne
    @JoinColumn(name = "level_skill_id")
    private LevelSkillEntity levelSkill;
    
    public EmployeeSkillEntity()
    {
        
    }
    
    public EmployeeSkillEntity(EmployeeEntity employee, SkillEntity skill, LevelSkillEntity levelSkill)
    {
        this.employee = employee;
        this.skill = skill;
        this.levelSkill = levelSkill;
    }

    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

    public SkillEntity getSkill() {
        return skill;
    }

    public void setSkill(SkillEntity skill) {
        this.skill = skill;
    }

    public LevelSkillEntity getLevelSkill() {
        return levelSkill;
    }

    public void setLevelSkill(LevelSkillEntity levelSkill) {
        this.levelSkill = levelSkill;
    }
    
}
