package com.orangehrm.utilslayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.orangehrm.ihelper.IDropdown;

public class HandleDropDown implements IDropdown {

	private Wait wait = new Wait();

	private Select getSelect(WebElement wb) {
		return new Select(wait.visibilityOf(wb));

	}

	@Override
	public void selectByVisibleText(WebElement wb, String value) {
		getSelect(wb).selectByVisibleText(value);

	}

	@Override
	public void selectByValue(WebElement wb, String value) {
		getSelect(wb).selectByValue(value);

	}

	@Override
	public void selectByIndex(WebElement wb, int value) {
		getSelect(wb).selectByIndex(value);

	}

	@Override
	public void withoutSelect(List<WebElement> listWb, String expectedValue) {
		for (WebElement value : wait.visibilityOfAllElement(listWb)) {
			if (value.getText().equalsIgnoreCase(expectedValue)) {
				wait.elementToBeClickable(value).click();
				break;
			}
		}

	}

}
