package com.sound.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConformationPage {

	@FindBy(xpath="//h2")
	public static WebElement TITLE;
	
	@FindBy(id="facility")
	public static WebElement FACILITY_CONF;
	
	@FindBy(id="hospital_readmission")
	public static WebElement READMISSION_CONF;
	
	@FindBy(id="program")
	public static WebElement PROGRAM_CONF;
	
	@FindBy(id="visit_date")
	public static WebElement DATE_CONF;
	
	@FindBy(id="comment")
	public static WebElement COMMENT_CONF;
	
	@FindBy(className="btn btn-default")
	public static WebElement HOME_PAGE;

}
