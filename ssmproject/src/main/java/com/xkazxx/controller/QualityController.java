package com.xkazxx.controller;

import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.UnqualifyApply;
import com.xkazxx.service.QualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String findUnqualifyProducts(){

        return "unqualify_list";
    }

    @RequestMapping("/unqualify/list")
    @ResponseBody
    public Map<String , Object> findAllUnqualifyProductsByPage(@RequestParam("page") int page,
                                                           @RequestParam("rows") int rows){
        PageInfo<UnqualifyApply> allUnqualifyProductsByPage = qualityService.findAllUnqualifyProductsByPage(page, rows);
        long total = allUnqualifyProductsByPage.getTotal();
        List<UnqualifyApply> list = allUnqualifyProductsByPage.getList();
        Map<String,Object> map = new HashMap<>();
        map.put("total",total);
        map.put("rows",list);
        return map;
    }
}
