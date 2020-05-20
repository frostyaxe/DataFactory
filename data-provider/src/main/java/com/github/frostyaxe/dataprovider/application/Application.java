package com.github.frostyaxe.dataprovider.application;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan( basePackages= {"com.github.frostyaxe.dataprovider.controllers","com.github.frostyaxe.dataprovider.services"} ) 
public class Application implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
	
	
	public static void main(String[] args)
	{
		Arrays.asList(args);
		
		SpringApplication.run(Application.class, args);
	}

	public void customize(ConfigurableWebServerFactory factory) {
		factory.setPort(8081);
		
	}
	
	
}
