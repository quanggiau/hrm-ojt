package com.brycen.hrm.masterservice.ms002001Search;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brycen.hrm.common.base.ContentResponse;
import com.brycen.hrm.entity.DepartmentEntity;

/**
 * [Description]: Class connect to database to search department and send result to interface<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Service
public class MS002001SearchImpl implements MS002001SearchService {
    @Autowired
    public EntityManager em;

    private Query query;

    @Override
    public ContentResponse search(MS002001SearchRequest searchRequest) {
        
        StringBuffer selectString = new StringBuffer("SELECT * ");
        StringBuffer fromString = new StringBuffer("FROM department d");
        StringBuffer whereString = new StringBuffer(" WHERE d.company_id= :companyID");
        StringBuffer queryString = new StringBuffer();
        if(searchRequest.getDepartmentCode() != null) {
            whereString
            .append(" AND")
            .append(" d.department_code= :departmentCode");
        }
        if(searchRequest.getDepartmentName() != null) {
            whereString
            .append(" AND")
            .append(" d.department_name= :departmentName");
        }
        queryString.append(selectString).append(fromString).append(whereString);
        query = em.createNativeQuery(queryString.toString(), DepartmentEntity.class);
        query.setParameter("companyID", searchRequest.getCompanyID());
        if(searchRequest.getDepartmentCode() != null) {
            query.setParameter("departmentCode", searchRequest.getDepartmentCode());
        }
        if(searchRequest.getDepartmentName() != null) {
            query.setParameter("departmentName", searchRequest.getDepartmentName());
        }
        
        if (searchRequest.getDepartmentName() != null && searchRequest.getDepartmentCode() != null) {
            query.setParameter("departmentName", searchRequest.getDepartmentName());
            query.setParameter("departmentCode", searchRequest.getDepartmentCode());
        }
        int totalElements = query.getResultList().size();
        @SuppressWarnings("unchecked")
        List<DepartmentEntity> departmentList = query.setFirstResult(searchRequest.getPageNum()).setMaxResults(searchRequest.getPageSize()).getResultList();
        List<Object> result = departmentList.stream().map(MS002001SearchResponse::new).collect(Collectors.toList());
        ContentResponse content = new ContentResponse(result, searchRequest.getPageNum(), searchRequest.getPageSize(), totalElements);
        return content;
    }
}
