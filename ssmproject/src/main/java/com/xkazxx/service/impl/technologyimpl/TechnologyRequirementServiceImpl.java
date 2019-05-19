package com.xkazxx.service.impl.technologyimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.QueryVO;
import com.xkazxx.bean.TechnologyRequirementCustom;
import com.xkazxx.mapper.TechnologyRequirementMapper;
import com.xkazxx.service.technologyservice.TechnologyRequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author alan.zhang
 */
@Service
public class TechnologyRequirementServiceImpl implements TechnologyRequirementService {

    @Autowired
    private TechnologyRequirementMapper technologyRequirementMapper;

    @Override
    public QueryVO findTechnologyRequirementAndTechnologyName(Integer page, Integer rows) {
        //设置分页信息
        PageHelper.startPage(page,rows);
        //执行查询
        List<TechnologyRequirementCustom> list = technologyRequirementMapper.selectTechnologyRequirementAndTechnologyName();
        //创建返回值对象
        QueryVO queryVO = new QueryVO();
        queryVO.setRows(list);
        //取分页结果
        PageInfo<TechnologyRequirementCustom> pageInfo = new PageInfo<>(list);
        //取总记录数
        int total = (int) pageInfo.getTotal();
        queryVO.setTotal(total);
        return queryVO;
    }
}
