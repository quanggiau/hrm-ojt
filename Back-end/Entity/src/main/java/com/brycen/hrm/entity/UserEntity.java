package com.brycen.hrm.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brycen.hrm.common.base.BaseEntity;

/**
 * [Description]:User Entity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
    /**
     * User ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userID;

    /**
     * username of user
     */
    @Column(name = "user_name")
    private String username;

    /**
     * password of user
     */
    @Column(name = "password")
    private String password;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    private Set<UserRoleEntity> listUserRole = new HashSet<>();

//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable( name = "user_role", 
//                joinColumns = @JoinColumn(name = "user_id"), 
//                inverseJoinColumns = @JoinColumn(name = "role_id"))
//    private Set<RoleEntity> listRole = new HashSet<>();
    
    /**
     * Role of User
     */
    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleEntity role;
    
    /**
     * Employee of User
     */
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;
    
    public UserEntity() {

    }

    public UserEntity(String username, String password) {
        this.username = username;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Set<RoleEntity> getListRole() {
//        return listRole;
//    }
//
//    public void setListRole(Set<RoleEntity> listRole) {
//        this.listRole = listRole;
//    }

    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

//    public Set<UserRoleEntity> getListUserRole() {
//        return listUserRole;
//    }
//
//    public void setListUserRole(Set<UserRoleEntity> listUserRole) {
//        this.listUserRole = listUserRole;
//    }


    
}
