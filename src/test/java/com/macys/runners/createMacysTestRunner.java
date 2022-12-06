package com.macys.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (
		features = "Feature",
		
		glue = "createMacysSteps",
		
		tags = "@Macys"
		
		)

public class createMacysTestRunner extends AbstractTestNGCucumberTests{

}
