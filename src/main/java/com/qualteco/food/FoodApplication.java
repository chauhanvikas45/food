package com.qualteco.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class FoodApplication {
	public static void main(String[] args) {
		SpringApplication.run(FoodApplication.class, args);
	}

}
