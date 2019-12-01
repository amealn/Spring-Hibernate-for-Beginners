package com.luv2code.springdemo.models.entities;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.models.service.FortuneService;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;
	
	private FortuneService fortuneService;

	// create a no-argument constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}	
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
