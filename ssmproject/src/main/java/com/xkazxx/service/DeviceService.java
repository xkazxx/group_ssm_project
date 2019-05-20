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

    void insertDevice(Device device);

    void insertDeviceType(DeviceType deviceType);

    void insertDeviceCheck(DeviceCheck deviceCheck);

    void insertDeviceFault(DeviceFault deviceFault);

    void insertDeviceMaintain(DeviceMaintain deviceMaintain);
}
