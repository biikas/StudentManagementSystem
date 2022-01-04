package com.sms.dto;

public class Student {
	private int id;
	private String name;
	private int grade;
	private String section;	
	
	public Student(int id, String name, int grade, String section) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.section = section;
	}
	public Student(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	
}
