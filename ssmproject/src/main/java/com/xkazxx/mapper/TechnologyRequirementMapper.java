package com.xkazxx.mapper;

import com.xkazxx.bean.TechnologyRequirement;
import com.xkazxx.bean.TechnologyRequirementCustom;

import java.util.List;

public interface TechnologyRequirementMapper {
    int deleteByPrimaryKey(String technologyRequirementId);

    int insert(TechnologyRequirement record);

    int insertSelective(TechnologyRequirement record);

    TechnologyRequirement selectByPrimaryKey(String technologyRequirementId);

    int updateByPrimaryKeySelective(TechnologyRequirement record);

    int updateByPrimaryKey(TechnologyRequirement record);

    /**
     *查找工艺要求和工艺的表
     * 一对一查询
     */
    List<TechnologyRequirementCustom> selectTechnologyRequirementAndTechnologyName();

}