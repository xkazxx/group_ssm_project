package com.xkazxx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.*;
import com.xkazxx.mapper.*;
import com.xkazxx.service.DeviceService;
import com.xkazxx.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    DeviceMapper deviceMapper;

    @Autowired
    DeviceTypeMapper deviceTypeMapper;

    @Autowired
    DeviceCheckMapper deviceCheckMapper;

    @Autowired
    DeviceFaultMapper deviceFaultMapper;

    @Autowired
    DeviceMaintainMapper deviceMaintainMapper;

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public <T>ResponseVo<T>     setResponseVo(int page, int rows, Class<?> T){

        PageHelper.startPage(page, rows);

        ResponseVo<T> responseVo = new ResponseVo<>();

        if("Device".equals(T.getSimpleName())) {
            PageInfo<DeviceVo> deviceVoPageInfo = new PageInfo<>(deviceMapper.selectAllDevice());

            responseVo.setTotal(deviceVoPageInfo.getTotal());
            responseVo.setRows((List) deviceVoPageInfo.getList());

        }else if("DeviceType".equals(T.getSimpleName())) {
            PageInfo<DeviceType> deviceTypePageInfo = new PageInfo<>(deviceTypeMapper.selectAllDeviceType());

            responseVo.setTotal(deviceTypePageInfo.getTotal());
            responseVo.setRows((List) deviceTypePageInfo.getList());
        }else if("DeviceCheck".equals((T.getSimpleName()))) {
            PageInfo<DeviceCheckVo> deviceCheckPageInfo = new PageInfo<>(deviceCheckMapper.selectAllDeviceCheck());

            responseVo.setTotal(deviceCheckPageInfo.getTotal());
            responseVo.setRows((List) deviceCheckPageInfo.getList());
        }else if("DeviceFault".equals(T.getSimpleName())){
            PageInfo<DeviceFaultVo> deviceFaultPageInfo = new PageInfo<>(deviceFaultMapper.selectAllDeviceFault());

            responseVo.setTotal(deviceFaultPageInfo.getTotal());
            responseVo.setRows((List) deviceFaultPageInfo.getList());
        }else if("DeviceMaintain".equals(T.getSimpleName())){
            PageInfo<DeviceMaintainVo> deviceMaintainPageInfo = new PageInfo<>(deviceMaintainMapper.selectAllDeviceMaintain());

            responseVo.setTotal(deviceMaintainPageInfo.getTotal());
            responseVo.setRows((List) deviceMaintainPageInfo.getList());
        }

        return responseVo;
    }

    @Override
    public <T> List<T> setList(Class<?> T) {

        List<T> list = new ArrayList<>();

        if("Department".equals(T.getSimpleName())){
            list = (List<T>) departmentMapper.selectAllDepartment();
        }

        return list;
    }

    @Override
    public DeviceType getDeviceType(String id) {

        return deviceTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public Device getDevice(String id) {

        return deviceMapper.selectByPrimaryKey(id);
    }

    @Override
    public Employee getEmployee(String id) {

        return employeeMapper.selectEmployeeAndDepartmentByPrimarkId(id);
    }

    @Override
    public DeviceFault getDeviceFault(String id) {

        return deviceFaultMapper.selectByPrimaryKey(id);
    }
}
