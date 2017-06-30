package com.bhavna.driverHelper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;

import resuablefunctions.Reusefunctions;
//import org.testng.annotations.Test;

public class CreateDriver
{
	
	public static WebDriver driver;
	public static Reusefunctions reuse;
	public static Properties prop;

	@BeforeSuite
		public void StartBrowser() throws IOException
		{
	
		System.out.println("START BROWSER");
		reuse=new Reusefunctions();
			
		//To Read properties file
		prop = new Properties();
		String propFileName = "C:\\Users\\arrchnnajaiin\\gitframework\\FrameWork\\src\\test\\java\\config\\test.properties";
		
		FileInputStream fin=new FileInputStream(propFileName);
		prop.load(fin);
	
		if(prop.getProperty("BROWSER").equalsIgnoreCase("CHROME"))
		{
			//Create a instance of ChromeOptions class
			ChromeOptions options = new ChromeOptions();
			
			//Add chrome switch to disable notification - "--disable-notifications"
			options.addArguments("--disable-notifications");
			System.out.println("Push notification for chrome has been disabled");
			
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver(options);
					
		}
		
		else if(prop.getProperty("BROWSER").equalsIgnoreCase("FIREFOX"))
		{
		System.setProperty("webdriver.gecko.driver", "./Driver/gekodriver.exe");
		driver=new FirefoxDriver();

		/*ProfilesIni ffProfiles = new ProfilesIni();
		FirefoxProfile profile = ffProfiles.getProfile("firefoxtestprofile");
		FirefoxDriver driver1 = new FirefoxDriver(profile);*/		
		//FirefoxProfile fp = new FirefoxProfile();
		//fp.setPreference("dom.webnotifications.enabled", false);
		//fp.setPreference("dom.webnotifications.serviceworker.enabled ", false);
		//fp.setPreference("network.http.spdy.allow-push", false);
		
		}
		else if(prop.getProperty("BROWSER").equalsIgnoreCase("IE"))
		{
		System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		}
		
		//Open URL
		driver.get(prop.getProperty("URL"));	
	
		//Implicit wait for 10 seconds 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		}
	}
	

/*	@AfterSuite
public void EndBrowser()
{
	driver.quit();
}
*/	
