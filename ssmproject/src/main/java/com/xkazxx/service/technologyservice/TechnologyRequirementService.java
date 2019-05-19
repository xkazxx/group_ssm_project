package com.xkazxx.service.technologyservice;

import com.xkazxx.bean.QueryVO;

/**
 * @author alan.zhang
 */
public interface TechnologyRequirementService {

    /**
     * @param page
     * @param rows
     * @return 一对一查询
     */
    QueryVO findTechnologyRequirementAndTechnologyName(Integer page, Integer rows);
}
