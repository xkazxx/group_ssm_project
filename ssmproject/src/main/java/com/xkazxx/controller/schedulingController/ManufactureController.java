package com.xkazxx.controller.schedulingController;

import com.xkazxx.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/manufacture")
public class ManufactureController {

    @Autowired
    SchedulingService schedulingService;


    @RequestMapping("/find")
    public String findManufacture() {
        //生产计划查询
        return "manufacture_list";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Map findManufacture(@RequestParam int page,
                               @RequestParam int rows) {

        return schedulingService.findManufacture(page,rows);
    }

    @RequestMapping("/search_manufacture_by_manufactureSn")
    @ResponseBody
    public Map findManufactureByManufactureSn(String searchValue, int page, int rows){
        return schedulingService.findManufactureByManufactureSn(searchValue,page,rows);
    }

    @RequestMapping("/search_manufacture_by_manufactureOrderId")
    @ResponseBody
    public Map findManufactureByManufactureOrderId(String searchValue, int page, int rows){
        return schedulingService.findManufactureByManufactureOrderId(searchValue,page,rows);
    }

    @RequestMapping("/search_manufacture_by_manufactureTechnologyName")
    @ResponseBody
    public Map findManufactureByManufactureTechnologyName(String searchValue, int page, int rows){
        return schedulingService.findManufactureByManufactureTechnologyName(searchValue,page,rows);
    }

    @RequestMapping("/add_judge")
    @ResponseBody
    public Map add_judge(){
        Map map = new HashMap();
        map.put("msg", null);
        return map;
    }

    @RequestMapping("/edit_judge")
    @ResponseBody
    public Map edit_judge(){
        Map map = new HashMap();
        map.put("msg", null);
        return map;
    }
}
