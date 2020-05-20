package com.github.frostyaxe.cucumber.runners;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * </b>Description:</b> This cucumber runner class runs the cucumber test
 * scripts. This runner class is integrated with the TestNG framework that
 * allows the user to use features that are present in the TestNG framework.
 * This runner class contains the configuration that are required to run the
 * feature file with step definition and generate the cucumber report in the
 * JSON format. This runner class runs the multiple scenarios in parallel.
 * 
 * @author Abhishek Prajapati
 * @email prajapatiabhishek1996@gmail.com
 * @team Frostyaxe
 */


@CucumberOptions(plugin = { "pretty" , "json:target/cucumber.json"}, monochrome = true, features = { "src/test/resources/features" }, glue = {
		"com.github.frostyaxe.cucumber.stepdefs","com.github.frostyaxe.cucumber.hooks" } )
public class ExpediaCucumberTestRunner extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider( parallel = true )
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
	
}
