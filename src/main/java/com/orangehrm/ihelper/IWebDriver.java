package com.orangehrm.ihelper;

import java.time.Duration;

public interface IWebDriver {
	
	void get(String url);
	void to(String url);
	void forward();
	void back();
	void refresh();
	void close();
	void quit();
	String getTitle();
	String getCrrentUrl();
	void maximixe();
	void minimize();
	void fullScreen();
	void implicitlyWait(Duration duration);
	void pageLoadTimeOut(Duration duration);
	void deleteAllCookies();
	
	

}
