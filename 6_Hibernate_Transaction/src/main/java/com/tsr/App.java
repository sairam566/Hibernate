package com.tsr;

import com.tsr.dao.ProductDAO;
import com.tsr.entitys.Product;
import com.tsr.helper.SessionFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
        Product product = null;
        ProductDAO dao = null;
    	try {
			product = new Product();
			product.setProductNo(1);
			product.setProductName("Apple");
			product.setDescription("iMac 27inch");
			product.setPrice(200000);
			dao = new ProductDAO();
			dao.addProduct(product);
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
    }
}
