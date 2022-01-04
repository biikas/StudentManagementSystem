package com.student.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
//import java.sql.Statement;
import java.util.List;

import com.sms.dto.Student;

public class StudentDAOMySQLImpl implements IStudentDAO {
	
	private Connection con=null;
	private PreparedStatement pst=null;
	private ResultSet rs= null;
	public static final String INS_COMMAND ="INSERT INTO student values(?,?,?,?)";
	public static final String DEL_COMMAND ="DELETE FROM student where stuid=?";
	public static final String UPDATE_COMMAND ="UPDATE Student SET  stuname=?,class=?,section=? WHERE stuid=?";
	public static final String SELECT_ALL="SELECT * from student";
	
	
	public StudentDAOMySQLImpl() {
		try {
			con=DriverManager.getConnection(IStudentDAO.URL,IStudentDAO.USERNAME,IStudentDAO.PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot establish a connection");
			e.printStackTrace();
		}
	}

	@Override
	public void addStudent(Student s) {
		//addingStudent
		int i =0;
		try {			
			pst=con.prepareStatement(INS_COMMAND);
			pst.setInt(1, s.getId());
			pst.setString(2, s.getName());
			pst.setInt(3, s.getGrade());
			pst.setString(4, s.getSection());
			//System.out.println("NewData Added");
			i = pst.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Addind data failed");
		}
		finally {
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(i>1) {
			System.out.println("NewData Added");
		}		
	}

	@Override
	public void deleteStudent(int stuid) {
		int i =0;
		System.out.println("Searching");
		try {
			System.out.println("Deleting some data");
			pst=con.prepareStatement(DEL_COMMAND);
			pst.setInt(1, stuid);			
			i=pst.executeUpdate();			
		} catch (SQLException e) {
			System.out.println("Delete opeartion failed");
			e.printStackTrace();			
		}finally {
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void updateStudent(Student s) {
		int i=0 ; 
		try {
			System.out.println("Started Updating.....");
			pst=con.prepareStatement(UPDATE_COMMAND);
			pst.setInt(4, s.getId());
			pst.setString(1, s.getName());
			pst.setInt(2, s.getGrade());
			pst.setString(3, s.getSection());
			pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Update operation failed");
			e.printStackTrace();
		}
		finally {
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(i>0) {
			System.out.println("Record updated succesfully");
		}	
		
		
	}

	@Override
	public void findStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> showAllStudent() {
		Student selectAllStu =null;
		List<Student> slist = new LinkedList<>();
		try {
			System.out.println("Here is the list of all student");
			pst =con.prepareStatement(SELECT_ALL);
			rs =pst.executeQuery();
			while(rs.next()) {
				selectAllStu = new Student();
				selectAllStu.setId(rs.getInt("stuid"));
				selectAllStu.setName(rs.getString("stuname"));
				selectAllStu.setGrade(rs.getInt("class"));
				selectAllStu.setSection(rs.getString("Section"));
				slist.add(selectAllStu);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return slist;
	}
	

}
