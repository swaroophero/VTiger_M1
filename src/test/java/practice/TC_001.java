package practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.ExcelUtility;
import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;
import objectRepo.LoginPage;

public class TC_001 {
	
	@Test
	public void launchVTiger() throws IOException {
		WebDriver driver = new ChromeDriver();
		SeleniumUtility sUtil = new SeleniumUtility();
		sUtil.maximizeWindow(driver);
		sUtil.getApplication(driver, "http://localhost:8888/");
		sUtil.implicitWait(driver, 15);
		
		LoginPage lp = new LoginPage(driver);
		PropertiesUtility pUtil = new PropertiesUtility();
		String un = pUtil.getDataFromPropertiesFile("username");
		String pwd = pUtil.getDataFromPropertiesFile("password");
		lp.login(un, pwd);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage le = new LeadsPage(driver);
		le.clickOnCreateNewLeadIcon();
		
		CreatingNewLeadPage cl = new CreatingNewLeadPage(driver);
		ExcelUtility eUtil = new ExcelUtility();
		String fn = eUtil.getDataFromExcel("Leads", 2, 2);
		String ln = eUtil.getDataFromExcel("Leads", 2, 3);
		String comp = eUtil.getDataFromExcel("Leads", 2, 4);
		cl.createNewLead(fn, ln, comp);
		
		
		hp.signOutOperation(driver);
		
		
	}

}
