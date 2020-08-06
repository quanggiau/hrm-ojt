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
 * [Description]:VacationList Entity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "vacation_list")
public class VacationListEntity extends BaseEntity{
    /**
     * Id of Vacation List
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacation_list_id")
    private Long vacationListID;

    /**
     * Vacation List Name
     */
    @Column(name = "vacation_list_name")
    private String vacationListName;
    
    /**
     * Vacation Year
     */
    @Column(name = "vacation_year")
    private int vacationYear;
    
    /**
     * List Vacation Detail
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vacationList")
    private Set<VacationListDetailEntity> listVacationDetail = new HashSet<>();
    
    public VacationListEntity() {

    }

    public VacationListEntity(String vacationListName, int vacationYear) {
        this.vacationListName = vacationListName;
        this.vacationYear = vacationYear;
    }

    public Long getVacationListID() {
        return vacationListID;
    }

    public void setVacationListID(Long vacationListID) {
        this.vacationListID = vacationListID;
    }

    public String getVacationListName() {
        return vacationListName;
    }

    public void setVacationListName(String vacationListName) {
        this.vacationListName = vacationListName;
    }

    public int getVacationYear() {
        return vacationYear;
    }

    public void setVacationYear(int vacationYear) {
        this.vacationYear = vacationYear;
    }

    public Set<VacationListDetailEntity> getListVacationDetail() {
        return listVacationDetail;
    }

    public void setListVacationDetail(Set<VacationListDetailEntity> listVacationDetail) {
        this.listVacationDetail = listVacationDetail;
    }
    
}
