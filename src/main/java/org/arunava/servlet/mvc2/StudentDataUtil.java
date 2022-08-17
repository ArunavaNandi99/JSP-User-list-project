package org.arunava.servlet.mvc2;

import java.util.ArrayList;
import java.util.List;



public class StudentDataUtil {
	public static List<Student> getStudnets(){
		
		List<Student> students  = new ArrayList<>();
		
		students.add(new Student("Arunava", "nandi", "Arunava@gmail.com"));
		students.add(new Student("roni", "nandi", "roni@gmail.com"));
		students.add(new Student("deep", "nandi", "deep@gmail.com"));
		
		return students;
	
	}

}
