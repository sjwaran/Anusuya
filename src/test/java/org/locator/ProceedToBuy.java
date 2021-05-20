package org.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class ProceedToBuy extends LibGlobal {

	public ProceedToBuy() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "hlb-ptc-btn-native")
	private WebElement btnProceedToBuy;

	public WebElement getBtnProceedToBuy() {
		return btnProceedToBuy;
	}

}
