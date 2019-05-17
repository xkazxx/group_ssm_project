package com.xkazxx.service;

import com.github.pagehelper.PageInfo;
import com.xkazxx.bean.UnqualifyApply;

public interface QualityService {

    PageInfo<UnqualifyApply> findAllUnqualifyProductsByPage(Integer pageNum ,Integer pageSize);
}
