package com.xkazxx.controller.schedulingController;

import com.xkazxx.bean.Product;
import com.xkazxx.service.SchedulingService;
import com.xkazxx.util.PublicMethodPart;
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
@RequestMapping("/product")
public class ProductController {

    @Autowired
    PublicMethodPart PublicMethodPart;

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
    public String addProduct(){
        return "product_add";
    }

    @RequestMapping("/edit")
    public String editProduct(){
        return "product_edit";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Map insertProduct(Product product){
        boolean success = schedulingService.insertProduct(product);
        return PublicMethodPart.optionSuccess(success);
    }

    @RequestMapping("/update_all")
    @ResponseBody
    public Map update_all_Product(Product product){
        boolean success = schedulingService.update_all_Product(product);
        return PublicMethodPart.optionSuccess(success);
    }

    @RequestMapping("/delete_batch")
    @ResponseBody
    public Map delete_batch_Product(String[] ids){
        boolean success = schedulingService.delete_batch_Product(ids);
        return PublicMethodPart.optionSuccess(success);
    }

    @RequestMapping("/update_note")
    @ResponseBody
    public Map updateProductNote(String note,String productId){
        boolean success = schedulingService.updateProductNote(note,productId);
        return PublicMethodPart.optionSuccess(success);
    }

}
