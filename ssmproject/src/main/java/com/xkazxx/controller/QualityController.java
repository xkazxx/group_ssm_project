package com.xkazxx.controller;

import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.*;
import com.xkazxx.service.QualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author Zachary Zhao
 * @create 2019-05-17 20:22
 */
@Controller
public class QualityController {

    @Autowired
    QualityService qualityService;

    @RequestMapping(path = {"/unqualify/find"})
    public String findUnqualifyProducts(){ return "unqualify_list"; }

    @RequestMapping("/unqualify/list")
    @ResponseBody
    public QueryVO findAllUnqualifyProductsByPage(@RequestParam("page") int page,
                                                  @RequestParam("rows") int rows){
        PageInfo<UnqualifyProduct> allUnqualifyProductsByPage = qualityService.findAllUnqualifyProductsByPage(page, rows);
        long total = allUnqualifyProductsByPage.getTotal();
        List<UnqualifyProduct> list = allUnqualifyProductsByPage.getList();
        QueryVO queryVO = new QueryVO();
        queryVO.setRows(list);
        queryVO.setTotal(Math.toIntExact(total));
        return queryVO;
    }

    @RequestMapping("/unqualify/add_judge")
    @ResponseBody
    public void preAddUnqualifyProduct(){ }

    @RequestMapping("/unqualify/add")
    public String addUnqualifyProduct(){ return  "unqualify_add";}

    @RequestMapping("/unqualify/insert")
    @ResponseBody
    public Map insertUnqualifyProduct(@RequestBody UnqualifyApply unqualifyApply){
        int res = qualityService.insert(unqualifyApply);
        Map<String , Object> map = new HashMap<>();
        if(res == 1){
            map.put("status",200);
            map.put("msg","OK");
        }else {
            map.put("status" , 500);
            map.put("msg" , "ERROR");
        }
        map.put("data",null);
        return map;
    }
    /*public Map insertUnqualifyProduct(HttpServletRequest request){
        UnqualifyApply unqualifyApply = new UnqualifyApply();
        unqualifyApply.setUnqualifyApplyId(request.getParameter("unqualifyApplyId"));
        unqualifyApply.set
    }*/

    /**
     * 调用了计划进度模块product的接口
     * 返回值为所有product的list
     * 如有冲突，讨论修改
     * */
    @RequestMapping("/product/get_data")
    @ResponseBody
    public List<Product> getAllProduct(){ return qualityService.getAllProduct(); }

    /**
     * 调用了人员管理模块的department的接口
     * 返回值为所有department的list
     * 如有冲突，讨论修改
     * */
    @RequestMapping("/department/get_data")
    @ResponseBody
    public List<Department> getAllDepartment(){ return  qualityService.getAllDepartment(); }

    /**
     * 调用了人员管理模块的employee的接口
     * 返回值为所有employee的list
     * 如有冲突，讨论修改
     * */
    @RequestMapping("/employee/get_data")
    @ResponseBody
    public List<Employee> getAllEmployee(){ return qualityService.getAllEmployee(); }
}
