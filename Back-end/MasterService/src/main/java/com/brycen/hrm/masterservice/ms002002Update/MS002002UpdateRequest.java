package com.brycen.hrm.masterservice.ms002002Update;

/**
 * [Description]: Modal contain data need to receive from client to update<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
public class MS002002UpdateRequest {
    private long departmentID;

    public MS002002UpdateRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

    public MS002002UpdateRequest(long departmentID) {
        super();
        this.departmentID = departmentID;
    }

    public long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(long departmentID) {
        this.departmentID = departmentID;
    }
}
