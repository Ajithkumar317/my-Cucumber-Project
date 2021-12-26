package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	public  WebDriver driver;

	public Logout_Page(WebDriver driver6) {
		this.driver=driver6;
		PageFactory.initElements(driver6, this);

	}

	
	@FindBy(xpath ="//a[contains(text(),'Logout')]")
	private static WebElement LogoutButton;
	@FindBy(xpath ="//td[contains (text(),'You have successfully logged out')]")
	private static WebElement Verification;
	public  WebElement getLogoutButton() {
		return LogoutButton;
	}
	public  WebElement getVerification() {
		return Verification;
	}
	
	
}
