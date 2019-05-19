package com.xkazxx.controller.devicecontroller;

import com.xkazxx.bean.DeviceFault;
import com.xkazxx.bean.DeviceMaintain;
import com.xkazxx.service.DeviceService;
import com.xkazxx.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceMaintainController {

    @Autowired
    DeviceService deviceService;

    @RequestMapping("/deviceMaintain/list")
    public ResponseVo list(@RequestParam("page") int page, @RequestParam("rows") int rows){

        return deviceService.setResponseVo(page, rows, DeviceMaintain.class);
    }

    @RequestMapping("/deviceFault/get/{id}")
    public DeviceFault getDeviceFault(@PathVariable("id") String id){

        return deviceService.getDeviceFault(id);
    }
}
