package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class MyAddress extends BaseClass{
	
	@FindBy(name="processAddress") WebElement proceedTocheckout;
	
	@FindBy(xpath="//a[text()='Add an address']") WebElement addmyAddress;


	public MyAddress() {
		PageFactory.initElements(getDriver(), this);
	}


	public ShippingPage proceedFromChecout() {
		Action.click(getDriver(), proceedTocheckout);
		return new ShippingPage();
	}
	
	public void addnewaddress() {
		Action.click(getDriver(), addmyAddress);
	}
	
	

}
