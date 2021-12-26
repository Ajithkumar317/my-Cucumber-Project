package com.adactin.configuration;

import org.openqa.selenium.WebDriver;
import com.adactin.pom.BookItenary;
import com.adactin.pom.LoginPage;
import com.adactin.pom.Logout_Page;
import com.adactin.pom.PasswordChange;
import com.adactin.pom.SearchHotel;

public class PageObjectManager {
	public WebDriver driver;

	private LoginPage lp;
	private SearchHotel sh;
	private BookItenary bi;
	private PasswordChange pc;
	private Logout_Page lg;




	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}
	public LoginPage getinstacelogin() {
		lp = new LoginPage(driver);
		return lp;
	}
	public SearchHotel getinstancesearchhotel() {
		sh=new SearchHotel(driver);
		return sh;
	}
	public BookItenary getinstancebookitenary() {
		bi=new BookItenary(driver);
		return bi;
	}
	public  PasswordChange getinstancepasswordchange() {
		pc= new PasswordChange(driver);
		return pc;
	}
	public  Logout_Page getintancelogoutpage() {
		lg=new Logout_Page(driver);
		return lg;
	}
}
