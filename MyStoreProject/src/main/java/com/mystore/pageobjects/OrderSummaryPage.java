package com.mystore.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mystore.actiondriver.Action;
import com.mystore.base.*;

public class OrderSummaryPage extends BaseClass{

	public OrderSummaryPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//button[@type='submit']") WebElement confirmOrder;
	
	public OrderConfirmationPage confirmorder() {
		Action.click(getDriver(), confirmOrder);
		return new OrderConfirmationPage();
	}
	
	
	
	
}
