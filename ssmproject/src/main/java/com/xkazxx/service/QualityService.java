package com.xkazxx.service;

import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.*;

import java.util.List;

public interface QualityService {

    PageInfo<UnqualifyProduct> findAllUnqualifyProductsByPage(Integer pageNum ,Integer pageSize);

    List<Product> getAllProduct();

    List<Employee> getAllEmployee();

    List<Department> getAllDepartment();

    int insert(UnqualifyApply unqualifyApply);
}
