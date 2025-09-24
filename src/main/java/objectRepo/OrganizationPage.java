package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

	@FindBy(xpath = "//a[text()='Amazon']")
	private WebElement organisationName;
	
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrganisationName() {
		return organisationName;
	}
	
	public void clickOnOrganization() {
		getOrganisationName().click();	
	}
}
