package com.xkazxx.controller;

import com.xkazxx.bean.UnqualifyApply;
import com.xkazxx.service.QualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Zachary Zhao
 * @create 2019-05-17 20:22
 */
@Controller
public class QualityController {

    @Autowired
    QualityService qualityService;

    @RequestMapping(path = {"/unqualify/find"})
    public ModelAndView findAllUnqualifyProductsByPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("unqualify_list");
        return modelAndView;
    }
}
