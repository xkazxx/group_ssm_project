package com.xkazxx.service;

import com.xkazxx.bean.COrder;
import com.xkazxx.bean.Custom;
import com.xkazxx.bean.Product;
import com.xkazxx.bean.Technology;

import java.util.List;
import java.util.Map;

public interface SchedulingService {

    Map findOrders(int pageNum, int pageSize);

    Custom findCostom(String id);

    Product findProduct(String id);

    Map findWorks(int pageNum, int pageSize);

    Map findProducts(int pageNum, int pageSize);

    Map findTasks(int pageNum, int pageSize);

    Map findManufacture(int pageNum, int pageSize);

    Technology findTechnology(String id);

    COrder findCOrder(String id);

    List getAllCustom();

    List getAllProduct();

    List getAllCOrder();
}

