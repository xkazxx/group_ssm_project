package com.xkazxx.controller.schedulingController;

import com.xkazxx.bean.Custom;
import com.xkazxx.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomController {

    @Autowired
    SchedulingService schedulingService;

    @RequestMapping("/custom/get/{id}")
    @ResponseBody
    public Custom findCustom(@PathVariable("id") String id) {
        Custom custom = schedulingService.findCostom(id);
        return custom;
    }


    @RequestMapping("/custom/find")
    public String findcustom() {

        //作业查询
        return "work_list";
    }

    @RequestMapping("/custom/get_data")
    @ResponseBody
    public List customGetData(@RequestParam int page,
                              @RequestParam int rows) {
        return schedulingService.getAllCustom();
    }

}
