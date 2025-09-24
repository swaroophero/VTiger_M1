package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ListenersImplementionClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

@Listeners(genericUtility.ListenersImplementionClass.class)
public class TC_006 extends BaseClass {
	@Test(groups={"regression"})
	public void CON_003() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnContactMenu();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreatingNewContactIcon();
		Assert.fail();
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		String lastName = eUtil.getDataFromExcel("Contacts", 7, 1);
		String title = eUtil.getDataFromExcel("Contacts", 7, 2);
		String Department = eUtil.getDataFromExcel("Contacts", 7, 3);
		String email = eUtil.getDataFromExcel("Contacts", 7, 4);
		String mobile = eUtil.getDataFromExcel("Contacts", 7, 5);
		cncp.createNewContact(lastName, title, Department, email, mobile);
	}

}
