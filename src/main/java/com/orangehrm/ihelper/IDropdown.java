package com.orangehrm.ihelper;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface IDropdown {
	
	void selectByVisibleText(WebElement wb, String value);
	void selectByValue(WebElement wb, String value);
	void selectByIndex(WebElement wb, int value);
	
	void withoutSelect(List<WebElement> listWb, String expectedValue);
	
	

}
