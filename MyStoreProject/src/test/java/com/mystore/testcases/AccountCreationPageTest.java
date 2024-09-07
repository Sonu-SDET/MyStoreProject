/**
 * 
 */
package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AccountCreationPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

/**
 * @author sonu_
 *
 */
public class AccountCreationPageTest extends BaseClass{
	IndexPage ip;
	LoginPage lp;
	
	@BeforeMethod
	public void setUp(String browser) {
		lauchApp(browser);
	}
	
	@Test
	public void createAccountPageTest() {
		ip = new IndexPage();
		lp = ip.clickOnSignIn();
		AccountCreationPage ac = lp.createAccount("sonu123@yopmail.com", "sonu","kumar","sonukumar","3","7","1991");
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}


}
