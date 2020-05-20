# Application Name: Expedia
#           Module: Flight Search
#           Author: Abhishek Prajapati
#            Email: prajapatiabhishek1996@gmail.com
#############################################################################################



Feature: Expedia Flight Search
  	This feature file will test the different functionalities of the Expedia Flight Search Module.

		Background: 
		    Given User is on Expedia Homepage
		    
		Scenario: Expedia Return Flight Search Functionality with correct data.
				Given User is able to see the Expedia HomePage
				When User clicks on the Flights tab button
				And Enters the required details in the form fields
						| flightData   |  flight/get/0 | flight/get/1 | flight/get/2 |
						
				Then User verifies the outcome
			
		 	
				

 