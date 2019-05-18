package com.xkazxx.mapper;

import com.xkazxx.bean.Task;

import java.util.List;

public interface TaskMapper {
    int deleteByPrimaryKey(String taskId);

    int insert(Task record);

    int insertSelective(Task record);

    Task selectByPrimaryKey(String taskId);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);

    List<Task> findTasks(int pageNum, int pageSize);
}