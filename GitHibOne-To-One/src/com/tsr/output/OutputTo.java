package com.tsr.output;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.tsr.pojo.Employees;

public class OutputTo {

	
	public static void generateTxtFile(List<Employees> EmpList) throws IOException{
		int empCount = 0;
		
		FileWriter writer = null;
		try {
			writer = new 
					FileWriter("C:\\Users\\Maneesh\\git\\Hibernate\\Txt\\EmpDetails.txt");
			
			if(EmpList!=null)
			{
				for (int i = 0; i < EmpList.size(); i++) {
					empCount++;
					Employees emp = (Employees) EmpList.get(i);
					writer.write("EMPLOYEE_ID:"+ (0!=emp.getEmpId() ? emp.getEmpId() : "NO Data") +"\r\n");
					writer.write("FIRST_NAME:"+(null!=emp.getfName() ? emp.getfName() : "NO Data")+"\r\n");
					writer.write("LAST_NAME:"+(null!=emp.getlName() ? emp.getlName() : "NO Data")+"\r\n");
					writer.write("EMAIL:"+(null!=emp.getEmail() ? emp.getEmail() : "NO Data")+"\r\n");
					writer.write("PHONE_NUMBER:"+(null!=emp.getPhoneNo() ? emp.getPhoneNo() : "NO Data")+"\r\n");
					writer.write("HIRE_DATE:"+(null!=emp.getHireDate() ? emp.getHireDate() : "NO Data")+"\r\n");
					writer.write("JOB_ID:"+(null!=emp.getJobId() ? emp.getJobId() : "NO Data")+"\r\n");
					writer.write("SALARY:"+(null!=emp.getSal() ? emp.getSal() : "NO Data")+"\r\n");
					writer.write("COMMISSION_PCT:"+(null!=emp.getCommissionPct() ? emp.getCommissionPct() : "NO Data")+"\r\n");
					writer.write("MANAGER_ID:"+(null!=emp.getManagerId() ? emp.getManagerId() : "NO Data")+"\r\n");
					writer.write("DEPARTMENT_ID:"+(null!=emp.getDeptId() ? emp.getDeptId() : "NO Data")+"\r\n");
					writer.write("--------------------------------------------------\r\n");
				}
				writer.write("\r\n\n\n\t\t\t----------Total Employees:"+ empCount+"-------------");
			}
			else
			{
				writer.write("\n\n\n\t\t\t----------No Employees Reccords Found-------------");
				writer.write("\n\n\n\t\t\t----------Total Employees:"+ empCount+"-------------");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(writer!=null){
			writer.close(); 
			}
		}
	}
		
		

	

}
