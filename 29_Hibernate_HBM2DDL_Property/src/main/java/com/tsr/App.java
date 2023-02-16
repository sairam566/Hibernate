package com.tsr;

import java.util.Date;

import com.tsr.dao.StudentDAO;
import com.tsr.entities.Student;
import com.tsr.helper.SessionFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
    	StudentDAO dao = null;
    	Student student = null;
        try {
			dao = new StudentDAO();
			student = new Student();
			student.setGrade("10th Grade");
			student.setJoiningDate(new Date());
			student.setName("Sai");
			dao.addStudent(student);
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
    }
}
