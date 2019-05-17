package com.xkazxx.service.impl;

import com.xkazxx.bean.COrder;
import com.xkazxx.mapper.COrderMapper;
import com.xkazxx.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchedulingServiceImpl implements SchedulingService {


    @Autowired
    COrderMapper cOrderMapper;

    @Override
    public List<COrder> findOrder() {
        return cOrderMapper.findOrder();
    }
}
