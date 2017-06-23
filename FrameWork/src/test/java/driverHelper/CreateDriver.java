package driverHelper;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;

public class CreateDriver
{
	
	public static WebDriver driver;
	public static ResourceBundle rb;

	@BeforeSuite
		public void StartBrowser()
		{
	
		rb=ResourceBundle.getBundle("test");
		if(rb.getString("BROWSER").equalsIgnoreCase("CHROME"))
		{
			//Create a instance of ChromeOptions class
			ChromeOptions options = new ChromeOptions();
			
			//Add chrome switch to disable notification - "--disable-notifications"
			options.addArguments("--disable-notifications");
			System.out.println("Push notification for chrome has been disabled");
			
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver(options);
					
		}
		
		else if((rb.getString("BROWSER").equalsIgnoreCase("FIREFOX")))
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
		else if((rb.getString("BROWSER").equalsIgnoreCase("IE")))
		{
		System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		}
		
		//Open URL
		driver.get("URL");	
	
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
