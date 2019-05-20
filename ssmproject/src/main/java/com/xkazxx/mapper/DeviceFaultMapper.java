package com.xkazxx.mapper;

import com.xkazxx.bean.DeviceFault;
import com.xkazxx.vo.DeviceFaultVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceFaultMapper {

    int deleteByPrimaryKey(String deviceFaultId);

    int deleteDeviceFaultByIds(String[] ids);

    int insert(DeviceFault record);

    int insertSelective(DeviceFault record);

    DeviceFault selectByPrimaryKey(String deviceFaultId);

    int updateByPrimaryKeySelective(DeviceFault record);

    int updateByPrimaryKey(DeviceFault record);

    List<DeviceFaultVo> selectAllDeviceFault();

    List<DeviceFaultVo> searchDeviceFaultVoByDeviceFaultId(@Param("searchValue") String searchValue);

    List<DeviceFaultVo> searchDeviceFaultVoByDeviceFaultName(@Param("searchValue") String searchValue);

    int updateDeviceFaultDetailById(@Param("deviceFaultId") String deviceFaultId, @Param("deviceFaultDetail") String deviceFaultDetail);
}