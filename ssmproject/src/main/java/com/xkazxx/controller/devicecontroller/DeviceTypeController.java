package com.xkazxx.controller.devicecontroller;

import com.xkazxx.bean.DeviceType;
import com.xkazxx.service.DeviceService;
import com.xkazxx.util.PublicMethodPart;
import com.xkazxx.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DeviceTypeController {

    @Autowired
    DeviceService deviceService;

    @ResponseBody
    @RequestMapping("/deviceType/list")
    public ResponseVo list(@RequestParam("page") int page, @RequestParam("rows") int rows){

        return deviceService.setResponseVo(page, rows, DeviceType.class);
    }

    @ResponseBody
    @RequestMapping("/deviceType/get_data")
    public List<DeviceType> getData(){

        return deviceService.setList(DeviceType.class);
    }

    @ResponseBody
    @RequestMapping("/deviceType/add_judge")
    public Map addJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }

    @RequestMapping("/deviceType/add")
    public String add(){

        return "deviceType_add";
    }

    @ResponseBody
    @RequestMapping("/deviceType/insert")
    public Map insert(DeviceType deviceType){

        return PublicMethodPart.optionSuccess(deviceService.insertDeviceType(deviceType));
    }

    @ResponseBody
    @RequestMapping("/deviceType/edit_judge")
    public Map editJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }

    @RequestMapping("/deviceType/edit")
    public String edit(){

        return "deviceType_edit";
    }

    @ResponseBody
    @RequestMapping("/deviceType/update_all")
    public Map updateAll(DeviceType deviceType){

        return PublicMethodPart.optionSuccess(deviceService.updateDeviceType(deviceType));
    }

    @ResponseBody
    @RequestMapping("/deviceType/update")
    public Map update(DeviceType deviceType){

        return PublicMethodPart.optionSuccess(deviceService.updateDeviceType(deviceType));
    }

    @ResponseBody
    @RequestMapping("/deviceType/delete_judge")
    public Map deleteJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }

    @ResponseBody
    @RequestMapping("/deviceType/delete_batch")
    public Map deleteBatch(String[] ids){

        return PublicMethodPart.optionSuccess(deviceService.deleteDeviceType(ids));
    }

    @ResponseBody
    @RequestMapping("/deviceType/search_deviceType_by_deviceTypeId")
    public ResponseVo searchDeviceTypeByDeviceTypeId(@RequestParam("searchValue")String searchValue,
                                             @RequestParam("page") int page,
                                             @RequestParam("rows") int rows){

        return deviceService.searchResponseVo(searchValue, page, rows,
                Thread.currentThread() .getStackTrace()[1].getMethodName());
    }

    @ResponseBody
    @RequestMapping("/deviceType/search_deviceType_by_deviceTypeName")
    public ResponseVo searchDeviceTypeByDeviceTypeName(@RequestParam("searchValue")String searchValue,
                                             @RequestParam("page") int page,
                                             @RequestParam("rows") int rows){

        return deviceService.searchResponseVo(searchValue, page, rows,
                Thread.currentThread() .getStackTrace()[1].getMethodName());
    }
}
