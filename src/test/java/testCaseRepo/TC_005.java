package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_005 extends BaseClass{
	
	@Test(groups={"regression"})
	public void CON_002() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnContactMenu();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreatingNewContactIcon();
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		String lastName = eUtil.getDataFromExcel("Contacts", 4, 1);
		String title = eUtil.getDataFromExcel("Contacts", 4, 2);
		String Department = eUtil.getDataFromExcel("Contacts", 4, 3);
		String email = eUtil.getDataFromExcel("Contacts", 4, 4);
		String mobile = eUtil.getDataFromExcel("Contacts", 4, 5);
		cncp.createNewContact(lastName, title, Department, email, mobile);
		
	}

}
