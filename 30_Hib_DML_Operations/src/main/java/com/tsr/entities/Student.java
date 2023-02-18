package com.tsr.entities;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{
	
	protected int studentId;
	protected String name;
	protected Date joiningDate;
	protected String grade;
	protected String classTeacher;
	
	public Student() {
		super();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", joiningDate=" + joiningDate + ", grade="
				+ grade + ", classTeacher=" + classTeacher + "]";
	}
	
}
