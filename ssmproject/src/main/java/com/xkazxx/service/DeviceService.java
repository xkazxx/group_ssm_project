package com.xkazxx.service;

import com.xkazxx.bean.Device;
import com.xkazxx.bean.DeviceFault;
import com.xkazxx.bean.DeviceType;
import com.xkazxx.bean.Employee;
import com.xkazxx.vo.ResponseVo;
import java.util.List;

public interface DeviceService {

    <T>ResponseVo setResponseVo(int page, int rows, Class<?> T);

    <T>List<T> setList(Class<?> T);

    DeviceType getDeviceType(String id);

    Device getDevice(String id);

    Employee getEmployee(String id);

    DeviceFault getDeviceFault(String id);
}
