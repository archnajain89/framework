package com.bhavna.pages;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.bhavna.driverHelper.CreateDriver;
import com.bhavna.locatorsClass.SignInLocatorClass;
import com.bhavna.utilities.DP;

public class SigninPage extends CreateDriver
{
public WebElement element1;
	
	@Test(dataProvider="DP3", dataProviderClass=DP.class, priority=3)
	public void signIn(String emailid, String password)
	{
		try
		{
		SignInLocatorClass signIn_locator=new SignInLocatorClass(driver);
			
		//Click  on Sign In link
		Thread.sleep(5000);
		//reuse.click_element(sign_locator.signUpLink);
		element1=signIn_locator.signInLink;
		element1.click();
		
		//Enter email id
		Thread.sleep(5000);
		element1=signIn_locator.login_emailid;
		element1.sendKeys(emailid);
					
		//Enter password
		Thread.sleep(5000);
		element1=signIn_locator.login_password;
		element1.sendKeys(password);
			
		//click on signIn button
		Thread.sleep(5000);
		element1=signIn_locator.signInBtn;
		element1.click();
		
		/*//Signout
		Thread.sleep(5000);
		Reusefunctions.actionMouse_Over();
		System.out.println("Sign out");*/
		
		}
		catch(Exception e)
		{
			System.out.println("Element not found");
		}
	}
}
