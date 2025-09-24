package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import genericUtility.SeleniumUtility;

public class FacebookRefresh {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("-incognito");
		WebDriver driver = new ChromeDriver(opt);
		
		SeleniumUtility sUtil= new SeleniumUtility();
		sUtil.maximizeWindow(driver);
		sUtil.getApplication(driver, "https://www.facebook.com/");
		sUtil.implicitWait(driver, 10);
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("admin");
		driver.navigate().refresh();
		element.sendKeys("leo");
	}
}
