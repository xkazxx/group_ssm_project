package com.xkazxx.mapper;

import com.xkazxx.bean.FinalCountCheck;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinalCountCheckMapper {
    int deleteByPrimaryKey(String fCountCheckId);

    int insert(FinalCountCheck record);

    int insertSelective(FinalCountCheck record);

    FinalCountCheck selectByPrimaryKey(String fCountCheckId);

    int updateByPrimaryKeySelective(FinalCountCheck record);

    int updateByPrimaryKey(FinalCountCheck record);

    List<FinalCountCheck> findAllCountCheckByPage();

    int deleteFinalCountCheckBatch(@Param("ids") String[] ids);

    List<FinalCountCheck> searchFCountCheckByCountCheckId(@Param("fCountCheckId") String fCountCheckId);

    List<FinalCountCheck> searchFCountCheckByOrerId(@Param("orderId") String orderId);
}