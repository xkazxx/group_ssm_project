package com.xkazxx.mapper;

import com.xkazxx.bean.Work;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkMapper {
    int deleteByPrimaryKey(String workId);

    int insert(Work record);

    int insertSelective(Work record);

    Work selectByPrimaryKey(String workId);

    int updateByPrimaryKeySelective(Work record);

    int updateByPrimaryKey(Work record);

    List<Work> findWorks(int pageNum, int pageSize);

    int getTotalNum();

    List<Work> findWorkByDevice(@Param("device_name") String searchValue,
                                  @Param("pageNum") int pageNum,
                                  @Param("pageSize") int pageSize);

    List<Work> findWorkByWorkId(@Param("work_id") String searchValue,
                                  @Param("pageNum") int pageNum,
                                  @Param("pageSize") int pageSize);

    List<Work> findWorkByProcess(@Param("process_number") String searchValue,
                                   @Param("pageNum") int pageNum,
                                   @Param("pageSize") int pageSize);

    List<Work> findWorkByProduct(@Param("product_name") String searchValue,
                                   @Param("pageNum") int pageNum,
                                   @Param("pageSize") int pageSize);

    List<Work> getAllWork();

}