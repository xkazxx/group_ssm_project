package com.xkazxx.controller.schedulingController;

import com.xkazxx.bean.Technology;
import com.xkazxx.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/work")
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

    @RequestMapping("/find")
    public String findWork() {

        //作业查询
        return "work_list";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Map findWorks(@RequestParam int page,
                            @RequestParam int rows) {

        return schedulingService.findWorks(page,rows);
    }

    @ResponseBody
    @RequestMapping("/search_work_by_workDevice")
    public Map findWorkByDevice(String searchValue, int page, int rows){

        return schedulingService.findWorkByDevice(searchValue,page,rows);
    }

    @RequestMapping("/search_work_by_workId")
    @ResponseBody
    public Map findWorkByWorkId(String searchValue, int page, int rows){

        return schedulingService.findWorkByWorkId(searchValue,page,rows);
    }

    @RequestMapping("/search_work_by_workProcess")
    @ResponseBody
    public Map findWorkByProcess(String searchValue, int page, int rows){

        return schedulingService.findWorkByProcess(searchValue,page,rows);
    }

    @RequestMapping("/search_work_by_workProduct")
    @ResponseBody
    public Map findWorkByProduct(String searchValue, int page, int rows){
        return schedulingService.findWorkByProduct(searchValue,page,rows);
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
