package com.xkazxx.vo;

import com.xkazxx.bean.Department;
import com.xkazxx.bean.Employee;
/*根据人员id返回EmployeeAndDepartmentVo*/
public class EmployeeAndDepartmentVo extends Employee {

    private Department department;

    public EmployeeAndDepartmentVo(){}

    public EmployeeAndDepartmentVo(Department department){
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
