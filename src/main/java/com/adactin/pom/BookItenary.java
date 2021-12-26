package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookItenary {
	public  WebDriver driver;
	@FindBy(xpath ="//input[@id='radiobutton_0']")
	private static WebElement Select;
	
	@FindBy(id ="continue")
	private static WebElement continuebutton;
	
	
	@FindBy(id ="first_name")
	private static WebElement first_name;
	
	@FindBy(id ="last_name")
	private static WebElement last_name;
	
	@FindBy(id ="address")
	private static WebElement address;
	
	@FindBy(id ="cc_num")
	private static WebElement cardnumber;
	
	@FindBy(id ="cc_type")
	private static WebElement cardtype;
	@FindBy(id ="cc_exp_month")
	private static WebElement expmonth;
	
	@FindBy(id ="cc_exp_year")
	private static WebElement expyear;
	@FindBy(id ="cc_cvv")
	private static WebElement cvvNumber;
	@FindBy(id ="book_now")
	private static WebElement booknow;
	@FindBy(id ="my_itinerary")
	private static WebElement my_itinerary;
	public BookItenary(WebDriver driver4) {
		this.driver=driver4;
		PageFactory.initElements(driver4, this);
	}
	public  WebElement getSelect() {
		return Select;
	}
	public  WebElement getContinuebutton() {
		return continuebutton;
	}
	public  WebElement getFirst_name() {
		return first_name;
	}
	public  WebElement getLast_name() {
		return last_name;
	}
	public  WebElement getAddress() {
		return address;
	}
	public  WebElement getCardnumber() {
		return cardnumber;
	}
	public  WebElement getCardtype() {
		return cardtype;
	}
	public  WebElement getExpmonth() {
		return expmonth;
	}
	public  WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	public  WebElement getBooknow() {
		return booknow;
	}
	
	
public  WebElement getMy_itinerary() {
		return my_itinerary;
	}
	
	
		


}
