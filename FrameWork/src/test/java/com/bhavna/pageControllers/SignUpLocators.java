package com.bhavna.pageControllers;

public class SignUpLocators
{
	public static final String signUpLink_xpath="//div[@id='signinPopup']//a[@class='signup-now-button' and text()='Sign Up']";
	public static final String emailid_xpath="//input[@id='iRegUserEmail']";
	public static final String password_xpath="//input[@id='iRegPwd']";
	public static final String cnfrmpassword_xpath="//input[@id='iRegCnfPwd']";
	public static final String signupbtn_xpath="//div[@class='submit-form' and text()='SIGN UP']";
	
	//Sign Out
	public static final String signouticon_xpath="//img[@id='loggedInImg']";
	public static final String signout_xpath="//div[@class='signed-in nav-tip']//div[2]//li[6]";

	
}
