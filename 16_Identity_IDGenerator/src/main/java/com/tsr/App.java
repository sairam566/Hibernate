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
			employee.setEmployeeName("Jagadeesh");
			employee.setEmployeeDept("Pega");
			employee.setEmployeeDOJ(new Date(2021, 8, 2));
			employee.setEmployeeSalary(300000.0);
			dao.addEmployee(employee);
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
    }
}
