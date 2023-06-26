package com.netcracker.departmentservice.service;

import com.netcracker.departmentservice.entity.Department;
import com.netcracker.departmentservice.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    DepartmentRepo departmentRepository;

    @Override
    public Department getDeptById(int deptId) {
        return departmentRepository.findById(deptId).get();
    }

    @Override
    public String createDepartment(Department dept) {
        Department savedDeptObj = departmentRepository.save(dept);
        return "Department Object with id "+savedDeptObj.getDepartmentId()+" and Name "+savedDeptObj.getDepartmentName()+
                " has been saved to the database.";
    }

    @Override
    public List<Department> findAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public String deleteDeptById(int deptId) {
        if(departmentRepository.existsById(deptId)){
            departmentRepository.deleteById(deptId);
            return "Department with id "+deptId+" has been successfully deleted";
        }else{
            return "Department with id "+deptId+" doesn't exist in database";
        }
    }
}
