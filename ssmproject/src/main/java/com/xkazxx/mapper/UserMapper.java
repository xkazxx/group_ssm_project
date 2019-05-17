package com.xkazxx.mapper;

import com.xkazxx.bean.User;

public interface UserMapper {
    int deleteByPrimaryKey(String pMeasureCheckId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String pMeasureCheckId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}