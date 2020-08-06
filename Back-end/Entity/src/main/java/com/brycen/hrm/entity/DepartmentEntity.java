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
 * [Description]:Department Entity [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "department")
public class DepartmentEntity extends BaseEntity {

    /**
     * ID of Department
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Long departmentID;

    /**
     * Department Name
     */
    @Column(name = "department_name")
    private String departmentName;

    /**
     * Department Code
     */
    @Column(name = "department_code")
    private String departmentCode;

    /**
     * Department Description
     */
    @Column(name = "department_description")
    private String departmentDescription;

    /**
     * List Employee of Department
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
    private Set<EmployeeEntity> listEmployee = new HashSet<>();

    public DepartmentEntity() {

    }

    public DepartmentEntity(Long departmentID, String departmentName, String departmentCode, String departmentDescription, Set<EmployeeEntity> listEmployee) {
        super();
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
        this.departmentDescription = departmentDescription;
        this.listEmployee = listEmployee;
    }

    public Long getDepartmentID() {
        return departmentID;
    }
    
    public void setDepartmentID(Long departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentDescription() {
        return departmentDescription;
    }

    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }

    public Set<EmployeeEntity> getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(Set<EmployeeEntity> listEmployee) {
        this.listEmployee = listEmployee;
    }
}
