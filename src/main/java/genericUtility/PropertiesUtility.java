package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * This is an utility class to work with properties file
 * @author swaro
 * @version 
 */

public class PropertiesUtility {

	/**
	 * This is a generic method to fetch data from properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String getDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	
    
}
