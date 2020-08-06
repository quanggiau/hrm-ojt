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
 * [Description]:LevelLanguage Entity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "level_language")
public class LevelLanguageEntity extends BaseEntity {
    /**
     * Level Language Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "level_language_id")
    private Long levelLanguageID;

    /**
     * Level Language Name
     */
    @Column(name = "level_language_name")
    private String levelLanguageName;

    /**
     * Level Language Code
     */
    @Column(name = "level_language_code")
    private String levelLanguageCode;
    
    /**
     * Level Language Description
     */
    @Column(name = "level_language_description")
    private String levelLanguageDescription;

    /**
     * List Employee Language 
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "levelLanguage")
    private Set<EmployeeLanguageEntity> listEmployeeLanguage = new HashSet<>();

    public LevelLanguageEntity() {

    }

    public LevelLanguageEntity(String levelLanguageName, String levelLanguageCode, String levelLanguageDescription) {
        this.levelLanguageName = levelLanguageName;
        this.levelLanguageCode = levelLanguageCode;
        this.levelLanguageDescription = levelLanguageDescription;
    }

    public Long getLevelLanguageID() {
        return levelLanguageID;
    }

    public void setLevelLanguageID(Long levelLanguageID) {
        this.levelLanguageID = levelLanguageID;
    }

    public String getLevelLanguageName() {
        return levelLanguageName;
    }

    public void setLevelLanguageName(String levelLanguageName) {
        this.levelLanguageName = levelLanguageName;
    }

    public String getLevelLanguageCode() {
        return levelLanguageCode;
    }

    public void setLevelLanguageCode(String levelLanguageCode) {
        this.levelLanguageCode = levelLanguageCode;
    }

    public String getLevelLanguageDescription() {
        return levelLanguageDescription;
    }

    public void setLevelLanguageDescription(String levelLanguageDescription) {
        this.levelLanguageDescription = levelLanguageDescription;
    }

    public Set<EmployeeLanguageEntity> getListEmployeeLanguage() {
        return listEmployeeLanguage;
    }

    public void setListEmployeeLanguage(Set<EmployeeLanguageEntity> listEmployeeLanguage) {
        this.listEmployeeLanguage = listEmployeeLanguage;
    }
}
