package com.xkazxx.controller.schedulingController;

import com.xkazxx.bean.COrder;
import com.xkazxx.service.SchedulingService;
import com.xkazxx.util.PublicMethodPart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

@Controller
@RequestMapping("/order")
public class COrderController {

    @Autowired
    PublicMethodPart publicMethodPart;

    @Autowired
    SchedulingService schedulingService;

    @RequestMapping("/find")
    public String findOrder(Model model) {
        //订单查询
        return "order_list";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Map findOrders(@RequestParam int page,
                          @RequestParam int rows) {
        return schedulingService.findOrders(page,rows);
    }

    @RequestMapping("/get/{id}")
    @ResponseBody
    public COrder findCOrder(@PathVariable("id") String id) {
        return schedulingService.findCOrder(id);

    }

    @RequestMapping("/get_data")
    @ResponseBody
    public List cOrderGetData() {
        return schedulingService.getAllCOrder();
    }

    @RequestMapping("/search_order_by_orderProduct")
    @ResponseBody
    public Map findCOrderByCOrderProduct(String searchValue,int page,int rows){

        return schedulingService.findCOrderByCOrderProduct(searchValue,page,rows);
    }

    @RequestMapping("/search_order_by_orderCustom")
    @ResponseBody
    public Map findCOrderByCOrderCustom(String searchValue,int page,int rows){

        return schedulingService.findCOrderByCOrderCustom(searchValue,page,rows);
    }

    @RequestMapping("/search_order_by_orderId")
    @ResponseBody
    public Map findCOrderByCOrderId(String searchValue,int page,int rows){

        return schedulingService.findCOrderByCOrderId(searchValue,page,rows);
    }

    @RequestMapping("/add_judge")
    @ResponseBody
    public Map add_judge(){
        String msg = null;
        return publicMethodPart.judgeResult(msg);
    }

    @RequestMapping("/add")
    public String addCOrder(){

        return "order_add";
    }
    @RequestMapping("/insert")
    public String insertCOrder(COrder cOrder, MultipartFile[] files){
        System.out.println(cOrder);
        System.out.println(files);
        return null;
    }

    @RequestMapping("/edit_judge")
    @ResponseBody
    public Map edit_judge(){
        String msg = null;
        return publicMethodPart.judgeResult(msg);
    }

     @RequestMapping("/delete_judge")
     @ResponseBody
     public Map delete_judge(){
        String msg = null;
         return publicMethodPart.judgeResult(msg);
     }

     @RequestMapping("/delete_batch")
     @ResponseBody
     public Map delete_batch_COrder(String[] ids){
        boolean success = schedulingService.delete_batch_COrder(ids);
         return publicMethodPart.optionSuccess(success);
     }


}
