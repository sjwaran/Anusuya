package org.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class DeliveryAddress extends LibGlobal {
	public DeliveryAddress() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "address-ui-widgets-enterAddressFullName")
	private WebElement txtFullName;

	@FindBy(id = "address-ui-widgets-enterAddressPhoneNumber")
	private WebElement txtMobilePhone;

	@FindBy(id = "address-ui-widgets-enterAddressPostalCode")
	private WebElement txtPincode;

	@FindBy(id = "address-ui-widgets-enterAddressLine1")
	private WebElement txtAddress1;

	@FindBy(id = "address-ui-widgets-enterAddressLine2")
	private WebElement txtAddress2;

	@FindBy(id = "address-ui-widgets-enterAddressCity")
	private WebElement txtCity;

	@FindBy(xpath = "//input[@class='a-button-input']")
	private WebElement btnClick;

	@FindBy(xpath = "//a[contains(text(),'Deliver to this')]")
	private WebElement btnAddress;

	public WebElement getBtnAddress() {
		return btnAddress;
	}

	public WebElement getTxtFullName() {
		return txtFullName;
	}

	public WebElement getTxtMobilePhone() {
		return txtMobilePhone;
	}

	public WebElement getTxtPincode() {
		return txtPincode;
	}

	public WebElement getTxtAddress1() {
		return txtAddress1;
	}

	public WebElement getTxtAddress2() {
		return txtAddress2;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

}
