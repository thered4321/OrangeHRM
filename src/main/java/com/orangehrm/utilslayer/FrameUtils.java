package com.orangehrm.utilslayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orangehrm.ihelper.IFrame;

public class FrameUtils implements IFrame {
	private WebDriver driver;
	private Wait wait = new Wait();

	public FrameUtils() {
		driver = DriverManager.getInstance().getDriver();
	}

	@Override
	public void frame(String idOrName) {
		wait.frameToBeAvailableAndSwitchToIt(idOrName);

	}

	@Override
	public void frame(int index) {
		wait.frameToBeAvailableAndSwitchToIt(index);

	}

	@Override
	public void frame(WebElement wb) {
		wait.frameToBeAvailableAndSwitchToIt(wb);

	}

	@Override
	public void parentFrame() {
		driver.switchTo().parentFrame();

	}

	@Override
	public void defaultContent() {
		driver.switchTo().defaultContent();

	}

}
