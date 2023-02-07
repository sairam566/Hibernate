package com.tsr;

import java.util.Date;

import com.tsr.dao.EmployeeDAO;
import com.tsr.entityes.Employee;
import com.tsr.helper.SessionFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDAO dao = null;
    	Employee employee = null;
    	try {
			dao = new EmployeeDAO();
			employee = new Employee();
			employee.setEmployeeName("TSR");
			employee.setEmployeeDept("CEO");
			employee.setEmployeeDOJ(new Date(2025, 10, 01));
			employee.setEmployeeSalary(120000000.0);
			String pkVal = dao.addEmployee(employee);
			System.out.println("The Primary Key Value is: "+pkVal);
			System.out.println(employee);
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
    }
}
