package com.xkazxx.mapper;

import com.xkazxx.bean.Technology;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author alan.zhang
 */
public interface TechnologyMapper {
    int deleteByPrimaryKey(String technologyId);

    /**加入Technology数据
     * @param record
     * @return
     */
    int insert(Technology record);

    int insertSelective(Technology record);

    Technology selectByPrimaryKey(String technologyId);

    int updateByPrimaryKeySelective(Technology record);

    /**修改technology
     * @param record
     * @return
     */
    int updateTechnologyByPrimaryKey(Technology record);

    /**
     * @return List<>
     */
    List<Technology> findTechnologyAll();

}