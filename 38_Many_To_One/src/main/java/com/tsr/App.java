package com.tsr;

import java.time.LocalDate;

import com.tsr.dao.LeaveDao;
import com.tsr.entities.Associate;
import com.tsr.entities.Leave;
import com.tsr.helper.SessionFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
        try {
		//	addAssociate();
        //	addLeave();
        	getLeave();
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		} 
    }

	private static void addAssociate() {
		LeaveDao dao = new LeaveDao();
		Associate associate = new Associate();
		associate.setDepartment("Engineering");
		associate.setDesignation("SE-1");
		associate.setEmailAddress("TSR@gmail.com");
		associate.setFullname("TSR");
		associate.setJoinedDate(LocalDate.of(2021, 8, 2));
		associate.setMobileNo("8956231478");
		dao.addAssociate(associate);
	}
	
	private static void addLeave() {
		LeaveDao dao = new LeaveDao();
		Associate associate = new Associate();
		Leave leave = new Leave();
		leave.setDescription("Vacation");
		leave.setStartDate(LocalDate.of(2023, 4, 25));
		leave.setEndDate(LocalDate.of(2023, 5, 5));
		leave.setLeaveType("VAC");
		leave.setStatus("Approved");
		
		associate.setAssociateNo(1);
		
		leave.setAssociate(associate);
		dao.addLeave(leave);
	}
	
	private static void getLeave() {
		LeaveDao dao = new LeaveDao();
		dao.getLeave(1);
	}
}
