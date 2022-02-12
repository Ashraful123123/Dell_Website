package com.bangladesh.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.bangladesh.Util.TestBaseParentClass;

public class DellHomePageLocator extends TestBaseParentClass{	
	//pageFactory is a Class
	//here initElements going to initialize all the locator we are going to write
	//it's job is initialize the value,what is the value, value is all the Locator.
	//This keyword is coming from java
	//This keyword is responsible for manage all the thing we are writing here
	//PageFactory is a class given by maven and ==( initElements )== is method of this class
	//initElements means initialize all the Element we are going to write
	//we are passing a driver and this keyword
	//This Constructor==(DellHomePageLocator) is going to initialize all the locator we are going to write
	//@FindBy also given by maven to locate any webElement
	//WebELement retun elements
	public DellHomePageLocator() {
		PageFactory.initElements(driver, this);
	      //We will give the locator information depending where we are landing,if sign in start in the home page
		 //we we give the first two steps of locator in the home page,here we have done that
		//All the page we are working on PageFactory CLass is controlling that.
	}
	//======================Locator Page====================//
	//(1)In Locator Class Page we will give only the location of the WebElement, nothing else.
	//(2)We use different Locators like Xpath,id,linktext to locate the WebElement.
	//(2)In Locator Class we will create a Constructor
	//(3)And in that Constructor,we declare PageFactory class and initialize the elements,
	//(4)And declare the driver, this.
	//=======================================================///
	@FindBy(how=How.XPATH,using="//*[@id=\"hpg-hero-section\"]/div/div/div/div/div[3]/a[1]")
	public WebElement searchField;
	
	@FindBy(how=How.LINK_TEXT,using="Laptops")
	public WebElement searchButton;
	
	@FindBy(how=How.XPATH,using="//span[text()='For Creators & Creativity']")
	public WebElement verifySearchResult;
}
