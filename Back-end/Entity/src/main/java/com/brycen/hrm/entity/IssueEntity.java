package com.brycen.hrm.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
 * [Description]:Issue Entity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "issue")
public class IssueEntity extends BaseEntity {
    /**
     * Issue Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "issue_id")
    private Long issueID;
    
    /**
     * Issue Subject
     */
    @Column(name = "issue_subject")
    private String issueSubject;
    
    /**
     * Issue Description
     */
    @Column(name = "issue_description")
    private String issueDescription;
    
    /**
     * Start Date Plan
     */
    @Column(name = "start_date_plan")
    private Date startDatePlan;
    
    /**
     * End Date Plan
     */
    @Column(name = "end_date_plan")
    private Date endDatePlan;
    
    /**
     * Estimate Time
     */
    @Column(name = "estiamted_time")
    private int estimatedTime;
    
    /**
     * Percent Complete
     */
    @Column(name = "percent_done")
    private float percentDone;
    
    /**
     * Number Target Plan
     */
    @Column(name = "number_target_plan")
    private int numberTargetPlan;
    
    /**
     * Quality Target Plan
     */
    @Column(name = "quality_target_plan")
    private float qualityTargetPlan;
    
    /**
     * Start Date Reality
     */
    @Column(name = "start_date_reality")
    private Date startDateReality;
    
    /**
     * End Date Reality
     */
    @Column(name = "end_date_reality")
    private Date endDateReality;
    
    /**
     * Number Target Reality
     */
    @Column(name = "number_target_reality")
    private int numberTargetReality;
    
    /**
     * Quality Target Reality
     */
    @Column(name = "quality_target_reality")
    private float qualityTargetReality;
    
    /**
     * Status Issue Id
     */
    @ManyToOne
    @JoinColumn(name = "status_issue_id")
    private StatusIssueEntity statusIssue;
    
    /**
     * Priority Issue Id
     */
    @ManyToOne
    @JoinColumn(name = "priority_issue_id")
    private PriorityIssueEntity priorityIssue;
    
    /**
     * Project Id
     */
    @ManyToOne
    @JoinColumn(name = "project_id")
    private ProjectEntity project;
    
    /**
     * Tracker Id
     */
    @ManyToOne
    @JoinColumn(name = "tracker_id")
    private TrackerEntity tracker;
    
    /**
     * List File Issue
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "issue")
    private Set<FileIssueEntity> listFileIssue = new HashSet<>();  
    
    public IssueEntity ()
    {
        
    }

    public Long getIssueID() {
        return issueID;
    }

    public void setIssueID(Long issueID) {
        this.issueID = issueID;
    }

    public String getIssueSubject() {
        return issueSubject;
    }

    public void setIssueSubject(String issueSubject) {
        this.issueSubject = issueSubject;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public Date getStartDatePlan() {
        return startDatePlan;
    }

    public void setStartDatePlan(Date startDatePlan) {
        this.startDatePlan = startDatePlan;
    }

    public Date getEndDatePlan() {
        return endDatePlan;
    }

    public void setEndDatePlan(Date endDatePlan) {
        this.endDatePlan = endDatePlan;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public float getPercentDone() {
        return percentDone;
    }

    public void setPercentDone(float percentDone) {
        this.percentDone = percentDone;
    }

    public int getNumberTargetPlan() {
        return numberTargetPlan;
    }

    public void setNumberTargetPlan(int numberTargetPlan) {
        this.numberTargetPlan = numberTargetPlan;
    }

    public float getQualityTargetPlan() {
        return qualityTargetPlan;
    }

    public void setQualityTargetPlan(float qualityTargetPlan) {
        this.qualityTargetPlan = qualityTargetPlan;
    }

    public Date getStartDateReality() {
        return startDateReality;
    }

    public void setStartDateReality(Date startDateReality) {
        this.startDateReality = startDateReality;
    }

    public Date getEndDateReality() {
        return endDateReality;
    }

    public void setEndDateReality(Date endDateReality) {
        this.endDateReality = endDateReality;
    }

    public int getNumberTargetReality() {
        return numberTargetReality;
    }

    public void setNumberTargetReality(int numberTargetReality) {
        this.numberTargetReality = numberTargetReality;
    }

    public float getQualityTargetReality() {
        return qualityTargetReality;
    }

    public void setQualityTargetReality(float qualityTargetReality) {
        this.qualityTargetReality = qualityTargetReality;
    }

    public StatusIssueEntity getStatusIssue() {
        return statusIssue;
    }

    public void setStatusIssue(StatusIssueEntity statusIssue) {
        this.statusIssue = statusIssue;
    }

    public PriorityIssueEntity getPriorityIssue() {
        return priorityIssue;
    }

    public void setPriorityIssue(PriorityIssueEntity priorityIssue) {
        this.priorityIssue = priorityIssue;
    }

    public ProjectEntity getProject() {
        return project;
    }

    public void setProject(ProjectEntity project) {
        this.project = project;
    }

    public TrackerEntity getTracker() {
        return tracker;
    }

    public void setTracker(TrackerEntity tracker) {
        this.tracker = tracker;
    }

    public Set<FileIssueEntity> getListFileIssue() {
        return listFileIssue;
    }

    public void setListFileIssue(Set<FileIssueEntity> listFileIssue) {
        this.listFileIssue = listFileIssue;
    }
    
    
}
