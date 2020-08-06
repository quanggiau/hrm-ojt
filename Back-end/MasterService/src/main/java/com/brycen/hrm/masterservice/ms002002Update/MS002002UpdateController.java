package com.brycen.hrm.masterservice.ms002002Update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.brycen.hrm.common.base.BaseResponse;
import com.brycen.hrm.constant.LogValue;
import com.brycen.hrm.constant.UrlAPI;
import com.brycen.hrm.entity.DepartmentEntity;
import com.brycen.hrm.logger.LogLevel;
import com.brycen.hrm.logger.LoggerService;

/**
 * [Description]: this is place send response or receive request from client<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@CrossOrigin
@RestController
public class MS002002UpdateController {
    @Autowired
    private MS002002UpdateService updateService;

    @Autowired
    private LoggerService logger;

    /**
     * [Description]: Receive request by param in RequestBody and return department is specification and status to client<br/>
     * [ Remarks ]:<br/>
     *
     * @param departmentRequest
     * @return department specification and status OK if true
     */
    @PostMapping(value = "/ms/" + UrlAPI.MS002002_DETAIL_DEPARTMENT)
    public ResponseEntity<?> ms002002DetailDepartment(@RequestBody MS002002UpdateRequest departmentRequest) {
        logger.write(LogLevel.INFOMATION, UrlAPI.MS002002_DETAIL_DEPARTMENT, departmentRequest, null, LogValue.BEGIN_API);
        MS002002UpdateResponse res = updateService.findByID(departmentRequest.getDepartmentID());
        BaseResponse baseRes = new BaseResponse();
        baseRes.setContent(res);
        logger.write(LogLevel.INFOMATION, UrlAPI.MS002002_DETAIL_DEPARTMENT, departmentRequest, baseRes, LogValue.END_API);
        return new ResponseEntity<>(baseRes, HttpStatus.OK);
    }

    /**
     * [Description]: Receive request by param in RequestBody and return message and status to client<br/>
     * [ Remarks ]:<br/>
     *
     * @param departmentRequest
     * @return message success and status OK if true
     */
    @PutMapping(value = "/ms/" + UrlAPI.MS002002_UPDATE_DEPARTMENT)
    public ResponseEntity<?> ms002002UpdateDepartment(@RequestBody DepartmentEntity departmentEntity) {
        logger.write(LogLevel.INFOMATION, UrlAPI.MS002002_UPDATE_DEPARTMENT, departmentEntity, null, LogValue.BEGIN_API);
        BaseResponse baseRes = updateService.save(departmentEntity);
        logger.write(LogLevel.INFOMATION, UrlAPI.MS002002_UPDATE_DEPARTMENT, departmentEntity, baseRes, LogValue.END_API);
        return new ResponseEntity<>(baseRes, HttpStatus.OK);
    }
}
