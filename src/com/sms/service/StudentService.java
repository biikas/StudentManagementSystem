package com.sms.service;

import java.util.List;

import com.sms.dto.Student;

public interface StudentService {
	
	public abstract void addStudent(Student s);
	public abstract void deleteStudent(int stuid);
	public abstract void updateStudent(Student s);
	public abstract void findStudent(Student s);
	public abstract List<Student> showAllStudent();
	
	

}
