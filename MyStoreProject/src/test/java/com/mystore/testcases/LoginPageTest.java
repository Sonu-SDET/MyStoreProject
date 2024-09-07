package com.mystore.testcases;

import com.mystore.base.BaseClass;
import com.mystore.dataprovider.DataProviders;

import org.testng.annotations.*;
import com.mystore.pageobjects.*;

public class LoginPageTest extends BaseClass{
	
	IndexPage ip;
	LoginPage lp;
	HomePage hp;
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browser) {
		lauchApp(browser);
	}
	
	
	@Test(dataProvider="credentials", dataProviderClass=DataProviders.class,groups={"smoke","sanity"})
	public void loginTest(String username,String password) {
		ip = new IndexPage();
		lp = ip.clickOnSignIn();
		hp = lp.login(username, password);
		hp.validatePage();
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		getDriver().quit();
	}

}
