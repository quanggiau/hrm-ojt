package com.brycen.hrm.masterservice.ms002002Create;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brycen.hrm.common.base.BaseResponse;
import com.brycen.hrm.entity.DepartmentEntity;

/**
 * [Description]: This is place make to create new department<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Service
public class MS002002CreateImpl implements MS002002CreateService {
    @Autowired
    private MS002002CreateRepository createRepository;

    @Override
    public BaseResponse save(DepartmentEntity departmentEntity) {
        BaseResponse baseRes = new BaseResponse();
        departmentEntity.setCreateBy(1L);
        departmentEntity.setCompanyID(1);
        departmentEntity.setLastModifiedBy(1L);
        createRepository.save(departmentEntity);
        baseRes.setContent(null);
        return baseRes;
    }
}
