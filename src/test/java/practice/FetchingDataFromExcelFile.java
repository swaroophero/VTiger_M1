package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import genericUtility.ExcelUtility;
import genericUtility.PropertiesUtility;

public class FetchingDataFromExcelFile {
	public static void main(String[] args) throws IOException {
//		FileInputStream fis = new FileInputStream("C:\\Users\\swaro\\Documents\\TestData.xlsx");
//	String value = new XSSFWorkbook(fis).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
//		Workbook wb= WorkbookFactory.create(fis);
//		Cell cell = wb.getSheet("Sheet1").getRow(1).getCell(0);
//		DataFormatter df = new DataFormatter();
//		String value = df.formatCellValue(cell);
		
		
//		PropertiesUtility pUtil = new PropertiesUtility();
//		String value = pUtil.getDataFromExcel("Sheet1", 1, 1);
		
		
		ExcelUtility eUtil = new ExcelUtility();
		String value = eUtil.getDataFromExcel("Sheet1", 1, 1);
		
		System.out.println(value);
		
		eUtil.createRow("Leo1", 2);
		eUtil.writeDataIntoCell("Leo1", 2, 3, "Badass");
	}

}
