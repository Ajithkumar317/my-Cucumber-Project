package com.adactin.runnerClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseClass.BaseClass;
import com.adactin.configuration.File_Reader_Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="FeatureFile",glue ="com.adactin.stepDefinition",monochrome = true , plugin = { "pretty","html:Report/HTML_Report","json:Report1/JSON_Report.json"})

public class Runner {
	public static WebDriver driver ;

	@BeforeClass
	public static void setUp() throws Throwable {
		String getbrowser = File_Reader_Manager.getinstance().getinstanceCR().getbrowser();
		driver=BaseClass.openbrowser(getbrowser)	;
	}
	

}
