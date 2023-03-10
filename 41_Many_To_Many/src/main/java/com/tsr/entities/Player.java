package com.tsr.entities;

import java.io.Serializable;
import java.time.LocalDate;


public class Player implements Serializable {
	protected int playerNo;
	protected String playerName;
	protected int rank;
	protected LocalDate dob;
	protected String gender;
	protected String nationality;
	
	public Player() {
		super();
	}
	
	public Player(int playerNo) {
		super();
		this.playerNo = playerNo;
	}



	public int getPlayerNo() {
		return playerNo;
	}

	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "Player [playerNo=" + playerNo + ", playerName=" + playerName + ", rank=" + rank + ", dob=" + dob
				+ ", gender=" + gender + ", nationality=" + nationality + "]";
	}
	
}
