package com.tsr;

import com.tsr.dao.ParcelDAO;
import com.tsr.helper.SessionFactoryRegistory;

public class App {
	public static void main(String[] args) {
		try {
			
			//getAllPArcels_QUERY();
			//getAllParcels_TypedQuery();
			getAllParcels_Weight_gt_20();
			
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
	}

	public static void getAllPArcels_QUERY() {
		ParcelDAO dao = new ParcelDAO();
		dao.getAllPArcels_QUERY();
	}
	
	public static void getAllParcels_TypedQuery() {
		ParcelDAO dao = new ParcelDAO();
		dao.getAllParcels_TypedQuery();
	}
	
	public static void getAllParcels_Weight_gt_20() {
		ParcelDAO dao = new ParcelDAO();
		dao.getAllParcels_Weight_gt_20();
	}
}
