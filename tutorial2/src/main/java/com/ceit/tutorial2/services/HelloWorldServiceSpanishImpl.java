package com.ceit.tutorial2.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("spanish")
public class HelloWorldServiceSpanishImpl implements HelloWorldService {

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Hello world in spanish";
	}
	

}
