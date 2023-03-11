package com.tsr;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.tsr.dao.ServiceDAO;
import com.tsr.entities.ServiceCenter;
import com.tsr.entities.Token;
import com.tsr.helper.SessionFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
    	try {
			//addServiceCenter();
			//addTokens();
			addTokensToServiceCenter();
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
    }
    
    public static void addServiceCenter() {
    	ServiceDAO dao = new ServiceDAO();
		ServiceCenter center = ServiceCenter.builder().serviceCenterName("Samsung Bhavani Abids Center")
				.company("samsung").branchManager("Basha").contactNo("86289073").emailAddress("samsungabids@gmail.com")
				.location("abids").build();
    	dao.addServiceCenter(center);
    }
    
    public static void addTokens() {
    	ServiceDAO dao = new ServiceDAO();
    	List<Token> tokens = new ArrayList<>();
    	
		Token token1 = Token.builder().serviceType("OutOfWarranty").problem("battery")
				.tokenIssuedDate(LocalDateTime.now()).customerName("lisa").mobileNo("659008379").build();
		
		Token token2 = Token.builder().serviceType("In_Warranty").problem("slow")
				.tokenIssuedDate(LocalDateTime.now()).customerName("paul").mobileNo("9897636738").build();
		
		Token token3 = Token.builder().serviceType("In_Warranty").problem("network issue")
				.tokenIssuedDate(LocalDateTime.now()).customerName("peter").mobileNo("73689488").build();
		
		tokens.add(token1);
		tokens.add(token2);
		tokens.add(token3);
		
		for(Token tok: tokens) {
			dao.addToken(tok);
		}
    }
    
    public static void addTokensToServiceCenter() {
    	ServiceDAO dao = new ServiceDAO();
    	
    	Token token1 = Token.builder().tokenNo(1).build();
    	Token token2 = Token.builder().tokenNo(2).build();
    	Token token3 = Token.builder().tokenNo(3).build();
    	
    	List<Token> tokens = new ArrayList<>();
    	tokens.add(token1);
		tokens.add(token2);
		tokens.add(token3);
    	
    	dao.addTokensToServiceCenter(tokens,1);
    }
}
