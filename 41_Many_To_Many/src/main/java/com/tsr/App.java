package com.tsr;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.tsr.dao.PlayerDAo;
import com.tsr.entities.Player;
import com.tsr.entities.Team;
import com.tsr.helper.SessionFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
        try {
			//addPlayer();
			//addTeam();
        	//getPlayer();
        	getTeam();
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
    }

	private static void addPlayer() {
		PlayerDAo dao = new PlayerDAo();
		Player player1 = new Player();
		player1.setPlayerName("Sachin");
		player1.setRank(1);
		player1.setGender("M");
		player1.setNationality("Indian");
		player1.setDob(LocalDate.of(1970, 2, 23));
		
		Player player2 = new Player();
		player2.setPlayerName("Rahul Dravid");
		player2.setRank(2);
		player2.setGender("M");
		player2.setNationality("Indian");
		player2.setDob(LocalDate.of(1976, 3, 23));
		
		dao.addPlayer(player1);
		dao.addPlayer(player2);
	}
	
	private static void addTeam() {
		PlayerDAo dao = new PlayerDAo();
		Team team = new Team();
		team.setTeamName("India Team");
		team.setCaptain("Saurav");
		team.setCoach("Kapil");
		team.setDescription("Indian Team");
		team.setRepresentationCountry("India");
		
		Player player1 = new Player(1);
		Player player2 = new Player(2);
		Set<Player> players = new HashSet<>();
		players.add(player1);
		players.add(player2);
		
		team.setPlayers(players);
		
		dao.addTeam(team);
	}
	
	private static void getPlayer() {
		PlayerDAo dao = new PlayerDAo();
		dao.getPlayer(1);
	}
	
	private static void getTeam() {
		PlayerDAo dao = new PlayerDAo();
		dao.getTeam(1);
	}
}
