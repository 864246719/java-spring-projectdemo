package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	 
	private FortuneService fortuneService;
	//�˴������ö���
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyworkkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
