package com.adactin.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	
	public Configuration_Reader() throws Throwable {

	File f =new File("C:\\Users\\User\\eclipse-workspace\\Adactin_Hotel_project\\src\\test\\java\\com\\adactin\\configuration\\Adactin.properties");
	FileInputStream fis =new FileInputStream(f);
	 p =new Properties();
	p.load(fis);

}
	
	public String getbrowser() {
		String browser = p.getProperty("Browser");
		return browser;
		}
	
	public String geturl() {
		String url = p.getProperty("url");
		return url;

	}
	public String getcardnumber() {
		String cardnumber = p.getProperty("cardnumber");
		return cardnumber;

	}
	public String getcvv() {
		String cvv = p.getProperty("cvv");
		return cvv;

	}
	
	}
