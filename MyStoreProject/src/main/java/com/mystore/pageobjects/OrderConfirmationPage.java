package com.mystore.pageobjects;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.WebElement;


public class OrderConfirmationPage extends BaseClass{
	
	public OrderConfirmationPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath="//p[@class='alert alert-success']") WebElement confirmMessage;
	
	public boolean validateConfirmMessage() {
		boolean status = confirmMessage.getText().contains("Your order on My Shop is complete.");
		return status;
	}
	
	
	
	
}
