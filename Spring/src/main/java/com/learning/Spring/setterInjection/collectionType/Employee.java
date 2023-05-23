package com.learning.Spring.setterInjection.collectionType;

import java.util.List;

public class Employee {
  private int empId;
  private String empName;
  private String empDept;
  private List<String> projectName;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpDept() {
	return empDept;
}
public void setEmpDept(String empDept) {
	this.empDept = empDept;
}
public List<String> getProjectName() {
	return projectName;
}
public void setProjectName(List<String> projectName) {
	this.projectName = projectName;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", projectName=" + projectName
			+ "]";
}
  
  
  
}
