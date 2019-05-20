package com.xkazxx.bean;

/**
 * @author alan.zhang
 */
public class ProcessCustom extends Process {

    private String technologyPlanId;

    @Override
    public String getTechnologyPlanId() {
        return technologyPlanId;
    }

    @Override
    public void setTechnologyPlanId(String technologyPlanId) {
        this.technologyPlanId = technologyPlanId;
    }
}
