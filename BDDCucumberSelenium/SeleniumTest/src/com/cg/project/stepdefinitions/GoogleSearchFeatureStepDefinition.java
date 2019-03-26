package com.cg.project.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchFeatureStepDefinition {
	private WebDriver driver;
	@Given("^User is on Google HomePage$")
	public void user_is_on_Google_HomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\software backup\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http:\\www.google.in");
	}

	@When("^User search for 'Agile Mehtodlogy'$")
	public void user_search_for_Agile_Mehtodlogy() throws Throwable {
		WebElement searchElement=driver.findElement(By.name("q"));
		searchElement.sendKeys("Agile Methodology");
		searchElement.submit();
	}

	@Then("^All links should display with 'Agile Methodlogy'$")
	public void all_links_should_display_with_Agile_Methodlogy() throws Throwable {
	   String actualTitle=driver.getTitle();
	   String expectedTitle="Agile Methodology-Google Search";
	   Assert.assertEquals(expectedTitle,actualTitle);
	   driver.close();
	}

}
