package com.xkazxx.controller.technology;

import com.xkazxx.bean.QueryVO;
import com.xkazxx.service.technologyservice.TechnologyRequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author alan.zhang
 */
@Controller
public class TechnologyRequirementController {

    @Autowired
    private TechnologyRequirementService technologyRequirementService;

    /**
     * 入口
     * @return
     */
    @RequestMapping("/technologyRequirement/find")
    public String findTechnologyRequirement(){

        return "technologyRequirement_list";
    }

    /**
     * @param page
     * @param rows
     * @return 返回工艺要求的json数据格式
     */
    @RequestMapping("technologyRequirement/list")
    @ResponseBody
    public QueryVO showTechnologyRequirement(Integer page,Integer rows){
        //调用业务层服务
        QueryVO queryVO = technologyRequirementService.findTechnologyRequirementAndTechnologyName(page, rows);
        return queryVO;
    }

}
