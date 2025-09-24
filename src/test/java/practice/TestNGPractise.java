package practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class TestNGPractise extends BaseClass {
	

	@Ignore
	@Test
	public void xyz() {
		System.out.println("hii");
	}
	
	@Test(priority=2,enabled = true)
	public void createUser() {
		System.out.println("User created");
		System.out.println("i'm beautiful");
	}
	
	@Test(priority=1,dependsOnMethods= {"createUser","deleteUser"})
	public void modifyUser() {
		System.out.println("user modified");
	}
	
	@Test(priority=3, invocationCount = 2)
	public void deleteUser() {
		System.out.println("user delete");
	}
}
