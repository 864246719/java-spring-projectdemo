package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data= {"hkl","hkl1","hkl2"};
	
	private Random myRandom=new Random();
	
	
	@Override
	public String getFortune() {
		int index=myRandom.nextInt(data.length);
		return data[index];
	}

}
