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
public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="email") WebElement userName;
	
	@FindBy(id="passwd") WebElement passWord;
	
	@FindBy(id="SubmitLogin") WebElement signInBtn;
	
	@FindBy(id="email_create") WebElement emailForNewAccount;
	
	@FindBy(id="SubmitCreate") WebElement createNewAccountBtn;
	
	@FindBy(id="id_gender1") WebElement title;
	
	@FindBy(id="customer_firstname") WebElement firstname;
	
	@FindBy(id="customer_lastname") WebElement lastname;
	
	@FindBy(id="email") WebElement emailId;
	
	@FindBy(id="passwd") WebElement password;
	
	@FindBy(id="days") WebElement dob_Day;
	
	@FindBy(id="months") WebElement dob_Mon;
	
	@FindBy(id="years") WebElement dob_Year;
	
	@FindBy(name="submitAccount") WebElement register;
	
	public HomePage login(String user, String pass) {
		Action.type(userName,user);
		Action.type(passWord,pass);
		Action.click(getDriver(), signInBtn);
		return new HomePage();
	}
	
	public AddressPage login1(String user, String pass) {
		Action.type(userName,user);
		Action.type(passWord,pass);
		Action.click(getDriver(), signInBtn);
		return new AddressPage();
	}

	
	public AccountCreationPage createAccount(String newEmail, String fname, String lname, String pass, String dobDay, String dobMon, String dobYear ) {
		Action.selectBySendkeys(newEmail, emailForNewAccount);
		Action.click(getDriver(), createNewAccountBtn);
		title.click();
		Action.selectBySendkeys(fname, firstname);
		Action.selectBySendkeys(lname, lastname);
		Action.selectBySendkeys(newEmail, emailId);
		Action.selectBySendkeys(pass, password);
		Action.selectbyvalue(dobDay, dob_Day);
		Action.selectbyvalue(dobMon, dob_Mon);
		Action.selectbyvalue(dobYear, dob_Year);
		Action.click(getDriver(), register);
		
		try {
			Thread.sleep(10000);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return new AccountCreationPage();
	}
	
	

}
