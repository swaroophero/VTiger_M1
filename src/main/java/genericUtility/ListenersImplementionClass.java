package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementionClass implements ITestListener {
	JavaUtility jUtil = new JavaUtility();
	String dateTimeStamp = jUtil.getCalenderDetails("dd-MM-YYYY hh-mm-ss");

	ExtentReports reports;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "Test method started");
		Reporter.log(methodName + "Test method started");
		
		//Creating fields in the extent reports for every test method getting executed"
		test = reports.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		//fetching method name of the test method during runtime
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "Test method executed successfully");
		Reporter.log(methodName + "Test method executed successfully");

		// logging the status as pass in the extent reports for the test method getting executed successfully
		test.log(Status.PASS, methodName+" - executed successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "Test method failed");
		// the below message will get logged in TestNG report
		Reporter.log(methodName + "Test method failed");
		//logging the status as FAIL in the extent reports for the test method getting failed 
		test.log(Status.FAIL, methodName+"-Failed");
		
		test.log(Status.INFO, result.getThrowable());

		//creating screenshot name with method name and date time stamp to make the name unique every time
		String screenshotName = methodName + "--" + dateTimeStamp;
		SeleniumUtility sUtil = new SeleniumUtility();

		try {
			//capturing the screenshot of the webpage for a failed test method
			String path = sUtil.takeScreenshotOfWebPage(BaseClass.sdriver, screenshotName);
			//attaching screenshot to the failed test in extent report
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"Test method skipped");
		Reporter.log(methodName+"Test method skipped");
		//logging the status as SKIP in the extent reports for the test method getting skippeed
	}
//
//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//	}
//
//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) {
//	}
//
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Suite execution Started");
		//Configuring the extent report i.e. setting name , path and other configurations
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(".\\Extents Report\\report--"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("VTiger Execution reports");
		reporter.config().setReportName("VTiger Report");
		reporter.config().setTheme(Theme.DARK);
		
		//Generating an empty Extent report with all the configuration done using ExtentSparkReporter
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base URL", "https://localhost");
		reports.setSystemInfo("Base Platform", "Windows");
		reports.setSystemInfo("Base Browser", "Chrome");
		reports.setSystemInfo("Test Engineer", "Swaroop Joseph");
		
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Suite execution done");
		
		//Flushing the Extent Report to the specific location(Compulsory)
		reports.flush();
	}

}
