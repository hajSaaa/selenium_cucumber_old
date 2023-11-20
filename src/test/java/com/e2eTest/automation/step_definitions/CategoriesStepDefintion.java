package com.e2eTest.automation.step_definitions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTest.automation.page_objects.MenuCatalogPage;
import com.e2eTest.automation.page_objects.CategoriesPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoriesStepDefintion {
	
	private CategoriesPage categoriesPage;
	private SeleniumUtils seleniumUtils;

	public CategoriesStepDefintion() {
		seleniumUtils = new SeleniumUtils();
		categoriesPage = new CategoriesPage();
	}


	@When("Je clique sur le bouton Add new")
	public void jeCliqueSurLeBoutonAddNew() {
		seleniumUtils.click(CategoriesPage.getBtnAddNew());
	}
	
	@When("Je renseigne le champ Name {string}")
	public void jeRenseigneLeChampName(String nameCategorie) {
		seleniumUtils.writeText(CategoriesPage.getNameCategorie(),nameCategorie);
	}
	

	@When("Je renseigne le champ Description {string} {string}")
	public void jeRenseigneLeChampDescription(String description, String descriptionFrameID) {
		seleniumUtils.click(CategoriesPage.getDescriptionCategorie());
		seleniumUtils.switchToNewWindow(Setup.getDriver(), descriptionFrameID);
		Setup.getDriver().switchTo().activeElement().sendKeys(description);
		Setup.getDriver().switchTo().defaultContent();
	}

	@When("Je clique sur la liste déroulante de Parent category")
	public void jeCliqueSurLaListeDéroulanteDeParentCategory() {
		//seleniumUtils.click(CategoriesPage.getParentCategorie());
		Select select = new Select(CategoriesPage.getParentCategorie());
		select.selectByIndex(2);
	}

	@When("Je clique sur Upload a file {string}")
	public void jeCliqueSurUploadAFile(String url) {
		seleniumUtils.writeText(CategoriesPage.getBtnUploadFile(), url);
	}
	
	@When("Je verifie que le fichier a bien ete charge")
	public void jeVerifieQueLeFichierABienEteCharge() {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(CategoriesPage.getUploadSuccess()));
	}
	
	@When("Je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() {
		seleniumUtils.click(CategoriesPage.getBtnSave());
	}

	/*@Then("Je verifie que la nouvelle categorie a ete ajoutee")
	public void jeVerifieQueLaNouvelleCategorieAEteAjoutee() {
		String message = AddANewCategoryPage.getAlertSuccess().getText();
		Assert.assertTrue(message.contains(text));
	}
*/

	@Then("Je verifie que la nouvelle categorie a ete ajoutee {string}")
	public void jeVerifieQueLaNouvelleCategorieAEteAjoutee(String text) {
		String message = CategoriesPage.getMesssageAjoutSuccess().getText();
		Assert.assertTrue(message.contains(text));
	}








	
	



}

