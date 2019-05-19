package com.xkazxx.service;

import com.xkazxx.bean.COrder;
import com.xkazxx.bean.Custom;
import com.xkazxx.bean.Product;
import com.xkazxx.bean.Technology;

import java.util.List;
import java.util.Map;

public interface SchedulingService {

    Map findOrders(int pageNum, int pageSize);

    Map findWorks(int pageNum, int pageSize);

    Map findProducts(int pageNum, int pageSize);

    Map findTasks(int pageNum, int pageSize);

    Map findManufacture(int pageNum, int pageSize);

    Map findCustoms(int pageNum, int pageSize);

    Custom findCostom(String id);

    Product findProduct(String id);

    Technology findTechnology(String id);

    COrder findCOrder(String id);

    List getAllCustom();

    List getAllProduct();

    List getAllCOrder();

    Map findCOrderByCOrderProduct(String searchValue, int pageNum, int pageSize);

    Map findCOrderByCOrderCustom(String searchValue, int pageNum, int pageSize);

    Map findCOrderByCOrderId(String searchValue, int pageNum, int pageSize);

    Map findCustomByCustomId(String searchValue, int pageNum, int pageSize);

    Map findCustomByCustomName(String searchValue, int pageNum, int pageSize);

    Map findProductByProductId(String searchValue, int pageNum, int pageSize);

    Map findProductByProductName(String searchValue, int pageNum, int pageSize);

    Map findProductByProductType(String searchValue, int pageNum, int pageSize);

    Map findWorkByDevice(String searchValue, int pageNum, int pageSize);

    Map findWorkByWorkId(String searchValue, int pageNum, int pageSize);

    Map findWorkByProcess(String searchValue, int pageNum, int pageSize);

    Map findWorkByProduct(String searchValue, int pageNum, int pageSize);

    Map findManufactureByManufactureSn(String searchValue, int pageNum, int pageSize);

    Map findManufactureByManufactureOrderId(String searchValue, int pageNum, int pageSize);

    Map findManufactureByManufactureTechnologyName(String searchValue, int pageNum, int pageSize);

    Map findTaskByTaskId(String searchValue, int pageNum, int pageSize);

    Map findTaskByWorkId(String searchValue, int pageNum, int pageSize);

    Map findTaskByManufactureSn(String searchValue, int pageNum, int pageSize);

    boolean delete_batch(String[] ids);
}


