package com.xkazxx.service.impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.Employee;
import com.xkazxx.mapper.EmployeeMapper;
import com.xkazxx.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public Map findEmployees(int pageNum, int pageSize) {

        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);
        PageInfo<Employee> pageInfo =
                new PageInfo<>(employeeMapper.findEmployees(pageNum,pageSize));

        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public Employee findEmployee(String id) {       //
        return employeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List getAllEmployee() {             //
        return employeeMapper.getAllEmployee();
    }

    @Override
    public Map findEmployeeByEmployeeId(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Employee> pageInfo = new PageInfo<>(employeeMapper.findEmployeeByEmployeeId(searchValue,pageNum,pageSize));

        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public Map findEmployeeByEmployeeName(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Employee> pageInfo = new PageInfo<>(employeeMapper.findEmployeeByEmployeeName(searchValue,pageNum,pageSize));

        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public Map findEmployeeByDepartmentName(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Employee> pageInfo = new PageInfo<>(employeeMapper.findEmployeeByDepartmentName(searchValue,pageNum,pageSize));

        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public boolean insertEmployee(Employee employee) {
        int insert = employeeMapper.insert(employee);
        return insert == 1;
    }

    @Override
    public boolean editEmployee(Employee employee) {
        return false;
    }

    @Override
    public boolean updateEmployeeNote(String note, String orderId) {
        return false;
    }

    @Override
    public boolean delete_batch_Employee(String[] ids) {
        return ids.length == employeeMapper.delete_batch_Employee(ids);
    }

    @Override
    public boolean update_all_Employee(Employee employee) {
        return 1 == employeeMapper.updateByPrimaryKey(employee);
    }


}
