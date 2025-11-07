package com.orangehrm.utilslayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.orangehrm.ihelper.IActions;

public class ActionUtils implements IActions {

	Wait wait = new Wait();
	
	private WebDriver driver;

	public ActionUtils() {
		driver = DriverManager.getInstance().getDriver();
	}

	public Actions getActions() {
		return new Actions(driver);
	}

	@Override
	public void click(WebElement wb) {
		getActions().click(wait.elementToBeClickable(wb)).build().perform();

	}
	
	@Override
	public void sendKeys(WebElement wb, String value) {
		getActions().sendKeys(wait.visibilityOf(wb), value).build().perform();
		
	}

	@Override
	public void doubleClick(WebElement wb) {
		getActions().doubleClick(wait.elementToBeClickable(wb)).build().perform();

	}

	@Override
	public void contextClick(WebElement wb) {
		getActions().contextClick(wait.elementToBeClickable(wb)).build().perform();

	}

	@Override
	public void moveToElement(WebElement wb) {
		getActions().moveToElement(wait.visibilityOf(wb)).build().perform();

	}

	@Override
	public void scrollToElement(WebElement wb) {
		getActions().scrollToElement(wait.visibilityOf(wb)).build().perform();

	}

	@Override
	public void dragAndDrop(WebElement src, WebElement trgt) {
		getActions().dragAndDrop(wait.visibilityOf(src), wait.visibilityOf(trgt)).build().perform();

	}

	@Override
	public void clickAndHold(WebElement wb) {
		getActions().clickAndHold(wait.visibilityOf(wb)).build().perform();

	}

	@Override
	public void release(WebElement wb) {
		getActions().release(wait.visibilityOf(wb)).build().perform();

	}

	@Override
	public void keyDown(Keys keys) {
		getActions().keyDown(keys);

	}

	@Override
	public void keyUp(Keys keys) {
		getActions().keyUp(keys);

	}

	

}
