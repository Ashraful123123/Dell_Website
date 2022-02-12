package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.bangladesh.PageAction.DellLogInPageAction;
import com.bangladesh.Util.TestBaseParentClass;
import com.bangladesh.Util.Utill;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefDellLogInPage extends TestBaseParentClass{
	
	DellLogInPageAction objOfdellLoginAction = new DellLogInPageAction();

	@Given("^Open Dell Web Application \"([^\"]*)\"$")//Cucumber made a regular expression with 
	public void Open_Dell_WebApplication(String URL) throws Throwable {	    //the parameter(String URL)

		// In the feature file we wrote "URL" so,we pass the value URL here.		
         	lunchUrl(URL);//Here we are passing the URL,Which we declared in lunchUrl method        	
	}
	
	@Then("^click On Sign In Button$")
	public void click_On_Sign_In_Button() throws Throwable {
		objOfdellLoginAction.clickOnSignInButtons();
	}

	@Then("^click Signin Link$")
	public void click_Signin_Link() throws Throwable {
		JavascriptExecutor obj2 = (JavascriptExecutor) driver;
		obj2.executeScript("window.scrollBy(0,80)");
		driver.manage().timeouts().pageLoadTimeout(Utill.pageLoadTimeout,TimeUnit.SECONDS);
		objOfdellLoginAction.clickSigninLink();
	}

	@Then("^enter Username Password And Click Signin$")
	public void enter_Username_Password_And_Click_Signin() throws Throwable {
		JavascriptExecutor obj3 = (JavascriptExecutor) driver;
		obj3.executeScript("window.scrollBy(0,150)");
		objOfdellLoginAction.enterUsernamePasswordAndClickSignin(loadTheFile.getProperty("userName"), loadTheFile.getProperty("password"));
	}

	@Then("^verify User Can Login$")
	public void verify_User_Can_Login() throws Throwable {
		objOfdellLoginAction.verifyUserCanLogin();
	}
}
