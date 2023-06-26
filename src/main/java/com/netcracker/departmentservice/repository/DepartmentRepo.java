package com.netcracker.departmentservice.repository;

import com.netcracker.departmentservice.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends MongoRepository<Department,Integer> {
}
