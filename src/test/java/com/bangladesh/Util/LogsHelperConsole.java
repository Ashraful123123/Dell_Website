package com.bangladesh.Util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
									//
public class LogsHelperConsole {	//we use log4j dependencies to use the log

//here root is a variable name ,and it's value is true or false//boolean give us true or false 
	
	private static boolean root = false;
	//here Logger is a class, and getLogs is a method,//and it is looking for some parameter
	//they put the class, and also declare a  class parametere
	//Here Class is a datatype and cls is just a variable or paarmetere we are passing
	
//	public static Logger getLogss(Class cls) {
//		
//		if(root) {
//			return Logger.getLogger(cls);
//		}
//		PropertyConfigurator.configure("log4j.properties");
//		root=true;
//		return Logger.getLogger(cls);
//	}

	public static Logger getLogss(Class cls) {
		// TODO Auto-generated method stub
		if(root) {
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j.properties");
		root=true;
		return Logger.getLogger(cls);
//		return null;
	}

}