package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {
	
	@Test
	public void strictLevelComparisionSoftAssertion() {
		String expValue ="Selenium";
		String actValue ="selenium";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(expValue, actValue);
		sa.assertTrue(actValue.equals(expValue));
		System.out.println("soft assertion strict level validation successful");
		sa.assertAll();
	}

	@Test
	public void containsLevelComparisonSoftAssertion() {
		String expValue = "ava";
		String actValue = "java";
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(actValue.contains(expValue));
		System.out.println("Soft assetion contains level validation successfull");
		sa.assertAll();
	}
}
