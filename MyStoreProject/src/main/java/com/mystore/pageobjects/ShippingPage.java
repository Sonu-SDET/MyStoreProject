package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class ShippingPage extends BaseClass{

	public ShippingPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(name="processCarrier") WebElement proceedToCheckout;
	
	@FindBy(id="cgv") WebElement termsAndConditions;
	
	
	public PaymentPage clickOnProceedTocheckout() {
		Action.click(getDriver(), termsAndConditions);
		Action.click(getDriver(), proceedToCheckout);
		return new PaymentPage();
	}
	
	
	
	
}
