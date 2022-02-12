package com.bangladesh.PageAction;

import org.testng.Assert;
import com.bangladesh.PageLocator.DellHomePageLocator;
import com.bangladesh.Util.TestBaseParentClass;

public class DellHomePageAction extends TestBaseParentClass{
	//=====================Action PAge===================================//
	//(1.)In Action Page we will write what I want to do in that WebElement 
	//(2.)We will call the Location--and we will do what i want to do in the locator that I mentioned
	//(3.)What I want to do, i want to click?,i want to pass any value in any field like ##Enter First Name
	//========================================================//
//In order to work with the locator we have to extends the class TestBAseParentClass
//Every page will extends TestBaseParentClass
	
	DellHomePageLocator objOfdellHomeLocator = new DellHomePageLocator();
	
//Here the method name should be same as the step name
	public void enterXPSinsearchfield() {
		objOfdellHomeLocator.searchField.click();
		 //Here I called (searchField) by the object of Locator Page
		//After that we will write what I want to do, in that element
	   //Here I want to click here,so I used the click() method.
	}
	//Here the method name should be same as the step name
	public void clickonsearchbutton() {

		objOfdellHomeLocator.searchButton.click();
	}

	public void verifysearchresultdisplay() {
		

		boolean verifySearchResult = objOfdellHomeLocator.verifySearchResult.isDisplayed();
		Assert.assertTrue(verifySearchResult);
	}
    //This two method we are writing for the DellLogin feature
	//But for going in Login page,This two test steps we are doing in the Dell home page
	//That is why we are writing this two method in DellHomePage Step Definition

}
