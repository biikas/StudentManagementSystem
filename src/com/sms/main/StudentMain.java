package com.sms.main;

import java.util.List;

import com.sms.dto.Student;
import com.sms.service.StudentService;
import com.sms.service.StudentServiceImpl;

public class StudentMain {
	public static void main(String args[]) {
		StudentService sService=	new StudentServiceImpl();
		System.out.println("Started Adding data");
		sService.addStudent(new Student(1,"bikas", 10, "A"));
		sService.addStudent(new Student(2,"Kauhshal", 1, "B"));
		sService.addStudent(new Student(3,"Anisha", 2, "C"));
		sService.addStudent(new Student(4,"Junu", 3,"D"));
		sService.addStudent(new Student(5,"Sudip", 19, "E"));
		
		List<Student> slist1=sService.showAllStudent();
		
		for(Student s:slist1) {
			System.out.println(s.getId()+" : "+s.getName()+" : "+s.getGrade()+" : "+s.getSection());
		}
		
		sService.deleteStudent(2);
		System.out.println("");
		System.out.println("After Deleting:");
		
		List<Student> slist3=sService.showAllStudent();
		
		for(Student s:slist3) {
			System.out.println(s.getId()+" : "+s.getName()+" : "+s.getGrade()+" : "+s.getSection());
		}
		
		sService.updateStudent(new Student(1, "Bikash Shah", 15, "kanchanjunga"));
		System.out.println();
		System.out.println("After updating");
		List<Student> slist2=sService.showAllStudent();
		for(Student s:slist2) {
			System.out.println(s.getId()+" : "+s.getName()+" : "+s.getGrade()+" : "+s.getSection());
		}
	}
}
