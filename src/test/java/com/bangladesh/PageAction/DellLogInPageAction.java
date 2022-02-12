package com.bangladesh.PageAction;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.bangladesh.PageLocator.DellLogInPageLocator;
import com.bangladesh.Util.TestBaseParentClass;

public class DellLogInPageAction extends TestBaseParentClass{
	

	DellLogInPageLocator objOfdellLogInLocator = new DellLogInPageLocator();
	
	public void clickOnSignInButtons() {
	//	objOfdellHomeLocator.hoverOnSignin.click();
		Actions hoverSignIn = new Actions(driver);
		hoverSignIn.moveToElement(objOfdellLogInLocator.hoverOnSignin).build().perform();

	}

	public void clickSigninLink() {
		objOfdellLogInLocator.clickOnSignin.click();
	}
	public void enterUsernamePasswordAndClickSignin(String userName,String password){
		
		objOfdellLogInLocator.enterEmail.sendKeys(userName);
		objOfdellLogInLocator.enterPassword.sendKeys(password);	
		objOfdellLogInLocator.clickOnLogin.click();
	}
	
	public void verifyUserCanLogin() {
		
	boolean verifyUser = objOfdellLogInLocator.verifyUserId.isDisplayed();
	Assert.assertTrue(verifyUser);
	}
}
