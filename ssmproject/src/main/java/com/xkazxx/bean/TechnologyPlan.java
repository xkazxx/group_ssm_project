package com.xkazxx.bean;

import java.util.Date;

/**
 * @author alan.zhang
 */
public class TechnologyPlan {
    private String technologyPlanId;

    private String technologyId;

    private Integer batchAmount;

    private Date startPlan;

    private Date endPlan;

    private Date commitPlan;

    private Date technologyPlanStart;

    private Date technologyPlanEnd;

    private Technology technology;

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public String getTechnologyPlanId() {
        return technologyPlanId;
    }

    public void setTechnologyPlanId(String technologyPlanId) {
        this.technologyPlanId = technologyPlanId == null ? null : technologyPlanId.trim();
    }

    public String getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(String technologyId) {
        this.technologyId = technologyId == null ? null : technologyId.trim();
    }

    public Integer getBatchAmount() {
        return batchAmount;
    }

    public void setBatchAmount(Integer batchAmount) {
        this.batchAmount = batchAmount;
    }

    public Date getStartPlan() {
        return startPlan;
    }

    public void setStartPlan(Date startPlan) {
        this.startPlan = startPlan;
    }

    public Date getEndPlan() {
        return endPlan;
    }

    public void setEndPlan(Date endPlan) {
        this.endPlan = endPlan;
    }

    public Date getCommitPlan() {
        return commitPlan;
    }

    public void setCommitPlan(Date commitPlan) {
        this.commitPlan = commitPlan;
    }

    public Date getTechnologyPlanStart() {
        return technologyPlanStart;
    }

    public void setTechnologyPlanStart(Date technologyPlanStart) {
        this.technologyPlanStart = technologyPlanStart;
    }

    public Date getTechnologyPlanEnd() {
        return technologyPlanEnd;
    }

    public void setTechnologyPlanEnd(Date technologyPlanEnd) {
        this.technologyPlanEnd = technologyPlanEnd;
    }
}