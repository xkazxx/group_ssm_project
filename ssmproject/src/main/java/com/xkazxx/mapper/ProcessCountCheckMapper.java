package com.xkazxx.mapper;

import com.xkazxx.bean.ProcessCountCheck;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProcessCountCheckMapper {
    int deleteByPrimaryKey(String pCountCheckId);

    int insert(ProcessCountCheck record);

    int insertSelective(ProcessCountCheck record);

    ProcessCountCheck selectByPrimaryKey(String pCountCheckId);

    int updateByPrimaryKeySelective(ProcessCountCheck record);

    int updateByPrimaryKey(ProcessCountCheck record);

    List<ProcessCountCheck> findAllPCountCheck();

    List<ProcessCountCheck> searchPCountCheckByPCountCheckId(@Param("pCountCheckId") String pCountCheckId);

    int deletePCountCheckBatch(@Param("ids") String[] ids);
}