package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;
import genericUtility.IPathUtility;

public class WritingDataToExcelFile {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		
//		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
//		Workbook wb = WorkbookFactory.create(fis);
//		wb.createSheet("Leo1").createRow(0).createCell(0).setCellValue("naan than da leo");
//		wb.getSheet("Leo1").createRow(1).createCell(1).setCellValue("leo das");
//		FileOutputStream fos = new FileOutputStream(IPathUtility.excelPath);
//		wb.write(fos);
		
		ExcelUtility eUtil = new ExcelUtility();
		eUtil.writeDataIntoCell("Leo1", 1, 2, "bloody sweet");
		
	}

}
