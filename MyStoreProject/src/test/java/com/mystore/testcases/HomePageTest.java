/**
 * 
 */
package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

/**
 * @author sonu_
 *
 */
public class HomePageTest extends BaseClass{
	IndexPage ip;
	LoginPage lp;
	HomePage hp;
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browsers) {
		lauchApp(browsers);
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test(groups="smoke")
	public void wishListTest() {
		ip = new IndexPage();
		lp = ip.clickOnSignIn();
		hp = lp.login("sonu123@yopmail.com", "sonukumar");
		hp.validatePage();
		
	}
	
	@Test(groups="smoke")
	public void orderHistoryDetailTest() {
		ip = new IndexPage();
		lp = ip.clickOnSignIn();
		hp = lp.login("sonu123@yopmail.com", "sonukumar");
		hp.validateorderHistory();
		
	}
	
	


}
