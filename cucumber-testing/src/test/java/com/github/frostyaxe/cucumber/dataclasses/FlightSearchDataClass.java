package com.github.frostyaxe.cucumber.dataclasses;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.github.frostyaxe.cucumber.pojos.FlightSearchPojo;
import com.github.frostyaxe.datafactory.DataFactory;
import com.github.frostyaxe.datafactory.annotations.FactoryConfig;
import com.github.frostyaxe.datafactory.annotations.SearchData;

@FactoryConfig( host = "localhost",  port = 8081 )
public class FlightSearchDataClass {

	private FlightSearchPojo flightSearchPojo = new FlightSearchPojo();
	
	private String dynamicPath;
	
	@SearchData( path = "{dynamicPath}" )
	private String flightData;
	
	public FlightSearchDataClass(String locator)
	{
		
		dynamicPath = locator;
		DataFactory.initData(this);
		init();
	}
	
	public void init()
	{
		
		JSONParser parser = new JSONParser();
		JSONObject contentObj = null;
		try 
		{
			 contentObj = (JSONObject)parser.parse(this.flightData);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		flightSearchPojo.setFrom( String.valueOf( contentObj.get("from") ));
		flightSearchPojo.setTo( String.valueOf( contentObj.get("to") ));
		flightSearchPojo.setDeparture( String.valueOf( contentObj.get("departing") ));
		flightSearchPojo.setReturning( String.valueOf( contentObj.get("returning") ));
		flightSearchPojo.setTravellers( String.valueOf( contentObj.get("travellers") ));
		
	}
	
	public FlightSearchPojo getPojo()
	{
		return flightSearchPojo;
	}
	
}
