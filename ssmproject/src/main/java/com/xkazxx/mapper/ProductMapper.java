package com.xkazxx.mapper;

import com.xkazxx.bean.Product;

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
}