package com.xkazxx.controller.technology;

import com.xkazxx.bean.QueryVO;
import com.xkazxx.service.technologyservice.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author alan.zhang
 */
@Controller
public class TechnologyController {

    @Autowired
    private TechnologyService technologyService;


    @RequestMapping(path = {"/technology/find"})
    public String findTechnology(){

        return "technology_list";
    }

    /**
     * 把technology展示出来
     * @return
     */
    @RequestMapping("/technology/list")
    @ResponseBody
    public QueryVO showTechnologyList(Integer page,Integer rows){
      //调用服务
        QueryVO technologyAll = technologyService.findTechnologyAll(page, rows);
        return technologyAll;
    }
}
