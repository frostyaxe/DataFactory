package com.github.frostyaxe.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.github.frostyaxe.cucumber.controllers.BaseController;

/**
 * <b>Description:</b> This is the Search Page class containing the Object of
 * web elements present on the search page.
 * 
 * @author Abhishek Prajapati
 * @team Frostyaxe
 * @email prajapatiabhishek1996@gmail.com
 *
 */
public class ExpediaSearch 
{
	
	
	/**
	 *  Initialization/Declaration of Class/Instance variables.
	 */
	BaseController controller = null;
	
	
	/**
	 * <b>Description:</b> This constructor initializes the Basecontroller reference
	 * variable with the baseController object.
	 * 
	 * @param controller : Object of the BaseController class
	 * @author Abhishek Prajapati
	 * @team Frostyaxe
	 * @email prajapatiabhishek1996@gmail.com
	 */
	public ExpediaSearch(BaseController controller)
	{
		this.controller = controller;
	}
	
	
	
	/**
	 * <b>Description:</b> This getter method returns the Object of Flight Search
	 * Class. Flight Search class contains the web elements which is present in the
	 * Flight Search tab.
	 * 
	 * @author Abhishek Prajapati
	 * @team Frostyaxe
	 * @email prajapatiabhishek1996@gmail.com
	 * @return
	 * 		Object of FlightSearch class.
	 */
	public FlightSearch getFlightSearchObj()
	{
		return new FlightSearch();
	}
	
	
	
	/**
	 * <b>Description:</b> This getter method returns the Hotel Search Object. Hotel
	 * Search class contains objects of web elements that are present in the Hotel
	 * Search tab.
	 * 
	 * @author Abhishek Prajapati
	 * @team Frostyaxe
	 * @email prajapatiabhishek1996@gmail.com
	 * @return
	 * 		Object of the HotelSearch class
	 */
	public HotelSearch getHotelSearchObj()
	{
		return new HotelSearch();
	}
	
	
	
	/**
	 * <b>Description:</b> This inner class creates and stores the web element
	 * objects that are present in the Flight search tab of Expedia application.
	 * 
	 * @author Abhishek Prajapati
	 * @team Frostyaxe
	 * @email prajapatiabhishek1996@gmail.com
	 */
   public class FlightSearch
	{
		
	    /**
	     * Declaration/Initialization of class/instance variables.
	     */
		private WebDriver driver;					// Selenium WebDriver reference variable.
		
		@FindBy(xpath = "//*[@id=\"tab-flight-tab-hp\"]")
		private WebElement flightTabButton;			// Flight Search Tab Button
		
		@FindBy(xpath ="//input[@id='flight-origin-hp-flight']")
		private WebElement flyingFromTextField;		// Text field that accepts "Flying From" location.
		
		@FindBy(xpath = "//input[@id='flight-destination-hp-flight']")
		private WebElement flyingToTextField;       // Text field that accepts "Flying To" location.
		
		@FindBy(xpath = "//input[@id='flight-departing-hp-flight']")
		private WebElement departingTextField;		// Date Field that accepts the departing date of Journey.
		
		@FindBy(xpath = "//input[@id='flight-returning-hp-flight']")
		private WebElement returningTextField;		// Date Field that accepts the returning date of Journey.
		
		@FindBy(xpath = "//div[@id='traveler-selector-hp-flight']/div/ul/li/button")
		private WebElement travellersButton;		// Travellers button that allows the user to increase and decrease the number of passengers.
		
		@FindBy(xpath = "(//div[@class=\"traveler-selector-sinlge-room-data traveler-selector-room-data\"]/child::div)[1]/child::div[@class=\"uitk-col all-col-shrink\"][2]/button")
		private WebElement travellersAdultIncreaseButton;	// Button that helps the to increase the number of adult passenger.
		
		@FindBy( xpath = "(//div[@class=\"cols-nested ab25184-submit\"][1]/descendant::button)[1]" )
		private WebElement searchButton;			// Search button that send the request to database and then lands the user on the Results page.
		
		
		
		/**
		 * <b>Description:</b> This constructor access the BaseController's object from
		 * the outer class and then initializes the web elements by using PageFactory.
		 * 
		 * @author Abhishek Prajapati
		 * @team Frostyaxe
		 * @email prajapatiabhishek1996@gmail.com
		 */
		private FlightSearch()
		{
			this.driver = controller.getDriver();
			PageFactory.initElements(driver, this);
		}
		
		
		
		
		/**
		 * <b>Description:</b> This getter method returns the WebElement object of Flying
		 * From text field.
		 * 
		 * @author Abhishek Prajapati
		 * @team Frostyaxe
		 * @email prajapatiabhishek1996@gmail.com
		 * @return Object of Flying From Web Element ( Text Field )
		 */
		public WebElement getFlyingFromTextField()
		{
			return flyingFromTextField;
		}
		
		
		
