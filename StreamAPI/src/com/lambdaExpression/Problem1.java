package com.lambdaExpression;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface FirstName{
	String[] getFname(List<Employee> list);
}

class Employee{
	private int empId;
	private String empfname;
	private String emplname;
	public Employee(int empId, String empfname, String emplname) {
		super();
		this.empId = empId;
		this.empfname = empfname;
		this.emplname = emplname;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpfname() {
		return empfname;
	}
	public void setEmpfname(String empfname) {
		this.empfname = empfname;
	}
	public String getEmplname() {
		return emplname;
	}
	public void setEmplname(String emplname) {
		this.emplname = emplname;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empfname=" + empfname + ", emplname=" + emplname + "]";
	}
		
}

public class Problem1 {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Akash","Kumar");
		Employee e2 = new Employee(102,"Mayank","Kumar");
		Employee e3 = new Employee(103,"Harsh","Kumar");
		Employee e4 = new Employee(104,"Ankit","Kumar");
		Employee e5 = new Employee(105,"Ravi","Kumar");
		
		//create a list 
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		//writing a lambda expression
		
		FirstName fname = (myList)->{
			String[] getName = new String[list.size()];
			for(int i=0;i<getName.length;i++){
				getName[i] = myList.get(i).getEmpfname();
			}
			return getName;
		};
		
		String[] result = new String[list.size()];
		result = fname.getFname(list);
		for(String empFname:result){
			System.out.println(empFname);
		}
		
		System.out.println("-----------------------------");
		for(String name:fname.getFname(list)){
			System.out.println(name);
		}
		
	}

}
