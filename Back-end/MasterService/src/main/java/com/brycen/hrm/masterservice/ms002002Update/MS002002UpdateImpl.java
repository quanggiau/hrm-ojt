package com.brycen.hrm.masterservice.ms002002Update;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brycen.hrm.common.base.BaseResponse;
import com.brycen.hrm.entity.DepartmentEntity;

/**
 * [Description]: This is place to update department<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Service
public class MS002002UpdateImpl implements MS002002UpdateService {
    @Autowired
    private MS002002UpdateRepository updateRepository;

    @Override
    public MS002002UpdateResponse findByID(long id) {
        Optional<DepartmentEntity> department = updateRepository.findById(id);
        MS002002UpdateResponse res = new MS002002UpdateResponse(department.get());
        return res;
    }

    @Override
    public BaseResponse save(DepartmentEntity departmentEntity) {
        BaseResponse baseRes = new BaseResponse();
        Optional<DepartmentEntity> currenDepartment = updateRepository.findById(departmentEntity.getDepartmentID());
        currenDepartment.get().setCreateBy(1L);
        currenDepartment.get().setCompanyID(2);
        currenDepartment.get().setLastModifiedBy(1L);
        currenDepartment.get().setDepartmentName(departmentEntity.getDepartmentName());
        currenDepartment.get().setCreateDate(departmentEntity.getCreateDate());
        currenDepartment.get().setIsDelete(departmentEntity.getIsDelete());
        currenDepartment.get().setDepartmentCode(departmentEntity.getDepartmentCode());
        currenDepartment.get().setDepartmentDescription(departmentEntity.getDepartmentDescription());
        currenDepartment.get().setLastModifiedDate(departmentEntity.getLastModifiedDate());
        updateRepository.save(currenDepartment.get());
        baseRes.setContent(null);
        return baseRes;
    }
}
