package com.xkazxx.mapper;

import com.xkazxx.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User queryUserById(@Param("username") String username,
                       @Param("password") String password);
}
