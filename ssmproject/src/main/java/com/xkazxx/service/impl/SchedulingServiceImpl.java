package com.xkazxx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.COrder;
import com.xkazxx.mapper.COrderMapper;
import com.xkazxx.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SchedulingServiceImpl implements SchedulingService {


    @Autowired
    COrderMapper cOrderMapper;

    @Override
    public PageInfo<COrder> findOrder(int pageNum,int pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        Map map = new HashMap();

//        int total = cOrderMapper.getTotalNum();
        List<COrder> cOrders = cOrderMapper.findOrder(pageNum,pageSize);


        PageInfo<COrder> pageInfo = new PageInfo<>();
        return pageInfo;
    }

}
