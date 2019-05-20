package com.xkazxx.controller.devicecontroller;

import com.xkazxx.bean.Device;
import com.xkazxx.bean.DeviceCheck;
import com.xkazxx.service.DeviceService;
import com.xkazxx.util.PublicMethodPart;
import com.xkazxx.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DeviceCheckController {

    @Autowired
    DeviceService deviceService;

    @ResponseBody
    @RequestMapping("/deviceCheck/list")
    public ResponseVo list(@RequestParam("page") int page, @RequestParam("rows") int rows){

        return deviceService.setResponseVo(page, rows, DeviceCheck.class);
    }

    @ResponseBody
    @RequestMapping("/deviceList/get/{id}")
    public Device get(@PathVariable("id") String id){

        return deviceService.getDevice(id);
    }

    @ResponseBody
    @RequestMapping("/deviceCheck/update_note")
    public Map updateDeviceCheckNote(@RequestParam("deviceCheckId") String deviceCheckId,
                                @RequestParam("deviceCheckResult") String deviceCheckResult){

        return PublicMethodPart.optionSuccess(deviceService.updateDeviceCheckResultById(deviceCheckId, deviceCheckResult));
    }

    @ResponseBody
    @RequestMapping("/deviceCheck/add_judge")
    public Map addJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }

    @RequestMapping("/deviceCheck/add")
    public String add(){

        return "deviceCheck_add";
    }

    @ResponseBody
    @RequestMapping("/deviceCheck/insert")
    public Map insert(DeviceCheck deviceCheck){

        return PublicMethodPart.optionSuccess(deviceService.insertDeviceCheck(deviceCheck));
    }

    @ResponseBody
    @RequestMapping("/deviceCheck/edit_judge")
    public Map editJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }

    @RequestMapping("/deviceCheck/edit")
    public String edit(){

        return "deviceCheck_edit";
    }

    @ResponseBody
    @RequestMapping("/deviceCheck/update")
    public Map update(DeviceCheck deviceCheck){

        return PublicMethodPart.optionSuccess(deviceService.updateDeviceCheck(deviceCheck));
    }

    @ResponseBody
    @RequestMapping("/deviceCheck/delete_judge")
    public Map deleteJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }

    @ResponseBody
    @RequestMapping("/deviceCheck/delete_batch")
    public Map deleteBatch(String[] ids){

        return PublicMethodPart.optionSuccess(deviceService.deleteDeviceCheck(ids));
    }

    @ResponseBody
    @RequestMapping("/deviceCheck/search_deviceCheck_by_deviceCheckId")
    public ResponseVo searchDeviceCheckByDeviceCheckId(@RequestParam("searchValue")String searchValue,
                                                       @RequestParam("page") int page,
                                                       @RequestParam("rows") int rows){

        return deviceService.searchResponseVo(searchValue, page, rows,
                Thread.currentThread() .getStackTrace()[1].getMethodName());
    }

    @ResponseBody
    @RequestMapping("/deviceCheck/search_deviceCheck_by_deviceName")
    public ResponseVo searchDeviceCheckByDeviceCheckName(@RequestParam("searchValue")String searchValue,
                                                         @RequestParam("page") int page,
                                                         @RequestParam("rows") int rows){

        return deviceService.searchResponseVo(searchValue, page, rows,
                Thread.currentThread() .getStackTrace()[1].getMethodName());
    }
}
