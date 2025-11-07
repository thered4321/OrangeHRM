package com.orangehrm.utilslayer;

import com.orangehrm.ihelper.IAlert;

public class AlertUtils implements IAlert {

	Wait wait = new Wait();

	@Override
	public void accept() {
		wait.alertIsPresent().accept();

	}

	@Override
	public void dismiss() {
		wait.alertIsPresent().dismiss();

	}

	@Override
	public String getText() {

		return wait.alertIsPresent().getText();
	}

	@Override
	public void sendKeys(String vlaue) {
		wait.alertIsPresent().sendKeys(vlaue);

	}

}
