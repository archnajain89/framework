package com.bhavna.pageControllers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.bhavna.driverHelper.CreateDriver;

public class Commonlocators extends CreateDriver
{

	//public static final String useregion_search="//input[@id='inp_RegionSearch_top']";
		
	
	public static WebElement getWebElement(String locator) throws IOException
	{
		
		//rb=ResourceBundle.getBundle("Element");
		prop = new Properties();
		String propFileName = "C:\\Users\\arrchnnajaiin\\gitframework\\FrameWork\\src\\test\\java\\config\\Element.properties";
		
		FileInputStream fin=new FileInputStream(propFileName);
		prop.load(fin);
		prop.getProperty("Element");
		
		String[] tokens = locator.split("_");
		String locatorType = tokens[tokens.length-1];
		String strlocator = prop.getProperty(locator).trim();
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
		Assert.fail(strlocator + " Element not found");

		}

		return webElement;
		}
}
