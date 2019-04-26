package LandingPage_Generic;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Baseclass 
{
	public WebDriver d;
	public com.aventstack.extentreports.ExtentReports extents;
	public com.aventstack.extentreports.ExtentTest test;
	public ExtentHtmlReporter report;
	
	@BeforeSuite
	public void startReport()
	{
		report = new ExtentHtmlReporter(new File("C:\\Users\\TYSS\\sahabazcucumber\\CucumberFramework\\report\\extent.html"));
		extents = new com.aventstack.extentreports.ExtentReports();
		extents.attachReporter(report);
		test = extents.createTest("TEstcase1");
	}
	
	@BeforeMethod
	public void launchingBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TYSS\\Desktop\\geckodriver.exe");
		d = new FirefoxDriver();
		d.get("https://run.leadsquared.com/");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		
		d.close();
	}
	
	@AfterTest
	public void endReport()
	{
		extents.flush();
	}
}
