package com.brycen.hrm.masterservice.ms000000Login;

import com.brycen.hrm.entity.RoleScreenActionEntity;

/**
 * [Description]:Custom RoleScreenAction Response<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
public class MS000000RoleScreenActionResponse {
    /**
     * Access of Action: true/false
     */
    private boolean access;
    
    /**
     * Action Response
     */
    private MS000000ActionResponse action;
      
    public MS000000RoleScreenActionResponse() {
        super();
        // TODO Auto-generated constructor stub
    }
    public MS000000RoleScreenActionResponse(RoleScreenActionEntity roleScreenActionEntity) {
        super();
        this.access = roleScreenActionEntity.getAccess();
        this.action = new MS000000ActionResponse(roleScreenActionEntity.getAction());
    }
    public boolean getAccess() {
        return access;
    }
    public void setAccess(boolean access) {
        this.access = access;
    }
    public MS000000ActionResponse getAction() {
        return action;
    }
    public void setAction(MS000000ActionResponse action) {
        this.action = action;
    }
    
    
}
