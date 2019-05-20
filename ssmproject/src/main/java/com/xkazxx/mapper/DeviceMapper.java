package com.xkazxx.mapper;

import com.xkazxx.bean.Device;
import com.xkazxx.vo.DeviceVo;

import java.util.List;

public interface DeviceMapper {
    int deleteByPrimaryKey(String deviceId);

    int deleteDeviceByIds(String[] ids);

    int insert(Device record);

    int insertSelective(Device record);

    Device selectByPrimaryKey(String deviceId);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);

    List<DeviceVo> selectAllDeviceVo();
}