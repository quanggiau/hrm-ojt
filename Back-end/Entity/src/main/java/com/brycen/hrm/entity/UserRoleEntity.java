//package com.brycen.hrm.entity;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.IdClass;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import com.brycen.hrm.common.base.BaseEntity;
//import com.brycen.hrm.common.base.PrimaryKeyUserRole;
//
///**
// * [Description]:<br>
// * [ Remarks ]:<br>
// * [Copyright]: Copyright (c) 2020<br>
// * 
// * @author Brycen VietNam Company
// * @version 1.0
// */
//@Entity
//@Table(name = "user_role")
//@IdClass(PrimaryKeyUserRole.class)
//public class UserRoleEntity extends BaseEntity{
//
//    @Id
//    @ManyToOne 
//    @JoinColumn(name = "user_id")
//    private UserEntity user;
//    
//    @Id
//    @ManyToOne 
//    @JoinColumn(name = "role_id")
//    private RoleEntity role;
//    
//    public UserRoleEntity()
//    {
//        
//    }
//    
//    public UserRoleEntity(UserEntity user, RoleEntity role)
//    {
//        this.user = user;
//        this.role = role;
//    }
//
//    public UserEntity getUser() {
//        return user;
//    }
//
//    public void setUser(UserEntity user) {
//        this.user = user;
//    }
//
//    public RoleEntity getRole() {
//        return role;
//    }
//
//    public void setRole(RoleEntity role) {
//        this.role = role;
//    }
//    
//    
//}
