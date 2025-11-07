package com.orangehrm.baselayer;

import org.openqa.selenium.WebDriver;

import com.orangehrm.utilslayer.DriverManager;

public class BaseClass {
	protected WebDriver driver;
	public BaseClass() {
		driver = DriverManager.getInstance().getDriver();
	}

}
