package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class ProductsPage extends BasePage {

		/* Retrieve web elements */
		@FindBy(how = How.XPATH, using = "//input[@id='SearchProductName']")
		private static WebElement productName;

		@FindBy(how = How.XPATH, using = "//button[@id='search-products']")
		private static WebElement btnSearch;

		public ProductsPage() {
			super(Setup.getDriver());
		}

		public static WebElement getProductName() {
			return productName;
		}
		
		public static WebElement getBtnSearch() {
			return btnSearch;
		}
}
