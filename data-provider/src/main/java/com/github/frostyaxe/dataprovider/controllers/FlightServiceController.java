package com.github.frostyaxe.dataprovider.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.frostyaxe.dataprovider.services.FlightDataService;

@RestController
public class FlightServiceController
{
	
	
	private FlightDataService flightService = null;

	
	
	{
		flightService = new FlightDataService();
	}
	
	
	@RequestMapping("/flight/get/{index}")
	public String getData(@PathVariable int index)
	{
		
		return flightService.getData(index);
	}
	
}
