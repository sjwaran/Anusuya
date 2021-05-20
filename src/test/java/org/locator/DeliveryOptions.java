package org.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class DeliveryOptions extends LibGlobal {

	public DeliveryOptions() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Change quantities or delete')]")
	private WebElement btnChanageOrDelete;

	public WebElement getBtnChanageOrDelete() {
		return btnChanageOrDelete;
	}

}
