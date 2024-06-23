package com.sound.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.sound.constants.Constants;
import com.sound.page_objects.ConformationPage;
import com.sound.page_objects.DetailsPage;
import com.sound.page_objects.HomePage;
import com.sound.page_objects.LoginPage;
import com.sound.webdriver_manager.DriverManager;

public class CommonUtils {

	
	public void loadProperties() {
		Properties properties=new Properties();
		
		try {
			//reader=new FileReader("config.properties");
			properties.load(getClass().getResourceAsStream("/config.properties"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//		try {
//			properties.load(reader);
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
		Constants.APP_URL=properties.getProperty("APP_URL");
		Constants.BROWSER=properties.getProperty("BROWSER");
		Constants.USERNAME=properties.getProperty("UserName");
		Constants.PASSWORD=properties.getProperty("Password");
		
		
		
	}
	
	public static void initWebElements() {
		PageFactory.initElements(DriverManager.getDriver(),LoginPage.class);
		PageFactory.initElements(DriverManager.getDriver(),HomePage.class);
		PageFactory.initElements(DriverManager.getDriver(),DetailsPage.class);
		PageFactory.initElements(DriverManager.getDriver(),ConformationPage.class);
	}
}
