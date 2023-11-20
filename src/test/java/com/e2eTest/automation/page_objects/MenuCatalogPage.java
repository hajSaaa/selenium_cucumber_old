package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class MenuCatalogPage extends BasePage {

	/* Retrieve web elements */
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']")
	private static WebElement menuCatalog;
     
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Products']")
	private static WebElement products;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Categories']")
	private static WebElement categories;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Manufacturers']")
	private static WebElement manufacturers;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Product reviews']")
	private static WebElement productReviews;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Product tags']")
	private static WebElement productTags;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Attributes']")
	private static WebElement attributes;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Sales']")
	private static WebElement sales;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Orders']")
	private static WebElement orders;

	public MenuCatalogPage() {
		super(Setup.getDriver());
	}

	public static WebElement getMenuCatalog() {
		return menuCatalog;
	}
	
	public static WebElement getProducts() {
		return products;
	}
	
	public static WebElement getCategories() {
		return categories;
	}
	
	public static WebElement getManufacturers() {
		return manufacturers;
	}
	
	public static WebElement getProductReviews() {
		return manufacturers;
	}
	
	public static WebElement getProductTags() {
		return manufacturers;
	}
	
	public static WebElement getAttributes() {
		return manufacturers;
	}
		
	public static WebElement getSales() {
		return sales;
	}
	
	public static WebElement getOrders() {
		return orders;
	}
}