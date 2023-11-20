package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class CategoriesPage extends BasePage {

	/* Retrieve web elements */
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnAddNew;
	
	@FindBy(how = How.XPATH, using = "//input[@id='Name']")
	private static WebElement nameCategorie;
	
	@FindBy(how = How.XPATH, using = "//iframe[@id='Description_ifr']")
	private static WebElement descriptionCategorie;

	@FindBy(how = How.XPATH, using = "//select[@id='ParentCategoryId']")
	private static WebElement parentCategorie;
	
	@FindBy(how = How.XPATH, using = "//input[@title='file input']")
	private static WebElement btnUploadFile;
	
	@FindBy(how = How.XPATH, using = "//li[@class='qq-file-id-0 qq-upload-success']")
	private static WebElement uploadSuccess;
	
	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSave;
	
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissable']")
	private static WebElement messsageAjoutSuccess;
	
	public CategoriesPage() {
		super(Setup.getDriver());
	}
		
	public static WebElement getBtnAddNew() {
		return btnAddNew;
	}
	
	public static WebElement getNameCategorie() {
		return nameCategorie;
	}
	
	public static WebElement getDescriptionCategorie() {
		return descriptionCategorie;
	}
	
	public static WebElement getParentCategorie() {
		return parentCategorie;
	}
	
	public static WebElement getBtnUploadFile() {
		return btnUploadFile;
	}
	
	public static WebElement getUploadSuccess() {
		return uploadSuccess;
	}
	
	public static WebElement getBtnSave() {
		return btnSave;
	}
	
	public static WebElement getMesssageAjoutSuccess() {
		return messsageAjoutSuccess;
	}
	
}

