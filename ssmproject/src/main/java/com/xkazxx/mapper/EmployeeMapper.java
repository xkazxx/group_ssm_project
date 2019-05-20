package com.xkazxx.mapper;

import com.xkazxx.bean.Employee;
import com.xkazxx.vo.EmployeeAndDepartmentVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(String empId);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(String empId);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);



    List<Employee> getAllEmployee();

    Employee selectEmployeeAndDepartmentByPrimarkId(String empid);
    /*根据人员id返回EmployeeAndDepartmentVo*/
    EmployeeAndDepartmentVo selectEmployeeAndDepartmentById(String empId);

    List<Employee> findEmployees(@Param("pageNum") int pageNum,
                            @Param("pageSize") int pageSize);


    List<Employee> findEmployeeByEmployeeId(@Param("emp_id") String searchValue,
                                      @Param("pageNum") int pageNum,
                                      @Param("pageSize") int pageSize);

    List<Employee> findEmployeeByEmployeeName(@Param("emp_name") String searchValue,
                                          @Param("pageNum") int pageNum,
                                          @Param("pageSize") int pageSize);

    List<Employee> findEmployeeByDepartmentName(@Param("department_name") String searchValue,
                                           @Param("pageNum") int pageNum,
                                           @Param("pageSize") int pageSize);

    List<EmployeeAndDepartmentVo> selectEmployeeAndDepartment();

    int delete_batch_Employee(@Param("ids") String[] ids);
    boolean updateEmployeeNote(@Param("note") String note,
                             @Param("orderId") String orderId);

}
