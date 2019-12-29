package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {
	
private WebDriver driver;
	
	public HeaderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Logout")
    WebElement lnkLogout;
	
	@FindBy(linkText="New Lead")
    WebElement lnkNewLead;
	
	public LoginPage clickonLogout()
	{
		lnkLogout.click();
		return new LoginPage(driver);
	}
	
	public LeadPage clickonNewLead()
	{
		lnkNewLead.click();
		return new LeadPage(driver);
	}

}
