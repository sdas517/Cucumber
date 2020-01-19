package com.vtiger.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.vtiger.common.CommonFunction;
import com.vtiger.common.config;

public class BaseTest {
	public WebDriver driver;
	public  ExtentReports report;
	public  ExtentTest logger; 
	public  String extentReport;
	
	public void openapp()
	{
		 String url =  System.getProperty("Env");
	         String type =  System.getProperty("TestingType");
	         System.out.println("Jenkins url "+url);
	         System.out.println("Jenkins Test "+type);
		CommonFunction cm= new CommonFunction();
		report=cm.setupResult();
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(config.url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(config.timeout, TimeUnit.SECONDS);
	}

}
