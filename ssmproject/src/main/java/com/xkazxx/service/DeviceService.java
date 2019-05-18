package com.xkazxx.service;


import com.xkazxx.vo.ResponseVo;

import java.util.Map;

public interface DeviceService {

    <T>ResponseVo setMap(int page, int rows, Class<?> T);

}
