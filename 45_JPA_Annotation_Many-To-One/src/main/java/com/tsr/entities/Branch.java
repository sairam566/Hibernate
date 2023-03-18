package com.tsr.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Branch implements Serializable{
	
	@Id
	@Column(name = "branch_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int branchNo;
	
	@Column(name = "branch_name")
	protected String branchName;
	
	@Column(name = "branch_manager")
	protected String branchManager;
	
	protected String location;
	
}
