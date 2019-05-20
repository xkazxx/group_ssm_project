package com.xkazxx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.Process;
import com.xkazxx.bean.ProcessCustom;
import com.xkazxx.bean.QueryVO;
import com.xkazxx.mapper.ProcessMapper;
import com.xkazxx.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author alan.zhang
 */
@Service
public class ProcessServiceImpl implements ProcessService {

    @Autowired
    private ProcessMapper processMapper;

    @Override
    public QueryVO findProcessAndTechnologyPlan(Integer page,Integer rows) {
        PageHelper.startPage(page,rows);

        List<ProcessCustom> list = processMapper.selectProcessAndTechnologyPlan();
        QueryVO queryVO = new QueryVO();
        queryVO.setRows(list);
        PageInfo<ProcessCustom> pageInfo = new PageInfo<>(list);
        int total = (int) pageInfo.getTotal();
        queryVO.setTotal(total);
        return queryVO;
    }

    @Override
    public List<Process> getAllProcess() {
        return processMapper.getAllProcess();
    }
}
