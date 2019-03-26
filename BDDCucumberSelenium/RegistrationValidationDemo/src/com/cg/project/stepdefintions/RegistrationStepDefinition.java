package com.cg.project.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.pagebeans.LoginPage;
import com.cg.project.pagebeans.RegistrationPageBean;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefinition {
	
	private WebDriver driver;
	private RegistrationPageBean pageBean;
	
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver","D:\\software backup\\chromedriver.exe");
	}
	
	@Given("^User is accessing RegistrationPage on Browser$")
	public void user_is_accessing_RegistrationPage_on_Browser() throws Throwable {
		driver.get("D:\\WebPages\\RegistrationForm.html");
		pageBean=PageFactory.initElements(driver, RegistrationPageBean.class);
	}

	@When("^user is trying submit data without entering 'User Id'$")
	public void user_is_trying_submit_data_without_entering_User_Id() throws Throwable {
	    pageBean.clickSignUp();
	}

	@Then("^'User Id should not be empty /length be between (\\d+) to (\\d+)' alert message should display$")
	public void user_Id_should_not_be_empty_length_be_between_to_alert_message_should_display(int arg1, int arg2) throws Throwable {
	    String expectedAlertMessage="User Id should not be empty /length be between 5 to 12";
	    String actualAlertMessage=driver.switchTo().alert().getText();
	    Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user is trying submit request without entering 'Password'$")
	public void user_is_trying_submit_request_without_entering_Password() throws Throwable {
	     driver.switchTo().alert().dismiss();
		 pageBean.setUsername("AnupBanerjee");
		 pageBean.clickSignUp();
	}

	@Then("^'Password should not be empty /length be between (\\d+) to (\\d+)' alert message should display$")
	public void password_should_not_be_empty_length_be_between_to_alert_message_should_display(int arg1, int arg2) throws Throwable {
		 String expectedAlertMessage="Password should not be empty /length be between 5 to 12";
		    String actualAlertMessage=driver.switchTo().alert().getText();
		    Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user is trying submit request without entering 'username'$")
	public void user_is_trying_submit_request_without_entering_username() throws Throwable {
	 driver.switchTo().alert().dismiss();
	 pageBean.setUserId("Anup15");
	 pageBean.clickSignUp();
	}

	@Then("^'Name should not be empty and must contain only alphabet characters only' alert message should display$")
	public void name_should_not_be_empty_and_must_contain_only_alphabet_characters_only_alert_message_should_display() throws Throwable {
		  String expectedAlertMessage="Name should not be empty and must contain only alphabet characters only /length be between 5 to 12";
		    String actualAlertMessage=driver.switchTo().alert().getText();
		    Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user is trying submit request without entering 'address'$")
	public void user_is_trying_submit_request_without_entering_address() throws Throwable {
		driver.switchTo().alert().dismiss();
		 pageBean.setUserId("Anup15");
		 pageBean.clickSignUp();
		
	}

	@Then("^'User address must have alphanumeric characters only' alert message should display$")
	public void user_address_must_have_alphanumeric_characters_only_alert_message_should_display() throws Throwable {
		 String expectedAlertMessage="User address must have alphanumeric characters only";
		    String actualAlertMessage=driver.switchTo().alert().getText();
		    Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user is trying submit request without entering 'country'$")
	public void user_is_trying_submit_request_without_entering_country() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^'Select your country from the list' alert message should display$")
	public void select_your_country_from_the_list_alert_message_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user is trying submit request without entering 'zipCode'$")
	public void user_is_trying_submit_request_without_entering_zipCode() throws Throwable {
		driver.switchTo().alert().dismiss();
		 pageBean.setZip("423011");
		 pageBean.clickSignUp();
	}

	@Then("^'Zip code must be numeric only' alert message should display$")
	public void zip_code_must_be_numeric_only_alert_message_should_display() throws Throwable {
		 String expectedAlertMessage="ZIP code must have numeric characters only";
		    String actualAlertMessage=driver.switchTo().alert().getText();
		    Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user is trying submit request without entering 'email'$")
	public void user_is_trying_submit_request_without_entering_email() throws Throwable {
		 driver.switchTo().alert().dismiss();
		 pageBean.setZip("423001");
		 
		 pageBean.clickSignUp();
	}

	@Then("^'You have entered an invalid email address!' alert message should display$")
	public void you_have_entered_an_invalid_email_address_alert_message_should_display() throws Throwable {
		 String expectedAlertMessage="You have entered an invalid email address!";
		    String actualAlertMessage=driver.switchTo().alert().getText();
		    Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user is trying submit request without entering 'gender'$")
	public void user_is_trying_submit_request_without_entering_gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^'Please select your gender' alert message should display$")
	public void please_select_your_gender_alert_message_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user is trying to submit data$")
	public void user_is_trying_to_submit_data() throws Throwable {
	  pageBean.setUserId("Anup15");
	  pageBean.setUsername("AnupBanerjee");
	  pageBean.setPassword("sasasasa");
	  pageBean.setCountry("India");
	  pageBean.setZip("423011");
	  pageBean.setEmail("anup.banerjee@gmail.com");
	  pageBean.setGender("Male");
	  pageBean.clickSignUp();
	}

	@Then("^'Your Registration with JobsWorld\\.com has successfully done plz check your registred email addres to activate your profile' alert message should display$")
	public void your_Registration_with_JobsWorld_com_has_successfully_done_plz_check_your_registred_email_addres_to_activate_your_profile_alert_message_should_display() throws Throwable {
		 String expectedAlertMessage="Your Registration with JobsWorld.com has successfully done plz check your registred email addres to activate your profile";
		    String actualAlertMessage=driver.switchTo().alert().getText();
		    Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

}