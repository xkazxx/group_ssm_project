package com.xkazxx.controller.schedulingController;

import com.xkazxx.bean.Manufacture;
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

        return schedulingService.findManufactures(page,rows);
    }

    @RequestMapping("/get/{id}")
    @ResponseBody
    public Manufacture findManufacture(@PathVariable("id") String id) {
        Manufacture manufacture = schedulingService.findManufacture(id);
        return manufacture;
    }

    @RequestMapping("/get_data")
    @ResponseBody
    public List manufactureGetData() {
        return schedulingService.getAllManufacture();
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
    public String addManufacture(){
        return "manufacture_add";
    }

    @RequestMapping("/edit")
    public String editManufacture(){
        return "manufacture_edit";
    }

    @RequestMapping("/update_all")
    @ResponseBody
    public Map updateManufactureById(Manufacture manufacture){
        boolean success = schedulingService.updateManufactureById(manufacture);
        return PublicMethodPart.optionSuccess(success);
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Map insertManufacture(Manufacture manufacture){
        boolean success = schedulingService.insertManufacture(manufacture);
        return PublicMethodPart.optionSuccess(success);
    }

    @RequestMapping("/delete_batch")
    @ResponseBody
    public Map delete_batch_Manufacture(String[] ids){
        boolean success = schedulingService.delete_batch_Manufacture(ids);
        return PublicMethodPart.optionSuccess(success);
    }

}
