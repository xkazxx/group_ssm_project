package com.xkazxx.controller;

import com.xkazxx.bean.COrder;
import com.xkazxx.bean.Custom;
import com.xkazxx.bean.Product;
import com.xkazxx.bean.Technology;
import com.xkazxx.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class SchedulingController {

    @Autowired
    SchedulingService schedulingService;

    @RequestMapping("/order/find")
    public String findOrder(Model model) {
        //订单查询
        return "order_list";
    }

    @RequestMapping("/order/list")
    @ResponseBody
    public Map findOrders(@RequestParam int page,
                            @RequestParam int rows) {
        return schedulingService.findOrders(page,rows);
    }

    @RequestMapping("/custom/get/{id}")
    @ResponseBody
    public Custom findCustom(@PathVariable("id") String id) {
        Custom custom = schedulingService.findCostom(id);
        return custom;
    }
    @RequestMapping("/technology/get/{id}")
    @ResponseBody
    public Technology findTechnology(@PathVariable("id") String id) {
     Technology technology = schedulingService.findTechnology(id);
        return technology;
    }

    @RequestMapping("/order/get/{id}")
    @ResponseBody
    public COrder findCOrder(@PathVariable("id") String id) {
     COrder cOrder = schedulingService.findCOrder(id);
        return cOrder;
    }

    @RequestMapping("/custom/find")
    public String findcustom() {

        //作业查询
        return "work_list";
    }

    @RequestMapping("product/find")
    public String findProduct() {

        //产品查询
        return "product_list";
    }

    @RequestMapping("/work/find")
    public String findWork() {

        //作业查询
        return "work_list";
    }

    @RequestMapping("product/list")
    @ResponseBody
    public Map findProducts(@RequestParam int page,
                            @RequestParam int rows) {
        //产品查询
        return schedulingService.findProducts(page,rows);
    }

    @RequestMapping("/product/get/{id}")
    @ResponseBody
    public Product findProduct(@PathVariable("id") String id) {
        Product product = schedulingService.findProduct(id);
        //客户查询
        return product;
    }

    @RequestMapping("/work/list")
    @ResponseBody
    public Map findWorks(@RequestParam int page,
                            @RequestParam int rows) {

        return schedulingService.findWorks(page,rows);
    }

    @RequestMapping("/manufacture/find")
    public String findManufacture() {
        //生产计划查询
        return "manufacture_list";
    }

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

    @RequestMapping("/manufacture/list")
    @ResponseBody
    public Map findManufacture(@RequestParam int page,
                         @RequestParam int rows) {

        return schedulingService.findManufacture(page,rows);
    }

    @RequestMapping("/custom/get_data")
    @ResponseBody
    public List customGetData(@RequestParam int page,
                              @RequestParam int rows) {
        return schedulingService.getAllCustom();
    }

    @RequestMapping("/product/get_data")
    @ResponseBody
    public List productGetData(@RequestParam int page,
                         @RequestParam int rows) {
        return schedulingService.getAllProduct();
    }
    @RequestMapping("/order/get_data")
    @ResponseBody
    public List cOrderGetData(@RequestParam int page,
                         @RequestParam int rows) {
        return schedulingService.getAllCOrder();
    }
}
