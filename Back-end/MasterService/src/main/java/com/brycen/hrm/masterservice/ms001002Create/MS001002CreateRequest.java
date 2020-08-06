package com.brycen.hrm.masterservice.ms001002Create;

public class MS001002CreateRequest {
    private String username;

    private String password;

//    private Set<Long> listRole;
    
    private Long roleID;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getRoleID() {
        return roleID;
    }

    public void setRoleID(Long roleID) {
        this.roleID = roleID;
    }

//    public Set<Long> getListRole() {
//        return listRole;
//    }
//
//    public void setListRole(Set<Long> listRole) {
//        this.listRole = listRole;
//    }
    
    
}
