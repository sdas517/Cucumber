package com.vtiger.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/com/vtiger/userstories/login.feature"
		,glue= {"com.vtiger.stepdefinitions"},
		 format = {"pretty", "html:target/Destination"} ,
				 //plugin = { "pretty", "json:target/cucumber.json" },
				// plugin = { "pretty", "json:target/cucumber.json" },
				 tags = {"@Smoke,@sanity"},////or
				 //tags = {"@Smoke","@sanity"},////and
				 //tags = {"@Smoke","~@Sanity"},////And
				 //tags = {"~@Smoke","~@Sanity"},////And
				 monochrome = true)

public class TestRunner {
	
	

}
