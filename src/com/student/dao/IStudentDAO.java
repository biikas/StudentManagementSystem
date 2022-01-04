package com.student.dao;

import java.util.List;

import com.sms.dto.Student;
import com.sms.exceptions.StudentNotFoundException;

public interface IStudentDAO {
	public static final String URL="jdbc:mysql://localhost:3306/sys";
	public static final String USERNAME="root";
	public static final String PASSWORD="bikas123";
	public static final String DRIVER_CLASSNAME ="com.jdbc.mysql.Driver";	
	
	public abstract void addStudent(Student s);
//	public abstract void deleteStudent(int stuid) throws StudentNotFoundException;
	public abstract void deleteStudent(int stuid) throws StudentNotFoundException;
	
	public abstract void updateStudent(Student s);
	public abstract void findStudent(Student s);
	public abstract List<Student> showAllStudent();
}
