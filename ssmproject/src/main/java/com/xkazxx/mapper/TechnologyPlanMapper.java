package com.xkazxx.mapper;

import com.xkazxx.bean.TechnologyPlan;
import com.xkazxx.bean.TechnologyPlanCustom;

import java.util.List;

public interface TechnologyPlanMapper {
    int deleteByPrimaryKey(String technologyPlanId);

    int insert(TechnologyPlan record);

    int insertSelective(TechnologyPlan record);

    TechnologyPlan selectByPrimaryKey(String technologyPlanId);

    int updateByPrimaryKeySelective(TechnologyPlan record);

    int updateByPrimaryKey(TechnologyPlan record);

    /**
     * 计划表和工艺表
     * 一对一
     * @return
     */
    List<TechnologyPlanCustom> selectTechnologyPlanAndTechnologyName();

    List<TechnologyPlan> getAllTechnologyPlan();

}