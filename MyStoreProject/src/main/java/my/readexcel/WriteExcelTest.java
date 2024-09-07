package my.readexcel;

import org.testng.annotations.Test;

public class WriteExcelTest {

	WriteExcel we = new WriteExcel();
	
	@Test
	public void writeExcelTest() throws Exception {
		we.writeExcel("Test", "Male", 0, 2);
	}
	
	
}
