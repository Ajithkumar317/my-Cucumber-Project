package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public  WebDriver driver;
	public SearchHotel(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver3, this);
	}

	@FindBy(xpath ="//select[@id='location']")
	private static WebElement location;
	
	@FindBy(id ="hotels")
	private static WebElement hotels;
	
	@FindBy(id ="room_type")
	private static WebElement room_type;

	@FindBy(id ="room_nos")
	private static WebElement Room_no;
	
	@FindBy(id ="datepick_in")
	private static WebElement check_in;

	@FindBy(id ="datepick_out")
	private static WebElement check_out;
	
	@FindBy(id ="adult_room")
	private static WebElement No_of_adults;
	@FindBy(id ="child_room")
	private static WebElement No_of_child;
	
	@FindBy(id ="Submit")
	private static WebElement search;
	

	public WebElement getLocation() {
		return location;
	}

	public  WebElement getHotels() {
		return hotels;
	}

	public  WebElement getRoom_type() {
		return room_type;
	}

	public  WebElement getRoom_no() {
		return Room_no;
	}

	public  WebElement getCheck_in() {
		return check_in;
	}

	public  WebElement getCheck_out() {
		return check_out;
	}

	public  WebElement getNo_of_adults() {
		return No_of_adults;
	}

	public WebElement getNo_of_child() {
		return No_of_child;
	}

	public  WebElement getSearch() {
		return search;
	}
	

}
