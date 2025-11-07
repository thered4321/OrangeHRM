package com.orangehrm.ihelper;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface IRadioButton {
	
	void selectValue(List<WebElement> listWb, String expectedValue);

}
