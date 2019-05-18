package com.xkazxx.service.impl;

import com.xkazxx.bean.Technology;
import com.xkazxx.mapper.TechnologyMapper;
import com.xkazxx.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author alan.zhang
 */
@Service
public class TechnologyServiceImpl implements TechnologyService {

    @Autowired
    private TechnologyMapper technologyMapper;

    @Override
    public List<Technology> findTechnologyAll() {
        List<Technology> technologyAll = technologyMapper.findTechnologyAll();
        return technologyAll;
    }
}
