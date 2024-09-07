package my.readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public void readExcel() throws Exception {
		
		String excelPath="C:\\Users\\sonu_\\Automation\\Workspace\\MyStoreProject\\TestData\\TestData.xlsx";
		String sheetName="Test";
		String fileNameString="TestData";
		
		File file = new File(excelPath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetName);

		int lastRowcount = sheet.getLastRowNum();

		String val1 = sheet.getRow(1).getCell(0).getStringCellValue();
		
		for(int i=0;i<lastRowcount;i++) {
			
			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) {
				
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(value+" ");
				
			}
			
			System.out.println();
			
		}
		
		wb.close();
		
		
		
	}
	
}
