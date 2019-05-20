package com.xkazxx.service;

import com.xkazxx.bean.Employee;


import java.util.List;
import java.util.Map;

public interface EmployeeService {
    Map findEmployees(int pageNum, int pageSize);
    Employee findEmployee(String id);
    List getAllEmployee();

    Map findEmployeeByEmployeeId(String searchValue, int pageNum, int pageSize);
    Map findEmployeeByEmployeeName(String searchValue, int pageNum, int pageSize);
    Map findEmployeeByDepartmentName(String searchValue, int pageNum, int pageSize);

    boolean insertEmployee(Employee employee);
    boolean editEmployee(Employee employee);


    boolean delete_batch_Employee(String[] ids);

    boolean update_all_Employee(Employee employee);
    boolean updateEmployeeNote(String note, String orderId);
}
