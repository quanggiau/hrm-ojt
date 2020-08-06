package com.brycen.hrm.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brycen.hrm.common.base.BaseEntity;

/**
 * [Description]:VacationListDetail Entity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "vacation_list_detail")
public class VacationListDetailEntity extends BaseEntity {
    /**
     * Vacation List Detail Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacation_list_detail_id")
    private Long vacationListDetailID;

    /**
     * Vacation List Detail Name
     */
    @Column(name = "vacation_list_detail_name")
    private String vacationListDetailName;
    
    /**
     * Vacation Detail Date
     */
    @Column(name = "vacation_detail_date")
    private Date vacationDetailDate;
    
    /**
     * List Vacation
     */
    @ManyToOne
    @JoinColumn(name = "vacation_list_id")
    private VacationListEntity vacationList;
    
    public VacationListDetailEntity()
    {
        
    }
    
    public VacationListDetailEntity(String vacationListDetailName, Date vacationDetailDate)
    {
        this.vacationListDetailName = vacationListDetailName;
        this.vacationDetailDate = vacationDetailDate;
    }

    public Long getVacationListDetailID() {
        return vacationListDetailID;
    }

    public void setVacationListDetailID(Long vacationListDetailID) {
        this.vacationListDetailID = vacationListDetailID;
    }

    public String getVacationListDetailName() {
        return vacationListDetailName;
    }

    public void setVacationListDetailName(String vacationListDetailName) {
        this.vacationListDetailName = vacationListDetailName;
    }

    public Date getVacationDetailDate() {
        return vacationDetailDate;
    }

    public void setVacationDetailDate(Date vacationDetailDate) {
        this.vacationDetailDate = vacationDetailDate;
    }

    public VacationListEntity getVacationList() {
        return vacationList;
    }

    public void setVacationList(VacationListEntity vacationList) {
        this.vacationList = vacationList;
    }
       
}
