package com.xkazxx.mapper;

import com.xkazxx.bean.DeviceCheck;
import com.xkazxx.vo.DeviceCheckVo;
import org.apache.ibatis.annotations.Param;

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

    List<DeviceCheckVo> searchDeviceCheckVoByDeviceCheckId(@Param("searchValue") String searchValue);

    List<DeviceCheckVo> searchDeviceCheckVoByDeviceCheckName(@Param("searchValue") String searchValue);

    int updateDeviceCheckResultById(@Param("deviceCheckId") String deviceCheckId, @Param("deviceCheckResult") String deviceCheckResult);
}