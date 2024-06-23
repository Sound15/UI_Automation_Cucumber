package com.sound.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailsPage {
	@FindBy(id="combo_facility")
	public static WebElement FACILITY;
	
	@FindBy(id="chk_hospotal_readmission")
	public static WebElement RE_ADMISSION;
	
	@FindBy(id="radio_program_medicaid")
	public static WebElement MEDIC_AID;
	
	@FindBy(id="txt_visit_date")
	public static WebElement DATE_BOX;

	
	@FindBy(className="next")
	public static WebElement NEXT;

	
	@FindBy(xpath="//td[contains(text(),\"10\")]")
	public static WebElement DATE;

	
	@FindBy(id="txt_comment")
	public static WebElement COMMENT;

	
	@FindBy(id="btn-book-appointment")
	public static WebElement BOOK_APPOINTMENT;


}






