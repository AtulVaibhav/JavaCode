package com.mockitoTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.mockitotest.Utility.StudentDetails;
import com.mockitotest.interfaces.StudentService;

public class MockitoTestIntro {
   
	StudentService studentService = Mockito.mock(StudentService.class);
	
	
	StudentDetails studentDetails;
	@Before
	public void setUp(){
		studentDetails = new StudentDetails(studentService);
	}
	
	@Test
	public void testgetAverageMarks(){
		Mockito.when(studentService.getTotalMarks()).thenReturn(500);
		Mockito.when(studentService.getTotalStudents()).thenReturn(10);
		
		int expectedOutput = 50;
		assertEquals(expectedOutput,studentDetails.getAverageMarks());
	}
}
