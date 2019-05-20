package com.xkazxx.controller.technology;

import com.xkazxx.bean.QueryVO;
import com.xkazxx.bean.TechnologyPlan;
import com.xkazxx.service.technologyservice.TechnologyPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author alan.zhang
 */
@Controller
public class TechnologyPlanController {

    @Autowired
    private TechnologyPlanService technologyPlanService;

    /**
     * 入口
     * @return
     */
    @RequestMapping("/technologyPlan/find")
    public String findTechnologyPlan(){

        return "technologyPlan_list";
    }

    @RequestMapping("/technologyPlan/list")
    @ResponseBody
    public QueryVO showTechnologyPlan(Integer page,Integer rows){
        QueryVO queryVO = technologyPlanService.findTechnologyPlanAndTechnologyName(page, rows);

        return queryVO;
    }

    /**
     * 质量监控模块调用
     * 如果发生冲突，勿删
     */
    @RequestMapping("/technologyPlan/get_data")
    @ResponseBody
    public List<TechnologyPlan> getAllTechnologyPlan(){ return technologyPlanService.getAllTechnologyPlan(); }
}
