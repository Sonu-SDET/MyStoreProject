package my.readexcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary {
	
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelLibrary() throws Exception{
		String excelPath="C:\\Users\\sonu_\\Automation\\Workspace\\MyStoreProject\\TestData\\TestData.xlsx";
		File file = new File(excelPath);
		FileInputStream fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
	}
	
	
	public String readData(String sheetName, int row, int col) {
		sheet = wb.getSheet(sheetName);
		return sheet.getRow(row).getCell(col).getStringCellValue();
	}
	
	
	
	

}
