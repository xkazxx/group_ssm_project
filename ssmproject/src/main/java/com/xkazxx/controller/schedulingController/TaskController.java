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
@RequestMapping("/task")
public class TaskController {
    @Autowired
    SchedulingService schedulingService;

    @RequestMapping("/find")
    public String findTask() {

        //生产派工查询
        return "task_list";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Map findTasks(@RequestParam int page,
                         @RequestParam int rows) {

        return schedulingService.findTasks(page,rows);
    }

    @RequestMapping("/search_task_by_taskId")
    @ResponseBody
    public Map findTaskByTaskId(String searchValue, int page, int rows){
        return schedulingService.findTaskByTaskId(searchValue,page,rows);
    }

    @RequestMapping("/search_task_by_taskWorkId")
    @ResponseBody
    public Map findTaskByWorkId(String searchValue, int page, int rows){
        return schedulingService.findTaskByWorkId(searchValue,page,rows);
    }

    @RequestMapping("/search_task_by_taskManufactureSn")
    @ResponseBody
    public Map findTaskByManufactureSn(String searchValue, int page, int rows){
        return schedulingService.findTaskByManufactureSn(searchValue,page,rows);
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
