package com.orangehrm.ihelper;

import org.openqa.selenium.WebElement;

public interface IElement {
	
	void click(WebElement wb);
	void submit(WebElement wb);
	void clear(WebElement wb);
	void sendKeys(WebElement wb, String expectedValue);
	String getText(WebElement wb);
	String getAttribute(WebElement wb, String keyName);
	String getCssValue(WebElement wb);
	boolean isDisplayed(WebElement wb);
	boolean isEnable(WebElement wb);
	boolean isSelected(WebElement wb);
	


}
