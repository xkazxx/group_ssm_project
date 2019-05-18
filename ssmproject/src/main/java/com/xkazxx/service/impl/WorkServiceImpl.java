package com.xkazxx.service.impl;

import com.xkazxx.bean.Work;
import com.xkazxx.mapper.WorkMapper;
import com.xkazxx.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author alan.zhang
 */
@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    WorkMapper workMapper;

    @Override
    public Work queryWorkerById(String id) {
        return workMapper.selectByPrimaryKey(id);
    }
}
