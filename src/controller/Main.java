package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;

public class Main {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException, SQLException {
		
		CityDAO citydao = new CityDAO();
		TeamDAO teamdao = new TeamDAO();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter city name");
		String cityName=br.readLine();
		
		System.out.println("Enter id");
		long id=Long.parseLong(br.readLine());
		
		City city=new City(id,cityName);
		
		System.out.println("Enter id");
		int id_team = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the name");
		String name=br.readLine();
		
		System.out.println("Enter coach name");
		String coachName = br.readLine();
		
		System.out.println("Enter captain name");
		int captianName = Integer.parseInt(br.readLine());
		
		Team team = new Team(id_team, name, coachName,id,captianName);
		
		teamdao.createTeam(team);
				
	}
}
