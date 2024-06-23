package com.sound.step_defnitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;

import com.sound.constants.Constants;
import com.sound.page_objects.ConformationPage;
import com.sound.page_objects.DetailsPage;
import com.sound.page_objects.HomePage;
import com.sound.page_objects.LoginPage;
import com.sound.webdriver_manager.DriverManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Appointment_Booking_Step_Def {
	
	private static final Logger LOGGER=LogManager.getLogger(Verify_Appointment_Booking_Step_Def.class);
	
	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() {
	    DriverManager.getDriver().get(Constants.APP_URL);
	}

	@And("the user clicks on the make appointment button")
	public void the_user_clicks_on_the_make_appointment_button() {
	    HomePage.MAKE_APPOINTMENT.click();
	    LOGGER.info("the user clicks on the make appointment option");
	}

	@And("the user login using the username and password")
	public void the_user_login_using_the_username_and_password() {
	    LoginPage.USERNAME.sendKeys(Constants.USERNAME);
	    LoginPage.PASSWORD.sendKeys(Constants.PASSWORD);
	    LoginPage.LOGIN_BUTTON.click();
	    
	    String url=DriverManager.getDriver().getCurrentUrl();
	    if(url.contains("appointment")) {
	    	LOGGER.info("the user is logged in successfully");
	    }
	}

	@And("the user selects the facility as {string} from the dropdown")
	public void the_user_selects_the_facility_as_from_the_dropdown(String facilityname) {
		Select facility= new Select(DetailsPage.FACILITY);
		facility.selectByVisibleText(facilityname);
		LOGGER.info("the user selects the facility as "+facilityname+" from the dropdown");
	}
	

    @And("the user checks the checkbox of readmission")
    public void the_user_checks_the_checkbox_of_readmission() {
    	DetailsPage.RE_ADMISSION.click();
    	LOGGER.info("the user checks the checkbox of readmission");
    }
	
    @Given("the user selects radiobutton of Medicaid Healthcare program")
    public void the_user_selects_radiobutton_of_medicaid_healthcare_program() {
    	DetailsPage.MEDIC_AID.click();
    	LOGGER.info("the user selects radiobutton of Medicaid Healthcare program");
    }
    
    @Given("the user selects the Tenth date of next month")
    public void the_user_selects_the_tenth_date_of_next_month() {
    	DetailsPage.DATE_BOX.click();
		DetailsPage.NEXT.click();
		DetailsPage.DATE.click();
		LOGGER.info("the user selects the Tenth date of next month");
    }
    
    @Given("the user adds necesssary comments as {string}")
    public void the_user_adds_necesssary_comments_as(String comment) {
    	DetailsPage.COMMENT.sendKeys(comment);
    	LOGGER.info("the user adds necesssary comments as "+comment);
    }	

	@When("the user clicks on book appointment button")
	public void the_user_clicks_on_book_appointment_button() {
	    DetailsPage.BOOK_APPOINTMENT.click();
	    LOGGER.info("the user clicks on book appointment button");
	}

	@Then("the user should see the title as {string}")
	public void the_user_should_see_the_title_as(String expectedTitle) {
		
	    String actualTitle=ConformationPage.TITLE.getText();
	    if(actualTitle.equalsIgnoreCase(expectedTitle)) {
	    	LOGGER.info("Expected Title is displayed");
	    	}
	}
	
	@And("the user should see the facility as {string}")
		public void the_user_should_see_the_facility_as(String expectedFacility) {
		String actualFacility=ConformationPage.FACILITY_CONF.getText();
	    if(actualFacility.equalsIgnoreCase(expectedFacility)) {
	    	LOGGER.info("Expected Facility is displayed");
	    }
    }
	
	@And("the user should see the readmission status as {string}")
	public void the_user_should_see_the_readmission_status_as(String expectedStatus) {
		String actualReadmissionStatus=ConformationPage.READMISSION_CONF.getText();
	    if(actualReadmissionStatus.equals(expectedStatus)) {
	    	LOGGER.info("Expected Readmission status is displayed");
	    }
	    
    }
	
	@And("the user should see the program as {string}")
	public void the_user_should_see_the_program_as(String expectedProgram) {
		String actualProgram=ConformationPage.PROGRAM_CONF.getText();
	    if(actualProgram.equals(expectedProgram)) {
	    	LOGGER.info("Expected Program is displayed");
	    }
	    
    }    
	    
	@And("the user should see the date as {string}")
	public void the_user_should_see_the_date_as(String expectedDate) {
		String actualDate=ConformationPage.DATE_CONF.getText();
	    if(actualDate.equals(expectedDate)) {
	    	LOGGER.info("Expected Date is displayed");
	    }
	    
    }        
	    
	@And("the user should see the comment as {string}")
	public void the_user_should_see_the_comment_as(String expectedComment) {
		String actualComment=ConformationPage.COMMENT_CONF.getText();
	    if(actualComment.equals(expectedComment)) {
	    	LOGGER.info("Expected comment is displayed");
	    }

	    
     }         
	    
	    
}
