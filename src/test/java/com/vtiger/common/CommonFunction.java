package com.vtiger.common;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CommonFunction {
	
	
	public ExtentReports setupResult()
	{	
		DateFormat format=new SimpleDateFormat("yyyyMMddhhmmss");
		Date date=new Date();
		String datestr=format.format(date);
		String extentReport=System.getProperty("user.dir")+"\\src\\test\\java\\com\\vtiger\\reports\\vtigerReport_"+datestr+".html";
		System.out.println(extentReport);
		ExtentReports report=new ExtentReports(extentReport);
		return report;
	}
	
	 public static String getscreenshot(String testname,WebDriver driver) throws Exception 
     {
		    DateFormat format=new SimpleDateFormat("yyyyMMddhhmmss");
			Date date=new Date();
			String datestr=format.format(date);
			String filename=System.getProperty("user.dir")+"\\src\\test\\java\\com\\vtiger\\reports\\Screenshot\\"+testname+"_"+datestr+".png";
		 
             File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            //The below method will save the screen shot in d drive with name "screenshot.png"
             FileUtils.copyFile(scrFile, new File(filename));
             return filename;
     }
	 
	 /*
	 public static void logsteps(boolean val,ExtentTest logger, Str )
	 {
		 if(val)
			{
				logger.log(LogStatus.PASS, "Logo found on login page");	
			}
			else
			{
				logger.log(LogStatus.FAIL, "Logo not found");
			}
			
			//sf.assertAll();
			report.endTest(logger);
			report.flush();
	 }
	 */

}
