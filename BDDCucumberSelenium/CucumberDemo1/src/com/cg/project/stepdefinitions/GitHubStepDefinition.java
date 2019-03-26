package com.cg.project.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.github.pagebeans.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GitHubStepDefinition {

	private WebDriver driver;
	private LoginPage loginPage;

	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver","D:\\software backup\\chromedriver.exe");
	}

	@Given("^user is on GitHub Login Page$")
	public void user_is_on_GitHub_Login_Page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://github.com/login");

		loginPage=PageFactory.initElements(driver, LoginPage.class);
	}

	@When("^user enter Invalid username and password$")
	public void user_enter_Invalid_username_and_password() throws Throwable {
		loginPage.setUsername("anup1517");
		loginPage.setPassword("temp@123");
		loginPage.clickSignIn();
	}

	@Then("^'Incorrect username or password\\.' Message should display$")
	public void incorrect_username_or_password_Message_should_display() throws Throwable {
		String expectedErrorMessage="Incorrect username or password";
		Assert.assertEquals(expectedErrorMessage, loginPage.getActualErrorMessage());
	}

	@When("^user enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
		String actualTitle=driver.getTitle();
		String expectedTitle="anup1517";
		Assert.assertEquals(expectedTitle,actualTitle);
	}

	@After
	public void tearDownStepEnv() {
		driver.close();
	}

}