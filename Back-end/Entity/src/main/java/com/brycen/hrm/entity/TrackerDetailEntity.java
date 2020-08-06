package com.brycen.hrm.entity;

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
 * [Description]:TrackerDetail Entity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
@Entity
@Table(name = "tracker_detail")
public class TrackerDetailEntity extends BaseEntity {

    /**
     * Tracker Detail Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tracker_detail_id")
    private Long trackerDetailID;
    
    /**
     * Field Name
     */
    @Column(name = "field_name")
    private String fieldName;
    
    /**
     * Control Type
     */
    @Column(name = "control_type")
    private String controlType;
    
    /**
     * Tracker Id
     */
    @ManyToOne
    @JoinColumn(name = "tracker_id")
    private TrackerEntity tracker;
    
    public TrackerDetailEntity()
    {
        
    }
    
    public TrackerDetailEntity(String fieldName, String controlType)
    {
        this.fieldName = fieldName;
        this.controlType = controlType;
    }

    public Long getTrackerDetailID() {
        return trackerDetailID;
    }

    public void setTrackerDetailID(Long trackerDetailID) {
        this.trackerDetailID = trackerDetailID;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getControlType() {
        return controlType;
    }

    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    public TrackerEntity getTracker() {
        return tracker;
    }

    public void setTracker(TrackerEntity tracker) {
        this.tracker = tracker;
    }
}
