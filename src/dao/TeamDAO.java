package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Team;
import utility.ConnectionManager;

public class TeamDAO {
	
	public void createTeam(Team team) throws ClassNotFoundException, SQLException {
		
		String sql="INSERT INTO TEAM VALUES(?,?,?,?,?)";
		PreparedStatement st=ConnectionManager.getConnection().prepareStatement(sql);

		st.setInt(1, team.getId());
		st.setString(2, team.getName());
		st.setString(3, team.getCoach());
		st.setLong(4, team.getCity());
		st.setInt(5, team.getCaptain());
		
		int x = st.executeUpdate();
		
		System.out.println(x);
	}
}
