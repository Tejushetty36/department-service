package com.netcracker.departmentservice.service;

import com.netcracker.departmentservice.entity.Department;

import java.util.List;

public interface DepartmentService {

    public Department getDeptById(int deptId);
    public String createDepartment(Department dept);
    public List<Department> findAllDepartments();
    public String deleteDeptById(int deptId);
}
