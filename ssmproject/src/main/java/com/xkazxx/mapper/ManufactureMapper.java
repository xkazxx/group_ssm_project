package com.xkazxx.mapper;

import com.xkazxx.bean.Manufacture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManufactureMapper {
    int deleteByPrimaryKey(String manufactureSn);

    int insert(Manufacture record);

    int insertSelective(Manufacture record);

    Manufacture selectByPrimaryKey(String manufactureSn);

    int updateByPrimaryKeySelective(Manufacture record);

    int updateByPrimaryKey(Manufacture record);

    List<Manufacture> findManufacture(int pageNum, int pageSize);

    List<Manufacture> findManufactureByManufactureSn(@Param("manufacture_sn") String searchValue,
                                                     @Param("pageNum") int pageNum,
                                                     @Param("pageSize") int pageSize);

    List<Manufacture> findManufactureByManufactureOrderId(@Param("order_id") String searchValue,
                                                          @Param("pageNum") int pageNum,
                                                          @Param("pageSize") int pageSize);

    List<Manufacture> findManufactureByManufactureTechnologyName(@Param("technology_name") String searchValue,
                                                                 @Param("pageNum") int pageNum,
                                                                 @Param("pageSize") int pageSize);
}