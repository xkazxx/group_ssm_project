package com.xkazxx.mapper;

import com.xkazxx.bean.DeviceMaintain;
import com.xkazxx.vo.DeviceMaintainVo;

import java.util.List;

public interface DeviceMaintainMapper {

    int deleteByPrimaryKey(String deviceMaintainId);

    int deleteDeviceMaintainByIds(String[] ids);

    int insert(DeviceMaintain record);

    int insertSelective(DeviceMaintain record);

    DeviceMaintain selectByPrimaryKey(String deviceMaintainId);

    int updateByPrimaryKeySelective(DeviceMaintain record);

    int updateByPrimaryKey(DeviceMaintain record);

    List<DeviceMaintainVo> selectAllDeviceMaintain();

}