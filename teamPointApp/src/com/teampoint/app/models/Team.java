package com.teampoint.app.models;

public class Team {
	private String teamName; 
	private int totalPoints;
	private int teamId;
	
	
	public Team() {
		super();
	}


	public Team(String teamName, int totalPoints, int teamId) {
		super();
		this.teamName = teamName;
		this.totalPoints = totalPoints;
		this.teamId = teamId;
	}


	public String getTeamName() {
		return teamName;
	}



	public int getTotalPoints() {
		return totalPoints;
	}



	public int getTeamId() {
		return teamId;
	}


	public void setTeamId(int teamId) {
		this.teamId = teamId;
	} 
	
	// add points to tota; 
	
	public int addPoints(int points) {
		if(points == 0) 
		this.totalPoints += points;
		return this.totalPoints;
	}
	
	public int addPoints(PointCategories category)
	{
		this.totalPoints += category.value;
		return this.totalPoints;
	}
	
	@Override
	public String toString() {
		return "Team[teamName=" + teamName + ", totalPoints=" + totalPoints + "]";
	}
	
   public enum PointCategories{
	   public final int value;
	   private PointCategories(int value) 
	   {
		   this.value = value;
	   }
   }
	
	
	
}
