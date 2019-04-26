package TestRunner;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "Feature", glue = { "StepDefinition" })
public class Runner extends AbstractTestNGCucumberTests 
{
	public static WebDriver d;
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
	
	
	
	@AfterTest
	public void endReport()
	{
		extents.flush();
	}
	@BeforeMethod
	public void launchBrowser()
	{
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\Desktop\\New folder\\chromedriver.exe");
		d = new ChromeDriver(c);
		d.manage().window().maximize();
		d.get("https://run.leadsquared.com");
	}
	
//	@AfterMethod
//	public void closeBrowser()
//	{
//		d.close();
//	}
	
	
}
