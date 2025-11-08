package com.orangehrm.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src\\test\\resources\\TC_001_Login.feature",
		glue = {"com/orangehrm/steps"},
		monochrome = true,
		dryRun = false,
		tags = "@Anand"
		)


public class OrangeHRMTestRunner extends AbstractTestNGCucumberTests{
	

}
