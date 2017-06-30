package com.bhavna.locatorsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bhavna.pageControllers.SignInLocators;

public class SignInLocatorClass 
{
	
		public SignInLocatorClass(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = SignInLocators.signIn_xpath)
		public WebElement signInLink;
		
		@FindBy(xpath = SignInLocators.login_emailid_xpath)
		public WebElement login_emailid;
		
		@FindBy(xpath = SignInLocators.login_password_xpath)
		public WebElement login_password;
		
		@FindBy(xpath = SignInLocators.login_SignInBtn_xpath)
		public WebElement signInBtn;	
		
}
