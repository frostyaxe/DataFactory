# Application Name: Expedia
#           Module: Hotel Search
#           Author: Abhishek Prajapati
#            Email: prajapatiabhishek1996@gmail.com
#############################################################################################

Feature: Expedia Hotel Search
		     Hotel Search functionality is getting tested of the Expedia Web Application
		     
		Background: 
		    Given User is on Expedia Homepage
		    
		Scenario: Hotel Search with correct details
		    Given User is able to see the Expedia HomePage
		    When User clicks on Hotel Tab button
		    And User enters the correct data in the form fields
		    And Clicks on the search button
		    Then User must be navigated to the results page