package com.xkazxx.service;

import com.xkazxx.bean.Department;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface DepartmentService {
    Map findDepartments(int pageNum, int pageSize);
    Department findDepartment(String id);
    List getAllDepartment();

    Map findDepartmentByDepartmentId(String searchValue, int pageNum, int pageSize);
    Map findDepartmentByDepartmentName(String searchValue, int pageNum, int pageSize);


    boolean insertDepartment(Department department);
    boolean editDepartment(Department department);


    boolean delete_batch_Department(String[] ids);

    boolean update_all_Department(Department department);
    boolean updateDepartmentNote(String note, String departmentId);
}
