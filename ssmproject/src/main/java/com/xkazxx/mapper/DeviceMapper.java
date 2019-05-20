package com.xkazxx.mapper;

import com.xkazxx.bean.Device;
import com.xkazxx.vo.DeviceVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface DeviceMapper {

    int deleteByPrimaryKey(String deviceId);

    int deleteDeviceByIds(String[] ids);

    int insert(Device record);

    int insertSelective(Device record);

    Device selectByPrimaryKey(String deviceId);

    int updateDeviceNoteById(@Param("id") String deviceId, @Param("note") String note);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);

    List<DeviceVo> selectAllDeviceVo();

    List<DeviceVo> searchDeviceByDeviceId(@Param("searchValue") String searchValue);

    List<DeviceVo> searchDeviceByDeviceName(@Param("searchValue") String searchValue);

    List<DeviceVo> searchDeviceByDeviceTypeName(@Param("searchValue") String searchValue);
}