package com.mystore.pageobjects;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.*;
import org.openqa.selenium.WebElement;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;


public class ProductDetailPage extends BaseClass{
	
	public ProductDetailPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	String pagetitle = "";
	
	@FindBy(id="#our_price_display") WebElement itemPrice;
	
	@FindBy(id="#our_price_display") WebElement itemSize;
	
	@FindBy(id="#our_price_display") WebElement itemColor;
	
	@FindBy(id="add_to_cart") WebElement addToCart;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']") WebElement proceedToCheckout;
	
	public void selectSize(String size) {
		Action.selectbyvalue(size, itemSize);
	}
	
	public String getProductprice() {
		return itemPrice.getText();
	}
	
	public void submitToCart() {
		Action.click(getDriver(), addToCart);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		Action.click(getDriver(), proceedToCheckout);
	}
	

}
