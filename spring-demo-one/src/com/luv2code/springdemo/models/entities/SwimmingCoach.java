package com.luv2code.springdemo.models.entities;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.models.service.FortuneService;

public class SwimmingCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	public SwimmingCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 200m and stretch";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
