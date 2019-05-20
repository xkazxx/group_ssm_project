package com.xkazxx.mapper;

import com.xkazxx.bean.Device;
import com.xkazxx.bean.DeviceType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceTypeMapper {

    int deleteByPrimaryKey(String deviceTypeId);

    int deleteDeviceTypeByIds(String[] ids);

    int insert(DeviceType record);

    int insertSelective(DeviceType record);

    DeviceType selectByPrimaryKey(String deviceTypeId);

    int updateByPrimaryKeySelective(DeviceType record);

    int updateByPrimaryKey(DeviceType record);

    List<DeviceType> selectAllDeviceType();

    List<DeviceType> searchDeviceTypeByDeviceTypeId(@Param("searchValue") String searchValue);

    List<DeviceType> searchDeviceTypeByDeviceTypeName(@Param("searchValue") String searchValue);
}