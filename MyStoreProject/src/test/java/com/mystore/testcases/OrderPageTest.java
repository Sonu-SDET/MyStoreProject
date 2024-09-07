package com.mystore.testcases;

import com.mystore.base.*;
import com.mystore.pageobjects.AddToCartPage;
import com.mystore.pageobjects.AddressPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.MyAddress;
import com.mystore.pageobjects.OrderConfirmationPage;
import com.mystore.pageobjects.OrderPage;
import com.mystore.pageobjects.OrderSummaryPage;
import com.mystore.pageobjects.PaymentPage;
import com.mystore.pageobjects.ProductDetailPage;
import com.mystore.pageobjects.SearchResultPage;
import com.mystore.pageobjects.ShippingPage;

import org.testng.Assert;
import org.testng.annotations.*;

public class OrderPageTest extends BaseClass{
	IndexPage ip;
	SearchResultPage sp;
	ProductDetailPage pdp;
	AddToCartPage acp;
	OrderPage or;
	LoginPage lp;
	AddressPage ap;
	AddressPage as;
	ShippingPage ss;
	MyAddress ma;
	PaymentPage pp;
	OrderSummaryPage op;
	OrderConfirmationPage of;
	
	@BeforeMethod
	public void setUp(String browser) {
		lauchApp(browser);
	}
	
	
	@Test
	public void addToCartTest() throws InterruptedException{
		
		ip = new IndexPage();
		sp = ip.searchProduct("Blouse");
		acp = sp.clickOnProduct("Blouse");
		acp.selectSize("L");
		acp.enterQuantity("3");
		acp.selectColor();
		acp.clickOnAddToCart();
		Thread.sleep(1000);
		or = acp.proceedToCheckout();
		lp = or.clickOnCheckout1();
		ap = lp.login1("sonu123@yopmail.com", "sonukumar");
		ma = ap.saveAddresss("Sonu", "Kumar", "Saboura", "Begusarai","Alaska", "87643","Temporary address","987654321");
		ss = ma.proceedFromChecout();
		pp = ss.clickOnProceedTocheckout();
		op = pp.selectPayBycheque();

	}
	
	

}
