package com.github.frostyaxe.cucumber.controllers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;


/**
 * <b>Description:</b> This controller class acts as WebDriver configurer. It
 * can also be used for the storage of page objects and can be used later on in
 * the project
 * 
 * @author Abhishek Prajapati
 * @team Frostyaxe
 * @email prajapatiabhishek1996@gmail.com
 *
 */

@Component
public class BaseController
{
	
	/**
	 *  Initialization/Declaration of Class/Instance Variable.
	 */
	private WebDriver driver = null;
	
	
	
	/**
	 * This default constructor initializes the ChromeDriver whenever the object is
	 * created of this class.
	 * 
	 * @author Abhishek Prajapati
	 * @team Frostyaxe
	 * @email prajapatiabhishek1996@gmail.com
	 */
	public BaseController()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/node_modules/chromedriver/lib/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	
	/**
	 * <b>Description:</b> This getter method returns the instance of the
	 * ChromeDriver.
	 * 
	 * @author Abhishek Prajapati
	 * @team Frostyaxe
	 * @email prajapatiabhishek1996@gmail.com
	 * @return Object of the ChromeDriver.
	 */
	public WebDriver getDriver()
	{
		return driver;
	}
	
}
