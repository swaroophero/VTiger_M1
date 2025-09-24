package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class HomePage {
	
	@FindBy(xpath="//a[@href=\"index.php?module=Leads&action=index\"]")
	private WebElement leadsMenu;
	
	@FindBy(xpath="//a[@href=\"index.php?module=Contacts&action=index\"]")
	private WebElement contactsMenu;
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement accountsIcon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutOption;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAccountsIcon() {
		return accountsIcon;
	}

	public WebElement getSignOutOption() {
		return signOutOption;
	}
/**
 * This is a business library to click on Leads menu
 */
	public void clickOnLeadsMenu() {
		getLeadsMenu().click();
	}
	/**
	 * This is a business library to click on Contacts menu
	 */
	public void clickOnContactMenu() {
		getContactsMenu().click();
	}
	
	/**
	 * This is a business library to perform sign out operation
	 * @param driver
	 */
	
	public void signOutOperation(WebDriver driver) {
		SeleniumUtility sUtil = new SeleniumUtility();
		sUtil.mouseHoveringAction(driver, getAccountsIcon());
	    getSignOutOption().click();

	}
}
