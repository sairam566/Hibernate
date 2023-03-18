package com.tsr;

import java.time.LocalDate;

import com.tsr.dao.BillDAO;
import com.tsr.entities.Bill;
import com.tsr.entities.ItemizedBill;
import com.tsr.helper.EntityManagerFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
        try {
			//addBill();
        	//addItemizedBill();
        	//getBill();
        	getItemizedBill();
		} finally {
			EntityManagerFactoryRegistory.closeEntityManagerFactory();
		}
    }
    
    public static void addBill() {
    	BillDAO billDAO = new BillDAO();
    	Bill bill = Bill.builder().customerName("TRS").mobileNo("5632788965").amount(566).billDate(LocalDate.now()).build();
    	billDAO.addBill(bill);
    }
    
    public static void addItemizedBill() {
    	BillDAO billDAO = new BillDAO();
    	Bill bill = Bill.builder().billNo(5).build();
    	ItemizedBill itemizedBill = ItemizedBill.builder().fromDate(LocalDate.now()).toDate(LocalDate.now())
    								.localMinutes(12).isdMinutes(123).localSms(21).isdSms(21).bill(bill).build();
    	billDAO.addItemizedBill(itemizedBill);
    }
    
    public static void getBill() {
    	BillDAO billDAO = new BillDAO();
    	billDAO.getBill(5);
    }
    
    public static void getItemizedBill() {
    	BillDAO billDAO = new BillDAO();
    	billDAO.getItemizedBill(5);
    }
}
