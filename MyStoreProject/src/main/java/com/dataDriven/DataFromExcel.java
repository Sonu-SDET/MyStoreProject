package com.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataFromExcel {
	
	String excelPath="C:\\Users\\sonu_\\Automation\\Workspace\\MyStoreProject\\TestData\\TestData.xlsx";
	//C:\Users\sonu_\Automation\Workspace\MyStoreProject\TestData
	
	
	@Test(dataProvider="credentials")
	public void getDatafromexcel(String user, String pass) {
		//String user, String pass
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("passwd")).sendKeys(pass);
		driver.findElement(By.id("SubmitLogin")).click();
	}
	
	
	@DataProvider(name="credentials")
	public Object[][] getData() throws Exception {
		
		FileInputStream fis = new FileInputStream(new File(excelPath));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Data");
		int row = sh.getLastRowNum();
		int col = sh.getRow(0).getLastCellNum();
		
		System.out.println(row);//3
		System.out.println(col);//2
		
		Object[][] data = new Object[row][col];
		
//		data[0][0] = "user1";
//		data[0][1] = "pass1";
//		
//		data[1][0] = "user2";
//		data[1][1] = "pass2";
		
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<col;j++) {
				
				data[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
				
			}
			
		}
		
		return data;
		
	}

}
