package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component  //����� spring��ע����
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is my lucky day!";
	}

}
