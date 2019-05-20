package com.xkazxx.controller.devicecontroller;

import com.xkazxx.bean.DeviceFault;
import com.xkazxx.bean.DeviceMaintain;
import com.xkazxx.service.DeviceService;
import com.xkazxx.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DeviceMaintainController {

    @Autowired
    DeviceService deviceService;

    @ResponseBody
    @RequestMapping("/deviceMaintain/list")
    public ResponseVo list(@RequestParam("page") int page, @RequestParam("rows") int rows){

        return deviceService.setResponseVo(page, rows, DeviceMaintain.class);
    }

    @ResponseBody
    @RequestMapping("/deviceFault/get/{id}")
    public DeviceFault getDeviceFault(@PathVariable("id") String id){

        return deviceService.getDeviceFault(id);
    }

    @ResponseBody
    @RequestMapping("/deviceFault/get_data")
    public DeviceFault getDataDeviceFault(){

        return null;
    }

    @ResponseBody
    @RequestMapping("/deviceMaintain/add_judge")
    public Map addJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }

    @RequestMapping("/deviceMaintain/add")
    public String add(){

        return "deviceMaintain_add";
    }

    @RequestMapping("/deviceMaintain/insert")
    public void insert(DeviceMaintain deviceMaintain){

        deviceService.insertDeviceMaintain(deviceMaintain);
    }

    @ResponseBody
    @RequestMapping("/deviceMaintain/edit_judge")
    public Map editJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }

    @RequestMapping("/deviceMaintain/edit")
    public String edit(){

        return "deviceMaintain_edit";
    }

    @ResponseBody
    @RequestMapping("/deviceMaintain/delete_judge")
    public Map deleteJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }
}
