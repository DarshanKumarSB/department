package com.bezkoder.spring.data.mongodb.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.data.mongodb.model.Department;
import com.bezkoder.spring.data.mongodb.repository.DepartmentRepository;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/api")
public class DepartmentController {

  @Autowired
  DepartmentRepository departmentRepository;

  @PostMapping("/createDepartment")
  public ResponseEntity<Department> createDepartment(@RequestBody Department tutorial) {
    try {
      Department _tutorial = departmentRepository.save(tutorial);
      return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
  
    @GetMapping("/department/{id}")
    public ResponseEntity<Department> getDepartmentById(String id)
    {
    	Optional<Department> departmentData = departmentRepository.findById(id);
    	
    	if(departmentData.isPresent()) {
    	return new ResponseEntity<> (departmentData.get(),HttpStatus.OK);
    	} else {
    		return new ResponseEntity<> (HttpStatus.NOT_FOUND);
    	}
    }
    
    @GetMapping("/allDepartments")
    public ResponseEntity<List<Department>> getAllDepartments()
    {
    	List<Department> departments = new ArrayList<>();
    	departmentRepository.findAll().forEach(departments::add);
    	return new ResponseEntity<>(departments,HttpStatus.OK);
    }
}
