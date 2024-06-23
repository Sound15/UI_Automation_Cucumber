package com.sound.step_defnitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sound.constants.Constants;
import com.sound.utilities.CommonUtils;
import com.sound.webdriver_manager.DriverManager;

import io.cucumber.java.Before;

public class Common_Step_Defnition {
	
	
	//public static WebDriver driver;
	private static final Logger LOGGER=LogManager.getLogger(Common_Step_Defnition.class);
	@Before
	public void beforeScenario() {
		LOGGER.info("Execution Started");
		try {
			LOGGER.info("Instantiating CommonUtils");
			CommonUtils commonUtils = new CommonUtils();
			LOGGER.info("Loading the Properties File");
			commonUtils.loadProperties();
			LOGGER.info("Checking the driver is null or not");
			//if (driver==null) {
			if(DriverManager.getDriver()==null) {
				LOGGER.info("Driver is null.Instantiating it!");
				//launchBrowser();
				DriverManager.launchbrowser();                                                    
				CommonUtils.initWebElements();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	public void launchBrowser() {
//		try {
//			switch(Constants.BROWSER){
//				case"chrome":
//					driver=new ChromeDriver();
//					break;
//				case"firefox":
//					driver=new FirefoxDriver();
//					break;
//				default:
//					driver=new ChromeDriver();
//					break;
//			}}
//		catch(Exception e) {
//			e.printStackTrace();
//		
//			}
//		}
	}
	
	


