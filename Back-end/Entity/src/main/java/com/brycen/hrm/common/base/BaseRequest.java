package com.brycen.hrm.common.base;

public class BaseRequest {
    private int pageNum;
    private int pageSize;
    private int companyID;

    public BaseRequest() {
        super();
    }

    public BaseRequest(int pageNum, int pageSize, int companyID) {
        super();
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.companyID = companyID;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }
}
