package com.bhavna.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.bhavna.driverHelper.CreateDriver;
import com.bhavna.locatorsClass.HomepageLocatorsClass;
import com.bhavna.utilities.DP;

public class HomePage extends CreateDriver
{

	public WebElement element1;
	
	@Test(dataProvider="DP1", dataProviderClass=DP.class, priority=1,groups={"signup"})
	public void enterCity(String city)
	{
		try
		{
		HomepageLocatorsClass home_locator=new HomepageLocatorsClass(driver);
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeSelected(home_locator.enterCity));
		
		Thread.sleep(5000);
		element1=home_locator.enterCity;
		//element1.sendKeys(prop.getProperty("city"));
		element1.sendKeys(city);
		element1.sendKeys(Keys.ENTER);
		System.out.println("City entered");
		
		Thread.sleep(5000);
		element1=home_locator.signInClick;
		element1.click();
		System.out.println("Sign in button clicked");
		
		/*//Signout
		Thread.sleep(5000);
		Reusefunctions.actionMouse_Over();
		System.out.println("Sign out");
		*/
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}
