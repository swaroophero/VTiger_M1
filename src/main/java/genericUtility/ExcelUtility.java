package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is an utility class to work with excel file
 * @author swaro
 * @version 
 */
public class ExcelUtility {
/**
 * 
 * @param sheetName
 * @param rowID
 * @param cellID
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	
	public String getDataFromExcel(String sheetName,int rowID, int cellID) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(IPathUtility.vtigerExcel);
		Workbook wb = WorkbookFactory.create(fis);
		Cell cell = wb.getSheet(sheetName).getRow(rowID).getCell(cellID);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(cell);
		return value;
	}
	/**
	 * This is a generic method to write data in a cell to excel file for an existing sheet and existing row
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void writeDataIntoCell(String sheet,int row,int cell,String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.vtigerExcel);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(IPathUtility.vtigerExcel);
		wb.write(fos);
	}
	/**
	 * This is a generic method to create a new row in the excel file for an existing sheet
	 * @param sheet
	 * @param row
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void createRow(String sheet,int row) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.vtigerExcel);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).createRow(row);
		FileOutputStream fos = new FileOutputStream(IPathUtility.vtigerExcel);
		wb.write(fos);
	}
}
