package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.*;

public class AddToCartPage extends BaseClass{

	public AddToCartPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	String pagetitle = "";
	
	@FindBy(id="#our_price_display") WebElement itemPrice;
	
	@FindBy(id="quantity_wanted") WebElement enterquantity;
	
	@FindBy(id="group_1") WebElement itemSize;
	
	@FindBy(xpath="//li/a[@title='Black']") WebElement blackColor;
	
	@FindBy(xpath="//li/a[@title='White']") WebElement whiteColor;
	
	@FindBy(xpath="") WebElement addToCartMsg;

	@FindBy(id="add_to_cart") WebElement addToCartBtn;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']") WebElement proceedtocheckout;
	
	
	public void enterQuantity(String quantity) {
		Action.type(enterquantity, quantity);
	}
	
	public void selectSize(String size) {
		Action.selectbyvisibleText(size, itemSize);
	}
	
	public void selectColor() {
		Action.click(getDriver(), blackColor);
	}

	public void clickOnAddToCart() {
		Action.click(getDriver(), addToCartBtn);
	}
	
	public boolean validateAddToCart() {
		return Action.isdisplayed(getDriver(), addToCartMsg);
	}
	
	public OrderPage proceedToCheckout() {
		Action.click(getDriver(), proceedtocheckout);
		return new OrderPage();
	}
	
	
	
	
	
	
	
	
}
