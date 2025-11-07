package com.orangehrm.utilslayer;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.orangehrm.ihelper.IScreenshot;

import ru.yandex.qatools.ashot.AShot;

public class ScreenShotUtils implements IScreenshot {

	private WebDriver driver;
	public ScreenShotUtils() {
		driver = DriverManager.getInstance().getDriver();
	}
	
	
	@Override
	public byte[] takeScreenShot() {
		TakesScreenshot ts = (TakesScreenshot) driver; 
		byte[] bytes = ts.getScreenshotAs(OutputType.BYTES);
		
		return bytes;
	}

	@Override
	public void fullScreenShot() {
//		AShot a = new AShot();
//		a.shootingStrategy(null)
		
	}

}
