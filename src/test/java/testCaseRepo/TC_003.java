package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_003 extends BaseClass {
	
	@Test(groups={"smoke"})
	public void LE_003() throws EncryptedDocumentException, IOException, InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		//Assert.fail();
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		String lastName = eUtil.getDataFromExcel("Leads", 8, 1);
		String company = eUtil.getDataFromExcel("Leads", 8, 2);
		String title = eUtil.getDataFromExcel("Leads", 8, 3);
		String email = eUtil.getDataFromExcel("Leads", 8, 4);
		String country = eUtil.getDataFromExcel("Leads", 8, 5);
		String city = eUtil.getDataFromExcel("Leads", 8, 6);
		String state = eUtil.getDataFromExcel("Leads", 8, 7);
		cnlp.createNewLead(lastName, company, title, email, country, city, state);
		Thread.sleep(4000);
	}

}
