package com.github.frostyaxe.cucumber.hooks;

import com.github.frostyaxe.cucumber.controllers.BaseController;
import io.cucumber.java8.En;



/**
 * <b>Description:</b> This hook class closes the browser session once the
 * execution gets completed.
 * 
 * @author Abhishek Prajapati
 * @team Frostyaxe
 * @email prajapatiabhishek1996@gmail.com
 *
 */
public class ServiceHooks implements En{
	
	
	/**
	 *  Initialization/Declaration of class/instance variables
	 */
	BaseController controller;
	
	/**
	 * <b>Description:</b> This constructor contains the implemented method that
	 * removes the browser session and closes the web browser, once the execution is
	 * completed.
	 * 
	 * @param controller: Object of the basecontroller containing the webdriver
	 *                    object.
	 * @author Abhishek Prajapati
	 * @team Frostyaxe
	 * @email prajapatiabhishek1996@gmail.com
	 */
	public ServiceHooks(BaseController controller)
	{
		
		this.controller = controller;
		
		
		/**
		 * It will be called when the execution of cucumber test script will get
		 * completed.
		 */
		After( (scenario)-> 
		{
			controller.getDriver().quit();
		});
		
		
		
	}

	
	
}
