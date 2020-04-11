package model;

public class Team{
	
	String name, coach;
	long city;
	int id;
	int captain;
	
	public int getCaptain() {
		return captain;
	}
	public void setCaptain(int captain) {
		this.captain = captain;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public long getCity() {
		return city;
	}
	public void setCity(long city) {
		this.city = city;
	}
	
	public Team(int id, String name, String coach, long city, int captain) {
		super();
		this.name = name;
		this.coach = coach;
		this.city = city;
		this.id = id;
		this.captain = captain;
	}
	
}