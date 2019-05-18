package com.xkazxx.service.technologyservice;

import com.xkazxx.bean.QueryVO;
import com.xkazxx.bean.Technology;

import java.util.List;

/**
 * @author alan.zhang
 */
public interface TechnologyService {


    /**
     * @param page
     * @param rows
     * @return 查询所有technology列表
     */
    QueryVO findTechnologyAll(Integer page, Integer rows);
}
