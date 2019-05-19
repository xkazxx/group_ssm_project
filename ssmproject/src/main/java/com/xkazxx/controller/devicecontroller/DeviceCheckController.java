package com.xkazxx.controller.devicecontroller;

import com.xkazxx.bean.Device;
import com.xkazxx.bean.DeviceCheck;
import com.xkazxx.service.DeviceService;
import com.xkazxx.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceCheckController {

    @Autowired
    DeviceService deviceService;

    @RequestMapping("/deviceCheck/list")
    public ResponseVo list(@RequestParam("page") int page, @RequestParam("rows") int rows){

        return deviceService.setResponseVo(page, rows, DeviceCheck.class);
    }

    @RequestMapping("/deviceList/get/{id}")
    public Device get(@PathVariable("id") String id){

        return deviceService.getDevice(id);
    }
}
