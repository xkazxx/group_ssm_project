package com.xkazxx.mapper;

import com.xkazxx.bean.FinalMeasureCheck;
import com.xkazxx.bean.UnqualifyApply;
import com.xkazxx.bean.UnqualifyProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UnqualifyApplyMapper {
    int deleteByPrimaryKey(String unqualifyApplyId);

    int insert(UnqualifyApply record);

    int insertSelective(UnqualifyApply record);

    UnqualifyApply selectByPrimaryKey(String unqualifyApplyId);

    int updateByPrimaryKeySelective(UnqualifyApply record);

    int updateByPrimaryKey(UnqualifyApply record);

    List<UnqualifyProduct> findAllUnqualifyProducts();

    List<UnqualifyProduct> search_unqualify_by_unqualifyId(@Param("unqualify_apply_id") String searchValue);

    List<UnqualifyProduct> search_unqualify_by_productName(@Param("productName") String searchValue);

    int deleteUnqualifyApplyBatch(@Param("ids") String[] ids);

}