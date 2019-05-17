package com.xkazxx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.UnqualifyApply;
import com.xkazxx.mapper.UnqualifyApplyMapper;
import com.xkazxx.service.QualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zachary Zhao
 * @create 2019-05-17 20:21
 */
@Service
public class QualityServiceImpl implements QualityService {

    @Autowired
    UnqualifyApplyMapper unqualifyApplyMapper;

    @Override
    public PageInfo<UnqualifyApply> findAllUnqualifyProductsByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<UnqualifyApply> products = unqualifyApplyMapper.findAllUnqualifyProducts();
        PageInfo<UnqualifyApply> pageInfo = new PageInfo<>(products);
        return pageInfo;
    }
}
