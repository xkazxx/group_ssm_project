package com.xkazxx.controller.devicecontroller;

import com.xkazxx.service.DeviceService;
import com.xkazxx.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deviceType")
public class DeviceTypeController {

    @Autowired
    DeviceService deviceService;

    @RequestMapping("/list")
    public ResponseVo list(@RequestParam("page") int page, @RequestParam("rows") int rows){

        return deviceService.setMap(page, rows, DeviceTypeController.class);
    }
}
