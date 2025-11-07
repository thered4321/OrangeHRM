package com.orangehrm.utilslayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.orangehrm.ihelper.IWebDriver;

public class WebDriverUtils implements IWebDriver {

	private WebDriver driver;

	public WebDriverUtils() {
		driver = DriverManager.getInstance().getDriver();
	}

	@Override
	public void get(String url) {
		driver.get(url);

	}

	@Override
	public void to(String url) {
		driver.navigate().to(url);

	}

	@Override
	public void forward() {
		driver.navigate().forward();

	}

	@Override
	public void back() {
		driver.navigate().back();

	}

	@Override
	public void refresh() {
		driver.navigate().refresh();

	}

	@Override
	public void close() {
		driver.close();

	}

	@Override
	public void quit() {
		driver.quit();

	}

	@Override
	public String getTitle() {

		return driver.getTitle();
	}

	@Override
	public String getCrrentUrl() {

		return driver.getCurrentUrl();
	}

	@Override
	public void maximixe() {
		driver.manage().window().maximize();

	}

	@Override
	public void minimize() {
		driver.manage().window().minimize();

	}

	@Override
	public void fullScreen() {
		driver.manage().window().fullscreen();

	}

	@Override
	public void implicitlyWait(Duration duration) {
		driver.manage().timeouts().implicitlyWait(duration);

	}

	@Override
	public void pageLoadTimeOut(Duration duration) {
		driver.manage().timeouts().pageLoadTimeout(duration);

	}

	@Override
	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();

	}

}
