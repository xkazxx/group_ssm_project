package com.xkazxx.mapper;

import com.xkazxx.bean.Device;

import java.util.List;

public interface DeviceMapper {
    int deleteByPrimaryKey(String deviceId);

    int insert(Device record);

    int insertSelective(Device record);

    Device selectByPrimaryKey(String deviceId);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);

    int getDeviceTotal();

    List<Device> selectAllDevice();
}