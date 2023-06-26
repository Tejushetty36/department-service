package com.netcracker.departmentservice.controller;

import com.netcracker.departmentservice.entity.Department;
import com.netcracker.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping(value = "/{deptId}")
    public Department getDeptById(@PathVariable("deptId") int deptId){
        return departmentService.getDeptById(deptId);
    }

    @PostMapping(value = "/")
    public String createDepartment(@RequestBody Department department){
        return departmentService.createDepartment(department);
    }

    @GetMapping(value = "/")
    public List<Department> findAllDepartments(){
        return departmentService.findAllDepartments();
    }

    @DeleteMapping(value = "/{deptId}")
    public String deleteDepartment(@PathVariable("deptId") int deptId){
        return departmentService.deleteDeptById(deptId);
    }
}
