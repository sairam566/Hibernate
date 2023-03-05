package com.tsr;

import java.time.LocalDate;

import com.tsr.dao.VehicleDAO;
import com.tsr.entities.InspectionReport;
import com.tsr.entities.VehicleInspection;
import com.tsr.helper.SessionFactoryRegistory;

public class App {
	public static void main(String[] args) {
		try {
			//addVehicleInspection();
			//addInspectionReport();
			//getVehicleInspection();
			getInspectionReport();
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
	}

	public static void addVehicleInspection() {
		VehicleDAO dao = new VehicleDAO();
		VehicleInspection inspection = new VehicleInspection();
		inspection.setRtaRegistrationNo("TS09BI0838");
		inspection.setEngineNo("E98933");
		inspection.setChasisNo("CH939873");
		inspection.setPurchaseDate(LocalDate.of(2019, 2, 21));
		inspection.setModelName("Seltos");
		inspection.setManufacturer("Kia");
		inspection.setVehicleType("SUV");
		dao.addVehicleInspection(inspection);
	}

	public static void addInspectionReport() {
		VehicleDAO dao = new VehicleDAO();
		VehicleInspection inspection = new VehicleInspection();
		inspection.setInspectionNo(1);
		InspectionReport inspectionReport = new InspectionReport();
		inspectionReport.setReportDate(LocalDate.of(2022, 6, 20));
		inspectionReport.setAgentName("Alex");
		inspectionReport.setDescription("Good Condition");
		inspectionReport.setObservations("light scratches and dents");
		inspectionReport.setRating(4);
		inspectionReport.setReportExpiryDate(LocalDate.now().plusDays(15));
		inspectionReport.setValuation(7000000);
		inspectionReport.setVehicleInspection(inspection);
		
		dao.addInspectionReport(inspectionReport);
	}
	
	public static void getInspectionReport() {
		VehicleDAO dao = new VehicleDAO();
		dao.getInspectionReport(1);
	}
	
	public static void getVehicleInspection() {
		VehicleDAO dao = new VehicleDAO();
		dao.getVehicleInspection(1);
		
	}
}
