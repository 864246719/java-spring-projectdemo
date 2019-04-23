package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach:inside default Constrctor");
	}
	//Spring will scan for a component that implements FortuneService interface 
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService=theFortuneService;
//	}
//	@Autowired
//	public void setFortuneService(FortuneService thefortuneService) {
//		System.out.println(">> TennisCoach: inside	SetFortuneService() method");
//		fortuneService=thefortuneService;
//	}
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService thefortuneService) {
		System.out.println(">> TennisCoach: inside	doSomeCrazyStuff() method");
		fortuneService=thefortuneService;
	}
	*/
	
	//define my init method
	//@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach:inside of doMyStartupStuff");
	}
	
	//define my destroy method
	//preDestroy
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volly";
	}

	@Override
	public String getDayilyFortune() {
		return fortuneService.getFortune();
	}
}
