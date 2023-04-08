package com.tsr;

import com.tsr.dao.ParcelDAO;
import com.tsr.helper.SessionFactoryRegistory;

public class App {
	public static void main(String[] args) {
		try {
			
			//getAllPArcels_QUERY();
			//getAllParcels_TypedQuery();
			//getAllParcels_Weight_gt_20();
			//getDeliveryAssociatesCount();
			//getDeliveryAssociateExperience();
			//getDeliveryAssociateColumnsDTO();
			//getDeliveryAssociateColumnsObjects();
			//getParcelsWithWeightGreaterThan();
			//getParcelDeliveredBy();
			getDeliveryAssociateOnParcel();
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
	}

	public static void getDeliveryAssociateOnParcel() {
		ParcelDAO dao = new ParcelDAO();
		dao.getDeliveryAssociateOnParcel();
	}
	
	public static void getParcelDeliveredBy() {
		ParcelDAO dao = new ParcelDAO();
		dao.getParcelDeliveredBy();
	}
	
	public static void getParcelsWithWeightGreaterThan() {
		ParcelDAO dao = new ParcelDAO();
		dao.getParcelsWithWeightGreaterThan();
	}

	public static void getDeliveryAssociateColumnsObjects() {
		ParcelDAO dao = new ParcelDAO();
		dao.getDeliveryAssociateColumnsObjects();
	}

	public static void getDeliveryAssociateColumnsDTO() {
		ParcelDAO dao = new ParcelDAO();
		dao.getDeliveryAssociateColumnsDTO();	
	}

	public static void getDeliveryAssociateExperience() {
		ParcelDAO dao = new ParcelDAO();
		dao.getDeliveryAssociateExperience();
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
	
	public static void getDeliveryAssociatesCount() {
		ParcelDAO dao = new ParcelDAO();
		dao.getDeliveryAssociatesCount();
	}
}
