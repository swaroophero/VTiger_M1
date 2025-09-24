package practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;
import objectRepo.HomePage;
import objectRepo.LeadsPage;
import objectRepo.LoginPage;

public class POMpractice {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		SeleniumUtility sUtil= new SeleniumUtility();
		PropertiesUtility pUtil = new PropertiesUtility();
		String url = pUtil.getDataFromPropertiesFile("url");
		String un = pUtil.getDataFromPropertiesFile("username");
		String pwd = pUtil.getDataFromPropertiesFile("password");
		sUtil.getApplication(driver,url );
		LoginPage l = new LoginPage(driver);
		l.login(un, pwd);
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage le = new LeadsPage(driver);
		le.clickOnCreateNewLeadIcon();
		
		
		hp.signOutOperation(driver);	
	}

}
