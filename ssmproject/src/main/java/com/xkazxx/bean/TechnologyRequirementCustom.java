package com.xkazxx.bean;

import java.io.Serializable;

/**
 * @author alan.zhang
 */
public class TechnologyRequirementCustom extends TechnologyRequirement implements Serializable {

    private String technologyName;

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }
}
