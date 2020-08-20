package com.ceit.tutorial2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ceit.tutorial2.controllers.GreetingController;

@SpringBootApplication
public class Tutorial2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Tutorial2Application.class, args);
		
		GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
		
		greetingController.sayHello();
	}

}
