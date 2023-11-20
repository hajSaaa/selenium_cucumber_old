package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AuthentificationStepDefinition {

	private AuthentificationPage authentificationPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;

	public AuthentificationStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		authentificationPage = new AuthentificationPage();
		configFileReader = new ConfigFileReader();
	}

	/* TC_01 */
	@Given("Je me connecte sur l application nopeCommerce")
	public void jeMeConnecteSurLApplicationNopeCommerce() {
		seleniumUtils.get(configFileReader.getProperties("home.recette"));
	}

	@When("Je saisis l email {string}")
	public void jeSaisisLEmail(String email) {
		seleniumUtils.writeText(AuthentificationPage.getEmail(), email);
	}

	@When("Je saisis le password {string}")
	public void jeSaisisLePassword(String password) {
		seleniumUtils.writeText(AuthentificationPage.getPassword(), password);
	}

	@When("Je clique sur le bouton LOG IN")
	public void jeCliqueSurLeBoutonLOGIN() {
		seleniumUtils.click(AuthentificationPage.getBtnLogin());
		
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
    String message = AuthentificationPage.getDashboard().getText();
    Assert.assertEquals(message, text);
	}
	
	/* TC_02 */
	@Then("Je verifie le message d'erreur {string}")
	public void jeVerifieLeMessageDErreur(String string) {
	}
	
	/* TC_03 */
	@When("Je clique sur le bouton Logout")
	public void jeCliqueSurLeBoutonLogout() {
		seleniumUtils.click(AuthentificationPage.getBtnLogout());
	}
}

