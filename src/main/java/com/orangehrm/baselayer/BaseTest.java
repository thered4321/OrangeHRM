package com.orangehrm.baselayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.orangehrm.utilslayer.DriverManager;
import com.orangehrm.utilslayer.PropertyReader;
import com.orangehrm.utilslayer.WebDriverUtils;

public class BaseTest extends BaseClass{
	
	public void setup(String driverName) {
		DriverManager.getInstance().setDriver(driverName);
		
		WebDriverUtils webDriver = new WebDriverUtils();
		webDriver.get(PropertyReader.getProperty("URL"));
		webDriver.implicitlyWait(Duration.ofSeconds(30));
		webDriver.pageLoadTimeOut(Duration.ofSeconds(30));
		webDriver.maximixe();
	}
	
	public void tearDown() {
		new WebDriverUtils().quit();
		
	}
	

}
