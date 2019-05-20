package com.xkazxx.mapper;

import com.xkazxx.bean.DeviceCheck;
import com.xkazxx.vo.DeviceCheckVo;

import java.util.List;

public interface DeviceCheckMapper {

    int deleteByPrimaryKey(String deviceCheckId);

    int deleteDeviceCheckByIds(String[] ids);

    int insert(DeviceCheck record);

    int insertSelective(DeviceCheck record);

    DeviceCheck selectByPrimaryKey(String deviceCheckId);

    int updateByPrimaryKeySelective(DeviceCheck record);

    int updateByPrimaryKey(DeviceCheck record);

    List<DeviceCheckVo> selectAllDeviceCheck();
}