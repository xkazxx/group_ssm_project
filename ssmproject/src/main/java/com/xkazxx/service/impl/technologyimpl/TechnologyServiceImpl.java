package com.xkazxx.service.impl.technologyimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.QueryVO;
import com.xkazxx.bean.Technology;
import com.xkazxx.mapper.TechnologyMapper;
import com.xkazxx.service.technologyservice.TechnologyService;
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
    public QueryVO findTechnologyAll(Integer page, Integer rows) {

        //设置分页信息
        PageHelper.startPage(page,rows);
        //执行查询
        List<Technology> list = technologyMapper.findTechnologyAll();
        //创建返回值对象
        QueryVO queryVO = new QueryVO();
        queryVO.setRows(list);
        //取分页结果
        PageInfo<Technology> pageInfo = new PageInfo<Technology>(list);
        //取总记录数
        int total = (int) pageInfo.getTotal();
        queryVO.setTotal(total);
        return queryVO;
    }

}
