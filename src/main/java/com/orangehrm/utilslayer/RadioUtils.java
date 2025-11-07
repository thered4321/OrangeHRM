package com.orangehrm.utilslayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.orangehrm.ihelper.IRadioButton;

public class RadioUtils implements IRadioButton {

	Wait wait = new Wait();

	@Override
	public void selectValue(List<WebElement> listWb, String expectedValue) {
		for(WebElement value: wait.visibilityOfAllElement(listWb)) {
			if(value.getText().equalsIgnoreCase(expectedValue)) {
				wait.elementToBeClickable(value).click();
				break;
			}
		}
		
	}

}
