package com.bhavna.pages;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.bhavna.driverHelper.CreateDriver;
import com.bhavna.locatorsClass.BookMovieLocatorsClass;
import com.bhavna.utilities.DP;
import resuablefunctions.Reusefunctions;

public class BookMovie  extends CreateDriver
{
	public WebElement ele1;
	public BookMovieLocatorsClass BMC;
	
	@Test(dataProvider="DP4",dataProviderClass=DP.class,priority=4)
	public void selectLang(String mobno, String cardnumber) throws Exception
	{
		BMC=new BookMovieLocatorsClass(driver);
		//Click Movie tab
		BMC.movieTab.click();
		System.out.println("Movie Tab clicked");
		
		//Select Movie Language
		Reusefunctions.chkbox_radiobtn_select(BMC.selectLang);
		
		//Tubelight movie clicked
		Thread.sleep(2000);
		BMC.moviename.click();
		System.out.println("Tubelight movie clicked");
		
		//Time selection for Tubelight
		Thread.sleep(5000);
		BMC.movietime.click();
		System.out.println("Tubelight movietime 08:00pm clicked");
		
		//Select number of seats
		Thread.sleep(5000);
		BMC.noseats.click();
		
		//Select first available seat
		Thread.sleep(2000);
		BMC.avail_seat.click();
		
		//Click on Proceed Button
		Thread.sleep(2000);
		BMC.proceedbtn.click();
		
		//Select mticket radio button
		Reusefunctions.chkbox_radiobtn_select(BMC.mticketradiobtn);
			
		//Select Proceed button
		Thread.sleep(2000);
		BMC.Proceedbtn.click();
		
		//Enter mobile number through Data provider
		Thread.sleep(2000);
		BMC.mobnotxtbox.sendKeys(mobno);
		System.out.println("Mobile number entered");
		
		//Click on Continue Button
		Thread.sleep(2000);
		BMC.continuebtnclick.click();
		System.out.println("Continue button clicked");
		
		//Enter Card no.
		Thread.sleep(1000);
		BMC.cardno.sendKeys(cardnumber);
		}
}
	
//Save displayed languages in list
		/*for(WebElement lang:BMC.selectLang)
		{
			String l=lang.toString();
			System.out.println("Inside For Each Loop");
			System.out.println("Movie name "+l);
			System.out.println("Lang name from excel "+language);
			if(language.equalsIgnoreCase(l))
			{
				if(!lang.isSelected())
				{
					System.out.println("Not selected");
					lang.click();
					System.out.println("Check Box is selected"+l);
				}		
			}
		}*/


/*//Uncheck book smile donation	
if(!BMC.booksmilechkbox.isSelected())
{
	BMC.booksmilechkbox.click();
	System.out.println("Check box unselected"); 
	//flag=true;
}*/
