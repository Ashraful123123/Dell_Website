package com.bangladesh.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  TestBaseParentClass {	//This is Our Parent Class>>(TestBaseParentClass)
									//If we need anything ,we will take it from this parent Class
	//We will make it static,so it will be more strong
	//Here we declared loadEverything variable as global variable,now anyone can access that variable
	//To load the file we use Properties Class
	
	public static Properties loadTheFile ;
	//In order to work with selenium what is the main thing we need, We need the WebDriver
	//now lets make our WebDriver as global
	public static WebDriver driver;
	
	
	
	//This constructor is responsible for going into the file location
	//And then read the file and load the file
	//We made this constructor for communicate with the config file
	public TestBaseParentClass() {//Constructor initialize all the value from the config.properties file
							//here user.dir should be in double qoutation,because it is a string
							//user is me,i am working in this system, and dir is a directory
		//I am saying that don't go anywhere,go to the  current project and find that file
		//Why we need dir(directory)because In future we are going to run that code from the cloud side
		//directory means my project directory
		//Cloud side will not come to my machine and run that code
		
		//Here FileInputStream class will go inside the config file and read everything
		//FileInputStream class is responsible for reading or writing anything 
		//inside the config.properties file
		try {
			//you want me to read or access a file give me the location of that file,here is that location
					//Here System.get-Here System means My System
					//EveryOne has User folder in their computer so, it is just reading my User Folder
						//FileInputStream class coming from Apachi POI Interface
			//because it is a framework we are writing the location in a different way
			//we are saying that go to this location and read the file
			FileInputStream readTheFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\bangladesh\\config\\configBD.properties");
											//This is the way it will go inside the file and read the file
			//Now to load the file we will need the Properties class,it will load everything
			//How I can make this loadEverything Global?
			//I want make that object(loadEverything) Global,So that everyOne can have it from anywhere.
			//Properties class is responsible for loading the file,that i given the path
			 loadTheFile = new Properties();		
			 loadTheFile.load(readTheFile);//than I use load method to load the file,
			//And I gave the file name that I want to load
		//which file i should load,please load that file--(fileReadWrite)

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//browserSetup();
		//loadEverything object is already global so we don't need to declared this
	//This is the way it will go inside the file and read everything under configBD.prpperties
	//Our values are initialise in configBD.prpperties file
	}
	
	//First try to find the key and if you find the key,and if the value is chrome,then lunch chrome browser
	//Now here in order to work with the Config.properties file,where our 
	//All the elements were Stored, we need the (Properties Class)
	//And we will use the method== getProperty(key) which is coming from the Properties Class
	//So,We already made an object of properties Class which is (loadTheFile)
	public void browserSetup() {//here my key is=browserOne and value is= Chrome
		String browserName = loadTheFile.getProperty("browserOne"); //And we have to change the backSlash of that path.
	//jodi browserName r value = chrome hoi tahole
		if(browserName.equals("chrome")) {			//We have to take the path by hovering in chromedriver.exe
			//value jodi  chrome hoi tahole chrome browser lunch koro
												//We are not giving the straight path,we are working in project level
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\\\Driver\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Utill.implicitly_wait, TimeUnit.SECONDS);
			// Here we are only hiding the values of pageLoadout and implicitlyWait
			driver.manage().timeouts().pageLoadTimeout(Utill.pageLoadTimeout, TimeUnit.SECONDS);
			// Here we are not showing are data,we are hiding our important data
		
			System.out.println("-------------------" + System.getProperty("user.dir"));

		}
		
		else	
			System.out.println("Browser Not Found");	
	}
	////////====In which Website I am Going to Work on this method is for lunch the URL I Wanted=====////////
	//we will make that method as static,so we don't have to make anything of that method
	public static void lunchUrl(String url) {//this url need to pass the value when StepDefinitions is redy
		//browserSetup();
		//We are paremeterized our Url
		///We have to pass the value when we have the stepdef ready
       //System.out.println(loadEverything.getProperty("url_qa"));
		driver.get(loadTheFile.getProperty("url_qa"));//Here we giving the key and 
		//the value of this key is dell Website
	}
}
//Properties Class
//FileInputStreem Class
//===========user.dir========
//user means user is me,I am working in this system.
//dir means directory,i am telling that don't go anywhere,go to the current project
//and  find the file
//Why we need dir-directory -in future we are going to run that code from cloud side
//so, cloud side  will not come to my machine,and run the code
//he will actually work with the project find that file,and will read or write that file

//Here we are saying go over this location,and after going in that location,--doing this by FileInputStreem Class
//Load that file-we are doing this by Properties class
//========================================//
/*
 * -------------------------------------------
===============TestBaseParentClass========================
--------------------------------------------
1.TestBAse ===parent class
2.We need constructor for initialize config file
3.We initialize the chrome browser
4.we need a method for lunching the browser
======This three things will be under the TestBase Class=======
/*
 *At FIrst FileInputStream will go inside the Config file,which we gave the path
 *then we used the Properties class and,load method to load the file
 * 
 * 
 * 
 * 
 * 
 * ======================1st Step==================
 * 1.We will have a constructor to communicate with the Config.properties file.
 * =======================2nd Step=================
 * 2.We will have a method called browserSetup for setup our Chrome Browser we
 * have given a if else condition and like if it match like this please lunch
 * the chrome browser.
 * We have given location path of the driver that is in the driver folder.
 * here,user mean my system and dir mean file directory
 * =======================3rd Step=================
 * We declared a method called lunchUrl,for lunching the Url
 * and we have taken path of the url from the config file.
 * as we already made an object of property class and we have declared the that object as global
 * and we have to use that object to fetch the url from the config file
 * so,we have used that object name, and we use getProperty method and given the key name of the url
 * in config file (url_qa) is the Key and value is the actual url(https://www.dell.com/en-us)
 * 
 */
