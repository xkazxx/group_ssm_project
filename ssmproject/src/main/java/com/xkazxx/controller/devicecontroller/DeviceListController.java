package com.xkazxx.controller.devicecontroller;

import com.xkazxx.bean.Department;
import com.xkazxx.bean.Device;
import com.xkazxx.bean.DeviceType;
import com.xkazxx.service.DeviceService;
import com.xkazxx.util.PublicMethodPart;
import com.xkazxx.vo.EmployeeAndDepartmentVo;
import com.xkazxx.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DeviceListController {

    @Autowired
    DeviceService deviceService;

    @ResponseBody
    @RequestMapping("/deviceList/list")
    public ResponseVo list(@RequestParam("page") int page, @RequestParam("rows") int rows){

        return deviceService.setResponseVo(page, rows, Device.class);
    }

    @ResponseBody
    @RequestMapping("/department/get_data")
    public List getDataDepartment(){

        return deviceService.setList(Department.class);
    }

    @ResponseBody
    @RequestMapping("/employee/get_data")
    public List<EmployeeAndDepartmentVo> getDataEmployee(){

        return deviceService.setList(EmployeeAndDepartmentVo.class);
    }

    @ResponseBody
    @RequestMapping("/deviceList/get_data")
    public List<Device> getDataDevice(){

        return deviceService.setList(Device.class);
    }

    @ResponseBody
    @RequestMapping("/deviceType/get/{id}")
    public DeviceType getDeviceType(@PathVariable("id") String id){

        return deviceService.getDeviceTypeById(id);
    }

    @ResponseBody
    @RequestMapping("/employee/get/{id}")
    public EmployeeAndDepartmentVo getEmployee(@PathVariable("id") String id){

        return deviceService.getEmployeeAndDepartmentVo(id);
    }

    @ResponseBody
    @RequestMapping("/deviceList/add_judge")
    public Map addJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }

    @RequestMapping("/deviceList/add")
    public String add(){

        return "deviceList_add";
    }

    @ResponseBody
    @PostMapping("/deviceList/insert")
    public Map insert(Device device){

        return PublicMethodPart.optionSuccess(deviceService.insertDevice(device));
    }

    @ResponseBody
    @RequestMapping("/deviceList/edit_judge")
    public Map editJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }

    @RequestMapping("/deviceList/edit")
    public String edit(){

        return "deviceList_edit";
    }

    @ResponseBody
    @RequestMapping("/deviceList/update")
    public Map update(Device device){

        return PublicMethodPart.optionSuccess(deviceService.updateDevice(device));
    }

    @ResponseBody
    @RequestMapping("/deviceList/delete_judge")
    public Map deleteJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }

    @ResponseBody
    @RequestMapping("/deviceList/delete_batch")
    public Map deleteBatch(String[] ids){

        return PublicMethodPart.optionSuccess(deviceService.deleteDevice(ids));
    }
}
