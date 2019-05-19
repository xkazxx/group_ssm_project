package com.xkazxx.mapper;

import com.xkazxx.bean.Custom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomMapper {
    int deleteByPrimaryKey(String customId);

    int insert(Custom record);

    int insertSelective(Custom record);

    Custom selectByPrimaryKey(String customId);

    List<Custom> findCustoms(int pageNum, int pageSize);

    int updateByPrimaryKeySelective(Custom record);

    int updateByPrimaryKey(Custom record);

    List<Custom> getAllCustom();

    List<Custom> findCustomByCustomId(@Param("custom_id") String searchValue,
                                      @Param("pageNum") int pageNum,
                                      @Param("pageSize") int pageSize);

    List<Custom> findCustomByCustomName(@Param("custom_name") String searchValue,
                                        @Param("pageNum") int pageNum,
                                        @Param("pageSize") int pageSize);
}