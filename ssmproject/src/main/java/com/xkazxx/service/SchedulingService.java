package com.xkazxx.service;

import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.COrder;


public interface SchedulingService {

    PageInfo<COrder> findOrder(int pageNum, int pageSize);

}
