package com.bhavna.pages;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.bhavna.driverHelper.CreateDriver;
import com.bhavna.locatorsClass.SignupLocatorClass;
import com.bhavna.utilities.DP;

public class SignupPage extends CreateDriver
{

	public WebElement element1;
	public SignupLocatorClass signup_locator;
	
	@Test(dataProvider="DP2", dataProviderClass=DP.class, priority=2)
	
	public void signup(String emailid, String password, String cnfrmpassword )
	{
		try
		{
		signup_locator=new SignupLocatorClass(driver);		
		//Click  on Sign up link
		Thread.sleep(5000);
		//reuse.click_element(sign_locator.signUpLink);
		element1=signup_locator.signUpLink;
		element1.click();
		
		//Enter email id
		Thread.sleep(5000);
		element1=signup_locator.emailid;
		element1.sendKeys(emailid);
					
		//Enter password
		Thread.sleep(5000);
		element1=signup_locator.password;
		element1.sendKeys(password);
			
		//Enter Confirm Password
		Thread.sleep(5000);
		element1=signup_locator.cnfrmpassword;
		element1.sendKeys(cnfrmpassword);
			
		//click on sign up button
		Thread.sleep(5000);
		element1=signup_locator.signupbtn;
		element1.click();
				
		/*//Sign out
		Thread.sleep(5000);
		Reusefunctions.actionMouse_Over();*/
		
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}
