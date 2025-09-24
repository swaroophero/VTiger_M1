package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_004 extends BaseClass {

	@Test(groups={"sanity"})
	public void CON_001() throws EncryptedDocumentException, IOException, InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickOnContactMenu();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreatingNewContactIcon();
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		String firstName = eUtil.getDataFromExcel("Contacts", 1, 1);
		String lastName = eUtil.getDataFromExcel("Contacts", 1, 2);
		String OrgName = eUtil.getDataFromExcel("Contacts", 1, 3);
		cncp.createNewContact(driver, firstName, lastName, OrgName);
	}
}
