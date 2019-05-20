package com.xkazxx.service.impl;

import com.xkazxx.bean.SysUser;
import com.xkazxx.mapper.SysUserMapper;
import com.xkazxx.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser login(String username, String password) {
        return sysUserMapper.getUerByNameAndword(username,password);
    }
}
