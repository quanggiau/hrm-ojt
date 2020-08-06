package com.brycen.hrm.masterservice.ms002001Search;

import com.brycen.hrm.entity.DepartmentEntity;

/**
 * [Description]: Create constructure of List<Object> in ContentResponse. This is data who client want to see<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
public class MS002001SearchResponse {
    private String departmentName;
    private String departmentCode;
    private String departmentDescription;

    public MS002001SearchResponse() {
        super();
    }

    public MS002001SearchResponse(DepartmentEntity departmentEntity) {
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
