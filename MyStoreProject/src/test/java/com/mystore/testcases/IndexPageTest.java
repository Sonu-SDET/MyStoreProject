/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
/**
 * @author sonu_
 *
 */

public class IndexPageTest extends BaseClass{
	IndexPage ip;

	@Parameters("browser")
	@BeforeMethod(groups={"smoke","sanity","Regression"})
	public void setUp(String browser) {
		lauchApp(browser);
	}

	@Test(groups="smoke")
	public void myStoreTitle() {
		ip = new IndexPage();
		Assert.assertTrue(ip.getMyStoreTitle().contains("My Shop"));
	}

	
	@Test(groups="smoke")
	public void myStoreLogoTest() {
		ip = new IndexPage();
		Assert.assertTrue(ip.validateLogo());
		Assert.fail("Failed");
	}
	
	
	@AfterMethod(groups="smoke")
	public void tearDown() {
		getDriver().quit();
	}
	
}
