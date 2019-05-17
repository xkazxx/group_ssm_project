package com.xkazxx.mapper;

import com.xkazxx.bean.COrder;

import java.util.List;

public interface COrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(COrder record);

    int insertSelective(COrder record);

    COrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(COrder record);

    int updateByPrimaryKey(COrder record);

    List<COrder> findOrder();
}