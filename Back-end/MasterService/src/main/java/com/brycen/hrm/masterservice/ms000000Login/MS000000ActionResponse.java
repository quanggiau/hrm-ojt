package com.brycen.hrm.masterservice.ms000000Login;

import com.brycen.hrm.entity.ActionEntity;

/**
 * [Description]:Custom Action Response<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
public class MS000000ActionResponse {
    /**
     * Action Code
     */
    private String actionCode;
       
    /**
     * Action Name
     */
    private String actionName;
    
    public MS000000ActionResponse() {
        super();
        // TODO Auto-generated constructor stub
    }
    public MS000000ActionResponse(ActionEntity actionEntity) {
        super();
        this.actionCode = actionEntity.getActionCode();
        this.actionName = actionEntity.getActionName();
    }
    public String getActionCode() {
        return actionCode;
    }
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }
    public String getActionName() {
        return actionName;
    }
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }
    
    
}

