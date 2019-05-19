package com.xkazxx.service.impl.technologyimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.QueryVO;
import com.xkazxx.bean.TechnologyPlan;
import com.xkazxx.bean.TechnologyPlanCustom;
import com.xkazxx.mapper.TechnologyPlanMapper;
import com.xkazxx.service.technologyservice.TechnologyPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author alan.zhang
 */
@Service
public class TechnologyPlanServiceImpl implements TechnologyPlanService {

    @Autowired
    private TechnologyPlanMapper technologyPlanMapper;

    /**
     * 工艺计划表和工艺表查询
     * 展示计划页面
     *
     * @param page
     * @param rows
     * @return
     */
    @Override
    public QueryVO findTechnologyPlanAndTechnologyName(Integer page, Integer rows) {
        //设置分页信息
        PageHelper.startPage(page, rows);
        List<TechnologyPlanCustom> list = technologyPlanMapper.selectTechnologyPlanAndTechnologyName();
        QueryVO queryVO = new QueryVO();
        queryVO.setRows(list);
        //获取分页结果哦
        PageInfo<TechnologyPlanCustom> pageInfo = new PageInfo<>(list);
        int total = (int) pageInfo.getTotal();
        queryVO.setTotal(total);
        return queryVO;
    }
}
