package com.xkazxx.service;

import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.*;

import java.util.List;

public interface QualityService {

    PageInfo<UnqualifyProduct> findAllUnqualifyProductsByPage(Integer pageNum ,Integer pageSize);

    List<Employee> getAllEmployee();

    List<Department> getAllDepartment();

    int insert(UnqualifyApply unqualifyApply);

    PageInfo<UnqualifyProduct> search_unqualify_by_unqualifyId(String searchValue, int page, int rows);

    PageInfo<UnqualifyProduct> search_unqualify_by_productName(String searchValue, int page, int rows);

    int updateUnqualifyApply(UnqualifyApply unqualifyApply);
}
