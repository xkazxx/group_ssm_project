package com.xkazxx.mapper;

import com.xkazxx.bean.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(String departmentId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(String departmentId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    List<Department> selectAllDepartment();
    List<Department> findDepartments(@Param("pageNum") int pageNum,
                                 @Param("pageSize") int pageSize);


    List<Department> findDepartmentByDepartmentId(@Param("department_id") String searchValue,
                                            @Param("pageNum") int pageNum,
                                            @Param("pageSize") int pageSize);

    List<Department> findDepartmentByDepartmentName(@Param("department_name") String searchValue,
                                              @Param("pageNum") int pageNum,
                                              @Param("pageSize") int pageSize);

    int delete_batch_Employee(@Param("ids") String[] ids);
}