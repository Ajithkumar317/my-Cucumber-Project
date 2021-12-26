package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordChange {
	public WebDriver driver;

	public PasswordChange(WebDriver driver5) {
		this.driver=driver5;
		PageFactory.initElements(driver5, this);
	}

	
	
	@FindBy(linkText  ="Change Password")
	private static WebElement ChangePassword;
	
	
	@FindBy(xpath ="//input[@id='current_pass']")
	private static WebElement CurrentPword;
	
	@FindBy(xpath ="//input[@id='new_password']")
	private static WebElement Newpword;
	
	@FindBy(xpath ="//input[@id='re_password']")
	private static WebElement ConfirmPword;
	
	@FindBy(id ="Submit")
	private static WebElement Submit;

	public  WebElement getChangePassword() {
		return ChangePassword;
	}

	public  WebElement getCurrentPword() {
		return CurrentPword;
	}

	public  WebElement getNewpword() {
		return Newpword;
	}

	public  WebElement getConfirmPword() {
		return ConfirmPword;
	}

	public  WebElement getSubmit() {
		return Submit;
	}

}
