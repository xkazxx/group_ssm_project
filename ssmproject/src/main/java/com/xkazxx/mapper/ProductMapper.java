package com.xkazxx.mapper;

import com.xkazxx.bean.Product;
import com.xkazxx.bean.UnqualifyProduct;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(String productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> findProducts(int pageNum, int pageSize);

    int getTotalNum();

    List<Product> getAllProduct();

    List<Product> findProductByProductId( @Param("product_id") String searchValue,
                                          @Param("pageNum") int pageNum,
                                          @Param("pageSize") int pageSize);

    List<Product> findProductByProductName(@Param("product_name") String searchValue,
                                           @Param("pageNum") int pageNum,
                                           @Param("pageSize") int pageSize);

    List<Product> findProductByProductType(@Param("product_type") String searchValue,
                                           @Param("pageNum") int pageNum,
                                           @Param("pageSize") int pageSize);
}