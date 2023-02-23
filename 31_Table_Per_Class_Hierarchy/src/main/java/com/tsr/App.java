package com.tsr;

import com.tsr.dao.InsuranceDAO;
import com.tsr.entities.AccidentalInsurancePlan;
import com.tsr.entities.InsurancePlan;
import com.tsr.entities.MedicalInsurancePlan;
import com.tsr.helper.SessionFactoryRegistory;

public class App {
	public static void main(String[] args) {
		try {
			// addInsurancePlan();
			// addMedicalInsurancePlan();
			// addAccidentalInsurancePlan();
			// getInsurancePlan();
			// getAccidentalInsurancePlan();
			// getMedicalInsurancePlan();
			getAccidentalInsurancePlanRefInInsurancePlan();
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
	}

	public static void addInsurancePlan() {
		InsuranceDAO dao = null;
		InsurancePlan insurancePlan = null;

		insurancePlan = new InsurancePlan();
		insurancePlan.setDescription("Insurance_Plan");
		insurancePlan.setPlanName("Med+");
		insurancePlan.setMinInsurredAmount(5000000);
		insurancePlan.setTaxSaver(true);
		dao = new InsuranceDAO();
		dao.addInsurancePlan(insurancePlan);
	}
	
	public static void addMedicalInsurancePlan() {
		InsuranceDAO dao = null;
		MedicalInsurancePlan medicalInsurancePlan = null;

		medicalInsurancePlan = new MedicalInsurancePlan();
		medicalInsurancePlan.setDescription("Medical_Insurance_Plan");
		medicalInsurancePlan.setPlanName("Med+");
		medicalInsurancePlan.setMinInsurredAmount(5000000);
		medicalInsurancePlan.setTaxSaver(true);
		medicalInsurancePlan.setNetworkType("LIC");
		medicalInsurancePlan.setCopay(12);
		dao = new InsuranceDAO();
		dao.addMedicalInsurancePlan(medicalInsurancePlan);
	}
	
	public static void addAccidentalInsurancePlan() {
		InsuranceDAO dao = null;
		AccidentalInsurancePlan accidentalInsurancePlan = null;

		accidentalInsurancePlan = new AccidentalInsurancePlan();
		accidentalInsurancePlan.setDescription("Accidental_Insurance_Plan");
		accidentalInsurancePlan.setPlanName("Med+");
		accidentalInsurancePlan.setMinInsurredAmount(5000000);
		accidentalInsurancePlan.setTaxSaver(true);
		accidentalInsurancePlan.setCoverageType("Covered");
		accidentalInsurancePlan.setDisabilityCoveragePercentage(50);
		dao = new InsuranceDAO();
		dao.addAccidentalInsurancePlan(accidentalInsurancePlan);
	}
	
	public static void getInsurancePlan() {
		InsuranceDAO dao = new InsuranceDAO();
		dao.getInsurancePlan(1);
	}
	
	public static void getAccidentalInsurancePlan() {
		InsuranceDAO dao = new InsuranceDAO();
		dao.getAccidentalInsurancePlan(3);
	}
	
	public static void getMedicalInsurancePlan() {
		InsuranceDAO dao = new InsuranceDAO();
		dao.getMedicalInsurancePlan(2);
	}
	
	public static void getAccidentalInsurancePlanRefInInsurancePlan() {
		InsuranceDAO dao = new InsuranceDAO();
		dao.getAccidentalInsurancePlanRefInInsurancePlan(3);
	}
}
