package com.adactin.configuration;

import org.openqa.selenium.WebDriver;

public class File_Reader_Manager {
	public WebDriver driver;

	private File_Reader_Manager() {
	}

	public static File_Reader_Manager getinstance() {
		File_Reader_Manager helper = new File_Reader_Manager();
		return  helper;
	}

	public Configuration_Reader getinstanceCR() throws Throwable {
		Configuration_Reader cr=new Configuration_Reader(); 
		return cr;

	}

}
