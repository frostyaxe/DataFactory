package com.github.frostyaxe.dataprovider.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class HotelDataService 
{
	
	JSONParser parser = new JSONParser();
	JSONObject jsonContent = new JSONObject();
	
	public HotelDataService()
	{
		
		FileReader reader = null;
		try {
			reader = new FileReader(new File("src/main/resources/data/hotel.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			jsonContent = (JSONObject)parser.parse(reader);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if( reader != null)
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public String getGoingTo()
	{
		
		return String.valueOf( jsonContent.get("goingTo") );
	}
	
	public String getCheckIn()
	{
		
		return String.valueOf( jsonContent.get("checkIn") );
	}
	
	public String getCheckOut()
	{
		
		return String.valueOf( jsonContent.get("checkOut") );
	}
	
}
