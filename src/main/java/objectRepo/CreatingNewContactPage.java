package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class CreatingNewContactPage {
	
	@FindBy(xpath = "//input[@name=\"firstname\"]")
	private WebElement firstnameTextField;
	
	@FindBy(xpath = "//input[@name=\"lastname\"]")
	private WebElement lastnameTextField;
	
	@FindBy(xpath = "//input[@name=\"account_id\"]/following-sibling::img[@title=\"Select\"]")
	private WebElement organisationNameTextField;
	
	@FindBy(id="title")
	private WebElement titleTextField;
	
	@FindBy(id ="department")
	private WebElement departmentTextField;
	
	@FindBy(id = "email")
	private WebElement emailTextField ;
	
	@FindBy(id="mobile")
	private WebElement mobileTextField ;
	
	@FindBy(id = "mailingcity")
	private WebElement mailingcityTextField ;
	
	@FindBy(id="mailingstate")
	private WebElement mailingstateTextField ;
	
	@FindBy(id ="mailingcountry")
	private WebElement mailingCountryTextField;
	
	@FindBy(xpath = "//input[@class='crmButton small save']")
	private WebElement saveButton ;
	
	public CreatingNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstnameTextField() {
		return firstnameTextField;
	}

	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}

	public WebElement getOrganisationNameTextField() {
		return organisationNameTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getDepartmentTextField() {
		return departmentTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getMailingcityTextField() {
		return mailingcityTextField;
	}

	public WebElement getMailingstateTextField() {
		return mailingstateTextField;
	}

	public WebElement getMailingCountryTextField() {
		return mailingCountryTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	/**
	 * This is a business library to create new contact
	 * @param fName
	 * @param lName
	 * @param orgName
	 * @throws InterruptedException 
	 */
	public void createNewContact(WebDriver driver, String fName, String lName , String orgName) throws InterruptedException {
		getFirstnameTextField().sendKeys(fName);
		getLastnameTextField().sendKeys(lName);
		getOrganisationNameTextField().click();
		SeleniumUtility sUtil = new SeleniumUtility();
		String parentId = sUtil.getCurrentWindowId(driver);
		sUtil.switchToSecondWindow(driver);
		OrganizationPage op = new OrganizationPage(driver);
//		System.out.println(driver.getCurrentUrl());
		op.clickOnOrganization();
		sUtil.switchToWindowBasedOnId(driver, parentId);
//		Thread.sleep(2000);
//		sUtil.switchToSecondWindow(driver);
//		System.out.println(driver.getCurrentUrl());
//		Thread.sleep(2000);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new contact
	 * @param lName
	 * @param title
	 * @param dept
	 * @param email
	 * @param mobile
	 */
	public void createNewContact(String lName, String title, String dept,String email, String mobile) {
		getLastnameTextField().sendKeys(lName);
		getTitleTextField().sendKeys(title);
		getDepartmentTextField().sendKeys(dept);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getSaveButton().click();
	}
	/**
	 * This is a business library to create new contact
	 * @param lName
	 * @param dept
	 * @param email
	 * @param mobile
	 * @param mailingCity
	 * @param mailingCountry
	 * @param mailingState
	 */
	
	public void createNewContact(String lName, String dept,String email, String mobile, String mailingCity, String mailingCountry, String mailingState){
		getLastnameTextField().sendKeys(lName);
		getDepartmentTextField().sendKeys(dept);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
     	getMailingcityTextField().sendKeys(mailingCity);
     	getMailingstateTextField().sendKeys(mailingState);
     	getMailingCountryTextField().sendKeys(mailingCountry);
		getSaveButton().click();
	}

}
