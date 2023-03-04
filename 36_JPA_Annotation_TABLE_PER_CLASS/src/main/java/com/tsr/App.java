package com.tsr;

import java.util.Date;

import com.tsr.dao.PaymentDAO;
import com.tsr.entities.CardPayment;
import com.tsr.entities.ChequePayment;
import com.tsr.entities.Payment;

public class App 
{
        public static void main( String[] args )
        {
        	// addPayment();
        	// addCardPayment();
        	// addChequePayment();
        	// getCardPayment();
        	// getChequePayment();
        	// getPayment();
        	 getSubClassObjIntoSuperClassRefType();
        }

    	private static void addPayment() {
    		Payment payment = new Payment();
    		PaymentDAO dao = new PaymentDAO();
    		
    		payment.setCustomerName("Sairam");
    		payment.setDescription("SE-1");
    		payment.setPaymentDate(new Date());
    		payment.setPaidAmount(500);
    		
    		dao.addPayment(payment);
    	}
    	
    	private static void addChequePayment() {
    		PaymentDAO dao = new PaymentDAO();
    		ChequePayment payment = new ChequePayment();
    		
    		payment.setCustomerName("Phillip");
    		payment.setDescription("SE-1");
    		payment.setPaymentDate(new Date());
    		payment.setPaidAmount(50);
    		
    		payment.setBankName("Hdfc Bank");
    		payment.setBranchName("Jubliee Hills");
    		payment.setChequeDate(new Date());
    		payment.setPayeeName("Lal Jewllerys");
    		payment.setChequeNo("BL38933");
    		
    		dao.addChequePayment(payment);
    	}

    	private static void addCardPayment() {
    		PaymentDAO dao = new PaymentDAO();
    		CardPayment payment = new CardPayment();
    		payment.setCustomerName("Sai");
    		payment.setDescription("SE-1");
    		payment.setPaymentDate(new Date());
    		payment.setPaidAmount(50);
    		
    		payment.setCardNo("768387679098");
    		payment.setCardHolderName("Adam");
    		payment.setExpiryDay(2);
    		payment.setExpiryMonth(2024);
    		payment.setIssuedBank("Citibank");
    		
    		dao.addCardPayment(payment);
    	}
    	
    	private static void getChequePayment() {
    		PaymentDAO dao = new PaymentDAO();
    		dao.getChequePayment(3);
    	}

    	private static void getCardPayment() {
    		PaymentDAO dao = new PaymentDAO();
    		dao.getCardPayment(2);
    	}
    	
    	private static void getPayment() {
    		PaymentDAO dao = new PaymentDAO();
    		dao.getPayment(1);
    	}
    	
    	private static void getSubClassObjIntoSuperClassRefType() {
    		PaymentDAO dao = new PaymentDAO();
    		dao.getSubClassObjIntoSuperClassRefType(2);
    	}
}
