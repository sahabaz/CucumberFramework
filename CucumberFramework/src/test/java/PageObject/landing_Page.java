package PageObject;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import LandingPage_Generic.Generic_Utils;
import TestRunner.Runner;

public class landing_Page extends Runner
{
	public static void login(String username , String password) throws InterruptedException
	{
		d.findElement(By.xpath("//*[@id='EmailID']")).sendKeys(username);
		d.findElement(By.xpath("//*[@id='Password']")).sendKeys(password);
		d.findElement(By.xpath("//*[@id='login']")).click();
		Thread.sleep(2000);
	}
	
	public static void move_to_landing_page() throws InterruptedException
	{
		Generic_Utils.mouseHover(d.findElement(By.xpath("//li[@menu='Marketing']/a")));
		d.findElement(By.xpath("//a[@href='/LandingPages']")).click();
		Thread.sleep(2000);
	}
	
	public static void create_landing_page() throws InterruptedException
	{
		d.findElement(By.xpath("//div[@id='related-settings-panel']//a[@data-name='Create Landing Page']")).click();
		Thread.sleep(3000);
		d.findElement(By.id("Name")).clear();
		d.findElement(By.id("Name")).sendKeys(RandomStringUtils.randomAlphabetic(10));
		Generic_Utils.mouseHover(d.findElement(By.xpath("//div[@title=\"Professional Services 02\"]")));
		d.findElement(By.xpath("//div[@title=\"Professional Services 02\"]/../div[contains(text(),'SELECT')]")).click();
		Thread.sleep(4000);
		Generic_Utils.scroll(0, 4000);
		d.findElement(By.id("btnNext")).click();
		Thread.sleep(3000);
		Generic_Utils.scroll(0, 4000);
		d.findElement(By.id("btnNext")).click();
		Thread.sleep(3000);
		Generic_Utils.scroll(0, 4000);
		d.findElement(By.id("btnNext")).click();
		Thread.sleep(3000);
		Generic_Utils.scroll(0, 4000);
		d.findElement(By.id("btnPublish")).click();
		Thread.sleep(2000);
		d.findElement(By.id("ButtonOk")).click();
		Thread.sleep(4000);
		d.findElement(By.xpath("//h3[contains(text(),'Confirm Publish')]")).click();
		Thread.sleep(5000);
		d.findElement(By.id("GotoList")).click();
		Thread.sleep(3000);
	}
	
	public static void logout()
	{
		Generic_Utils.mouseHover(d.findElement(By.xpath("//a[@class='dropdown-toggle my-account-menu']")));
		d.findElement(By.xpath("//a[@href='/Home/SignOut']")).click();
		
	}
}
