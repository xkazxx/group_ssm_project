package com.xkazxx.service.technologyservice;

import com.xkazxx.bean.QueryVO;

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
}
