package com.orangehrm.utilslayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverManager {

	private static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();

	private DriverManager() {

	}

	public static DriverManager getInstance() {
		return new DriverManager();
	}

	public void setDriver(String driverName) {

		WebDriver driver;
		if (driverName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (driverName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "\\AllDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (driverName.equalsIgnoreCase("incognito")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
			driver = new ChromeDriver(opt);

//			//In other way to write 32,33,34 line in single statement
//			driver = new ChromeDriver(new ChromeOptions().addArguments("--incognito"));		
		} else if (driverName.equalsIgnoreCase("headless")) {
			driver = new ChromeDriver(new ChromeOptions().addArguments("--headless"));
		} else if (driverName.equalsIgnoreCase("disableNotifications")) {
			driver = new ChromeDriver(new ChromeOptions().addArguments("--disableNotifications"));
		} else if (driverName.equalsIgnoreCase("SSlCertificate")) {
			ChromeOptions opt = new ChromeOptions();
			opt.setAcceptInsecureCerts(true);
			driver = new ChromeDriver(opt);
		} else {
			throw new RuntimeException("InvalidDriverName: Enter Valid DriverName");
		}

		td.set(driver);

	}

	public WebDriver getDriver() {
		return td.get();

	}

}
