package com.xkazxx.controller.schedulingController;

import com.xkazxx.bean.Technology;
import com.xkazxx.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class WorkController {

    @Autowired
    SchedulingService schedulingService;

    //其他模块的请求，等他人写完删除
    @RequestMapping("/technology/get/{id}")
    @ResponseBody
    public Technology findTechnology(@PathVariable("id") String id) {
     Technology technology = schedulingService.findTechnology(id);
        return technology;
    }


    @RequestMapping("/work/find")
    public String findWork() {

        //作业查询
        return "work_list";
    }


    @RequestMapping("/work/list")
    @ResponseBody
    public Map findWorks(@RequestParam int page,
                            @RequestParam int rows) {

        return schedulingService.findWorks(page,rows);
    }

}
