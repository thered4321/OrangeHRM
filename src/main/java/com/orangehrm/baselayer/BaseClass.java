package com.orangehrm.baselayer;

import org.openqa.selenium.WebDriver;

import com.orangehrm.utilslayer.DriverManager;
import com.orangehrm.utilslayer.Element;

public class BaseClass {
	protected WebDriver driver;
	protected Element element;
	public BaseClass() {
		driver = DriverManager.getInstance().getDriver();
		element = new Element();
		
	}

}
