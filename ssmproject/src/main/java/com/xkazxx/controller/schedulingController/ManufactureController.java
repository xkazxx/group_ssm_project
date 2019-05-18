package com.xkazxx.controller.schedulingController;

import com.xkazxx.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class ManufactureController {

    @Autowired
    SchedulingService schedulingService;


    @RequestMapping("/manufacture/find")
    public String findManufacture() {
        //生产计划查询
        return "manufacture_list";
    }

    @RequestMapping("/manufacture/list")
    @ResponseBody
    public Map findManufacture(@RequestParam int page,
                               @RequestParam int rows) {

        return schedulingService.findManufacture(page,rows);
    }
}
