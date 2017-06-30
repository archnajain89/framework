package com.bhavna.locatorsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bhavna.pageControllers.HomepageLocators;

public class HomepageLocatorsClass 
{
	public HomepageLocatorsClass(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = HomepageLocators.useregion_search_xpath)
	public WebElement enterCity;
	
	@FindBy(xpath = HomepageLocators.signInClick_xpath)
	public WebElement signInClick;
	
	/*@FindBy(name = commonlocators.password)
	public  WebElement passwordtext;
	
	@FindBy(id = commonlocators.ok)
	public WebElement okbutton;
	
	@FindBy(id = commonlocators.google)
	public WebElement googlemouse;*/
}
