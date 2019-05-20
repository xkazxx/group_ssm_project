package com.xkazxx.controller.devicecontroller;

import com.xkazxx.bean.Department;
import com.xkazxx.bean.Device;
import com.xkazxx.bean.DeviceType;
import com.xkazxx.service.DeviceService;
import com.xkazxx.vo.EmployeeAndDepartmentVo;
import com.xkazxx.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @RequestMapping("/deviceList/insert")
    public void insert(Device device){

        deviceService.insertDevice(device);
    }

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
    @RequestMapping("/deviceList/delete_judge")
    public Map deleteJudge(){

        HashMap<String, Object> map = new HashMap<>();

        map.put("null", null);

        return map;
    }


}
