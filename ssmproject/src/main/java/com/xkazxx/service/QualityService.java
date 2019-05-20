package com.xkazxx.service;

import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.*;

import java.util.List;

public interface QualityService {

    PageInfo<UnqualifyProduct> findAllUnqualifyProductsByPage(Integer pageNum ,Integer pageSize);

    List<Department> getAllDepartment();

    int insert(UnqualifyApply unqualifyApply);

    PageInfo<UnqualifyProduct> search_unqualify_by_unqualifyId(String searchValue, int page, int rows);

    PageInfo<UnqualifyProduct> search_unqualify_by_productName(String searchValue, int page, int rows);

    int updateUnqualifyApply(UnqualifyApply unqualifyApply);

    int deleteUnqualifyApplyBatch(String[] ids);

    PageInfo<FinalMeasureCheck> findMeasurementByPage(int page, int rows);

    PageInfo<FinalMeasureCheck> search_fMeasureCheck_by_fMeasureCheckId(String searchValue, int page, int rows);

    PageInfo<FinalMeasureCheck> search_fMeasureCheck_by_orderId(String orderId, int page, int rows);

    int addFinalMeasureCheck(FinalMeasureCheck finalMeasureCheck);

    int updateFinalMeasureCheck(FinalMeasureCheck finalMeasureCheck);

    int deleteMeasure(String[] ids);

    PageInfo<FinalCountCheck> findAllCountCheckByPage(int page, int rows);

    int addFinalCountCheck(FinalCountCheck finalCountCheck);

    int updateFinalCountCheck(FinalCountCheck finalCountCheck);

    int deleteFinalCountCheck(String[] ids);

    PageInfo<FinalCountCheck> searchFCountCheckByCountCheckId(int page, int rows, String fCountCheckId);

    PageInfo<FinalCountCheck> searchFCountCheckByOrerId(String orderId, int page, int rows);

    PageInfo<ProcessMeasureCheck> findAllPMeasureCheck(int page, int rows);

    PageInfo<ProcessMeasureCheck> searchPMeasureCheckByPMeasureCheckId(String pMeasureCheckId, int page, int rows);
}
