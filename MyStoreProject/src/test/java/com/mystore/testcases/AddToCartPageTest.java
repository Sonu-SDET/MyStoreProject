/**
 * 
 */
package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.ProductDetailPage;
import com.mystore.pageobjects.SearchResultPage;

/**
 * @author sonu_
 *
 */
public class AddToCartPageTest extends BaseClass{
	
	IndexPage ip;
	SearchResultPage sp;
	ProductDetailPage pdp;
	AddToCartPage acp;
	
	
	@BeforeMethod
	public void setUp(String browser) {
		lauchApp(browser);
	}
	
	@AfterMethod
	public void tearDown() {
		
	}
	
	@Test
	public void addToCartTest() throws InterruptedException{
		
		ip = new IndexPage();
		sp = ip.searchProduct("Blouse");
		acp = sp.clickOnProduct("Blouse");
		acp.selectSize("L");
		acp.enterQuantity("1");
		acp.selectColor();
		acp.clickOnAddToCart();
		Thread.sleep(1000);
		acp.proceedToCheckout();
		
	}
	
}
