package com.xkazxx.service.technologyservice;

import com.xkazxx.bean.QueryVO;
import com.xkazxx.bean.Technology;

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


    /**像数据库中的Technology插入数据
     * @param technology
     * @return
     */
    int insertTechnology(Technology technology);

    /**修改数据库中的数据，单行修改
     * @param technology
     * @return
     */
    int updateTechnologyId(Technology technology);
}
