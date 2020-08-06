package com.brycen.hrm.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/**
 * [Description]: Company Entity [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "company")
public class CompanyEntity {

    /**
     * ID of Company
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private Long companyID;

    /**
     * Name of Company
     */
    @Column(name = "company_name")
    private String companyName;


    /**
     * 
     */
    @Column(name = "is_delete", columnDefinition = "tinyint(0)")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean isDelete;

    /**
     * Create by User
     */
    @Column(name = "create_by")
    private int createBy;

    /**
     * Last modified by User
     */
    @Column(name = "last_modified_by")
    private int lastModifiedBy;
    
    /**
     * Date create
     */
    @Column(name = "create_date")
    private Date createDate;
    
    /**
     * Last Modified Date
     */
    @Column(name = "last_modified_date")
    private Date lastModifiedDate;


    public CompanyEntity() {
    }

    public Long getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Long companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCreateBy() {
        return createBy;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
    }

    public int getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(int lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

}
