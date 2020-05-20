package com.github.frostyaxe.dataprovider.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FlightDataService 
{
	
	JSONParser parser = new JSONParser();
	JSONArray jsonContent = new JSONArray();
	
	public FlightDataService()
	{
		
		FileReader reader = null;
		try {
			reader = new FileReader(new File("src/main/resources/data/flight.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			jsonContent = (JSONArray)parser.parse(reader);
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
	
	public String getData(int index)
	{
		
		return String.valueOf( jsonContent.get(index) );
	}
	
	
}
