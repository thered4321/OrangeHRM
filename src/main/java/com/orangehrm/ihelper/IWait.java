package com.orangehrm.ihelper;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface IWait {
	
	WebElement visibilityOf(WebElement wb);
	List<WebElement> visibilityOfAllElement(List<WebElement> listWb);
	WebElement elementToBeClickable(WebElement wb);
	Alert alertIsPresent();
	WebDriver frameToBeAvailableAndSwitchToIt(String frameNameOrId); 
	WebDriver frameToBeAvailableAndSwitchToIt(int index);
	WebDriver frameToBeAvailableAndSwitchToIt(WebElement wb);

}
