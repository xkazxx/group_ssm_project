package com.xkazxx.controller.devicecontroller;

import com.xkazxx.bean.DeviceFault;
import com.xkazxx.service.DeviceService;
import com.xkazxx.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deviceFault")
public class DeviceFaultController {

    @Autowired
    DeviceService deviceService;

    @RequestMapping("/list")
    public ResponseVo list(@RequestParam("page") int page, @RequestParam("rows") int rows){

        return deviceService.setResponseVo(page, rows, DeviceFault.class);
    }
}
