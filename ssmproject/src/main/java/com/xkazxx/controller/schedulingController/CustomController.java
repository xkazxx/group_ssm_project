package com.xkazxx.controller.schedulingController;

import com.xkazxx.bean.Custom;
import com.xkazxx.service.SchedulingService;
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
@RequestMapping("/custom")
public class CustomController {

    @Autowired
    SchedulingService schedulingService;

    @RequestMapping("/get/{id}")
    @ResponseBody
    public Custom findCustom(@PathVariable("id") String id) {
        Custom custom = schedulingService.findCostom(id);
        return custom;
    }


    @RequestMapping("/find")
    public String findcustom() {

        //作业查询
        return "custom_list";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Map findcustoms(@RequestParam int page,
                           @RequestParam int rows) {

        return schedulingService.findCustoms(page,rows);
    }

    @RequestMapping("/get_data")
    @ResponseBody
    public List customGetData() {
        return schedulingService.getAllCustom();
    }

    @RequestMapping("/search_custom_by_customId")
    @ResponseBody
    public Map findCustomByCustomId(String searchValue,int page,int rows){
        return schedulingService.findCustomByCustomId(searchValue,page,rows);
    }

    @RequestMapping("/search_custom_by_customName")
    @ResponseBody
    public Map findCustomByCustomName(String searchValue,int page,int rows){
        return schedulingService.findCustomByCustomName(searchValue,page,rows);
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
