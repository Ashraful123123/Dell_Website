package com.bangladesh.TestRunnerr;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.bangladesh.Util.TestBaseParentClass;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "src/test/resources/Featuress" }, // Give me the location of Feature folder
		plugin = { "json:target/cucumber.json" }, // What kind of report you want to genarate,as a json,and html

		glue = "StepDefinitions", tags = { "@DellLogin" })



//=======We will write CucumberOption between my Package and Class======//
public class TestRunnerr extends AbstractTestNGCucumberTests{
	
	@BeforeTest//We will to use the cucumber Hooks
	public void lunchTheUrl() {	//This method is responsible for opening our browser
		TestBaseParentClass lunch = new TestBaseParentClass();
		lunch.browserSetup();
	}
	
	@AfterTest
	public void closeTheUrl() {//This method is responsible for Closing our browser
		TestBaseParentClass closeTheUrl = new TestBaseParentClass();
		closeTheUrl.driver.quit();
		
	}
//Now We will integrate The TestNg here
	//We Will Extend one of the TestNG Class(AbstractTestNGCucumberTests) given by Cucumber
	//How you integrate TestNg with TestRunnerClass?????
	//Answer:We integrate TestNg With TEstRunner Class by extending one of the class
	//Given by Cucumber
}

//Whole thing ,we have a inheritance concept
//We will have parent,and any class we have later will be the children