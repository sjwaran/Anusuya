package org.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class EditQuantites extends LibGlobal {

	public EditQuantites() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Delete']")
	private WebElement btnQuantity;

	@FindBy(xpath = "//h1[contains(text(),'Amazon')]")
	private WebElement getTextFromPage;

	public WebElement getBtnQuantity() {
		return btnQuantity;
	}

	public WebElement getGetTextFromPage() {
		return getTextFromPage;
	}

}
