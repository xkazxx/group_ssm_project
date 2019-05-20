package com.xkazxx.service;

import com.xkazxx.bean.*;
import com.xkazxx.vo.EmployeeAndDepartmentVo;
import com.xkazxx.vo.ResponseVo;
import java.util.List;

public interface DeviceService {

    <T>ResponseVo setResponseVo(int page, int rows, Class<?> T);

    <T>List<T> setList(Class<?> T);

    DeviceType getDeviceTypeById(String id);

    Device getDevice(String id);

    EmployeeAndDepartmentVo getEmployeeAndDepartmentVo(String id);

    DeviceFault getDeviceFault(String id);

    boolean insertDevice(Device device);

    boolean insertDeviceType(DeviceType deviceType);

    boolean insertDeviceCheck(DeviceCheck deviceCheck);

    boolean insertDeviceFault(DeviceFault deviceFault);

    boolean insertDeviceMaintain(DeviceMaintain deviceMaintain);

    boolean updateDevice(Device device);

    boolean updateDeviceType(DeviceType deviceType);

    boolean updateDeviceCheck(DeviceCheck deviceCheck);

    boolean updateDeviceFault(DeviceFault deviceFault);

    boolean updateDeviceMaintain(DeviceMaintain deviceMaintain);

    boolean deleteDevice(String[] ids);

    boolean deleteDeviceType(String[] ids);

    boolean deleteDeviceCheck(String[] ids);

    boolean deleteDeviceFault(String[] ids);

    boolean deleteDeviceMaintain(String[] ids);

    ResponseVo searchResponseVo(String searchValue, int page, int rows, String searchMethod);

    boolean updateDeviceNoteById(String deviceId, String note);

    boolean updateDeviceCheckResultById(String deviceCheckId, String deviceCheckResult);

    boolean updateDeviceFaultDetailById(String deviceFaultId, String deviceFaultDetail);

    boolean updateDeviceMaintainNoteById(String deviceMaintainId, String note);
}
