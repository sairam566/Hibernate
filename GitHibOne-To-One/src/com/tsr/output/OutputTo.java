package com.tsr.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.hibernate.Session;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
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
		
	public static void generatePDFFile(List<Employees> EmpList) {
		
		//give the location where to store the PDF file.
		String FILE = "C:\\Users\\Maneesh\\git\\Hibernate\\PDF\\EmpDetails.pdf";
		
		Document doc = new Document();
		
		try {
			
			PdfWriter.getInstance(doc, new FileOutputStream(FILE));
			
			doc.open();
			
			doc.newPage();
			
			Chapter chapter = new Chapter(new Paragraph("Employees Detailes", new Font(Font.FontFamily.HELVETICA,18,Font.BOLD)),1);
			
			Section section = chapter.addSection("Employees Detailes");
			
			PdfPTable table = new PdfPTable(11);
			
			//creation of table header
			PdfPCell c1 = new PdfPCell(new Phrase("EMPLOYEE_ID"));
			table.addCell(c1);
			PdfPCell c2 = new PdfPCell(new Phrase("FIRST_NAME"));
			table.addCell(c2);
			PdfPCell c3 = new PdfPCell(new Phrase("LAST_NAME"));
			table.addCell(c3);
			PdfPCell c4 = new PdfPCell(new Phrase("EMAIL"));
			table.addCell(c4);
			PdfPCell c5 = new PdfPCell(new Phrase("PHONE_NUMBER"));
			table.addCell(c5);
			PdfPCell c6 = new PdfPCell(new Phrase("HIRE_DATE"));
			table.addCell(c6);
			PdfPCell c7 = new PdfPCell(new Phrase("JOB_ID"));
			table.addCell(c7);
			PdfPCell c8 = new PdfPCell(new Phrase("SALARY"));
			table.addCell(c8);
			PdfPCell c9 = new PdfPCell(new Phrase("COMMISSION_PCT"));
			table.addCell(c9);
			PdfPCell c10 = new PdfPCell(new Phrase("MANAGER_ID"));
			table.addCell(c10);
			PdfPCell c11 = new PdfPCell(new Phrase("DEPARTMENT_ID"));
			table.addCell(c11);
			table.setHeaderRows(1);
			
			if(EmpList!=null){
				for(int i=0 ; i<EmpList.size();i++)
				{
					Employees emp = (Employees) EmpList.get(i);
					table.addCell(""+ (0!=emp.getEmpId() ? emp.getEmpId() : "NO Data"));
					table.addCell(""+(null!=emp.getfName() ? emp.getfName() : "NO Data"));
					table.addCell(""+(null!=emp.getlName() ? emp.getlName() : "NO Data"));
					table.addCell(""+(null!=emp.getEmail() ? emp.getEmail() : "NO Data"));
					table.addCell(""+(null!=emp.getPhoneNo() ? emp.getPhoneNo() : "NO Data"));
					table.addCell(""+(null!=emp.getHireDate() ? emp.getHireDate() : "NO Data"));
					table.addCell(""+(null!=emp.getJobId() ? emp.getJobId() : "NO Data"));
					table.addCell(""+(null!=emp.getSal() ? emp.getSal() : "NO Data"));
					table.addCell(""+(null!=emp.getCommissionPct() ? emp.getCommissionPct() : "NO Data"));
					table.addCell(""+(null!=emp.getManagerId() ? emp.getManagerId() : "NO Data"));
					table.addCell(""+(null!=emp.getDeptId() ? emp.getDeptId() : "NO Data"));
					section.add(table);
				}
			}
			doc.add(section);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (DocumentException e) {
			
			e.printStackTrace();
		}finally {
			doc.close();
		}
		
		
		
		
		
		
	}

	

}
