package com.tsr.entities;

import java.io.Serializable;
import java.util.Set;


public class Team implements Serializable {
	protected int teamNo;
	protected String teamName;
	protected String description;
	protected String representationCountry;
	protected String coach;
	protected String captain;
	protected Set<Player> players;
	
	public Team() {
		super();
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRepresentationCountry() {
		return representationCountry;
	}

	public void setRepresentationCountry(String representationCountry) {
		this.representationCountry = representationCountry;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team [teamNo=" + teamNo + ", teamName=" + teamName + ", description=" + description
				+ ", representationCountry=" + representationCountry + ", coach=" + coach + ", captain=" + captain
				+ ", players=" + players + "]";
	}
	
}
