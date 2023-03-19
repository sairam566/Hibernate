package com.tsr.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "sbi_account")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Account implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_no")
	protected int accountNo;
	
	@Column(name = "acc_holder_nm")
	protected String accountHolderName;
	
	@Column(name = "open_dt")
	protected LocalDate openedDate;
	
	@Column(name = "acc_ty")
	protected String accountType;
	
	@Column(name = "branch_code")
	protected String branchCode;
	
	protected double balance;
	
	@OneToMany
	@JoinColumn(name = "account_no",unique = true)
	protected Set<Locker> lockers;

}
