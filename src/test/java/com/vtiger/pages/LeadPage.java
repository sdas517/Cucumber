package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LeadPage extends HeaderPage {

	private WebDriver driver;
	
	public LeadPage(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "lastname") 
    WebElement txtlastname;
	
	@FindBy(name="company")
    WebElement txtcomp;
	
	@FindBy(xpath="(//input[@name='button'])[1]")
    WebElement btnsave;
	
	public void createlead(String lname, String comp)
	{
		txtlastname.sendKeys(lname);
		txtcomp.sendKeys(comp);
		btnsave.click();
	}
	
	

}
