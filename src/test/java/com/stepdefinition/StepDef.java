package com.stepdefinition;

import org.locator.AddToCart;
import org.locator.DeliveryAddress;
import org.locator.DeliveryOptions;
import org.locator.EditQuantites;
import org.locator.EmailPage;
import org.locator.HomePage;
import org.locator.PasswordPage;
import org.locator.ProceedToBuy;
import org.locator.SearchProductPage;
import org.openqa.selenium.WebElement;

import com.base.LibGlobal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends LibGlobal {
	HomePage homePage;
	EditQuantites editQuantites;

	@Given("I am on Amazon page")
	public void i_am_on_Amazon_page() {
		
		getLaunch("https://www.amazon.in/");

	}

	@When("I need to enter userName and Password and Click login button")
	public void i_need_to_enter_userName_and_Password_and_Click_login_button() {
		homePage = new HomePage();
		WebElement verifyLogo = homePage.getVerifyLogo();
		if (verifyLogo.isEnabled()) {
			System.out.println("Launched Amazon Home Page");
		}
		moveToElement(homePage.getMousetnSign());
		buttonCLick(homePage.getBtnSign());
		EmailPage emailPage = new EmailPage();
		enterText(emailPage.getTxtUserName(), "9080748939");
		buttonCLick(emailPage.getBtnContinue());
		PasswordPage passwordPage = new PasswordPage();
		enterText(passwordPage.getTxPassword(), "yuva95");
		buttonCLick(passwordPage.getBtnSignIn());
	}

	@Then("I need to validate MY username is present on right side header page of Homepage")
	public void i_need_to_validate_MY_username_is_present_on_right_side_header_page_of_Homepage() {
		String textFromPage = getTextFromPage(homePage.getGetTextUserName());
		if (textFromPage.contains("Yuvaraj")) {
			System.out.println("UserName is Displayes on HomePage :" + textFromPage);
		}

	}

	@When("I need to search for a product")
	public void i_need_to_search_for_a_product() {
		enterText(homePage.getTxSearchBox(), "mixi Grinder");
		buttonCLick(homePage.getBtnSearch());

	}

	@When("I need to click a particular product from search list and add to card")
	public void i_need_to_click_a_particular_product_from_search_list_and_add_to_card() {
		SearchProductPage productPage = new SearchProductPage();
		buttonCLick(productPage.getProductSearch());
		switchToChildWindow();
		AddToCart toCart = new AddToCart();
		buttonCLick(toCart.getBtnAddToCard());

	}

	@Then("I need to verify Product is added successfully")
	public void i_need_to_verify_Product_is_added_successfully() {
		WebElement btnAddToCart = homePage.getBtnAddToCart();
		String text = btnAddToCart.getText();
		int parseInt = Integer.parseInt(text);
		if (parseInt >= 1) {
			System.out.println("Product is Add to Card Sucessfully" + "  " + "Total No of Product in cart :" + text);
		}

	}

	@Then("I need to procedd for payment")
	public void i_need_to_procedd_for_payment() {
		ProceedToBuy toBuy = new ProceedToBuy();
		buttonCLick(toBuy.getBtnProceedToBuy());
	}

	@Then("GO back to cart page and remove product from cart")
	public void go_back_to_cart_page_and_remove_product_from_cart() throws InterruptedException {
		DeliveryAddress address = new DeliveryAddress();
		buttonCLick(address.getBtnAddress());
		DeliveryOptions deliveryOptions = new DeliveryOptions();
		buttonCLick(deliveryOptions.getBtnChanageOrDelete());
		Thread.sleep(4000);
		editQuantites = new EditQuantites();
		buttonCLick(editQuantites.getBtnQuantity());

	}

	@Then("I need to verify that product is removed from the cart")
	public void i_need_to_verify_that_product_is_removed_from_the_cart() throws InterruptedException {
		Thread.sleep(4000);
		String textFromPage = getTextFromPage(editQuantites.getGetTextFromPage());
		if (textFromPage.contains("Cart is empty")) {
			System.out.println("Amazon Cart is Empty");

		}
		driver.quit();
	}

}
