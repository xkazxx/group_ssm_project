package com.xkazxx.mapper;

import com.xkazxx.bean.Manufacture;

import java.util.List;

public interface ManufactureMapper {
    int deleteByPrimaryKey(String manufactureSn);

    int insert(Manufacture record);

    int insertSelective(Manufacture record);

    Manufacture selectByPrimaryKey(String manufactureSn);

    int updateByPrimaryKeySelective(Manufacture record);

    int updateByPrimaryKey(Manufacture record);

    List<Manufacture> findManufacture(int pageNum, int pageSize);
}