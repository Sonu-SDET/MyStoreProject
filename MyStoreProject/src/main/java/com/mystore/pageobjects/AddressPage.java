package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.*;

public class AddressPage extends BaseClass{
	
	
	public AddressPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="firstname") WebElement firstName;
	
	@FindBy(id="lastname") WebElement lastName;
	
	@FindBy(id="address1") WebElement address;
	
	@FindBy(id="city") WebElement city;
	
	@FindBy(id="id_state") WebElement state;
	
	@FindBy(id="postcode") WebElement zipCode;
	
	@FindBy(id="phone") WebElement homePhone;
	
	@FindBy(id="alias") WebElement addressTitle;
	
	@FindBy(id="submitAddress") WebElement save;
	
	@FindBy(name="processAddress") WebElement proceedtocheckout;
	
	public OrderPage saveAddress(String fname, String lname, String _address, String _city, String _zipcode, String _title) {
		Action.type(firstName,fname);
		Action.type(lastName, lname);
		Action.type(address, _address);
		Action.selectbyvisibleText(_city, city);
		Action.type(zipCode, _zipcode);
		Action.type(addressTitle, _title);
		Action.click(getDriver(), save);
		return new OrderPage();
	}
	
	
	public MyAddress saveAddresss(String fname, String lname, String _address, String _city, String _state,String _zipcode, String _title,String phone) {
		Action.type(firstName,fname);
		Action.type(lastName, lname);
		Action.type(address, _address);
		Action.type(city, _city);
		Action.selectbyvisibleText(_state,state);
		Action.type(zipCode, _zipcode);
		Action.type(homePhone, phone);
		Action.type(addressTitle, _title);
		Action.click(getDriver(), save);
		return new MyAddress();
	}
	
	public ShippingPage proceedTocheckout() {
		Action.click(getDriver(), proceedtocheckout);
		return new ShippingPage();
	}
	

}
