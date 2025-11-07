package com.orangehrm.ihelper;

import org.openqa.selenium.WebElement;

public interface IAlert {
	
	void accept();
	void dismiss();
	String getText();
	void sendKeys(String vlaue);

}
