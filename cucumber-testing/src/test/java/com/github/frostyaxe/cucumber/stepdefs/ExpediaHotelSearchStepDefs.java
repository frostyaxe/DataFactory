package com.github.frostyaxe.cucumber.stepdefs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import com.github.frostyaxe.cucumber.controllers.BaseController;
import com.github.frostyaxe.cucumber.dataclasses.HotelDataClass;
import com.github.frostyaxe.cucumber.pages.ExpediaSearch;
import com.github.frostyaxe.cucumber.pages.ExpediaSearch.HotelSearch;
import io.cucumber.java8.En;

public class ExpediaHotelSearchStepDefs implements En
{

		
		/**
		 * @param controller
		 */
		public ExpediaHotelSearchStepDefs(@Autowired BaseController controller, @Autowired HotelDataClass hotelData)
		{

			
			HotelSearch hotelSearchObj = new ExpediaSearch(controller).getHotelSearchObj();

			
			When("User clicks on Hotel Tab button", () -> {
				
				hotelSearchObj.getHotelTabButton().click();
				
			});
			
			And("User enters the correct data in the form fields", () -> {
				
				
				
				
				new WebDriverWait(controller.getDriver(), 15).until(ExpectedConditions.visibilityOf(hotelSearchObj.getGoingToTextField()));
				
				
					
					hotelSearchObj.getGoingToTextField().sendKeys( hotelData.getGoingTo() );
					
					hotelSearchObj.getCheckInDateField().sendKeys( hotelData.getCheckIn()  );
					
					hotelSearchObj.getCheckOutDateField().sendKeys( hotelData.getCheckOut()  );
					
				
			});
			
			
			And("Clicks on the search button",() -> {
				hotelSearchObj.getSearchButton().click();
			} );
			
			Then("User must be navigated to the results page", () -> {
				
				controller.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				Thread.sleep(15000);
				String actualTitle = controller.getDriver().getTitle();
				String expectedTitle = "Mumbai, India (BOM-Chhatrapati Shivaji Intl.) Hotel Search Results";
				
				Assert.assertEquals(actualTitle, expectedTitle);
				
			});
			
		
		}
}
