package com.teampoint.app.ui;

import java.util.Scanner;

import com.teampoint.app.models.Team;

public class Menu {
	
	public static void open() {
		
		Scanner scanner = new Scanner(System.in);
		String userInput = "";
		
		do {
			
			System.out.println("Welcome to the team points app!!");
			System.out.println("Where you can earn points for your tram to acomplisj infinite glory!!");
			System.out.println("[1] Create a team");
			System.out.println("[2] Add points to a team");
			System.out.println("[x] Exit");
			
			
			userInput = scanner.nextLine();
			switch(userInput)
			{
			case "1":
				System.out.println("Enter team name:");
				String teamName = scanner.nextLine();
				Team newTeam = new Team(teamName);
				System.out.println(newTeam);
				
				break;
			
			}
			
			
			
			
			
		}while (!userInput.equals("x"));
	}

}
