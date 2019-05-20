package com.xkazxx.mapper;

import com.xkazxx.bean.COrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface COrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(COrder record);

    int insertSelective(COrder record);

    COrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(COrder record);

    int updateByPrimaryKey(COrder record);

    int getTotalNum();

    List<COrder> findOrders(@Param("pageNum") int pageNum,
                            @Param("pageSize") int pageSize);

    List<COrder> getAllCOrder();

    List<COrder> findCOrderByCOrderId(@Param("order_id") String searchValue,
                                      @Param("pageNum") int pageNum,
                                      @Param("pageSize") int pageSize);

    List<COrder> findCOrderByCOrderCustom(@Param("custom_name") String searchValue,
                                          @Param("pageNum") int pageNum,
                                          @Param("pageSize") int pageSize);

    List<COrder> findCOrderByCOrderProduct(@Param("product_name") String searchValue,
                                           @Param("pageNum") int pageNum,
                                           @Param("pageSize") int pageSize);

    int delete_batch_COrder(@Param("ids") String[] ids);

    boolean updateCOrderNote(@Param("note") String note,
                             @Param("orderId") String orderId);

}