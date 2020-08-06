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
 * [Description]:Vacation Entity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "vacation")
public class VacationEntity extends BaseEntity{
    /**
     * ID of Vacation
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacation_id")
    private Long vacationTypeID;

    /**
     * Reason of Vacation
     */
    @Column(name = "vacation_reason")
    private String vacationReason;
    
    /**
     * Note of Vacation
     */
    @Column(name = "vacation_note")
    private String vacationNote;
    
    /**
     * Vacation Start Date
     */
    @Column(name = "vacation_start_date")
    private Date vacationStartDate;
    
    /**
     * Vacation End Date
     */
    @Column(name = "vacation_end_date")
    private Date vacationEndDate;
    
    /**
     * Group Assign 1
     */
    @Column(name = "group_assign_one")
    private String groupAssignOne;
    
    /**
     * Group Assign 2
     */
    @Column(name = "group_assign_two")
    private String groupAssignTwo;
    
    /**
     * Group Assign 3
     */
    @Column(name = "group_assign_three")
    private String groupAssignThree;
    
    /**
     * Vacation Type
     */
    @ManyToOne
    @JoinColumn(name = "vacation_type_id")
    private VacationTypeEntity vacationType;
    
    /**
     * Vacation Option
     */
    @ManyToOne
    @JoinColumn(name = "vacation_option_id")
    private VacationOptionEntity vacationOption;
    
    /**
     * Employee Entity
     */
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;
    
    public VacationEntity() {

    }

    public Long getVacationTypeID() {
        return vacationTypeID;
    }

    public void setVacationTypeID(Long vacationTypeID) {
        this.vacationTypeID = vacationTypeID;
    }

    public String getVacationReason() {
        return vacationReason;
    }

    public void setVacationReason(String vacationReason) {
        this.vacationReason = vacationReason;
    }

    public String getVacationNote() {
        return vacationNote;
    }

    public void setVacationNote(String vacationNote) {
        this.vacationNote = vacationNote;
    }

    public Date getVacationStartDate() {
        return vacationStartDate;
    }

    public void setVacationStartDate(Date vacationStartDate) {
        this.vacationStartDate = vacationStartDate;
    }

    public Date getVacationEndDate() {
        return vacationEndDate;
    }

    public void setVacationEndDate(Date vacationEndDate) {
        this.vacationEndDate = vacationEndDate;
    }

    public String getGroupAssignOne() {
        return groupAssignOne;
    }

    public void setGroupAssignOne(String groupAssignOne) {
        this.groupAssignOne = groupAssignOne;
    }

    public String getGroupAssignTwo() {
        return groupAssignTwo;
    }

    public void setGroupAssignTwo(String groupAssignTwo) {
        this.groupAssignTwo = groupAssignTwo;
    }

    public String getGroupAssignThree() {
        return groupAssignThree;
    }

    public void setGroupAssignThree(String groupAssignThree) {
        this.groupAssignThree = groupAssignThree;
    }

    public VacationTypeEntity getVacationType() {
        return vacationType;
    }

    public void setVacationType(VacationTypeEntity vacationType) {
        this.vacationType = vacationType;
    }

    public VacationOptionEntity getVacationOption() {
        return vacationOption;
    }

    public void setVacationOption(VacationOptionEntity vacationOption) {
        this.vacationOption = vacationOption;
    }
    
    
}
