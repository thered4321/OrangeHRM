package com.orangehrm.utilslayer;

import org.openqa.selenium.WebElement;

import com.orangehrm.ihelper.IElement;

public class Element implements IElement {

	private Wait wait = new Wait();

	@Override
	public void click(WebElement wb) {
		wait.elementToBeClickable(wb).click();

	}

	@Override
	public void submit(WebElement wb) {
		wait.visibilityOf(wb).submit();

	}

	@Override
	public void clear(WebElement wb) {
		wait.visibilityOf(wb).clear();

	}

	@Override
	public void sendKeys(WebElement wb, String expectedValue) {
		wait.visibilityOf(wb).sendKeys(expectedValue);

	}

	@Override
	public String getText(WebElement wb) {
		return wait.visibilityOf(wb).getText();
	}

	@Override
	public String getAttribute(WebElement wb, String keyName) {

		return wait.visibilityOf(wb).getAttribute(keyName);
	}

	@Override
	public String getCssValue(WebElement wb) {

		return wait.visibilityOf(wb).getCssValue("background");
	}

	@Override
	public boolean isDisplayed(WebElement wb) {

		return wait.visibilityOf(wb).isDisplayed();
	}

	@Override
	public boolean isEnable(WebElement wb) {

		return wait.visibilityOf(wb).isEnabled();
	}

	@Override
	public boolean isSelected(WebElement wb) {

		return wait.visibilityOf(wb).isSelected();
	}
}
