package com.tsr.entities;

public class MedicalInsurancePlan extends InsurancePlan{
	
	protected String networkType;
	protected int copay;
	
	public MedicalInsurancePlan() {
		super();
	}

	public String getNetworkType() {
		return networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public int getCopay() {
		return copay;
	}

	public void setCopay(int copay) {
		this.copay = copay;
	}

	@Override
	public String toString() {
		return "MedicalInsurancePlan [networkType=" + networkType + ", copay=" + copay + ", insurancePlanNo="
				+ insurancePlanNo + ", planName=" + planName + ", description=" + description + ", taxSaver=" + taxSaver
				+ ", minInsurredAmount=" + minInsurredAmount + "]";
	}
	
}
