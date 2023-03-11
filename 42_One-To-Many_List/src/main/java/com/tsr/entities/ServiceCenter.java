package com.tsr.entities;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = false)
@ToString
@EqualsAndHashCode
public class ServiceCenter implements Serializable{
	
	protected int serviceCenterNo;
	protected String serviceCenterName;
	protected String location;
	protected String company;
	protected String branchManager;
	protected String contactNo;
	protected String emailAddress;
	protected List<Token> tokens; 
}
