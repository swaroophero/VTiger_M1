package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class Test_TC_001 extends BaseClass {
	
	@Test(groups= {"sanity","smoke"})
	public void LE_001() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		String firstName = eUtil.getDataFromExcel("leads", 2, 1);
		String lastName = eUtil.getDataFromExcel("Leads", 2, 2);
		String company = eUtil.getDataFromExcel("Leads", 2, 3);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(firstName, lastName, company);
		
	}
	
	@Test
	public void defaults(){
		System.out.println("im good	");
	}

}
