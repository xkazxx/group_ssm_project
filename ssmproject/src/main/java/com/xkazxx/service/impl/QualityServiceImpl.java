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

    @Autowired
    FinalCountCheckMapper finalCountCheckMapper;

    @Autowired
    ProcessMeasureCheckMapper processMeasureCheckMapper;

    @Autowired
    ProcessCountCheckMapper processCountCheckMapper;

    @Override
    public PageInfo<UnqualifyProduct> findAllUnqualifyProductsByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<UnqualifyProduct> products = unqualifyApplyMapper.findAllUnqualifyProducts();
        PageInfo<UnqualifyProduct> pageInfo = new PageInfo<>(products);
        return pageInfo;
    }

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

    @Override
    public int updateFinalMeasureCheck(FinalMeasureCheck finalMeasureCheck) {
        return finalMeasureCheckMapper.updateFinalMeasureCheck(finalMeasureCheck);
    }

    @Override
    public int deleteMeasure(String[] ids) {
        int res = finalMeasureCheckMapper.deleteMeasure(ids);
        if(ids.length == res){
            return 1;
        }
        return 0;
    }

    @Override
    public PageInfo<FinalCountCheck> findAllCountCheckByPage(int page, int rows) {
        PageHelper.startPage(page,rows);
        List<FinalCountCheck> list = finalCountCheckMapper.findAllCountCheckByPage();
        PageInfo<FinalCountCheck> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public int addFinalCountCheck(FinalCountCheck finalCountCheck) {
        return finalCountCheckMapper.insert(finalCountCheck);
    }

    @Override
    public int updateFinalCountCheck(FinalCountCheck finalCountCheck) {
        return finalCountCheckMapper.updateByPrimaryKey(finalCountCheck);
    }

    @Override
    public int deleteFinalCountCheck(String[] ids) {
        int res = finalCountCheckMapper.deleteFinalCountCheckBatch(ids);
        if(res == ids.length){
            return 1;
        }
        return 0;
    }

    @Override
    public PageInfo<FinalCountCheck> searchFCountCheckByCountCheckId(int page, int rows, String fCountCheckId) {
        PageHelper.startPage(page,rows);
        List<FinalCountCheck> list = finalCountCheckMapper.searchFCountCheckByCountCheckId(fCountCheckId);
        PageInfo<FinalCountCheck> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<FinalCountCheck> searchFCountCheckByOrerId(String orderId, int page, int rows) {
        PageHelper.startPage(page,rows);
        List<FinalCountCheck> list = finalCountCheckMapper.searchFCountCheckByOrerId(orderId);
        return new PageInfo<FinalCountCheck>(list);
    }

    @Override
    public PageInfo<ProcessMeasureCheck> findAllPMeasureCheck(int page, int rows) {
        PageHelper.startPage(page,rows);
        List<ProcessMeasureCheck> list = processMeasureCheckMapper.findAllPMeasureCheck();
        return new PageInfo<ProcessMeasureCheck>(list);
    }

    @Override
    public PageInfo<ProcessMeasureCheck> searchPMeasureCheckByPMeasureCheckId(String pMeasureCheckId, int page, int rows) {
        PageHelper.startPage(page,rows);
        List<ProcessMeasureCheck> list = processMeasureCheckMapper.searchPMeasureCheckByPMeasureCheckId(pMeasureCheckId);
        return new PageInfo<>(list);
    }

    @Override
    public int insertPMeasureCheck(ProcessMeasureCheck processMeasureCheck) {
        return processMeasureCheckMapper.insert(processMeasureCheck);
    }

    @Override
    public int updatePMeasureCheck(ProcessMeasureCheck processMeasureCheck) {
        return processMeasureCheckMapper.updateByPrimaryKey(processMeasureCheck);
    }

    @Override
    public int deletePMeasureCheckBatch(String[] ids) {
        int res = processMeasureCheckMapper.deletePMeasureCheckBatch(ids);
        if(res == ids.length){
            return 1;
        }
        return 0;
    }

    @Override
    public PageInfo<ProcessCountCheck> findAllPCountCheck(int page, int rows) {
        PageHelper.startPage(page,rows);
        List<ProcessCountCheck> list = processCountCheckMapper.findAllPCountCheck();
        return new PageInfo<>(list);
    }

    @Override
    public PageInfo<ProcessCountCheck> searchPCountCheckByPCountCheckId(String pCountCheckId, int page, int rows) {
        PageHelper.startPage(page,rows);
        List<ProcessCountCheck> list = processCountCheckMapper.searchPCountCheckByPCountCheckId(pCountCheckId);
        return new PageInfo<>(list);
    }

    @Override
    public int insertPCountCheck(ProcessCountCheck processCountCheck) {
        return processCountCheckMapper.insert(processCountCheck);
    }

    @Override
    public int undatePCountCheck(ProcessCountCheck processCountCheck) {
        return processCountCheckMapper.updateByPrimaryKey(processCountCheck);
    }

    @Override
    public int deletePCountCheckBatch(String[] ids) {
        int res = processCountCheckMapper.deletePCountCheckBatch(ids);
        if(res == ids.length){
            return 1;
        }
        return 0;
    }
}
