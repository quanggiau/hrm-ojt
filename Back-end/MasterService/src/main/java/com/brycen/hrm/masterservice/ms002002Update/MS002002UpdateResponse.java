package com.brycen.hrm.masterservice.ms002002Update;

import com.brycen.hrm.entity.DepartmentEntity;

/**
 * [Description]: Model contain data what want to send to client<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
public class MS002002UpdateResponse {
    private String departmentName;
    private String departmentCode;
    private String departmentDescription;

    public MS002002UpdateResponse(DepartmentEntity departmentEntity) {
        super();
        this.departmentName = departmentEntity.getDepartmentName();
        this.departmentCode = departmentEntity.getDepartmentCode();
        this.departmentDescription = departmentEntity.getDepartmentDescription();
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
}
