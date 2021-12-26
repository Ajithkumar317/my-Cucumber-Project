package com.adactin.stepDefinition;

import com.adactin.baseClass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks extends BaseClass{
@Before
	public void beforehooks(Scenario Scenario) {
		
		String name = Scenario.getName();
		System.out.println(" Scenario Title is" + name);

	}
	@After
	public void afterhooks(Scenario Scenario) throws Throwable {
		Status status = Scenario.getStatus();
System.err.println(" Scenario Status is " + status);
if (Scenario.isFailed()) {
	screenshot();
	
}
	}
}
