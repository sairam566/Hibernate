package com.tsr;

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
			//employee = dao.getEmployeeUsingGet(1);
			employee = dao.getEmployeeUsingLoad(1);			
			System.out.println(employee);
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
    }
}
