package com.xkazxx.controller.employeeController;

import com.xkazxx.bean.Employee;
import com.xkazxx.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xkazxx.util.PublicMethodPart;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    PublicMethodPart publicMethodPart;
    @Autowired
    EmployeeService employeeService;
    @RequestMapping("/find")
    public String findEmployee(Model model) {
        //员工查询
        return "employee_list";     //返回到jsp页面
    }

    //雇员列表
    @RequestMapping("/list")
    @ResponseBody
    public Map findEmployees(@RequestParam int page,
                          @RequestParam int rows) {
        return employeeService.findEmployees(page,rows);
    }

    @RequestMapping("/get/{id}")
    @ResponseBody
    public Employee findEmployee(@PathVariable("id") String id) {
        Employee employee = employeeService.findEmployee(id);
        return employee;
    }

    @RequestMapping("/get_data")
    @ResponseBody
    public List employeeGetData() {
        return employeeService.getAllEmployee();
    }
    //搜索条件
    @RequestMapping("/search_employee_by_employeeId")
    @ResponseBody
    public Map findEmployeeByEmployeeId(String searchValue,int page,int rows){

        return employeeService.findEmployeeByEmployeeId(searchValue,page,rows);
    }
    //搜索条件
    @RequestMapping("/search_employee_by_employeeName")
    @ResponseBody
    public Map findEmployeeByEmployeeName(String searchValue,int page,int rows){

        return employeeService.findEmployeeByEmployeeName(searchValue,page,rows);
    }
    //搜索条件
    @RequestMapping("/search_employee_by_departmentName")
    @ResponseBody
    public Map findEmployeeByDepartmentName(String searchValue,int page,int rows){

        return employeeService.findEmployeeByDepartmentName(searchValue,page,rows);
    }
    //插入按钮
    @RequestMapping("/add_judge")
    @ResponseBody
    public Map add_judge(){
        String msg = null;
        return publicMethodPart.judgeResult(msg);
    }

    @RequestMapping("/add")
    public String addEmployee(){
        return "employee_add";
    }

    @RequestMapping("/insert")
    public Map insertEmployee(Employee employee){
        boolean success = employeeService.insertEmployee(employee);
        return PublicMethodPart.optionSuccess(success);
    }
    //编辑按钮
    /*@RequestMapping("/edit_judge")
    @ResponseBody
    public Map edit_judge(){
        String msg = null;
        return publicMethodPart.judgeResult(msg);
    }*/
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
    public Map delete_batch_COrder(String[] ids){
        boolean success = employeeService.delete_batch_Employee(ids);
        return publicMethodPart.optionSuccess(success);
    }

    @RequestMapping("/update_all")
    @ResponseBody
    public Map update_all_Employee(Employee employee) {
        boolean success = employeeService.update_all_Employee(employee);
        return PublicMethodPart.optionSuccess(success);
    }

    @RequestMapping("/update_note")
    @ResponseBody
    public Map updateEmployeeNote(String note, String orderId) {
        boolean success = employeeService.updateEmployeeNote(note, orderId);
        return PublicMethodPart.optionSuccess(success);
    }
}
