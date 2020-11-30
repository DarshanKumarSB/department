package com.bezkoder.spring.data.mongodb.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.bezkoder.spring.data.mongodb.model.Department;

public interface DepartmentRepository extends MongoRepository<Department, String> {
  
}
