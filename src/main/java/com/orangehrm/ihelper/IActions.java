package com.orangehrm.ihelper;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public interface IActions {
	
	void click(WebElement wb);
	void sendKeys(WebElement wb, String value);
	void doubleClick(WebElement wb);
	void contextClick(WebElement wb);
	void moveToElement(WebElement wb);
	void scrollToElement(WebElement wb);
	void dragAndDrop(WebElement src, WebElement trgt);
	void clickAndHold(WebElement wb);
	void release(WebElement wb);
	void keyDown(Keys keys);
	void keyUp(Keys key);
	
	
	
	

}
