package com.orangehrm.utilslayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.orangehrm.ihelper.ICalendar;

public class CalendarUtils implements ICalendar {

	
	private Wait wait = new Wait();
	
	
	@Override
	public void selectMonthYear(WebElement monthYear, String expectedValue, WebElement next) {
		while(true) {
			String actualmonthYear =  wait.visibilityOf(monthYear).getText();
			if(actualmonthYear.equalsIgnoreCase(expectedValue)) {
				break;
			}
			else {
				wait.elementToBeClickable(next).click();
			}
		}
		
	}

	@Override
	public void selectDay(List<WebElement> listWb, String expectedValue) {
		for(WebElement value: wait.visibilityOfAllElement(listWb)) {
			if(wait.visibilityOf(value).getText().equalsIgnoreCase(expectedValue)) {
				wait.elementToBeClickable(value).click();
				break;
			}
		}
		
	}

}
