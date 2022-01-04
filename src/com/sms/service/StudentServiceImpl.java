package com.sms.service;

import java.util.List;

import com.sms.dto.Student;
import com.sms.exceptions.StudentNotFoundException;
import com.student.dao.IStudentDAO;
import com.student.dao.StudentDAOMySQLImpl;

public class StudentServiceImpl implements StudentService{
	
	
	IStudentDAO stuDAO = new StudentDAOMySQLImpl();
	
	@Override
	public void addStudent(Student s) {
		stuDAO.addStudent(s);
		
		
		
	}

	@Override
	public void deleteStudent(int stuid) {
		try {
			stuDAO.deleteStudent(stuid);
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Student s) {
		stuDAO.updateStudent(s);
		
	}

	@Override
	public void findStudent(Student s) {
		// left to do
		
	}

	@Override
	public List<Student> showAllStudent() {
		
		return stuDAO.showAllStudent();
	}

}
