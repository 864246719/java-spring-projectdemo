package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneServices;
		
	 public TrackCoach(FortuneService fortuneServices) {
		this.fortuneServices = fortuneServices;
	}

	@Override
	public String getDailyworkkout() {
		return "run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: "+fortuneServices.getFortune();
	}
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach:init method doMyStartUpStuff");
	}
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach:inside method doMyCleanupStuffYoYO");
	}
}
