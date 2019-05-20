package com.xkazxx.service.technologyservice;

import com.xkazxx.bean.QueryVO;
import com.xkazxx.bean.TechnologyPlan;

import java.util.List;

/**
 * @author alan.zhang
 */
public interface TechnologyPlanService {

    /**
     * @param page
     * @param rows
     * @return
     */
    QueryVO findTechnologyPlanAndTechnologyName(Integer page,Integer rows);

    List<TechnologyPlan> getAllTechnologyPlan();
}
