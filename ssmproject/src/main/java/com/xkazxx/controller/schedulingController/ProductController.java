package com.xkazxx.controller.schedulingController;

import com.xkazxx.bean.Product;
import com.xkazxx.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/product")
public class ProductController {


    @Autowired
    SchedulingService schedulingService;

    @RequestMapping("/find")
    public String findProduct() {

        //产品查询
        return "product_list";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Map findProducts(@RequestParam int page,
                            @RequestParam int rows) {
        //产品查询
        return schedulingService.findProducts(page,rows);
    }

    @RequestMapping("/get/{id}")
    @ResponseBody
    public Product findProduct(@PathVariable("id") String id) {
        Product product = schedulingService.findProduct(id);
        //客户查询
        return product;
    }

    @RequestMapping("/get_data")
    @ResponseBody
    public List productGetData() {
        return schedulingService.getAllProduct();
    }

    @RequestMapping("/search_product_by_productId")
    @ResponseBody
    public Map findProductByProductId(String searchValue,int page,int rows){

        return schedulingService.findProductByProductId(searchValue,page,rows);
    }

    @RequestMapping("/search_product_by_productName")
    @ResponseBody
    public Map findProductByProductName(String searchValue,int page,int rows){

        return schedulingService.findProductByProductName(searchValue,page,rows);
    }

    @RequestMapping("/search_product_by_productType")
    @ResponseBody
    public Map findProductByProductType(String searchValue,int page,int rows){

        return schedulingService.findProductByProductType(searchValue,page,rows);
    }

}
