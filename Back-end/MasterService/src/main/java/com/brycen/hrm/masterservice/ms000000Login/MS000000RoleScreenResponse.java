package com.brycen.hrm.masterservice.ms000000Login;

import com.brycen.hrm.entity.RoleScreenEntity;

/**
 * [Description]:Custom RoleScreen Response<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
public class MS000000RoleScreenResponse {
    /**
     * Access of Screen: true/false
     */
    private boolean access;
    
    /**
     * Screen Response
     */
    private MS000000ScreenResponse screen;
    
    public MS000000RoleScreenResponse() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public MS000000RoleScreenResponse(RoleScreenEntity roleScreenEntity) {
        super();
        this.access = roleScreenEntity.isAccess();
        this.screen = new MS000000ScreenResponse(roleScreenEntity.getScreen());
    }

    public boolean isAccess() {
        return access;
    }
    public void setAccess(boolean access) {
        this.access = access;
    }
    public MS000000ScreenResponse getScreen() {
        return screen;
    }
    public void setScreen(MS000000ScreenResponse screen) {
        this.screen = screen;
    }
    
    
}
