package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='include/images/vtiger-crm.gif']")
    WebElement imglogo;
	
	@FindBy(how = How.NAME, using = "user_name") 
    WebElement txtusername;
	
	@FindBy(name="user_password")
    WebElement txtpwd;
	
	@FindBy(name="Login")
    WebElement btnLogin;
	
	@FindBy(xpath="//td[contains(text(),'You must specify a valid username and password.')]")
    WebElement lblErrormsg;
	
	
	
	//By imglogo = By.xpath("//img[@src='include/images/vtiger-crm.gif']");
	//By txtusername = By.name("user_name");
	//By txtpwd = By.name("user_password");
	//By btnLogin = By.name("Login");
	//By lblErrormsg = By.xpath("//td[contains(text(),'You must specify a valid username and password.')]");
	
	
	public boolean invalidLogin()
	{
		txtusername.clear();
		txtusername.sendKeys("asdda");
		txtpwd.clear();
		txtpwd.sendKeys("414141");
		btnLogin.click();
		boolean val = false;
		try
		{
			val = lblErrormsg.isDisplayed();
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		return val;
	}
	
	public boolean verifytitle()
	{
			
		if(driver.getTitle().trim().equals("vtiger123 CRM - Commercial Open Source CRM"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public boolean verifylogo()
	{
			
		if(imglogo.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public HomePage validlogin(String user, String pwd)
	{
		txtusername.clear();
		txtusername.sendKeys(user);
		txtpwd.clear();
		txtpwd.sendKeys(pwd);
		btnLogin.click();
		return new HomePage(driver);
	}
	
	

}
