package com.mystore.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mystore.utility.NewExcelLibrary;

public class DataProviders {
	
	String excelPath = System.getProperty("user.dir")+"/TestData/TestData.xlsx";
	
	NewExcelLibrary obj = new NewExcelLibrary(excelPath);
	
	@DataProvider(name="credentials")
	public Object[][] getEmailData1() throws Exception{
		FileInputStream fis = new FileInputStream(new File(excelPath));
		String sheetName = "Data";
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Data");
		
		int row = sh.getLastRowNum();
		int col = sh.getRow(0).getLastCellNum();
		System.out.println(row);
		System.out.println(col);
		Object[][] data = new Object[row][col];
		
		for(int i =1;i<=row;i++) {
			for(int j=0;j<col;j++) {
				data[i-1][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
	
	
	
	public Object[][] getData() throws Exception{
		
		NewExcelLibrary obj = new NewExcelLibrary(excelPath,"Data");
		
		FileInputStream fis = new FileInputStream(new File(excelPath));
		String sheetName = "Data";
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Data");
		
		int row = sh.getLastRowNum();
		int col = sh.getRow(0).getLastCellNum();
		System.out.println(row);
		System.out.println(col);
		Object[][] data = new Object[row][col];
		
		for(int i =1;i<=row;i++) {
			for(int j=0;j<col;j++) {
				data[i-1][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
	
	
	public Object[][] getEmailData() throws Exception{
		String sheetName = "Data";
		
		int row = obj.getRowCount("Data");
		int actrow = row+1;
		int col = obj.getColumnCount("Data");
		
		Object[][] data = new Object[actrow][col];
		
		for(int i =0;i<actrow;i++) {
			for(int j=0;j<col;j++) {
				data[i][j] = obj.getCellData("Data", j, i+2);
			}
		}
		return data;
	}


}
