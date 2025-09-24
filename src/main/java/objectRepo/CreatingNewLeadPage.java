package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewLeadPage {

	@FindBy(name="firstname")
	private WebElement firstnameTextField ;
	
	@FindBy(name = "lastname")
	private WebElement lastnameTextField ;
	
	@FindBy(name = "company")
	private WebElement companyNameTextField ;
	
	@FindBy(name = "leadsource")
	private WebElement leadsourceDropDown;
	
	@FindBy(id = "designation")
	private WebElement titleTextField ;
	
	@FindBy(id = "noofemployees")
	private WebElement noOfEmployeesTextField ;
	
	@FindBy(id ="mobile")
	private WebElement mobileNoTextField;
	
	@FindBy	(id = "email")
	private WebElement emailTextField ;
	
	@FindBy(id = "country")
	private WebElement countryTextField ;
	
	@FindBy(id = "city")
	private WebElement cityTextField;
	
	@FindBy(id="state")
	private WebElement stateTextField;
	
	@FindBy(xpath = "//input[@class=\"crmButton small save\"]")
	private WebElement saveButton;
	
	
	public CreatingNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstnameTextField() {
		return firstnameTextField;
	}

	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}

	public WebElement getCompanyNameTextField() {
		return companyNameTextField;
	}

	public WebElement getLeadsourceDropDown() {
		return leadsourceDropDown;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getNoOfEmployeesTextField() {
		return noOfEmployeesTextField;
	}

	public WebElement getMobileNoTextField() {
		return mobileNoTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getCountryTextField() {
		return countryTextField;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getStateTextField() {
		return stateTextField;
	}
	
	public WebElement getSaveButton() {
		return saveButton;
	}
/**
 * 
 * @param lName
 * @param company
 * @param title
 * @param email
 * @param country
 * @param city
 * @param State
 */
	public void createNewLead(String lName, String company, String title, String email, String country, String city, String State) {
		getLastnameTextField().sendKeys(lName);
		getCompanyNameTextField().sendKeys(company);
		getTitleTextField().sendKeys(title);
		getEmailTextField().sendKeys(email);
		getCountryTextField().sendKeys(country);
		getCityTextField().sendKeys(city);
		getStateTextField().sendKeys(State);
		
		
	}
	public void createNewLead(String fName,String lName, String company) {
		getFirstnameTextField().sendKeys(fName);
		getLastnameTextField().sendKeys(lName);
		getCompanyNameTextField().sendKeys(company);
	}
	/**
	 * 
	 * @param lName
	 * @param company
	 * @param leadSource
	 * @param noOfEmp
	 * @param mobile
	 */
	public void createNewLead(String lName, String company, String leadSource, String noOfEmp, String mobile) {
		getLastnameTextField().sendKeys(lName);
		getCompanyNameTextField().sendKeys(company);
		getLeadsourceDropDown().sendKeys(leadSource);
		getNoOfEmployeesTextField().sendKeys(noOfEmp);
		getMobileNoTextField().sendKeys(mobile);
		
		
	}
	
}
