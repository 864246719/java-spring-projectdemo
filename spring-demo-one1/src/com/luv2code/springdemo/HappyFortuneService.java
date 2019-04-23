package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component  //这个类 spring将注册它
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is my lucky day!";
	}

}
