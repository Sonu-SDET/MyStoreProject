package my.readexcel;

import org.testng.annotations.*;

public class ReadExcelTest {
	
	@Test
	public void readExcelTest() throws Exception{
		ExcelLibrary obj = new ExcelLibrary();
		String value = obj.readData("Test", 4, 1);
		System.out.println(value);
		
	}

}
