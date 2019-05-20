package com.xkazxx.controller;

import com.xkazxx.bean.Process;
import com.xkazxx.bean.QueryVO;
import com.xkazxx.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author alan.zhang
 */
@Controller
public class ProcessController {

    @Autowired
    private ProcessService processService;

    @RequestMapping("/process/find")
    public String findProcessAndTechnologyPlan(){
        return "process_list";
    }

    @RequestMapping("/process/list")
    @ResponseBody
    public QueryVO selectProcessAndTechnologyPlan(Integer page,Integer rows){
        QueryVO queryVO = processService.findProcessAndTechnologyPlan(page, rows);
        return queryVO;
    }

    @RequestMapping("/process/get_data")
    @ResponseBody
    public List<Process> getAllProcess() {
        return processService.getAllProcess();
    }
}
