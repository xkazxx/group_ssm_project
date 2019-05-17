package com.cskaoyan.mytest;


import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.UnqualifyApply;
import com.xkazxx.service.QualityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class MainTest {

    @Autowired
    QualityService qualityService;

    @Test
    public void myTest1(){
        PageInfo<UnqualifyApply> allUnqualifyProductsByPage = qualityService.findAllUnqualifyProductsByPage(1, 5);
        System.out.println(allUnqualifyProductsByPage);
    }
}
