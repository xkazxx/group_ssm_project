package com.xkazxx.controller.employeeController;
import com.xkazxx.bean.Department;
import com.xkazxx.service.DepartmentService;
import com.xkazxx.util.PublicMethodPart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    PublicMethodPart publicMethodPart;
    @Autowired
    DepartmentService departmentService;
    @RequestMapping("/find")
    public String findDepartment(Model model) {
        //员工查询
        return "department_list";     //返回到jsp页面
    }

    //雇员列表
    @RequestMapping("/list")
    @ResponseBody
    public Map findDepartments(@RequestParam int page,
                             @RequestParam int rows) {
        return departmentService.findDepartments(page,rows);
    }

    @RequestMapping("/get/{id}")
    @ResponseBody
    public Department findDepartment(@PathVariable("id") String id) {
        Department department = departmentService.findDepartment(id);
        return department;
    }

    @RequestMapping("/get_data")
    @ResponseBody
    public List departmentGetData() {
        return departmentService.getAllDepartment();
    }
    //搜索条件
    @RequestMapping("/search_department_by_departmentId")
    @ResponseBody
    public Map findDepartmentByDepartmentId(String searchValue,int page,int rows){

        return departmentService.findDepartmentByDepartmentId(searchValue,page,rows);
    }
    //搜索条件
    @RequestMapping("/search_department_by_departmentName")
    @ResponseBody
    public Map findDepartmentByDepartmentName(String searchValue,int page,int rows){

        return departmentService.findDepartmentByDepartmentName(searchValue,page,rows);
    }

    //插入按钮
    @RequestMapping("/add_judge")
    @ResponseBody
    public Map add_judge(){
        String msg = null;
        return publicMethodPart.judgeResult(msg);
    }

    @RequestMapping("/add")
    public String addDepartment(){
        return "department_add";
    }

    @RequestMapping("/insert")
    public String insertDepartment(Department department, MultipartFile[] files){
        System.out.println(department);
        System.out.println(files);
        return null;
    }
    //编辑按钮
    @RequestMapping("/edit_judge")
    @ResponseBody
    public Map edit_judge(){
        String msg = null;
        return publicMethodPart.judgeResult(msg);
    }
    //删除按钮
    @RequestMapping("/delete_judge")
    @ResponseBody
    public Map delete_judge(){
        String msg = null;
        return publicMethodPart.judgeResult(msg);
    }

    //多选删除
    @RequestMapping("/delete_batch")
    @ResponseBody
    public Map delete_batch_Department(String[] ids){
        boolean success = departmentService.delete_batch_Department(ids);
        return publicMethodPart.optionSuccess(success);
    }

    @RequestMapping("/update_all")
    @ResponseBody
    public Map update_all_Department(Department department) {
        boolean success = departmentService.update_all_Department(department);
        return PublicMethodPart.optionSuccess(success);
    }

    @RequestMapping("/update_note")
    @ResponseBody
    public Map updateDepartmentNote(String note, String orderId) {
        boolean success = departmentService.updateDepartmentNote(note, orderId);
        return PublicMethodPart.optionSuccess(success);
    }
}
