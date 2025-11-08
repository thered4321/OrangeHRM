package com.orangehrm.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.baselayer.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(name="username")
	private WebElement uName;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginButton;
	
	@FindBy(xpath="//p[text()='Forgot your password? ']")
	private WebElement forgotPass;
	
	@FindBy(xpath="//p[text()=\"Invalid credentials\"]")
	private WebElement errorMsg;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterUserNameAndPassword(String username, String password) {
		element.sendKeys(this.uName, username);
		element.sendKeys(this.pass, password);
		
	}
	
	public void clickOnLoginButton() {
		element.click(this.loginButton);
	}
	
	public String getInvalidCredential() {
		return element.getText(this.errorMsg);
		
	}
}
