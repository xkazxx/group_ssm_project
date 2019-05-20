package com.xkazxx.mapper;

import com.xkazxx.bean.FinalMeasureCheck;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinalMeasureCheckMapper {

    List<FinalMeasureCheck> findMeasurementByPage();

    List<FinalMeasureCheck> search_fMeasureCheck_by_fMeasureCheckId(@Param("f_measure_check_id") String searchValue);

    List<FinalMeasureCheck> search_fMeasureCheck_by_orderId(@Param("order_id") String orderId);

    int addFinalMeasureCheck(@Param("finalMeasureCheck") FinalMeasureCheck finalMeasureCheck);

    int updateFinalMeasureCheck(@Param("record") FinalMeasureCheck finalMeasureCheck);
}
