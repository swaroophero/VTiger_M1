package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {
	
	@Test
	public void strictLevelComparisonHardAssertion() {
		String expValue = "java";
		String actValue ="java";
		Assert.assertEquals(actValue, expValue);
		
	}
	
	@Test
	public void containsLevelComparisonHardAssertion() {
		String expValue="ava";
		String actValue ="java";
		Assert.assertTrue(actValue.contains(expValue));
	}

}
