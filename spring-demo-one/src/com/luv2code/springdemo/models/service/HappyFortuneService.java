package com.luv2code.springdemo.models.service;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
