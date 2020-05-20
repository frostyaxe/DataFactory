package com.github.frostyaxe.cucumber.stepdefs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.github.frostyaxe.cucumber.controllers.BaseController;
import com.github.frostyaxe.cucumber.dataclasses.FlightSearchDataClass;
import com.github.frostyaxe.cucumber.pages.ExpediaSearch;
import com.github.frostyaxe.cucumber.pages.ExpediaSearch.FlightSearch;
import com.github.frostyaxe.cucumber.pojos.FlightSearchPojo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;

public class ExpediaFlightSearchStepDefs implements En
{

	BaseController controller = null;
	
	public ExpediaFlightSearchStepDefs(BaseController controller)
	{
		
		
		this.controller = controller;
		ExpediaSearch expediaSearchPageObj = new ExpediaSearch(controller);
		FlightSearch flightSearch = expediaSearchPageObj.getFlightSearchObj();
		
		/**
		 * <b>Description:</b> This method opens the Expedia Homepage in the browser.
		 * 
		 * @author Abhishek Prajapati
		 * @Email prajapatiabhishek1996@gmail.com
		 */
		Given("User is on Expedia Homepage", () -> 
		{ 
			
			controller.getDriver().get("https://www.expedia.co.in/"); 		// Opens URL in the web browser.
			controller.getDriver().manage().window().maximize();			// Maximizes the web browser window.
			controller.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		});
		
		
		
		/**
		 * <b>Description:</b> This method verifies whether user is landed on the homepage or not.
		 * 
		 * @author Abhishek Prajapati
		 * @email prajapatiabhishek1996@gmail.com
		 */
		Given("User is able to see the Expedia HomePage", () -> 
		{ 
			
			String pageTitle = controller.getDriver().getTitle();
			String pageUrl = controller.getDriver().getCurrentUrl();
			String expectedTitle = "Expedia Travel: Vacations, Cheap Flights, Airline Tickets & Airfares";
			String expectedUrl = "https://www.expedia.co.in/";
			
			
			Assert.assertEquals(pageTitle, expectedTitle);
			Assert.assertEquals(pageUrl, expectedUrl);
			
		} );
		
		
		
		When("User clicks on the Flights tab button", () -> 
		{
			
			new WebDriverWait(controller.getDriver(), 10).until(ExpectedConditions.visibilityOf(flightSearch.getFlightTabButton()));
			flightSearch.getFlightTabButton().click();
			
		});
		
		And("Enters the required details in the form fields", (DataTable table) -> 
		{ 
			

			
			
			
		List<Map<String, String>> flightSearchFormData = table.transpose().asMaps(String.class, String.class);
			
			 flightSearchFormData.forEach( 
					 
					 dataMap -> {
						
			List<WebElement> elements = new ArrayList<>();	 
				 
			FlightSearchDataClass dataClass = new FlightSearchDataClass(dataMap.get("flightData"));
			FlightSearchPojo flightData = dataClass.getPojo();
			
			
			
			
			new WebDriverWait(controller.getDriver(), 10).until(ExpectedConditions.visibilityOf(flightSearch.getFlyingFromTextField()));
			flightSearch.getFlyingFromTextField().sendKeys(flightData.getFrom());
			elements.add(flightSearch.getFlyingFromTextField());
			
			flightSearch.getFlyingToTextField().sendKeys(flightData.getTo());
			elements.add(flightSearch.getFlyingToTextField());
			
			flightSearch.getDepartingTextField().sendKeys(flightData.getDeparture());
			elements.add(flightSearch.getDepartingTextField());
			
			flightSearch.getReturningTextField().sendKeys(flightData.getReturning());
			elements.add(flightSearch.getReturningTextField());
			
			
			
			try 
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
			
			elements.forEach( element -> {element.clear();} );
			
			
			 } );
			 
			 
	
		 } 
		 
				 );
	
		Then("User verifies the outcome", () -> 
		{
			System.out.println("User verfifies the outcomess");
		});
	}
	
}
