package com.github.frostyaxe.dataprovider.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.frostyaxe.dataprovider.services.HotelDataService;

@RestController
public class HotelServiceController
{
	
	
	private HotelDataService hotelService = null;

	
	
	{
		hotelService = new HotelDataService();
	}
	
	
	
	@RequestMapping("/")
	public void main()
	{
		System.out.println("Main Test");
	}
	
	@RequestMapping("/hotel/goingTo")
	public String goingTo()
	{
		return hotelService.getGoingTo();
	}
	
	
	@RequestMapping("/hotel/checkIn")
	public String checkIn()
	{
		return hotelService.getCheckIn();
	}
	
	
	
	@RequestMapping("/hotel/checkOut")
	public String checkOut()
	{
		return hotelService.getCheckOut();
	}
	
	
	
}
