package com.bezkoder.spring.data.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "department")
public class Department {
  @Id
  private String deptId;

  private String deptName;
  
  

public Department() {
}


public Department(String deptId, String deptName) {
	this.deptId = deptId;
	this.deptName = deptName;
}


public String getDeptId() {
	return deptId;
}


public void setDeptId(String deptId) {
	this.deptId = deptId;
}


public String getDeptName() {
	return deptName;
}


public void setDeptName(String deptName) {
	this.deptName = deptName;
}


@Override
public String toString() {
	return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
}


  
  
  


  

  
}
