package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.City;
import utility.ConnectionManager;

public class CityDAO {

	public void createCity(City city) throws SQLException, Exception {
		
		String sql = "INSERT INTO CITY VALUES (?,?)";
		
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		
		st.setLong(1, city.getCityId());
		st.setString(2, city.getCityName());
		
		int x = st.executeUpdate();
		
		System.out.println(x);
	}
	public void getCityByName(String name) throws Exception {

		String sql = "SELECT * FROM CITY";
		
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		ResultSet result = st.executeQuery();
		
		while(result.next()) {
			String checkName = result.getString("name");
			if(name.equals(checkName))
				System.out.println("Equal");
		}
	}
}
