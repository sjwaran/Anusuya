package org.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class PasswordPage extends LibGlobal {

	public PasswordPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ap_password")
	private WebElement txPassword;

	@FindBy(id = "signInSubmit")
	private WebElement btnSignIn;

	public WebElement getTxPassword() {
		return txPassword;
	}

	public WebElement getBtnSignIn() {
		return btnSignIn;
	}

}
