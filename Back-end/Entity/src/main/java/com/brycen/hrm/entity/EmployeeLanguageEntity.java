package com.brycen.hrm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brycen.hrm.common.PrimaryKeyEmpLanguage;
import com.brycen.hrm.common.base.BaseEntity;

/**
 * [Description]:EmployeeLanguage Entity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "employee_language")
@IdClass(PrimaryKeyEmpLanguage.class)
public class EmployeeLanguageEntity extends BaseEntity {

    /**
     * Id of Employee
     */
    @Id
    @ManyToOne 
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;
    
    /**
     * Id of Language
     */
    @Id
    @ManyToOne 
    @JoinColumn(name = "language_id")
    private LanguageEntity language;
    
    /**
     * Id of Level Language
     */
    @ManyToOne
    @JoinColumn(name = "level_language_id")
    private LevelLanguageEntity levelLanguage;

    public EmployeeLanguageEntity()
    {
        
    }
    
    public EmployeeLanguageEntity(EmployeeEntity employee, LanguageEntity language, LevelLanguageEntity levelLanguage)
    {
        this.employee = employee;
        this.language = language;
        this.levelLanguage = levelLanguage;
    }
    
    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

    public LanguageEntity getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEntity language) {
        this.language = language;
    }

    public LevelLanguageEntity getLevelLanguage() {
        return levelLanguage;
    }

    public void setLevelLanguage(LevelLanguageEntity levelLanguage) {
        this.levelLanguage = levelLanguage;
    }
    
    
}
