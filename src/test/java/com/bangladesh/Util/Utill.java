package com.bangladesh.Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utill {
	//if we declare the method name as static we 
	//don't need create any object of this class
	//we can access this method without creating any object.
	public static long implicitly_wait =20;
	public static long pageLoadTimeout =30;

			//we made this as static and named as takeScreenshot
					//We also declearing our driver here,
	//Also we are passing a paremeter here which is String and name as screenshot
public static void takeScreenshot(WebDriver driver, String screenshot) {
				//This TakesScreenshot interface is responsible for taking a screenshot
	//Sc
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//Everything we are doing in directory//everytime we give the path we use user.dir
	//because we will run the code  from cloud side
	String correntdir = System.getProperty("user.dir");
	
	try {//Screenshot support only png format		//This is my folder name//
		FileUtils.copyFile(srcFile, new File(correntdir+"/ScreenShots/"+screenshot+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
