package com.xkazxx.controller.qualitycontroller;

import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.*;
import com.xkazxx.service.QualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    QueryVO queryVO;

    Map<String,Object> map = new HashMap<>();

    /*
    不合格品管理-分页查询所有不合格品
     */
    @RequestMapping(path = {"/unqualify/find"})
    public String findUnqualifyProducts(){ return "unqualify_list"; }

    @RequestMapping("/unqualify/list")
    @ResponseBody
    public QueryVO findAllUnqualifyProductsByPage(@RequestParam("page") int page,
                                                  @RequestParam("rows") int rows){
        PageInfo<UnqualifyProduct> allUnqualifyProductsByPage = qualityService.findAllUnqualifyProductsByPage(page, rows);
        long total = allUnqualifyProductsByPage.getTotal();
        List<UnqualifyProduct> list = allUnqualifyProductsByPage.getList();
        queryVO.setRows(list);
        queryVO.setTotal(Math.toIntExact(total));
        return queryVO;
    }

    /*
    不合格品管理-添加新的不合格品
     */
    @RequestMapping("/unqualify/add_judge")
    @ResponseBody
    public void preAddUnqualifyProduct(){ }

    @RequestMapping("/unqualify/add")
    public String addUnqualifyProduct(){ return  "unqualify_add";}

    @RequestMapping("/unqualify/insert")
    @ResponseBody
    public Map insertUnqualifyProduct(UnqualifyApply unqualifyApply){
        int res = qualityService.insert(unqualifyApply);
        return setMap(res);
    }

    /*
    不合格品管理-根据不合格品申请编号模糊查询
     */
    @RequestMapping("/unqualify/search_unqualify_by_unqualifyId")
    @ResponseBody
    public QueryVO search_unqualify_by_unqualifyId(@RequestParam("searchValue") String searchValue ,
                                                   @RequestParam("page") int page ,
                                                   @RequestParam("rows") int rows ){
        PageInfo<UnqualifyProduct> unqualifyProductsById = qualityService.search_unqualify_by_unqualifyId(searchValue,page, rows);
        return setQueryVO(unqualifyProductsById);
    }

    /*
    不合格品管理-根据不合格品产品名模糊查询
     */
    @RequestMapping("/unqualify/search_unqualify_by_productName")
    @ResponseBody
    public QueryVO search_unqualify_by_productName(@RequestParam("searchValue") String searchValue ,
                                                   @RequestParam("page") int page ,
                                                   @RequestParam("rows") int rows){
        PageInfo<UnqualifyProduct> unqualifyProductsByName = qualityService.search_unqualify_by_productName(searchValue,page, rows);
        return setQueryVO(unqualifyProductsByName);
    }

    /*
    不合格品管理-修改不合格品
     */
    @RequestMapping("/unqualify/edit_judge")
    @ResponseBody
    public void preUpdateUnqualifyProduct(){ }

    @RequestMapping("/unqualify/edit")
    public String updateUnqualifyProduct(){ return  "unqualify_edit";}

    @RequestMapping("/unqualify/update_all")
    @ResponseBody
    public Map updateUnqualifyApply(UnqualifyApply unqualifyApply){
        int res = qualityService.updateUnqualifyApply(unqualifyApply);
        return setMap(res);
    }

    /*
    自定义方法，根据持久层返回的res设置返回给前端的map
     */
    public Map setMap(int res){
        if(res ==1){
            map.put("status",200);
            map.put("msg","OK");
        }else {
            map.put("status",500);
            map.put("msg","ERROR");
        }
        map.put("data",null);
        return map;
    }
    /**
     * 自定义方法，分页查询时使用
     * 方法体内设置前端需要的total个rows参数
     * 返回值为分页查询工具类
     * */
    public QueryVO setQueryVO(PageInfo pageInfo){
        queryVO.setTotal(Math.toIntExact(pageInfo.getTotal()));
        queryVO.setRows(pageInfo.getList());
        return queryVO;
    }
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
