package com.prac1.Prac1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Prac1Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(Prac1Application.class, args);
		Dev.build();
		Dev obj = context.getBean(Dev.class);
		obj.nonStatic();
	}

}
