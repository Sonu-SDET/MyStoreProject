/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.*;
/**
 * @author sonu_
 *
 */
public class OrderPage extends BaseClass{
	
	public OrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//td[@class='cart_unit']/ul/li") WebElement unitPrice;
	
	@FindBy(css="#total_price_container > span") WebElement totalPrice;
	
	@FindBy(xpath="//p/a[@title='Proceed to checkout']") WebElement proceedToCheckout;
	
	public Double getUnitPrice() {
		String unitPrice1 = unitPrice.getText();
		String unit = unitPrice1.replaceAll("[^a-zA-Z0-9]","");
		double finalUnitPrice = Double.parseDouble(unit);
		return finalUnitPrice/100;
	}
	
	public Double getTotalPrice() {
		String unitPrice1 = totalPrice.getText();
		String unit = unitPrice1.replaceAll("[^a-zA-Z0-9]","");
		double finalUnitPrice = Double.parseDouble(unit);
		return finalUnitPrice/100;
	}
	
	public LoginPage clickOnCheckout1() {
		Action.click(getDriver(), proceedToCheckout);
		return new LoginPage();
	}
	
	
	public AddressPage clickOnCheckout() {
		Action.click(getDriver(), proceedToCheckout);
		return new AddressPage();
	}
	
	
	
}
