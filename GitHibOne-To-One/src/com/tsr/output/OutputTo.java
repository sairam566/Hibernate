package com.tsr.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
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
		
		Document doc = new Document(PageSize.A4,0,0,0,0);
		
		try {
			
			PdfWriter.getInstance(doc, new FileOutputStream(FILE));
			
			doc.open();
			
			doc.newPage();
			
			Chapter chapter = new Chapter(new Paragraph("Employees Detailes", new Font(Font.FontFamily.HELVETICA,18,Font.BOLD)),1);
			
			Section section = chapter.addSection("Employees Detailes");
			
			PdfPTable table = new PdfPTable(11);
			
			//adding data alignment
			table.setWidthPercentage(100);
			table.setSpacingBefore(0f);
			table.setSpacingAfter(0f);
			
			
			//creation of table header
			PdfPCell cell = new PdfPCell();
			cell.setColspan(11);
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setPadding(5.0f);
	        cell.setBackgroundColor(new BaseColor(140, 221, 8));
	        table.addCell(cell);
			
			table.addCell("EMPLOYEE_ID");
			table.addCell("FIRST_NAME");
			table.addCell("LAST_NAME");
			table.addCell("EMAIL");
			table.addCell("PHONE_NUMBER");
			table.addCell("HIRE_DATE");
			table.addCell("JOB_ID");
			table.addCell("SALARY");
			table.addCell("COMMISSION_PCT");
			table.addCell("MANAGER_ID");
			table.addCell("DEPARTMENT_ID");
			table.setHeaderRows(1);
			table.setSkipFirstHeader(true);
			
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
					
				}
				section.add(table);
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
	
	
	public static void generateEmail(List<Employees> EmpList)
	{
		try{
		 String host ="smtp.gmail.com" ;
         String user = "";
         String pass = "";
         String to = "";
         String from = "";
         String subject = "";
         String messageText = "";
         boolean sessionDebug = false;
         
		Properties properties = System.getProperties();
		
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smpt.host", host);
		properties.put("mail.smpt.auth", "true");
		properties.put("mail.smpt.port", "587");
		properties.put("mail.smtp.starttls.required", "true");
		
		//java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        Session mailSession = Session.getDefaultInstance(properties, null);
        mailSession.setDebug(sessionDebug);
        Message msg = new MimeMessage(mailSession);
        msg.setFrom(new InternetAddress(from));
        InternetAddress[] address = {new InternetAddress(to)};
        msg.setRecipients(Message.RecipientType.TO, address);
        msg.setSubject(subject); 
        msg.setSentDate(new Date());
        msg.setText(messageText);

       Transport transport=mailSession.getTransport("smtp");
       transport.connect(host, user, pass);
       transport.sendMessage(msg, msg.getAllRecipients());
       transport.close();
       System.out.println("message send successfully");
	 }catch(Exception ex)
    {
        System.out.println(ex);
    }

	}
	
	public static void generateExcleFile(List<Employees> EmpList)
	{
		HSSFWorkbook workBook = new HSSFWorkbook();
		
		
	}
}
