package com.tsr;

import com.tsr.dao.AddressDAO;
import com.tsr.dao.ProductDAO;
import com.tsr.entityes.Address;
import com.tsr.entityes.Product;
import com.tsr.helper.SessionFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
        Address address = null;
        Product product = null;
        AddressDAO addressDAO = null;
        ProductDAO productDAO = null;
        try {
			addressDAO = new AddressDAO();
			productDAO = new ProductDAO();
			
			address = addressDAO.getAddressById(1);
			System.out.println(address);
			product = productDAO.getProductById(1);
			System.out.println(product);
			
		} finally {
			SessionFactoryRegistory.closeSessionFactory("HR");
			SessionFactoryRegistory.closeSessionFactory("SALES");
		}
    }
}
