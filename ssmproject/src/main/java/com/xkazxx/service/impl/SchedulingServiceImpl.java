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
    public Map findManufacture(int pageNum, int pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageNum,pageSize);

        PageInfo<Manufacture> pageInfo = new PageInfo<>(manufactureMapper.findManufacture(pageNum,pageSize));

        map.put("total",pageInfo.getTotal());
        map.put("rows", pageInfo.getList());
        return map;
    }

    @Override
    public Technology findTechnology(String id) {
        return technologyMapper.selectByPrimaryKey(id);
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
}
