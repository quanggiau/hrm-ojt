package com.brycen.hrm.masterservice.ms000000Login;

public class MS000000LogInRequest {
    /**
     * Username of user
     */
    private String username;

    /**
     * Password of user
     */
    private String password;

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

}
