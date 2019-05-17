package com.xkazxx.mapper;

import com.xkazxx.bean.ProcessMeasureCheck;
import com.xkazxx.bean.ProcessMeasureCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessMeasureCheckMapper {
    long countByExample(ProcessMeasureCheckExample example);

    int deleteByExample(ProcessMeasureCheckExample example);

    int deleteByPrimaryKey(String pMeasureCheckId);

    int insert(ProcessMeasureCheck record);

    int insertSelective(ProcessMeasureCheck record);

    List<ProcessMeasureCheck> selectByExample(ProcessMeasureCheckExample example);

    ProcessMeasureCheck selectByPrimaryKey(String pMeasureCheckId);

    int updateByExampleSelective(@Param("record") ProcessMeasureCheck record, @Param("example") ProcessMeasureCheckExample example);

    int updateByExample(@Param("record") ProcessMeasureCheck record, @Param("example") ProcessMeasureCheckExample example);

    int updateByPrimaryKeySelective(ProcessMeasureCheck record);

    int updateByPrimaryKey(ProcessMeasureCheck record);
}