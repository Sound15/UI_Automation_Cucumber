package com.sound.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id="txt-username")
	public static WebElement USERNAME;
	@FindBy(id="txt-password")
	public static WebElement PASSWORD;
	@FindBy(id="btn-login")
	public static WebElement LOGIN_BUTTON;

}
