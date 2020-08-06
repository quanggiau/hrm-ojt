package com.brycen.hrm.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brycen.hrm.common.base.BaseEntity;

/**
 * [Description]:HistoryWork Entity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "history_work")
public class HistoryWorkEntity extends BaseEntity {
    /**
     * History Work Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "history_work_id")
    private Long historyWorkID;

    /**
     * History Work Name
     */
    @Column(name = "history_work_name")
    private String historyWorkName;

    /**
     * Start Date 
     */
    @Column(name = "start_date")
    private Date startDate;
    
    /**
     * End Date
     */
    @Column(name = "end_date")
    private Date endDate;
    
    /**
     * Inside Company
     */
    @Column(name = "inside_company")
    private boolean insideCompany;
    
    /**
     * History Technical Language
     */
    @Column(name = "history_language")
    private String historyLanguage;
    
    /**
     * History Tool Develope
     */
    @Column(name = "history_tools")
    private String historyTools;
    
    /**
     * Operation System Id
     */
    @ManyToOne
    @JoinColumn(name = "operation_system_id")
    private OperationSystemEntity operationSystem;
    
    /**
     * Used DataBase History Id
     */
    @ManyToOne
    @JoinColumn(name = "database_history_id")
    private DatabaseHistoryEntity databaseHistory;
    
    public HistoryWorkEntity() {

    }

    public HistoryWorkEntity(String historyWorkName, String actionCode) {
        this.historyWorkName = historyWorkName;
    }

    public Long getHistoryWorkID() {
        return historyWorkID;
    }

    public void setHistoryWorkID(Long historyWorkID) {
        this.historyWorkID = historyWorkID;
    }

    public String getHistoryWorkName() {
        return historyWorkName;
    }

    public void setHistoryWorkName(String historyWorkName) {
        this.historyWorkName = historyWorkName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isInsideCompany() {
        return insideCompany;
    }

    public void setInsideCompany(boolean insideCompany) {
        this.insideCompany = insideCompany;
    }

    public String getHistoryLanguage() {
        return historyLanguage;
    }

    public void setHistoryLanguage(String historyLanguage) {
        this.historyLanguage = historyLanguage;
    }

    public String getHistoryTools() {
        return historyTools;
    }

    public void setHistoryTools(String historyTools) {
        this.historyTools = historyTools;
    }

    public OperationSystemEntity getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(OperationSystemEntity operationSystem) {
        this.operationSystem = operationSystem;
    }

    public DatabaseHistoryEntity getDatabaseHistory() {
        return databaseHistory;
    }

    public void setDatabaseHistory(DatabaseHistoryEntity databaseHistory) {
        this.databaseHistory = databaseHistory;
    }

}
