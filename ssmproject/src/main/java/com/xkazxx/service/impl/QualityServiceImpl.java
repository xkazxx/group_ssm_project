package com.xkazxx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.*;
import com.xkazxx.mapper.*;
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

    @Autowired
    FinalMeasureCheckMapper finalMeasureCheckMapper;

    @Override
    public PageInfo<UnqualifyProduct> findAllUnqualifyProductsByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<UnqualifyProduct> products = unqualifyApplyMapper.findAllUnqualifyProducts();
        PageInfo<UnqualifyProduct> pageInfo = new PageInfo<>(products);
        return pageInfo;
    }

    @Override
    public List<Employee> getAllEmployee() { return employeeMapper.getAllEmployee(); }

    @Override
    public List<Department> getAllDepartment() { return departmentMapper.selectAllDepartment(); }

    @Override
    public int insert(UnqualifyApply unqualifyApply) {
        return unqualifyApplyMapper.insert(unqualifyApply);
    }

    @Override
    public PageInfo<UnqualifyProduct> search_unqualify_by_unqualifyId(String searchValue, int page, int rows) {
        PageHelper.startPage(page,rows);
        List<UnqualifyProduct> products = unqualifyApplyMapper.search_unqualify_by_unqualifyId(searchValue);
        PageInfo<UnqualifyProduct> pageInfo = new PageInfo<>(products);
        return pageInfo;
    }

    @Override
    public PageInfo<UnqualifyProduct> search_unqualify_by_productName(String searchValue, int page, int rows) {
        PageHelper.startPage(page,rows);
        List<UnqualifyProduct> products = unqualifyApplyMapper.search_unqualify_by_productName(searchValue);
        PageInfo<UnqualifyProduct> pageInfo = new PageInfo<>(products);
        return pageInfo;
    }

    @Override
    public int updateUnqualifyApply(UnqualifyApply unqualifyApply) {
        return unqualifyApplyMapper.updateByPrimaryKey(unqualifyApply);
    }

    @Override
    public int deleteUnqualifyApplyBatch(String[] ids) {
        int res = unqualifyApplyMapper.deleteUnqualifyApplyBatch(ids);
        if(res == ids.length){
            return 1;
        }
        return 0;
    }

    @Override
    public PageInfo<FinalMeasureCheck> findMeasurementByPage(int page, int rows) {
        PageHelper.startPage(page,rows);
        List<FinalMeasureCheck> products = finalMeasureCheckMapper.findMeasurementByPage();
        PageInfo<FinalMeasureCheck> pageInfo = new PageInfo<>(products);
        return pageInfo;
    }

    @Override
    public PageInfo<FinalMeasureCheck> search_fMeasureCheck_by_fMeasureCheckId(String searchValue, int page, int rows) {
        PageHelper.startPage(page,rows);
        List<FinalMeasureCheck> list = finalMeasureCheckMapper.search_fMeasureCheck_by_fMeasureCheckId(searchValue);
        PageInfo<FinalMeasureCheck> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<FinalMeasureCheck> search_fMeasureCheck_by_orderId(String orderId, int page, int rows) {
        PageHelper.startPage(page,rows);
        List<FinalMeasureCheck> list = finalMeasureCheckMapper.search_fMeasureCheck_by_orderId(orderId);
        PageInfo<FinalMeasureCheck> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public int addFinalMeasureCheck(FinalMeasureCheck finalMeasureCheck) {
        return finalMeasureCheckMapper.addFinalMeasureCheck(finalMeasureCheck);
    }
}
