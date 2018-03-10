package com.dp360crm.steps;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dp360crm.impl.LoginCrm;
import com.dp360crm.impl.StepsImpl;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps {
	public WebDriver driver;

	private StepsImpl stepsImpl;
	private LoginCrm loginCrm;

	@Before
	public void initiliaze() {
		System.setProperty("webdriver.chrome.driver", "C:/AccuRate/chromedriver.exe");
		driver = new ChromeDriver();
		stepsImpl = new StepsImpl();
		loginCrm = new LoginCrm();
	}

	
	@Given("^user enters credentials in the CRM landing page$")
	public void user_enters_credentials_in_the_CRM_landing_page(DataTable credentials) throws Throwable {
	    
		List<List<String>> credentials_Crm = credentials.raw();
		loginCrm.login_crm(driver, credentials_Crm.get(1).get(0), credentials_Crm.get(1).get(1));
	}

	@When("^User creates a lead$")
	public void user_creates_a_lead() throws Throwable {
	
		// This function will create a lead
		stepsImpl.createLead(driver);

	}

	@Then("^Lead should be created and listed in lead details$")
	public void lead_should_be_created_and_listed_in_lead_details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

}
