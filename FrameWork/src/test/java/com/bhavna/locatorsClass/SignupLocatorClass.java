package com.bhavna.locatorsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bhavna.pageControllers.SignUpLocators;

public class SignupLocatorClass 
{
	public SignupLocatorClass(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = SignUpLocators.signUpLink_xpath)
	public WebElement signUpLink;
	
	@FindBy(xpath = SignUpLocators.emailid_xpath)
	public WebElement emailid;
	
	@FindBy(xpath = SignUpLocators.password_xpath)
	public WebElement password;
	
	@FindBy(xpath = SignUpLocators.cnfrmpassword_xpath)
	public WebElement cnfrmpassword;
	
	@FindBy(xpath = SignUpLocators.signupbtn_xpath)
	public WebElement signupbtn;

	@FindBy(xpath = SignUpLocators.signouticon_xpath)
	public WebElement signouticon;
	
	@FindBy(xpath = SignUpLocators.signout_xpath)
	public WebElement signout;
	
}
