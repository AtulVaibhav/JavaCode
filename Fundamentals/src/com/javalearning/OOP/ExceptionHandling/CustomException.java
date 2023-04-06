package com.javalearning.OOP.ExceptionHandling;

class StudentNotFoundException extends Exception{
	String msg;
	 StudentNotFoundException(String msg) {
		this.msg = msg;
	}
	 public void showDetails(){
		 System.out.println(this.msg);
	 }
}
class Student{
	public static void studentDetails(int id){
		if(id !=102){
			try {
				throw new StudentNotFoundException("Id doesn't match");
			} catch (StudentNotFoundException e) {
				//System.out.println("Id doesn't match");
			    e.showDetails();
			}
		}else{
			System.out.println("Student details found");
		}
	}
}


public class CustomException {
   
	public static void main(String[] args) {
		Student.studentDetails(101);

	}

}
