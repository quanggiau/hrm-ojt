package com.brycen.hrm.masterservice.ms000000Login;

import java.util.List;
import java.util.stream.Collectors;

import com.brycen.hrm.entity.ScreenEntity;

/**
 * [Description]:Custom Screen Response<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
public class MS000000ScreenResponse {
    /**
     * Screen ID
     */
    private Long screenID;
    
    /**
     * Screen Name
     */
    private String screenName;
    
    /**
     * Screen URL
     */
    private String screenUrl;
    
    /**
     * ID parent of screen
     */
    private Long screenLevel;    
    
    
    /**
     * List action of screen
     */
    private List<MS000000RoleScreenActionResponse> listAction;

    public MS000000ScreenResponse() {
        super();
        // TODO Auto-generated constructor stub
    }
    public MS000000ScreenResponse(ScreenEntity screenEntity) {
        super();
        this.screenID = screenEntity.getScreenID();
        this.screenName = screenEntity.getScreenName();
        this.screenUrl = screenEntity.getScreenUrl();
        this.screenLevel = screenEntity.getScreenLevel();
        this.listAction = screenEntity.getListAction().stream().map(MS000000RoleScreenActionResponse::new).collect(Collectors.toList());
    }
    public Long getScreenID() {
        return screenID;
    }
    public void setScreenID(Long screenID) {
        this.screenID = screenID;
    }
    public String getScreenName() {
        return screenName;
    }
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
    public String getScreenUrl() {
        return screenUrl;
    }
    public void setScreenUrl(String screenUrl) {
        this.screenUrl = screenUrl;
    }
    public Long getScreenLevel() {
        return screenLevel;
    }
    public void setScreenLevel(Long screenLevel) {
        this.screenLevel = screenLevel;
    }
    public List<MS000000RoleScreenActionResponse> getListAction() {
        return listAction;
    }
    public void setListAction(List<MS000000RoleScreenActionResponse> listAction) {
        this.listAction = listAction;
    }
    
    
}
