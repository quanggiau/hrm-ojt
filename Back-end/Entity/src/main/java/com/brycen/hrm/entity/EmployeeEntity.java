package com.brycen.hrm.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.brycen.hrm.common.base.BaseEntity;

/**
 * [Description]:Employee Entity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "employee")
public class EmployeeEntity extends BaseEntity {

    /**
     * ID of Employee
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeID;
    
    /**
     * Code of Employee
     */
    @Column(name = "employee_code")
    private String employeeCode;

    /**
     * Last Name of Employee
     */
    @Column(name = "last_name")
    private String lastName;

    /**
     * First Name of Employee
     */
    @Column(name = "first_name")
    private String firstName;
    
    /**
     * BirthDay of Employee
     */
    @Column(name = "birthday")
    private Date birthday;
    
    /**
     * Gender of Employee
     */
    @Column(name = "gender")
    private boolean gender;
    
    /**
     * Email of Employee
     */
    @Column(name = "email")
    private String email;
    
    /**
     * Phone number of Employee
     */
    @Column(name = "phone_number")
    private String phone;

    /**
     * Address of Employee
     */
    @Column(name = "address")
    private String address;
    
    /**
     * Avatar URL of Employee
     */
    @Column(name = "avata_url")
    private String avataUrl;
    
    /**
     * Employee History
     */
    @Column(name = "employment_history")
    private String employmentHistory;
    
    /**
     * IdentityCard of Employee
     */
    @Column(name = "identity_card")
    private String identityCard;
    
    /**
     * Year graduate of Employee
     */
    @Column(name = "graduate_year")
    private int graduateYear;
    
    /**
     * University of Employee
     */
    @Column(name = "university")
    private String university;
    
    /**
     * Skype of Employee
     */
    @Column(name = "skype")
    private String skype;
    
    /**
     * Date join Campany 
     */
    @Column(name = "date_join_company")
    private Date dateJoinCompany;
    
    /**
     * Number of children
     */
    @Column(name = "num_of_child")
    private int numOfChild;
    
    /**
     * Information for contact emergency
     */
    @Column(name = "emergency")
    private String emergency;
    
    /**
     * Degree of Employee
     */
    @Column(name = "degree")
    private String degree;
    
    /**
     * Note for Employee
     */
    @Column(name = "notes")
    private String notes;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentEntity department;
    
    @ManyToOne
    @JoinColumn(name = "status_employee_id")
    private StatusEmployeeEntity statusEmployee;
    
    @ManyToOne
    @JoinColumn(name = "position_employee_id")
    private PositionEmployeeEntity positionEmployee;
    
    @ManyToOne
    @JoinColumn(name = "contract_type_id")
    private ContractTypeEntity contractType;
    
//    @ManyToOne
//    @JoinColumn(name = "company_id")
//    private CompanyEntity company;
    
    @ManyToOne
    @JoinColumn(name = "nationality_id")
    private NationalityEntity nationality;
    
    /**
     * List Employee Skill
     */
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<EmployeeSkillEntity> listEmpSkill;
    
    /**
     * List Employee Language
     */
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<EmployeeLanguageEntity> listEmpLanguage;
    
    /**
     * List Employee Vacation Type
     */
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<EmployeeVacationTypeEntity> litsEmpVacationType;
    
    /**
     * List Employee Project
     */
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<EmployeeProjectEntity> listEmpProject;
    
    
    /**
     * List vacation of Employee
     */
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<VacationEntity> listVacation ;
    
    /**
     * List User
     */
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<UserEntity> listUser  ;
    
    public EmployeeEntity() {

    }

//    public EmployeeEntity(String actionName, String actionCode) {
//        this.actionName = actionName;
//        this.actionCode = actionCode;
//    }
    
    public Long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvataUrl() {
        return avataUrl;
    }

    public void setAvataUrl(String avataUrl) {
        this.avataUrl = avataUrl;
    }

    public String getEmploymentHistory() {
        return employmentHistory;
    }

    public void setEmploymentHistory(String employmentHistory) {
        this.employmentHistory = employmentHistory;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public int getGraduateYear() {
        return graduateYear;
    }

    public void setGraduateYear(int graduateYear) {
        this.graduateYear = graduateYear;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Date getDateJoinCompany() {
        return dateJoinCompany;
    }

    public void setDateJoinCompany(Date dateJoinCompany) {
        this.dateJoinCompany = dateJoinCompany;
    }

    public int getNumOfChild() {
        return numOfChild;
    }

    public void setNumOfChild(int numOfChild) {
        this.numOfChild = numOfChild;
    }

    public String getEmergency() {
        return emergency;
    }

    public void setEmergency(String emergency) {
        this.emergency = emergency;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public DepartmentEntity getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentEntity department) {
        this.department = department;
    }

    public StatusEmployeeEntity getStatusEmployee() {
        return statusEmployee;
    }

    public void setStatusEmployee(StatusEmployeeEntity statusEmployee) {
        this.statusEmployee = statusEmployee;
    }

    public PositionEmployeeEntity getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(PositionEmployeeEntity positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public NationalityEntity getNationality() {
        return nationality;
    }

    public void setNationality(NationalityEntity nationality) {
        this.nationality = nationality;
    }

    public List<EmployeeSkillEntity> getListEmpSkill() {
        return listEmpSkill;
    }

    public void setListEmpSkill(List<EmployeeSkillEntity> listEmpSkill) {
        this.listEmpSkill = listEmpSkill;
    }

    public List<EmployeeLanguageEntity> getListEmpLanguage() {
        return listEmpLanguage;
    }

    public void setListEmpLanguage(List<EmployeeLanguageEntity> listEmpLanguage) {
        this.listEmpLanguage = listEmpLanguage;
    }

    public List<EmployeeVacationTypeEntity> getLitsEmpVacationType() {
        return litsEmpVacationType;
    }

    public void setLitsEmpVacationType(List<EmployeeVacationTypeEntity> litsEmpVacationType) {
        this.litsEmpVacationType = litsEmpVacationType;
    }

    public List<EmployeeProjectEntity> getListEmpProject() {
        return listEmpProject;
    }

    public void setListEmpProject(List<EmployeeProjectEntity> listEmpProject) {
        this.listEmpProject = listEmpProject;
    }


}
