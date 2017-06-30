package com.bhavna.validations;

import org.openqa.selenium.chrome.ChromeDriver;

public class regpagevalidation
{
	public static boolean regPageValidation(ChromeDriver driver, String exp_result)
	{
		boolean result=false;
		try
		{
		
		if(driver.switchTo().alert().getText().equalsIgnoreCase("Please enter valid date."))
		{
			System.out.println(driver.switchTo().alert().getText());
			result=true;
		}
		
		if(driver.switchTo().alert().getText().equalsIgnoreCase("Your age must be 18."))
		{
			System.out.println(driver.switchTo().alert().getText());
			result=true;
		}
	
		}
		catch(Exception e)
		{
			
		}
		return result;
		
	}
}
