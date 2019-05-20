package com.xkazxx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.*;
import com.xkazxx.mapper.*;
import com.xkazxx.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SchedulingServiceImpl implements SchedulingService {

    @Autowired
    COrderMapper cOrderMapper;

    @Autowired
    CustomMapper customMapper;

    @Autowired
    ProductMapper productMapper;

    @Autowired
    WorkMapper workMapper;

    @Autowired
    TaskMapper taskMapper;

    @Autowired
    ManufactureMapper manufactureMapper;

    @Autowired
    TechnologyMapper technologyMapper;


    @Override
    public Map findOrders(int pageNum,int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<COrder> pageInfo =
                new PageInfo<>(cOrderMapper.findOrders(pageNum,pageSize));

        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;

    }

    @Override
    public Map findCustoms(int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Custom> pageInfo =
                new PageInfo<>(customMapper.findCustoms(pageNum,pageSize));

        map.put("total",pageInfo.getTotal());
        map.put("rows", pageInfo.getList());
        return map;
    }

    @Override
    public Map findWorks(int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Work> pageInfo =
                new PageInfo<>(workMapper.findWorks(pageNum,pageSize));
        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public Map findProducts(int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Product> pageInfo =
                new PageInfo<>(productMapper.findProducts(pageNum,pageSize));
        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public Map findTasks(int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Task> pageInfo = new PageInfo<>(taskMapper.findTasks(pageNum,pageSize));

        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public Custom findCostom(String id) {
        return customMapper.selectByPrimaryKey(id);
    }

    @Override
    public Product findProduct(String id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public Manufacture findManufacture(String id) {
        return manufactureMapper.selectByPrimaryKey(id);
    }

    @Override
    public Map findManufactures(int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Manufacture> pageInfo = new PageInfo<>(manufactureMapper.findManufactures(pageNum,pageSize));

        map.put("total",pageInfo.getTotal());
        map.put("rows", pageInfo.getList());
        return map;
    }

    @Override
    public Work findWork(String id) {
        return workMapper.selectByPrimaryKey(id);
    }

    @Override
    public COrder findCOrder(String id) {
        return cOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public List getAllCustom() {
        return customMapper.getAllCustom();
    }

    @Override
    public List getAllProduct() {
        return productMapper.getAllProduct();
    }

    @Override
    public List getAllCOrder() {
        return cOrderMapper.getAllCOrder();
    }

    @Override
    public List<Work> getAllWork() {
        return workMapper.getAllWork();
    }

    @Override
    public List<Manufacture> getAllManufacture() {
        return manufactureMapper.getAllManufacture();
    }

    @Override
    public Map findCOrderByCOrderProduct(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<COrder> pageInfo = new PageInfo<>(cOrderMapper.findCOrderByCOrderProduct(searchValue,pageNum,pageSize));

        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public Map findCOrderByCOrderCustom(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<COrder> pageInfo = new PageInfo<>(cOrderMapper.findCOrderByCOrderCustom(searchValue,pageNum,pageSize));

        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public Map findCOrderByCOrderId(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<COrder> pageInfo = new PageInfo<>(cOrderMapper.findCOrderByCOrderId(searchValue,pageNum,pageSize));

        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public Map findCustomByCustomId(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Custom> pageInfo = new PageInfo<>(customMapper.findCustomByCustomId(searchValue,pageNum,pageSize));

        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public Map findCustomByCustomName(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Custom> pageInfo = new PageInfo<>(customMapper.findCustomByCustomName(searchValue,pageNum,pageSize));

        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public Map findProductByProductId(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Product> pageInfo = new PageInfo<>(productMapper.findProductByProductId(searchValue,pageNum,pageSize));

        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public Map findProductByProductName(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Product> pageInfo = new PageInfo<>(productMapper.findProductByProductName(searchValue,pageNum,pageSize));

        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public Map findProductByProductType(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Product> pageInfo = new PageInfo<>(productMapper.findProductByProductType(searchValue,pageNum,pageSize));

        map.put("rows", pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @Override
    public Map findWorkByDevice(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Work> pageInfo = new PageInfo<>(workMapper.findWorkByDevice(searchValue,pageNum,pageSize));

        map.put("total",pageInfo.getTotal());
        map.put("rows", pageInfo.getList());
        return map;
    }

    @Override
    public Map findWorkByWorkId(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Work> pageInfo = new PageInfo<>(workMapper.findWorkByWorkId(searchValue,pageNum,pageSize));

        map.put("total",pageInfo.getTotal());
        map.put("rows", pageInfo.getList());
        return map;
    }

    @Override
    public Map findWorkByProcess(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Work> pageInfo = new PageInfo<>(workMapper.findWorkByProcess(searchValue,pageNum,pageSize));

        map.put("total",pageInfo.getTotal());
        map.put("rows", pageInfo.getList());
        return map;
    }

    @Override
    public Map findWorkByProduct(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Work> pageInfo = new PageInfo<>(workMapper.findWorkByProduct(searchValue,pageNum,pageSize));

        map.put("total",pageInfo.getTotal());
        map.put("rows", pageInfo.getList());
        return map;
    }

    @Override
    public Map findManufactureByManufactureSn(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Manufacture> pageInfo = new PageInfo<>(manufactureMapper.findManufactureByManufactureSn(searchValue,pageNum,pageSize));

        map.put("total",pageInfo.getTotal());
        map.put("rows", pageInfo.getList());
        return map;
    }

    @Override
    public Map findManufactureByManufactureOrderId(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Manufacture> pageInfo = new PageInfo<>(manufactureMapper.findManufactureByManufactureOrderId(searchValue,pageNum,pageSize));

        map.put("total",pageInfo.getTotal());
        map.put("rows", pageInfo.getList());
        return map;
    }

    @Override
    public Map findManufactureByManufactureTechnologyName(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Manufacture> pageInfo = new PageInfo<>(manufactureMapper.findManufactureByManufactureTechnologyName(searchValue,pageNum,pageSize));

        map.put("total",pageInfo.getTotal());
        map.put("rows", pageInfo.getList());
        return map;
    }

    @Override
    public Map findTaskByTaskId(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Task> pageInfo = new PageInfo<>(taskMapper.findTaskByTaskId(searchValue,pageNum,pageSize));

        map.put("total",pageInfo.getTotal());
        map.put("rows", pageInfo.getList());
        return map;
    }

    @Override
    public Map findTaskByWorkId(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Task> pageInfo = new PageInfo<>(taskMapper.findTaskByWorkId(searchValue,pageNum,pageSize));

        map.put("total",pageInfo.getTotal());
        map.put("rows", pageInfo.getList());
        return map;
    }

    @Override
    public Map findTaskByManufactureSn(String searchValue, int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Task> pageInfo = new PageInfo<>(taskMapper.findTaskByManufactureSn(searchValue,pageNum,pageSize));

        map.put("total",pageInfo.getTotal());
        map.put("rows", pageInfo.getList());
        return map;
    }


    @Override
    public boolean delete_batch_COrder(String[] ids) {
        int i = cOrderMapper.delete_batch_COrder(ids);
        return i == ids.length;
    }

    @Override
    public boolean insertCustom(Custom custom) {
        int insert = customMapper.insertSelective(custom);
        return insert == 1;
    }

    @Override
    public boolean delete_batch_Custom(String[] ids) {
        return ids.length == customMapper.delete_batch_Custom(ids);
    }

    @Override
    public boolean update_all_Custom(Custom custom) {
        return 1 == customMapper.updateByPrimaryKey(custom);
    }

    @Override
    public boolean insertTask(Task task) {
        return 1 == taskMapper.insertSelective(task);
    }

    @Override
    public boolean update_all_Task(Task task) {
        return 1 == taskMapper.updateByPrimaryKey(task);
    }

    @Override
    public boolean delete_batch_Task(String[] ids) {
        return ids.length == taskMapper.delete_batch_Task(ids);
    }

    @Override
    public boolean insertProduct(Product product) {
        return 1 == productMapper.insertSelective(product);
    }

    @Override
    public boolean update_all_Product(Product product) {
        return 1 == productMapper.updateByPrimaryKey(product);
    }

    @Override
    public boolean delete_batch_Product(String[] ids) {

        return ids.length == productMapper.delete_batch_Product(ids);
    }

    @Override
    public boolean updateCustomNote(String note,String customId) {
        return 1 == customMapper.updateCustomNote(note,customId);
    }

    @Override
    public boolean updateProductNote(String note, String productId) {
        return 1 == productMapper.updateProductNote(note,productId);
    }

    @Override
    public boolean updateWorkById(Work work) {
        return 1 == workMapper.updateByPrimaryKeySelective(work);
    }

    @Override
    public boolean updateManufactureById(Manufacture manufacture) {
        return 1 == manufactureMapper.updateByPrimaryKeySelective(manufacture);
    }

    @Override
    public boolean update_all_COrder(COrder cOrder) {
        return 1 == cOrderMapper.updateByPrimaryKeySelective(cOrder);
    }

    @Override
    public boolean updateCOrderNote(String note, String orderId) {
        return cOrderMapper.updateCOrderNote(note,orderId);
    }

    @Override
    public boolean insertManufacture(Manufacture manufacture) {
        return 1 == manufactureMapper.insertSelective(manufacture);
    }

    @Override
    public boolean delete_batch_Manufacture(String[] ids) {
        return ids.length == manufactureMapper.delete_batch_Manufacture(ids);
    }

    @Override
    public boolean insertCOrder(COrder cOrder) {
        return 1 == cOrderMapper.insertSelective(cOrder);
    }

    @Override
    public boolean editCOrder(COrder cOrder) {
        return 1 == cOrderMapper.updateByPrimaryKeySelective(cOrder);
    }

    @Override
    public boolean insertWork(Work work) {
        return 1 == workMapper.insertSelective(work);
    }

    @Override
    public boolean editWork(Work work) {
        return 1 == workMapper.updateByPrimaryKeySelective(work);
    }

    @Override
    public boolean delete_batch_Work(String[] ids) {
        return ids.length == workMapper.delete_batch_Work(ids);
    }

}
