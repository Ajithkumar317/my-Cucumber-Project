package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public  WebDriver driver;
	@FindBy(id ="username")
	private static WebElement uname;
	
	@FindBy(id ="password")
	private static WebElement pword;
	
	@FindBy(id ="login")
	private static WebElement loginbutton;

	
	

	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public  WebElement getUname() {
		return uname;
	}

	public WebElement getPword() {
		return pword;
	}

	public  WebElement getLoginbutton() {
		return loginbutton;
	}

}
