package com.xkazxx.service;

import com.xkazxx.bean.SysUser;

public interface HomeService {

    SysUser login(String username, String password);
}
