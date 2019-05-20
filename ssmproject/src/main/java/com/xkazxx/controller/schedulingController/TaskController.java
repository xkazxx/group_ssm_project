package com.xkazxx.controller.schedulingController;

import com.xkazxx.bean.Task;
import com.xkazxx.service.SchedulingService;
import com.xkazxx.util.PublicMethodPart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
        String msg = null;
        return PublicMethodPart.judgeResult(msg);
    }

    @RequestMapping("/edit_judge")
    @ResponseBody
    public Map edit_judge(){
        String msg = null;
        return PublicMethodPart.judgeResult(msg);
    }

    @RequestMapping("/delete_judge")
    @ResponseBody
    public Map delete_judge(){
        String msg = null;
        return PublicMethodPart.judgeResult(msg);
    }

    @RequestMapping("/add")
    public String addTask(){
        return "task_add";
    }

    @RequestMapping("/edit")
    public String editCustom(){
        return "task_edit";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Map insertTask(Task task){
        boolean success = schedulingService.insertTask(task);
        return PublicMethodPart.optionSuccess(success);
    }

    @RequestMapping("/update_all")
    @ResponseBody
    public Map update_all_Task(Task task){
        boolean success = schedulingService.update_all_Task(task);
        return PublicMethodPart.optionSuccess(success);
    }

    @RequestMapping("/delete_batch")
    @ResponseBody
    public Map delete_batch_Task(String[] ids){
        boolean success = schedulingService.delete_batch_Task(ids);
        return PublicMethodPart.optionSuccess(success);
    }

}
