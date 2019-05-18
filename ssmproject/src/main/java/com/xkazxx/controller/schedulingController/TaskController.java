package com.xkazxx.controller.schedulingController;

import com.xkazxx.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class TaskController {
    @Autowired
    SchedulingService schedulingService;

    @RequestMapping("/task/find")
    public String findTask() {

        //生产派工查询
        return "task_list";
    }

    @RequestMapping("/task/list")
    @ResponseBody
    public Map findTasks(@RequestParam int page,
                         @RequestParam int rows) {

        return schedulingService.findTasks(page,rows);
    }
}
