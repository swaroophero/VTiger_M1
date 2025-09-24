package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import genericUtility.PropertiesUtility;
/**
 * 
 */

public class FetchingDataFromPropertiesFile {

	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
	
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("-incognito");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
//		FileInputStream fis = new FileInputStream("C:\\Users\\swaro\\Documents\\TestData.properties");
//		Properties prop = new Properties();
//		
//		prop.load(fis);
//		String url = prop.getProperty("URL");
		PropertiesUtility pUtil = new PropertiesUtility();
		String url = pUtil.getDataFromPropertiesFile("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//String un = pUtil.getUserNameProp("username");
		//driver.findElement(By.name("user_name")).sendKeys(un);
	}
}
