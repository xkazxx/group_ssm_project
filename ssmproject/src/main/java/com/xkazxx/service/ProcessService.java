package com.xkazxx.service;

import com.xkazxx.bean.Process;
import com.xkazxx.bean.QueryVO;

import java.util.List;

/**
 * @author alan.zhang
 */
public interface ProcessService {


    /**查询所有工序管理（分页）
     * @param page
     * @param rows
     * @return
     */
    QueryVO findProcessAndTechnologyPlan(Integer page,Integer rows);

    List<Process> getAllProcess();
}
