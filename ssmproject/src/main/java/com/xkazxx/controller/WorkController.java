package com.xkazxx.controller;

import com.xkazxx.bean.Work;
import com.xkazxx.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/work")
public class WorkController {

    @Autowired
    WorkService workService;

    @RequestMapping("/getWork")
    public Work getWork(String id ){
        Work work = workService.queryWorkerById(id);
        System.out.println(work);
        return work;
    }


}
