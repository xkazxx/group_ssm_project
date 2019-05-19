package com.xkazxx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.*;
import com.xkazxx.mapper.DepartmentMapper;
import com.xkazxx.mapper.EmployeeMapper;
import com.xkazxx.mapper.ProductMapper;
import com.xkazxx.mapper.UnqualifyApplyMapper;
import com.xkazxx.service.QualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zachary Zhao
 * @create 2019-05-17 20:21
 */
@Service
public class QualityServiceImpl implements QualityService {

    @Autowired
    UnqualifyApplyMapper unqualifyApplyMapper;

    @Autowired
    ProductMapper productMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public PageInfo<UnqualifyProduct> findAllUnqualifyProductsByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<UnqualifyProduct> products = unqualifyApplyMapper.findAllUnqualifyProducts();
        PageInfo<UnqualifyProduct> pageInfo = new PageInfo<>(products);
        return pageInfo;
    }

    @Override
    public List<Product> getAllProduct() { return productMapper.getAllProduct(); }

    @Override
    public List<Employee> getAllEmployee() { return employeeMapper.getAllEmployee(); }

    @Override
    public List<Department> getAllDepartment() { return departmentMapper.getAllDepartment(); }

    @Override
    public int insert(UnqualifyApply unqualifyApply) {
        return unqualifyApplyMapper.insert(unqualifyApply);
    }
}
