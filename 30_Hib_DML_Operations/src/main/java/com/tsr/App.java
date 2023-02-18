package com.tsr;

import java.util.Date;

import com.tsr.dao.StudentDAO;
import com.tsr.entities.Student;
import com.tsr.helper.SessionFactoryRegistory;

public class App {
	public static void main(String[] args) {

		try {
			 save();
			// persist();
			// saveOrUpdate_That_insert();
			// saveOrUpdate_That_update();
			// addStudent_Partial_UPDATE();
			// addStudent_Full_UPDATE();
			// merge();
			// delete();
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
	}

	public static void save() {
		StudentDAO dao = null;
		Student student = null;

		dao = new StudentDAO();
		student = new Student();
		//student.setGrade("10th Grade");
		student.setJoiningDate(new Date());
		student.setName("Sai");
		//student.setClassTeacher("SAVE");
		dao.addStudent_SAVE(student);
	}
	
	public static void persist() {
		StudentDAO dao = null;
		Student student = null;

		dao = new StudentDAO();
		student = new Student();
		student.setGrade("10th Grade");
		student.setJoiningDate(new Date());
		student.setName("Sai");
		student.setClassTeacher("PERSIST");
		dao.addStudent_PERSIST(student);
	}
	
	public static void saveOrUpdate_That_insert() {
		StudentDAO dao = null;
		Student student = null;

		dao = new StudentDAO();
		student = new Student();
		student.setGrade("12th Grade");
		student.setJoiningDate(new Date());
		student.setName("Ram");
		student.setClassTeacher("SAVE_OR_UPDATE");
		dao.addStudent_SAVE_OR_UPDATE_ThatInsert(student);
	}
	
	public static void saveOrUpdate_That_update() {
		StudentDAO dao = null;
		Student student = null;

		dao = new StudentDAO();
		student = new Student();
		student.setStudentId(3);
		student.setGrade("12th Grade");
		student.setJoiningDate(new Date());
		student.setName("Ramana");
		student.setClassTeacher("SAVE_OR_UPDATE");
		dao.addStudent_SAVE_OR_UPDATE_ThatUpdate(student);
	}
	
	public static void addStudent_Partial_UPDATE() {
		StudentDAO dao = null;
		dao = new StudentDAO();
		dao.addStudent_Partial_UPDATE();
	}
	
	public static void addStudent_Full_UPDATE() {
		StudentDAO dao = null;
		dao = new StudentDAO();
		dao.addStudent_Full_UPDATE();
	}
	
	public static void merge() {
		StudentDAO dao = null;
		Student student = null;

		dao = new StudentDAO();
		student = new Student();
		student.setStudentId(5);
		student.setGrade("5th Grade");
		student.setJoiningDate(new Date());
		student.setName("Ramana");
		student.setClassTeacher("MERGE");
		dao.merge(student);
	}
	
	public static void delete() {
		StudentDAO dao = null;
		dao = new StudentDAO();
		dao.detete(5);
	}
}
