package com.github.frostyaxe.cucumber.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.github.frostyaxe.cucumber.dataclasses.HotelDataClass;


@SpringBootApplication
@ComponentScan( basePackages = "com.github.frostyaxe.cucumber.dataclasses" )
public class Application {
	
	public static void main(String args[])
	{
		
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public HotelDataClass getBean()
	{
		return new HotelDataClass();
	}
}
