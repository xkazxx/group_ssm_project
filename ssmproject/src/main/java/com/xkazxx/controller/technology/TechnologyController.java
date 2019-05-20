package com.xkazxx.controller.technology;

import com.xkazxx.bean.QueryVO;
import com.xkazxx.bean.Technology;
import com.xkazxx.bean.TechnologyResult;
import com.xkazxx.service.technologyservice.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author alan.zhang
 */
@Controller
@RequestMapping("/technology")
public class TechnologyController {

    @Autowired
    private TechnologyService technologyService;


    @RequestMapping(path = {"/find"})
    public String findTechnology(){

        return "technology_list";
    }

    /**
     * 把technology展示出来
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public QueryVO showTechnologyList(Integer page,Integer rows){
      //调用服务
        QueryVO technologyAll = technologyService.findTechnologyAll(page, rows);
        return technologyAll;
    }

    /**
     * 请求technology_add页面
     * @return
     */
    @RequestMapping("/add_judge")
    @ResponseBody
    public String findTechnologyAdd1(){
        return "technology_add";
    }
    @RequestMapping("/add")
    public String findTechnologyAdd2(){
        return "technology_add";
    }

    /**
     * 新增功能
     * @param technology
     * @return
     */
    @RequestMapping("/insert")
    @ResponseBody
    public TechnologyResult insertTechnology(Technology technology){
        //调用业务层，插入数据库
        int insert = technologyService.insertTechnology(technology);
        TechnologyResult technologyResult = new TechnologyResult();
        if(insert == 1){
            technologyResult.setMsg("OK");
            technologyResult.setStatus("200");
        }else {
            technologyResult.setMsg("ERROR");
            technologyResult.setStatus("500");
        }
        return technologyResult;
    }


    /**
     * 请求technology_edit页面
     * @return
     */
    @RequestMapping("/edit_judge")
    @ResponseBody
    public String findTechnologyEdit1(){
        return "technology_edit";
    }
    @RequestMapping("/edit")
    public String findTechnologyEdit2(){
        return "technology_edit";
    }
    /**
     * 编辑功能
     * @param technology
     * @return
     */
    @RequestMapping("/update_all")
    @ResponseBody
    public TechnologyResult updateTechnologyById(Technology technology){
        //调用业务层，修改数据
        int update = technologyService.updateTechnologyId(technology);
        TechnologyResult technologyResult = new TechnologyResult();
        if(update == 1){
            technologyResult.setMsg("OK");
            technologyResult.setStatus("200");
        }else {
            technologyResult.setMsg("ERROR");
            technologyResult.setStatus("500");
        }
        return technologyResult;
    }

//测试方式的叫法是

}
