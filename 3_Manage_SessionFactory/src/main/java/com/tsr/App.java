package com.tsr;

import com.tsr.dao.ProductDAO;
import com.tsr.entityes.Product;
import com.tsr.helper.SessionFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
    	Product product = null;
    	ProductDAO dao = null;
    	try {
			dao = new ProductDAO();
			product = dao.getProductById(1);
			System.out.println(product);
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
    }
}
