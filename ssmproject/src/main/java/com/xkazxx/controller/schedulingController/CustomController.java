package com.xkazxx.controller.schedulingController;

import com.xkazxx.bean.Custom;
import com.xkazxx.service.SchedulingService;
import com.xkazxx.util.PublicMethodPart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/custom")
public class CustomController {

    @Autowired
    PublicMethodPart publicMethodPart;

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
        String msg = null;
        return publicMethodPart.judgeResult(msg);
    }

    @RequestMapping("/delete_judge")
    @ResponseBody
    public Map delete_judge(){
        String msg = null;
        return publicMethodPart.judgeResult(msg);
    }

    @RequestMapping("/edit_judge")
    @ResponseBody
    public Map edit_judge(){
        String msg = null;
        return publicMethodPart.judgeResult(msg);
    }


    @RequestMapping("/add")
    public String addCustom(){
        return "custom_add";
    }

    @RequestMapping("/edit")
    public String editCustom(){
        return "custom_edit";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Map insertCustom(Custom custom){
        boolean success = schedulingService.insertCustom(custom);
        return publicMethodPart.optionSuccess(success);
    }

    @RequestMapping("/update_all")
    @ResponseBody
    public Map update_all_Custom(Custom custom){
        boolean success = schedulingService.update_all_Custom(custom);
        return publicMethodPart.optionSuccess(success);
    }

    @RequestMapping("/delete_batch")
    @ResponseBody
    public Map delete_batch_Custom(String[] ids){
        boolean success = schedulingService.delete_batch_Custom(ids);
        return publicMethodPart.optionSuccess(success);
    }

    @RequestMapping("/update_note")
    @ResponseBody
    public Map updateCustomNote(String note,String customId){
        boolean success = schedulingService.updateCustomNote(note,customId);
        return publicMethodPart.optionSuccess(success);
    }



}
