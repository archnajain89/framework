package com.bhavna.locatorsClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import com.bhavna.pageControllers.BookMovieLocators;

public class BookMovieLocatorsClass 
{
	public BookMovieLocatorsClass(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = BookMovieLocators.movieTabxpath)
	public WebElement movieTab;
	
	@FindBy(xpath = BookMovieLocators.selectLangxpath)
	public WebElement selectLang;
	
	@FindBy(xpath = BookMovieLocators.movienamexpath)
	public WebElement moviename;

	@FindBy(xpath = BookMovieLocators.movietimexpath)
	public WebElement movietime;
	
	@FindBy(xpath = BookMovieLocators.noseatsxpath)
	public WebElement noseats;
	
	@FindBy(xpath = BookMovieLocators.avail_seatxpath)
	public WebElement avail_seat;
	
	@FindBy(xpath = BookMovieLocators.proceedxpath)
	public WebElement proceedbtn;
	
	@FindBy(xpath = BookMovieLocators.bksmilechkbox_xpath)
	public WebElement booksmilechkbox;
	
	@FindBy(xpath = BookMovieLocators.mticketradiobtn_xpath)
	public WebElement mticketradiobtn;
	
	@FindBy(xpath = BookMovieLocators.Proceedbtn_xpath)
	public WebElement Proceedbtn;
	
	@FindBy(xpath = BookMovieLocators.mobno_xpath)
	public WebElement mobnotxtbox;
	
	@FindBy(xpath = BookMovieLocators.continuebtn_xpath)
	public WebElement continuebtnclick;
	
	@FindBy(xpath = BookMovieLocators.cardno_xpath)
	public WebElement cardno;

	/*@FindBys({@FindBy(xpath=BookMovieLocators.noseatsxpath)})
	public List<WebElement> noseats;*/
}
