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
public class AccountCreationPage extends BaseClass{

	public AccountCreationPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="") WebElement formTitle;
	
	@FindBy(id="id_gender1") WebElement title;
	
	@FindBy(id="customer_firstname") WebElement firstname;
	
	@FindBy(id="customer_lastname") WebElement lastname;
	
	@FindBy(id="email") WebElement emailId;
	
	@FindBy(id="passwd") WebElement password;
	
	@FindBy(id="days") WebElement dob_Day;
	
	@FindBy(id="months") WebElement dob_Mon;
	
	@FindBy(id="years") WebElement dob_Year;
	
	@FindBy(name="submitAccount") WebElement register;
	
	public void createAccount(String gender, String fname, String lname, String email, String pass, String dobDay, String dobMon, String dobYear ) {
		title.click();
		Action.selectBySendkeys(fname, firstname);
		Action.selectBySendkeys(lname, lastname);
		Action.selectBySendkeys(email, emailId);
		Action.selectBySendkeys(pass, password);
		Action.selectbyvisibleText(dobDay, dob_Day);
		Action.selectbyvisibleText(dobMon, dob_Mon);
		Action.selectbyvisibleText(dobYear, dob_Year);
		Action.click(getDriver(), register);
		
	}
	
	public boolean validateAccountCreatePage() {
		return Action.isdisplayed(getDriver(), formTitle);
	}
	
	
}
