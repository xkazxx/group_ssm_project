package com.xkazxx.mapper;

import com.xkazxx.bean.ProcessMeasureCheck;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProcessMeasureCheckMapper {
    int deleteByPrimaryKey(String pMeasureCheckId);

    int insert(ProcessMeasureCheck record);

    int insertSelective(ProcessMeasureCheck record);

    ProcessMeasureCheck selectByPrimaryKey(String pMeasureCheckId);

    int updateByPrimaryKeySelective(ProcessMeasureCheck record);

    int updateByPrimaryKey(ProcessMeasureCheck record);

    List<ProcessMeasureCheck> findAllPMeasureCheck();

    List<ProcessMeasureCheck> searchPMeasureCheckByPMeasureCheckId(@Param("pMeasureCheckId") String pMeasureCheckId);
}