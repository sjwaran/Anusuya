package org.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchProductPage extends LibGlobal {

	public SearchProductPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='a-size-small a-color-base a-text-normal'])[1]")
	private WebElement productSearch;

	public WebElement getProductSearch() {
		return productSearch;
	}

}
