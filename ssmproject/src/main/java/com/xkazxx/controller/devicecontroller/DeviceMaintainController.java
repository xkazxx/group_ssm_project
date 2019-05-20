package com.xkazxx.controller.devicecontroller;

import com.xkazxx.bean.DeviceFault;
import com.xkazxx.bean.DeviceMaintain;
import com.xkazxx.bean.DeviceType;
import com.xkazxx.service.DeviceService;
import com.xkazxx.util.PublicMethodPart;
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

    @ResponseBody
    @RequestMapping("/deviceMaintain/insert")
    public Map insert(DeviceMaintain deviceMaintain){

        return PublicMethodPart.optionSuccess(deviceService.insertDeviceMaintain(deviceMaintain));
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
    @RequestMapping("/deviceMaintain/update")
    public Map update(DeviceMaintain deviceMaintain){

        return PublicMethodPart.optionSuccess(deviceService.updateDeviceMaintain(deviceMaintain));
    }

    @ResponseBody
    @RequestMapping("/deviceMaintain/update_note")
    public Map updateDeviceMaintainNoteById(@RequestParam("deviceMaintainId") String deviceMaintainId,
                                           @RequestParam("note") String note) {

        return PublicMethodPart.optionSuccess(deviceService.updateDeviceMaintainNoteById(deviceMaintainId, note));
    }

    @ResponseBody
    @RequestMapping("/deviceMaintain/delete_judge")
    public Map deleteJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }

    @ResponseBody
    @RequestMapping("/deviceMaintain/delete_batch")
    public Map deleteBatch(String[] ids){

        return PublicMethodPart.optionSuccess(deviceService.deleteDeviceMaintain(ids));
    }

    @ResponseBody
    @RequestMapping("/deviceMaintain/search_deviceMaintain_by_deviceMaintainId")
    public ResponseVo searchDeviceMaintainByDeviceMaintainId(@RequestParam("searchValue")String searchValue,
                                                     @RequestParam("page") int page,
                                                     @RequestParam("rows") int rows){

        return deviceService.searchResponseVo(searchValue, page, rows,
                Thread.currentThread() .getStackTrace()[1].getMethodName());
    }

    @ResponseBody
    @RequestMapping("/deviceMaintain/search_deviceMaintain_by_deviceFaultId")
    public ResponseVo searchDeviceMaintainByDeviceFaultId(@RequestParam("searchValue")String searchValue,
                                                       @RequestParam("page") int page,
                                                       @RequestParam("rows") int rows){

        return deviceService.searchResponseVo(searchValue, page, rows,
                Thread.currentThread() .getStackTrace()[1].getMethodName());
    }
}
