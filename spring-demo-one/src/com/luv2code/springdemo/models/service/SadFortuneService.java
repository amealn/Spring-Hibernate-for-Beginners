package com.luv2code.springdemo.models.service;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String [] fortunes = {"You will die", "Try next time", "You're gonna have a bad year"};
		return fortunes[(int) (Math.random()*3)];
	}

}
