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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List cOrderGetData(@RequestParam int page,
                              @RequestParam int rows) {
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
    /*@RequestMapping({"/search_order_by_orderId","/search_order_by_orderCustom","/search_order_by_orderProduct"})
    @ResponseBody
    public Map findCOrderByCOrderId(String searchValue,int page,int rows){
        Map<String,String> paramMap = new HashMap<>();
        paramMap


        return schedulingService.findCOrderByCOrderId(searchValue,page,rows);
    }*/

}
