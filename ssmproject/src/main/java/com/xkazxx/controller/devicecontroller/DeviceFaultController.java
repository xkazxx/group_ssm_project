package com.xkazxx.controller.devicecontroller;

import com.xkazxx.bean.DeviceFault;
import com.xkazxx.service.DeviceService;
import com.xkazxx.util.PublicMethodPart;
import com.xkazxx.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DeviceFaultController {

    @Autowired
    DeviceService deviceService;

    @ResponseBody
    @RequestMapping("/deviceFault/list")
    public ResponseVo list(@RequestParam("page") int page, @RequestParam("rows") int rows){

        return deviceService.setResponseVo(page, rows, DeviceFault.class);
    }

    @ResponseBody
    @RequestMapping("/deviceFault/update_note")
    public Map updateDeviceFaultDetailById(@RequestParam("deviceFaultId") String deviceFaultId,
                                           @RequestParam("deviceFaultDetail") String deviceFaultDetail) {

        return PublicMethodPart.optionSuccess(deviceService.updateDeviceFaultDetailById(deviceFaultId, deviceFaultDetail));
    }

    @ResponseBody
    @RequestMapping("/deviceFault/update_all")
    public Map updateDeviceFaultAll(DeviceFault deviceFault) {

        return PublicMethodPart.optionSuccess(deviceService.updateDeviceFault(deviceFault));
    }

    @ResponseBody
    @RequestMapping("/deviceFault/add_judge")
    public Map addJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }

    @RequestMapping("/deviceFault/add")
    public String add(){

        return "deviceFault_add";
    }

    @ResponseBody
    @RequestMapping("/deviceFault/insert")
    public Map insert(DeviceFault deviceFault){

        return PublicMethodPart.optionSuccess(deviceService.insertDeviceFault(deviceFault));
    }

    @ResponseBody
    @RequestMapping("/deviceFault/edit_judge")
    public Map editJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }

    @RequestMapping("/deviceFault/edit")
    public String edit(){

        return "deviceFault_edit";
    }

    @ResponseBody
    @RequestMapping("/deviceFault/update")
    public Map update(DeviceFault deviceFault){

        return PublicMethodPart.optionSuccess(deviceService.updateDeviceFault(deviceFault));
    }

    @ResponseBody
    @RequestMapping("/deviceFault/delete_judge")
    public Map deleteJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }

    @ResponseBody
    @RequestMapping("/deviceFault/delete_batch")
    public Map deleteBatch(String[] ids){

        return PublicMethodPart.optionSuccess(deviceService.deleteDeviceFault(ids));
    }

    @ResponseBody
    @RequestMapping("/deviceFault/search_deviceFault_by_deviceFaultId")
    public ResponseVo searchDeviceFaultByDeviceFaultId(@RequestParam("searchValue")String searchValue,
                                                       @RequestParam("page") int page,
                                                       @RequestParam("rows") int rows){

        return deviceService.searchResponseVo(searchValue, page, rows,
                Thread.currentThread() .getStackTrace()[1].getMethodName());
    }

    @ResponseBody
    @RequestMapping("/deviceFault/search_deviceFault_by_deviceName")
    public ResponseVo searchDeviceFaultByDeviceFaultName(@RequestParam("searchValue")String searchValue,
                                                         @RequestParam("page") int page,
                                                         @RequestParam("rows") int rows){

        return deviceService.searchResponseVo(searchValue, page, rows,
                Thread.currentThread() .getStackTrace()[1].getMethodName());
    }
}
