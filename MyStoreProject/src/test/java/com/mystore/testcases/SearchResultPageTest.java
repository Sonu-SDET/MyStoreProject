/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.SearchResultPage;

/**
 * @author sonu_
 *
 */

public class SearchResultPageTest extends BaseClass{
	
	IndexPage ip;
	SearchResultPage sr;
	
	@BeforeMethod
	public void setUp(String browser) {
		lauchApp(browser);
	}
	
	@Test
	public void productAvailiabilityTest() {
		String item = "Blouse";
		ip = new IndexPage();
		sr = ip.searchProduct(item);
		Assert.assertTrue(sr.isProductAvailable());
	}
	
	
	@Test
	public void noProductAvailability() {
		String item = "Blousedddd";
		ip = new IndexPage();
		sr = ip.searchProduct(item);
		Assert.assertTrue(sr.warningText().contains("No results were found for your search"));
	}
	
	
	@AfterMethod
	public void tearDown() {
	}

}
