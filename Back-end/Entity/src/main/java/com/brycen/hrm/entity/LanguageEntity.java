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
 * [Description]:Language Entity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "language")
public class LanguageEntity extends BaseEntity{
    /**
     * Language Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private Long languageID;

    /**
     * Language Name
     */
    @Column(name = "language_name")
    private String languageName;

    /**
     * Language Code
     */
    @Column(name = "language_code")
    private String languageCode;
    
    /**
     * Language Description
     */
    @Column(name = "language_description")
    private String languageDescription;

    /**
     * List Employee Language
     */
    @OneToMany(mappedBy = "language", cascade = CascadeType.ALL)
    private List<EmployeeLanguageEntity> listEmployeeLanguage;

    public LanguageEntity() {

    }

    public LanguageEntity(String languageName, String languageCode, String languageDescription) {
        this.languageName = languageName;
        this.languageCode = languageCode;
        this.languageDescription = languageDescription;
    }
    
    public Long getLanguageID() {
        return languageID;
    }

    public void setLanguageID(Long languageID) {
        this.languageID = languageID;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLanguageDescription() {
        return languageDescription;
    }

    public void setLanguageDescription(String languageDescription) {
        this.languageDescription = languageDescription;
    }

    public List<EmployeeLanguageEntity> getListEmployeeLanguage() {
        return listEmployeeLanguage;
    }

    public void setListEmployeeLanguage(List<EmployeeLanguageEntity> listEmployeeLanguage) {
        this.listEmployeeLanguage = listEmployeeLanguage;
    }

}
