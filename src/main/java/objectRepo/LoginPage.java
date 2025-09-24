package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration of webelement
	@FindBy (name="user_name")
	private WebElement usernameTextField;
	@FindBy (name="user_password")
	private WebElement passwordTextField;
	
	@FindBy (id="submitButton")
	private WebElement loginButton;
	
	//initialization of webelement
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}


	//public getters
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}


	public WebElement getPasswordTextField() {
		return passwordTextField;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}
	//Utilization of web elements
	/**
	 * This is a business library/user defined method to perform login operation to the web application
	 * @param un
	 * @param pwd
	 */
	public void login(String un,String pwd) {
		
		getUsernameTextField().sendKeys(un);
		getPasswordTextField().sendKeys(pwd);
		getLoginButton().click();
	}

}
