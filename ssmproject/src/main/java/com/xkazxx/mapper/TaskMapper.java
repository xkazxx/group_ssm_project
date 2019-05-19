package com.xkazxx.mapper;

import com.xkazxx.bean.Task;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskMapper {
    int deleteByPrimaryKey(String taskId);

    int insert(Task record);

    int insertSelective(Task record);

    Task selectByPrimaryKey(String taskId);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);

    List<Task> findTasks(int pageNum, int pageSize);

    List<Task> findTaskByTaskId(@Param("task_id") String searchValue,
                                @Param("pageNum") int pageNum,
                                @Param("pageSize") int pageSize);

    List<Task> findTaskByWorkId(@Param("work_id") String searchValue,
                                @Param("pageNum") int pageNum,
                                @Param("pageSize") int pageSize);

    List<Task> findTaskByManufactureSn(@Param("manufacture_sn") String searchValue,
                                       @Param("pageNum") int pageNum,
                                       @Param("pageSize") int pageSize);
}