package com.xkazxx.controller.devicecontroller;

import com.xkazxx.bean.Department;
import com.xkazxx.bean.Device;
import com.xkazxx.bean.DeviceType;
import com.xkazxx.bean.Employee;
import com.xkazxx.service.DeviceService;
import com.xkazxx.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeviceListController {

    @Autowired
    DeviceService deviceService;

    @RequestMapping("/deviceList/list")
    public ResponseVo list(@RequestParam("page") int page, @RequestParam("rows") int rows){

        return deviceService.setResponseVo(page, rows, Device.class);
    }

    @RequestMapping("/department/get_data")
    public List getData(){

        return deviceService.setList(Department.class);
    }

    @RequestMapping("/deviceType/get/{id}")
    public DeviceType getDeviceType(@PathVariable("id") String id){

        return deviceService.getDeviceType(id);
    }

    @RequestMapping("/employee/get/{id}")
    public Employee getEmployee(@PathVariable("id") String id){

        return deviceService.getEmployee(id);
    }
}
