package com.bangladesh.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bangladesh.Util.TestBaseParentClass;

public class DellLogInPageLocator extends TestBaseParentClass{

	
	public DellLogInPageLocator() {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"um-si-label\"]")
	public WebElement hoverOnSignin;
	
	@FindBy(how=How.XPATH,using="//a[@href='//www.dell.com/Identity/global/LoginOrRegister/98254675-AC6F-47D9-A7E4-4537724F135D?c=us&l=en&r=us&s=corp&redirectUrl=']")
	public WebElement clickOnSignin;
	
	@FindBy(how=How.XPATH,using="//input[@id='EmailAddress']")//input[@id='EmailAddress']
	public WebElement enterEmail;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"Password\"]")
	public WebElement enterPassword;
	
	@FindBy(how=How.XPATH,using="//button[@id=\"sign-in-button\"]")
	public WebElement clickOnLogin;

	@FindBy(how=How.XPATH,using="//*[@id=\"um-si-label\"]")
	public WebElement verifyUserId;
}
