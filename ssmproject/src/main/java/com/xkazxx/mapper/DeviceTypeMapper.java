package com.xkazxx.mapper;

import com.xkazxx.bean.Device;
import com.xkazxx.bean.DeviceType;
import java.util.List;

public interface DeviceTypeMapper {
    int deleteByPrimaryKey(String deviceTypeId);

    int insert(DeviceType record);

    int insertSelective(DeviceType record);

    DeviceType selectByPrimaryKey(String deviceTypeId);

    int updateByPrimaryKeySelective(DeviceType record);

    int updateByPrimaryKey(DeviceType record);

    List<DeviceType> selectAllDeviceType();
}