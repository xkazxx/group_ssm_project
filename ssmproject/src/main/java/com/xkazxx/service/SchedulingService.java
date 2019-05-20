package com.xkazxx.service;

import com.xkazxx.bean.*;

import java.util.List;
import java.util.Map;

public interface SchedulingService {

    Map findOrders(int pageNum, int pageSize);

    Map findWorks(int pageNum, int pageSize);

    Map findProducts(int pageNum, int pageSize);

    Map findTasks(int pageNum, int pageSize);

    Map findManufactures(int pageNum, int pageSize);

    Map findCustoms(int pageNum, int pageSize);

    Custom findCostom(String id);

    Product findProduct(String id);

    Work findWork(String id);

    COrder findCOrder(String id);

    List getAllCustom();

    List getAllProduct();

    List getAllCOrder();

    List<Work> getAllWork();

    List<Manufacture> getAllManufacture();

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

    boolean delete_batch_COrder(String[] ids);

    boolean insertCustom(Custom custom);

    boolean delete_batch_Custom(String[] ids);

    boolean update_all_Custom(Custom custom);

    boolean insertTask(Task task);

    boolean update_all_Task(Task task);

    boolean delete_batch_Task(String[] ids);

    boolean insertProduct(Product product);

    boolean update_all_Product(Product product);

    boolean delete_batch_Product(String[] ids);

    Manufacture findManufacture(String id);

    boolean updateCustomNote(String s, String note);

    boolean updateProductNote(String note, String productId);

    boolean updateWorkById(Work work);

    boolean updateManufactureById(Manufacture manufacture);

    boolean update_all_COrder(COrder cOrder);

    boolean updateCOrderNote(String note, String orderId);

    boolean insertManufacture(Manufacture manufacture);

    boolean delete_batch_Manufacture(String[] ids);

    boolean insertCOrder(COrder cOrder);

    boolean editCOrder(COrder cOrder);

    boolean insertWork(Work work);

    boolean editWork(Work work);

    boolean delete_batch_Work(String[] ids);
}


