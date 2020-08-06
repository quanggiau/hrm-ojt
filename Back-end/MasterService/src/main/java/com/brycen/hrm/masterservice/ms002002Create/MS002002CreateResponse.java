package com.brycen.hrm.masterservice.ms002002Create;

/**
 * [Description]: Model contain data what want to send to client<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
public class MS002002CreateResponse {
    private String message;

    public MS002002CreateResponse(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