		/**
		 * <b>Description:</b> This getter method returns the WebElement object of Flight
		 * Tab button
		 * 
		 * @author Abhishek Prajapati
		 * @team Frostyaxe
		 * @email prajapatiabhishek1996@gmail.com
		 * @return Object of Flight Tab Web Element ( Tab Button )
		 */
		public WebElement getFlightTabButton()
		{
			return flightTabButton;
		}
		
		
		
		
		/**
		 * <b>Description:</b> This getter method returns the WebElement object of Flying
		 * To text field.
		 * 
		 * @author Abhishek Prajapati
		 * @team Frostyaxe
		 * @email prajapatiabhishek1996@gmail.com
		 * @return Object of Flying To Web Element ( Text Field )
		 */
		public WebElement getFlyingToTextField()
		{
			return flyingToTextField;
		}
		
		
		
		/**
		 * <b>Description:</b> This getter method returns the WebElement object of
		 * Departing Date web element.
		 * 
		 * @author Abhishek Prajapati
		 * @team Frostyaxe
		 * @email prajapatiabhishek1996@gmail.com
		 * @return Object of Departing Date Web Element ( DatePicker )
		 */
		public WebElement getDepartingTextField()
		{
			return departingTextField;
		}
		
		
		
		/**
		 * <b>Description:</b> This getter method returns the WebElement object of
		 * returning Date web element.
		 * 
		 * @author Abhishek Prajapati
		 * @team Frostyaxe
		 * @email prajapatiabhishek1996@gmail.com
		 * @return Object of returning Date Web Element ( DatePicker )
		 */
		public WebElement getReturningTextField()
		{
			return returningTextField;
		}
		
		
		/**
		 * <b>Description:</b> This getter method returns the WebElement object of
		 * travellers button that increases and decreased the number of passengers.
		 * 
		 * @author Abhishek Prajapati
		 * @team Frostyaxe
		 * @email prajapatiabhishek1996@gmail.com
		 * @return Object of travellers button Web Element ( Button )
		 */
		public WebElement getTravellersButton()
		{
			return travellersButton;
		}
		
		
		
		/**
		 * <b>Description:</b> This getter method returns the WebElement object of
		 * travellers button that increases and decreased the number of passengers.
		 * 
		 * @author Abhishek Prajapati
		 * @team Frostyaxe
		 * @email prajapatiabhishek1996@gmail.com
		 * @return Object of travellers button Web Element ( Button )
		 */
		public WebElement getTravellersAdultIncreaseButton()
		{
			return travellersAdultIncreaseButton;
		}
		
		
		
		/**
		 * <b>Description:</b> This getter method returns the WebElement object of
		 * Search Button
		 * 
		 * @author Abhishek Prajapati
		 * @team Frostyaxe
		 * @email prajapatiabhishek1996@gmail.com
		 * @return Object of Search button Web Element ( Button )
		 */
		public WebElement getSearchButton()
		{
			return searchButton;
		}
		
	}
   
   
   
   public class HotelSearch
   {
	   
	   private WebDriver driver = null;
	   
	   @FindBy(xpath = "//button[@id='tab-hotel-tab-hp']" )
	   private WebElement hotelTabButton;
	   
	   @FindBy( xpath= "//input[@id='hotel-destination-hp-hotel']" )
	   private WebElement goingToTextField;
	   
	   @FindBy( xpath = "//input[@id='hotel-checkin-hp-hotel']" )
	   private WebElement checkInDateField;
	   
	   @FindBy( xpath = "//input[@id='hotel-checkout-hp-hotel']")
	   private WebElement checkOutDateField;
	   
	   @FindBy( xpath = "//button[@data-gcw-change-submit-text='Search']")
	   private WebElement searchButton;
	   
	   private HotelSearch()
	   {
		  
		   this.driver = controller.getDriver();
		   PageFactory.initElements(driver, this);
		   
	   }
	   
	   
	   public WebElement getHotelTabButton()
	   {
		   return hotelTabButton;
	   }
	   
	   public WebElement getGoingToTextField()
	   {
		   return goingToTextField;
	   }
	   
	   public WebElement getCheckInDateField()
	   {
		   return checkInDateField;
	   }
	   
	   public WebElement getCheckOutDateField()
	   {
		   return checkOutDateField;
	   }
	   
	   public WebElement getSearchButton()
	   {
		   return searchButton;
	   }
   }
}
