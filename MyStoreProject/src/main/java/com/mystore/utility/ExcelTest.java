package com.mystore.utility;

import org.testng.annotations.*;
public class ExcelTest {
	
	NewExcelLibrary obj = new NewExcelLibrary("C:\\Users\\sonu_\\Automation\\Workspace\\MyStoreProject\\TestData\\TestData.xlsx");
	
	@Test(priority=1,enabled=false)
	public void testcase1() {
		NewExcelLibrary obj = new NewExcelLibrary("C:\\Users\\sonu_\\Automation\\Workspace\\MyStoreProject\\TestData\\TestData.xlsx");
		int totalRows = obj.getRowCount("Employee");
		System.out.println("Total number of rows "+totalRows);
	}
	
	@Test(priority=2,enabled=false)
	public void testcase2() {
		NewExcelLibrary obj = new NewExcelLibrary("C:\\Users\\sonu_\\Automation\\Workspace\\MyStoreProject\\TestData\\TestData.xlsx");
		String Salary = obj.getCellData("Employee", "Salary", 2);
		System.out.println("Salary is "+Salary);
	}
	
	@Test(priority=3,enabled=false)
	public void testcase3() {
		NewExcelLibrary obj = new NewExcelLibrary("C:\\Users\\sonu_\\Automation\\Workspace\\MyStoreProject\\TestData\\TestData.xlsx");
		String rating = obj.getCellData("Employee", 4, 2);
		System.out.println("Rating is now "+Double.valueOf(rating));
	}

	@Test(priority=4,enabled=false)
	public void testcase4() {
		obj.setCellData("Employee", "5000", 1, "Salary");
		obj.setCellData("Employee", "Salary", 2, "5000");
	}
	
	@Test(priority=5,enabled=false)
	public void testcase5() {
		obj.addSheet("NewSheet");
	}
	
	
	@Test(priority=6)
	public void testcase6() {
		obj.removeSheet("NewSheet");
	}
	
}
