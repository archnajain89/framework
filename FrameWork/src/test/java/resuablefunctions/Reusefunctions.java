package resuablefunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.bhavna.driverHelper.CreateDriver;
import com.bhavna.locatorsClass.SignupLocatorClass;
import com.bhavna.locatorsClass.BookMovieLocatorsClass;

public class Reusefunctions extends CreateDriver
{
	public static BookMovieLocatorsClass BML;
	
	//public WebElement element;
	/*public void click_element(WebElement element)
	{
		this.element=element;
	}*/
	
	public static void actionMouse_Over() throws InterruptedException
	{
		
		try
		{
		SignupLocatorClass sign_out=new SignupLocatorClass(driver);
		Thread.sleep(5000);
		WebElement ele1=sign_out.signouticon;
		ele1.click();
		Actions act1=new Actions(driver);
		act1.moveToElement(sign_out.signout).click().perform();
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void chkbox_radiobtn_select(WebElement webelement_chkbox)
	{
	
		BML=new BookMovieLocatorsClass(driver);
		
		try
		{
			Thread.sleep(2000);
		
			//Select Movie Language
			if(!webelement_chkbox.isSelected())
			{
				WebElement ele1 =webelement_chkbox;
				System.out.println("Not selected");
				ele1.click();
				System.out.println("INSIDE REUSE FUNCTION CheckBox and RadioButton is selected");
			}	
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}


}
