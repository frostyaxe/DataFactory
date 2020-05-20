package com.github.frostyaxe.cucumber.dataclasses;

import org.springframework.stereotype.Component;

import com.github.frostyaxe.datafactory.DataFactory;
import com.github.frostyaxe.datafactory.annotations.FactoryConfig;
import com.github.frostyaxe.datafactory.annotations.SearchData;


@FactoryConfig( host = "localhost", port = 8081 )
@Component
public class HotelDataClass 
{
	
	

	@SearchData( path = "hotel/goingTo" )
	private String goingTo;
	
	@SearchData( path = "hotel/checkIn" )
	private String checkIn;
	
	@SearchData( path = "hotel/checkOut" )
	private String checkOut;
	
	
	
	public HotelDataClass()
	{
		DataFactory.initData(this);
	}
	
	public String getGoingTo()
	{
		return goingTo;
	}
	
	public String getCheckIn()
	{
		return checkIn;
	}
	
	public String getCheckOut()
	{
		return checkOut;
	}
}
