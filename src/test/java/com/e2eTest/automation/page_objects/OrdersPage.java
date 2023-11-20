package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class OrdersPage extends BasePage {

	public OrdersPage(WebDriver driver) {
		super(Setup.getDriver());
	}
	/* Retrieve web elements */
	@FindBy(how = How.ID, using = "StartDate")
	private static WebElement startDate;

	@FindBy(how = How.ID, using = "EndDate")
	private static WebElement endDate;

	@FindBy(how = How.ID, using = "WarehouseId")
	private static WebElement wareHouse;

	@FindBy(how = How.XPATH, using = "//input[@id='search-product-name']")
	private static WebElement product;

	// @FindBy(how = How.XPATH, using = "//input[@id='search-product-name']")
	private static WebElement orderStatuses;

	// @FindBy(how = How.XPATH, using = "//input[@id='search-product-name']")
	private static WebElement paymentStatuses;

	// @FindBy(how = How.XPATH, using = "//input[@id='search-product-name']")
	private static WebElement shippingStatuses;

	// input[@id='search-product-name']

//	public static WebElement getProductName() {
//		return productName;
//	}
//	
//	public static WebElement getBtnSearch() {
//		return btnSearch;
//	}
}
