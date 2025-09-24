package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_002 extends BaseClass{
	
	@Test(groups={"sanity"})
	public void LE_002() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		String lastName = eUtil.getDataFromExcel("Leads", 5, 1);
		String company = eUtil.getDataFromExcel("Leads", 5, 2);
		String leadSource = eUtil.getDataFromExcel("Leads", 5, 3);
		String noOfEmp = eUtil.getDataFromExcel("Leads", 5, 4);
		String mobile = eUtil.getDataFromExcel("Leads", 5, 5);

		cnlp.createNewLead(lastName, company, leadSource, noOfEmp, mobile);
	}
	

}
