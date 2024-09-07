package com.dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import my.readexcel.NewExcelLibraryy;

public class DataDrivenTest {
	
	String excelPath="C:\\Users\\sonu_\\Automation\\Workspace\\MyStoreProject\\TestData\\TestData.xlsx";
	
	@Test(dataProvider="credentialss")
	public void loginTest(String user, String pass) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("passwd")).sendKeys(pass);
		driver.findElement(By.id("SubmitLogin")).click();
		
		System.out.println(user+" "+pass);
		
	}
	
	@DataProvider(name="credentials")
	public Object[][] getExcelData() {
		NewExcelLibraryy obj = new NewExcelLibraryy(excelPath);
		int rowCount = obj.getRowCount(excelPath);
		int cellCount = obj.getColumnCount(excelPath);
		Object[][] data = new Object[rowCount][cellCount];
	
		return data;
	}
	
	
	
	@DataProvider(name="credentials")
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0]="admin1";
		data[0][1]="pass1";
		
		data[1][0]="admin2";
		data[1][1]="pass2";
		
		data[2][0]="admin3";
		data[2][1]="pass3";
		
		return data;
	}

}
