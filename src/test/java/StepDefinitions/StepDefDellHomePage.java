package StepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;

import com.bangladesh.PageAction.DellHomePageAction;
import com.bangladesh.Util.LogsHelperConsole;
import com.bangladesh.Util.TestBaseParentClass;
import com.bangladesh.Util.Utill;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefDellHomePage extends TestBaseParentClass {
	
	DellHomePageAction objOfdellHomeAction = new DellHomePageAction();
	   	//Here we wrote like ClassName.our method name getLogss(now I need to pass My Class name .class) 
				//since this line of code is returning log,so we have to store it in Logger Class
	//And in order to use any kind of class we have create an object so,we give an object name as log
	Logger log = LogsHelperConsole.getLogss(LogsHelperConsole.class);

	@Given("^Open Dell WebApplication \"([^\"]*)\"$")//Cucumber made a regular expression with 
	public void Open_Dell_WebApplication(String URL) throws Throwable {	    //the parameter(String URL)

		    //In the feature file we wrote "URL" so,we pass the value URL here.		
         	lunchUrl(URL);//Here we are passing the URL,Which we declared in lunchUrl method        	
         	Utill.takeScreenshot(driver, "HomePage");
         	log.info("Opening the url");
            //here we used the object (log and method info)to know where we are at that moment
	}
	

	@Then("^enter XPS in search field$")
	public void enter_XPS_in_search_field() throws Throwable {
		objOfdellHomeAction.enterXPSinsearchfield();
		JavascriptExecutor obj = (JavascriptExecutor) driver;
		obj.executeScript("window.scrollBy(0,150)");
     	log.info("clicking on shop now");

	}

	@Then("^click on search button$")
	public void click_on_search_button() throws Throwable {
		
		JavascriptExecutor obj1 = (JavascriptExecutor) driver;
		obj1.executeScript("window.scrollBy(0,50)");
		objOfdellHomeAction.clickonsearchbutton();
     	log.info("clicking on laptop");

	}

	@Then("^verify search result display$")
	public void verify_search_result_display() throws Throwable {
		JavascriptExecutor obj2 = (JavascriptExecutor) driver;
		obj2.executeScript("window.scrollBy(0,250)");
		
		objOfdellHomeAction.verifysearchresultdisplay();
		
		Utill.takeScreenshot(driver, "seacrhResult");
     	log.info("verify we are in the expected page");

	}
}
//In future we are going to run our code from cloud
//Without the framework we can not run our code from cloud
//
