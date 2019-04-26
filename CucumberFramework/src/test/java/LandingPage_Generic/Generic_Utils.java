package LandingPage_Generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import TestRunner.Runner;

public class Generic_Utils 
{
	public static void selectBytext(WebElement element , String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static void mouseHover(WebElement target)
	{
		Actions a = new Actions(Runner.d);
		a.moveToElement(target).perform();
	}
	
	public static void scroll(int x , int y)
	{
		JavascriptExecutor j = (JavascriptExecutor) Runner.d;
		j.executeScript("window.scrollBy("+x+","+y+")", "");
	}
}
