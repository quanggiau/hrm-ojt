package com.brycen.hrm.masterservice.ms000000Login;

/**
 * [Description]:Login Response<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
public class MS000000LogInResponse {
    /**
     * Access Token
     */
    private String token;
    
    /**
     * Token Type : Bearer
     */
    private String type = "Bearer";
    
    /**
     * User ID 
     */
    private Long userID;
    
    /**
     * Username of User
     */
    private String username;
//    private List<String> roles;
//    private List<Integer> roleValues;
    /**
     * Employee ID of User
     */
    private Long employeeID;
        
    /**
     * List access Screen of Role user
     */
    private Object role;

    public MS000000LogInResponse(String accessToken, Long userID, String username, Long employeeID, Object role) {
        this.token = accessToken;
        this.userID = userID;
        this.username = username;
//        this.roleValues = roleValues;
//        this.roles = roles;
        this.employeeID = employeeID;
        this.role = role;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public List<Integer> getRoleValues() {
//        return roleValues;
//    }
//
//    public void setRoleValues(List<Integer> roleValues) {
//        this.roleValues = roleValues;
//    }

    public Long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public Object getRole() {
        return role;
    }

    public void setRole(Object role) {
        this.role = role;
    }

//    public List<String> getRoles() {
//        return roles;
//    }
}
