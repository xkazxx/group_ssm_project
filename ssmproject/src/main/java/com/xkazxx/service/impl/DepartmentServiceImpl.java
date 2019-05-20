package com.xkazxx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.Department;
import com.xkazxx.mapper.DepartmentMapper;
import com.xkazxx.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    @Override
    public Map findDepartments(int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);
        PageInfo<Department> pageInfo =
                new PageInfo<>(departmentMapper.findDepartments(pageNum,pageSize));
        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public Department findDepartment(String id) {
        return departmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List getAllDepartment() {
        return departmentMapper.selectAllDepartment();
    }

    @Override
    public Map findDepartmentByDepartmentId(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Department> pageInfo = new PageInfo<>(departmentMapper.findDepartmentByDepartmentId(searchValue,pageNum,pageSize));

        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public Map findDepartmentByDepartmentName(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Department> pageInfo = new PageInfo<>(departmentMapper.findDepartmentByDepartmentName(searchValue,pageNum,pageSize));

        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public boolean insertDepartment(Department department) {
        int insert = departmentMapper.insertSelective(department);
        return insert == 1;
    }

    @Override
    public boolean editDepartment(Department department) {
        return false;
    }

    @Override
    public boolean delete_batch_Department(String[] ids) {
        return false;
    }

    @Override
    public boolean update_all_Department(Department department) {
        return 1 == departmentMapper.updateByPrimaryKey(department);
    }

    @Override
    public boolean updateDepartmentNote(String note, String departmentId) {
        return false;
    }
}
