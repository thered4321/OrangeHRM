package com.orangehrm.steps;

import com.orangehrm.baselayer.BaseTest;
import com.orangehrm.pagelayer.LoginPage;
import com.orangehrm.utilslayer.PropertyReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	static LoginPage loginPage;

	@Given("user open login page url on {string} driver")
	public void user_open_login_page_url_on_driver(String driverName) {
		new BaseTest().setup(driverName);

	}

	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
		loginPage = new LoginPage();
		loginPage.enterUserNameAndPassword("admin", "admin");
	}

	@Then("user verify error credentials message")
	public void user_verify_error_credentials_message() {
		loginPage.clickOnLoginButton();
		System.out.println(loginPage.getInvalidCredential());

	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		loginPage.enterUserNameAndPassword(PropertyReader.getProperty("USERNAME"),
				PropertyReader.getProperty("PASSWORD"));

	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickOnLoginButton();
	}

}
