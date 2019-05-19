package com.xkazxx.controller.schedulingController;

import com.xkazxx.bean.COrder;
import com.xkazxx.service.SchedulingService;
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
        COrder cOrder = schedulingService.findCOrder(id);
        return cOrder;
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
        Map map = new HashMap();
        map.put("msg", null);
        return map;
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
        Map map = new HashMap();
        map.put("msg", null);
        return map;
    }

     @RequestMapping("/delete_judge")
     @ResponseBody
     public Map delete_judge(){
         Map map = new HashMap();
         map.put("msg", null);
         return map;
     }

     @RequestMapping("/delete_batch")
     @ResponseBody
     public Map delete_batch(String[] ids){
        boolean success = schedulingService.delete_batch(ids);
         Map map = new HashMap();
         if(success) {
            map.put("msg", "ok");
            map.put("status", 200);
            map.put("data", null);
        }
         return map;
     }

}
