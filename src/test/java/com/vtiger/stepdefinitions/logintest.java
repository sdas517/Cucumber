package com.vtiger.stepdefinitions;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logintest extends BaseTest {
	
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario123");
    }	
	
	@After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
	
	@Given("^user navigate url$")
	public void user_navigate_url() throws Throwable {
		openapp();
	}

	@Given("^user should be landing on login page$")
	public void user_should_be_landing_on_login_page() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		if(lp.verifytitle())
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
	}

	@When("^user enters valid credential \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_credential_and(String arg1, String arg2) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.validlogin(arg1, arg2);
		
	}

	@Then("^user should be login successfully$")
	public void user_should_be_login_successfully() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.clickonLogout();
	}

	@Then("^page should be navigate on home page$")
	public void page_should_be_navigate_on_home_page() throws Throwable {
		System.out.println("page should be navigate on home page");
	}

	@Then("^user need to verify title$")
	public void user_need_to_verify_title() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		if(lp.verifytitle())
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
	}

	@Then("^user need to verify logo$")
	public void user_need_to_verify_logo() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		if(lp.verifylogo())
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
	}

}
