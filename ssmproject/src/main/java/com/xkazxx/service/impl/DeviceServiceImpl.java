package com.xkazxx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.*;
import com.xkazxx.mapper.*;
import com.xkazxx.service.DeviceService;
import com.xkazxx.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public <T>ResponseVo<T> setMap(int page, int rows, Class<?> T){

        PageHelper.startPage(page, rows);

        ResponseVo<T> responseVo = new ResponseVo<>();

        if("Device".equals(T.getSimpleName())) {
            PageInfo<Device> devicePageInfo = new PageInfo<>(deviceMapper.selectAllDevice());

            responseVo.setTotal(devicePageInfo.getTotal());
            responseVo.setRows((List) devicePageInfo.getList());

        }else if("DeviceType".equals(T.getSimpleName())) {
            PageInfo<DeviceType> deviceTypePageInfo = new PageInfo<>(deviceTypeMapper.selectAllDeviceType());

            responseVo.setTotal(deviceTypePageInfo.getTotal());
            responseVo.setRows((List) deviceTypePageInfo.getList());
        }else if("DeviceCheck".equals((T.getSimpleName()))) {
            PageInfo<DeviceCheck> deviceCheckPageInfo = new PageInfo<>(deviceCheckMapper.selectAllDeviceCheck());

            responseVo.setTotal(deviceCheckPageInfo.getTotal());
            responseVo.setRows((List) deviceCheckPageInfo.getList());
        }else if("DeviceFault".equals(T.getSimpleName())){
            PageInfo<DeviceFault> deviceFaultPageInfo = new PageInfo<>(deviceFaultMapper.selectAllDeviceFault());

            responseVo.setTotal(deviceFaultPageInfo.getTotal());
            responseVo.setRows((List) deviceFaultPageInfo.getList());
        }else if("DeviceMaintain".equals(T.getSimpleName())){
            PageInfo<DeviceMaintain> deviceMaintainPageInfo = new PageInfo<>(deviceMaintainMapper.selectAllDeviceMaintain());

            responseVo.setTotal(deviceMaintainPageInfo.getTotal());
            responseVo.setRows((List) deviceMaintainPageInfo.getList());
        }

        return responseVo;
    }
}
