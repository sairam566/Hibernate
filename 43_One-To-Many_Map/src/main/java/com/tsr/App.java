package com.tsr;

import java.time.LocalDate;
import java.util.Map;

import com.tsr.dao.CourierCenterDAO;
import com.tsr.entities.CourierCenter;
import com.tsr.entities.Parcel;
import com.tsr.helper.SessionFactoryRegistory;

public class App {
	public static void main(String[] args) {
		try {
			//addCourierCenter();
			//addParcel();
			//addParcelToCourrierCenter();
			//getParcel();
			getCourierCenter();
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
	}

	private static void addCourierCenter() {
		CourierCenterDAO centerDAO = new CourierCenterDAO();
		CourierCenter courierCenter1 = CourierCenter.builder()
				.centerName("Bluedart Center")
				.contactNo("93894783")
				.emailAddress("enquiries@bluedart.com")
				.inChargeName("Smith")
				.location("ameerpet").build();
		CourierCenter courierCenter2 = CourierCenter.builder()
				.centerName("TSR Center")
				.contactNo("88888888")
				.emailAddress("enquiries@tsr.com")
				.inChargeName("KMR")
				.location("USA").build();
		
		centerDAO.addCourierCenter(courierCenter1);
		
		centerDAO.addCourierCenter(courierCenter2);
	}

	private static void addParcel() {
		CourierCenterDAO centerDAO = new CourierCenterDAO();
		Parcel parcel1 = Parcel.builder()
				.description("documents")
				.source("hyderabad")
				.destination("new delhi")
				.parcelDate(LocalDate.now())
				.shippingAmount(450)
				.weight(10).build();

		Parcel parcel2 = Parcel.builder()
				.description("books")
				.source("pune")
				.destination("new delhi")
				.parcelDate(LocalDate.now())
				.shippingAmount(150)
				.weight(15).build();
		
		centerDAO.addParcel(parcel1);
		centerDAO.addParcel(parcel2);
	}

	private static void addParcelToCourrierCenter() {
		CourierCenterDAO centerDAO = new CourierCenterDAO();
		
		Parcel parcel1 = Parcel.builder().parcelNo(1).build();
		
		Parcel parcel2 = Parcel.builder().parcelNo(2).build();
		
		Map<String, Parcel> map = Map.of("AWB5689",parcel1,"AWB784521",parcel2);
		
		centerDAO.addParcelToCourrierCenter(map, 2);
	}

	private static void getParcel() {
		CourierCenterDAO centerDAO = new CourierCenterDAO();
		centerDAO.getParcel(2);
	}

	private static void getCourierCenter() {
		CourierCenterDAO centerDAO = new CourierCenterDAO();
		centerDAO.getCourierCenter(2);
	}

}
