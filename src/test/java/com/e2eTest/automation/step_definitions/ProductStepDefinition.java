package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.ProductsPage;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDefinition {
	
	private ProductsPage productsPage;
	private SeleniumUtils seleniumUtils;

	public ProductStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		productsPage = new ProductsPage();
	}
	
	@When("Je saisis le produit {string}")
	public void jeSaisisLeProduit(String asus) {
		seleniumUtils.writeText(ProductsPage.getProductName(), asus); 
	}
	
	@When("Je clique sur le bouton Search")
	public void jeCliqueSurLeBoutonSearch() {
		seleniumUtils.click(ProductsPage.getBtnSearch());
	}
	
	@Then("Le resultat de recherche est OK")
	public void leResultatDeRechercheEstOK() {

	}

	@Then("Le resultat de recherche est KO")
	public void leResultatDeRechercheEstKO() {

	}




}
