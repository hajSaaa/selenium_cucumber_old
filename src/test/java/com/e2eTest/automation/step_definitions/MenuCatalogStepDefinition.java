package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.MenuCatalogPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuCatalogStepDefinition  {
	
	private MenuCatalogPage catalogPage;
	private SeleniumUtils seleniumUtils;
	
	public MenuCatalogStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		catalogPage = new MenuCatalogPage();
	}

	@When("Je clique sur le menu catalog")
	public void jeCliqueSurLeMenuCatalog() {
		seleniumUtils.click(MenuCatalogPage.getMenuCatalog());
	}
	
	@When("Je clique sur le menu Products")
	public void jeCliqueSurLeMenuProducts() {
		seleniumUtils.click(MenuCatalogPage.getProducts());
	}

	@When("Je clique sur le menu Categories")
	public void jeCliqueSurLeMenuCategories()  {
		seleniumUtils.waitForElementToBeClickable(MenuCatalogPage.getCategories());
		seleniumUtils.click(MenuCatalogPage.getCategories());
	}











}
