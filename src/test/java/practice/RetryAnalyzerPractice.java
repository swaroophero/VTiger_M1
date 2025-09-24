package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerPractice {
	int i=0;
	
	@Test(retryAnalyzer = genericUtility.RetryAnalyzerImplementation.class)
	public void demo() {
		i++;
		System.out.println("hello");
		if(i<3) //condition given to understand if a flaky test is passed before  maz count ,it will stop retry
			Assert.fail();
			}

}
