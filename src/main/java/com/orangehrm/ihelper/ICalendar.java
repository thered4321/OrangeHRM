package com.orangehrm.ihelper;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface ICalendar {
	
	void selectMonthYear(WebElement monthYear, String expectedValue, WebElement next);
	void selectDay(List<WebElement> listWb, String expectedValue); 

}
