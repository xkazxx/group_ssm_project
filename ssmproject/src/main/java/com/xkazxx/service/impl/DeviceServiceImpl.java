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
    public <T> ResponseVo setResponseVo(int page, int rows, Class<?> c){

        PageHelper.startPage(page, rows);

        ResponseVo<T> responseVo = new ResponseVo<>();

        if("Device".equals(c.getSimpleName())) {
            PageInfo<DeviceVo> deviceVoPageInfo = new PageInfo<>(deviceMapper.selectAllDevice());

            responseVo.setTotal(deviceVoPageInfo.getTotal());
            responseVo.setRows((List) deviceVoPageInfo.getList());

        }else if("DeviceType".equals(c.getSimpleName())) {
            PageInfo<DeviceType> deviceTypePageInfo = new PageInfo<>(deviceTypeMapper.selectAllDeviceType());

            responseVo.setTotal(deviceTypePageInfo.getTotal());
            responseVo.setRows((List) deviceTypePageInfo.getList());
        }else if("DeviceCheck".equals((c.getSimpleName()))) {
            PageInfo<DeviceCheckVo> deviceCheckPageInfo = new PageInfo<>(deviceCheckMapper.selectAllDeviceCheck());

            responseVo.setTotal(deviceCheckPageInfo.getTotal());
            responseVo.setRows((List) deviceCheckPageInfo.getList());
        }else if("DeviceFault".equals(c.getSimpleName())){
            PageInfo<DeviceFaultVo> deviceFaultPageInfo = new PageInfo<>(deviceFaultMapper.selectAllDeviceFault());

            responseVo.setTotal(deviceFaultPageInfo.getTotal());
            responseVo.setRows((List) deviceFaultPageInfo.getList());
        }else if("DeviceMaintain".equals(c.getSimpleName())){
            PageInfo<DeviceMaintainVo> deviceMaintainPageInfo = new PageInfo<>(deviceMaintainMapper.selectAllDeviceMaintain());

            responseVo.setTotal(deviceMaintainPageInfo.getTotal());
            responseVo.setRows((List) deviceMaintainPageInfo.getList());
        }else if("EmployeeAndDepartmentVo".equals(c.getSimpleName())){
            /*人员监控模块的人员管理*/
            PageInfo<EmployeeAndDepartmentVo> employeeAndDepartmentVoPageInfo = new PageInfo<>(employeeMapper.selectEmployeeAndDepartment());

            responseVo.setTotal(employeeAndDepartmentVoPageInfo.getTotal());
            responseVo.setRows((List) employeeAndDepartmentVoPageInfo.getList());
        }

        return responseVo;
    }

    @Override
    public <T> List<T> setList(Class<?> c) {

        List<T> list = new ArrayList<>();

        if("Department".equals(c.getSimpleName())){
            list = (List<T>) departmentMapper.selectAllDepartment();
        }else if("DeviceType".equals(c.getSimpleName())){
            list = (List<T>) deviceTypeMapper.selectAllDeviceType();
        }else if("EmployeeAndDepartmentVo".equals(c.getSimpleName())){
            list = (List<T>) employeeMapper.selectEmployeeAndDepartment();
        }

        return list;
    }

    @Override
    public DeviceType getDeviceTypeById(String id) {

        return deviceTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public Device getDevice(String id) {

        return deviceMapper.selectByPrimaryKey(id);
    }

    @Override
    public EmployeeAndDepartmentVo getEmployeeAndDepartmentVo(String id) {

        return employeeMapper.selectEmployeeAndDepartmentById(id);
    }

    @Override
    public DeviceFault getDeviceFault(String id) {

        return deviceFaultMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertDevice(Device device) {

        deviceMapper.insert(device);
    }

    @Override
    public void insertDeviceType(DeviceType deviceType) {

        deviceTypeMapper.insert(deviceType);
    }

    @Override
    public void insertDeviceCheck(DeviceCheck deviceCheck) {

        deviceCheckMapper.insert(deviceCheck);
    }

    @Override
    public void insertDeviceFault(DeviceFault deviceFault) {

        deviceFaultMapper.insert(deviceFault);
    }

    @Override
    public void insertDeviceMaintain(DeviceMaintain deviceMaintain) {

        deviceMaintainMapper.insert(deviceMaintain);
    }
}
