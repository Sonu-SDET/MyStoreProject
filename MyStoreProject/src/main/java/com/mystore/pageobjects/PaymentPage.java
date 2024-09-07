/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.*;

import com.mystore.actiondriver.Action;
import com.mystore.base.*;

/**
 * @author sonu_
 *
 */
public class PaymentPage extends BaseClass{
	
	public PaymentPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(className="bankwire") WebElement bankWireMethod;
	
	@FindBy(className="cheque") WebElement payByCheck;
	
	public OrderSummaryPage selectPayBycheque() {
		Action.click(getDriver(), payByCheck);
		return new OrderSummaryPage();
	}
	
	
	public OrderSummaryPage selectPayByWire() {
		Action.click(getDriver(), bankWireMethod);
		return new OrderSummaryPage();
	}
	
	
	public OrderSummaryPage clickOnPaymentMethod() {
		Action.click(getDriver(), bankWireMethod);
		return new OrderSummaryPage();
	}
	

	
	

}
