package com.luv2code.springdemo;

import com.luv2code.springdemo.models.entities.TrackCoach;

public class MyApp {

	public static void main(String[] args) {

		//create the object
		Coach theCoach = new TrackCoach();
		//use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
