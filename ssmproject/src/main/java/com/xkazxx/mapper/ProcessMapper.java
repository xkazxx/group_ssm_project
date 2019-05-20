package com.xkazxx.mapper;

import com.xkazxx.bean.Process;
import com.xkazxx.bean.ProcessCustom;

import java.util.List;

public interface ProcessMapper {
    int deleteByPrimaryKey(String processId);

    int insert(Process record);

    int insertSelective(Process record);

    Process selectByPrimaryKey(String processId);

    int updateByPrimaryKeySelective(Process record);

    int updateByPrimaryKey(Process record);

    /**
     * 查找所有工序管理表
     * @return
     */
    List<ProcessCustom> selectProcessAndTechnologyPlan();

    List<Process> getAllProcess();
}