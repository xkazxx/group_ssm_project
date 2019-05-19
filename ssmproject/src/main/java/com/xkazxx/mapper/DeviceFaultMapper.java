package com.xkazxx.mapper;

import com.xkazxx.bean.DeviceFault;
import com.xkazxx.vo.DeviceFaultVo;

import java.util.List;

public interface DeviceFaultMapper {
    int deleteByPrimaryKey(String deviceFaultId);

    int insert(DeviceFault record);

    int insertSelective(DeviceFault record);

    DeviceFault selectByPrimaryKey(String deviceFaultId);

    int updateByPrimaryKeySelective(DeviceFault record);

    int updateByPrimaryKey(DeviceFault record);

    List<DeviceFaultVo> selectAllDeviceFault();
}