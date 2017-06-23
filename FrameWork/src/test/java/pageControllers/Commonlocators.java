package pageControllers;

import java.util.NoSuchElementException;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverHelper.CreateDriver;

public class Commonlocators extends CreateDriver
{

	//public static final String useregion_search="//input[@id='inp_RegionSearch_top']";
		
	
	public static WebElement getWebElement(String locator)
	{
		
		rb=ResourceBundle.getBundle("Element");
		String[] tokens = locator.split("_");
		String locatorType = tokens[tokens.length-1];
		String strlocator = rb.getString(locator).trim();
		WebElement webElement = null;

		try
		{

		if(locatorType.equalsIgnoreCase("XPATH"))
		{

		webElement = driver.findElement(By.xpath(strlocator));

		}else if(locatorType.equalsIgnoreCase("ID"))
		{

		webElement = driver.findElement(By.id(strlocator));

		}else if(locatorType.equalsIgnoreCase("NAME"))
		{

		webElement = driver.findElement(By.name(strlocator));

		}else if(locatorType.equalsIgnoreCase("CSS"))
		{

		webElement = driver.findElement(By.cssSelector(strlocator));

		}else if(locatorType.equalsIgnoreCase("LINKTEXT"))
		{

		webElement = driver.findElement(By.linkText(strlocator));
		}

		}
		catch(NoSuchElementException e)
		{
		e.getMessage();
		//log.error(strlocator + " Element not found");
		//Assert.fail(strlocator + " Element not found");

		}

		return webElement;
		}
}
