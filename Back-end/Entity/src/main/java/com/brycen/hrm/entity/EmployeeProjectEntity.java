package com.brycen.hrm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brycen.hrm.common.PrimaryKeyEmpProject;

/**
 * [Description]:EmployeeProject Entity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "employee_project")
@IdClass(PrimaryKeyEmpProject.class)
public class EmployeeProjectEntity {
    /**
     * Id of Employee
     */
    @Id
    @ManyToOne 
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;
    
    /**
     * Id of Project
     */
    @Id
    @ManyToOne 
    @JoinColumn(name = "project_id")
    private ProjectEntity project;
    
    /**
     * Possition Project Id
     */
    @ManyToOne
    @JoinColumn(name = "position_project_id")
    private PositionProjectEntity postionProject;
    
    public EmployeeProjectEntity()
    {
        
    }
    
    public EmployeeProjectEntity(EmployeeEntity employee, ProjectEntity project, PositionProjectEntity postionProject)
    {
        this.employee = employee;
        this.project = project;
        this.postionProject = postionProject;
    }

    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

    public ProjectEntity getProject() {
        return project;
    }

    public void setProject(ProjectEntity project) {
        this.project = project;
    }

    public PositionProjectEntity getPostionProject() {
        return postionProject;
    }

    public void setPostionProject(PositionProjectEntity postionProject) {
        this.postionProject = postionProject;
    }
    
    
}
