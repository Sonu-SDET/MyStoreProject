/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

/**
 * @author sonu_
 *
 */
public class PersonalInformationPage extends BaseClass{
	
	public PersonalInformationPage() {
		PageFactory.initElements(getDriver(), this);
	}

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
		Action.selectBySendkeys(fname, lastname);
		Action.selectBySendkeys(fname, emailId);
		Action.selectBySendkeys(fname, password);
		Action.selectbyvisibleText(fname, dob_Day);
		Action.selectbyvisibleText(fname, dob_Mon);
		Action.selectbyvisibleText(fname, dob_Year);
		Action.click(getDriver(), register);
	}
	
	
	
	
}
