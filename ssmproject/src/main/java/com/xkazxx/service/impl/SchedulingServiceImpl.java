package com.xkazxx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public PageInfo<COrder> findOrder(int pageNum,int pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        List<COrder> orderList = cOrderMapper.findOrder(pageNum,pageSize);
        PageInfo<COrder> pageInfo = new PageInfo<>(orderList);
        return pageInfo;
    }

}
