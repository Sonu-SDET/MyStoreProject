package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.*;

public class HomePage extends BaseClass{
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//div[contains(@class,'breadcrumb')]") WebElement pageBreadcrumb;
	
	@FindBy(xpath="//a[@title='Orders']") WebElement orderHistory;
	
	@FindBy(xpath="//a[@title='Credit slips']")  WebElement creditSlip;
	
	
	public Boolean validatePage() {
		boolean flag = Action.isdisplayed(getDriver(), pageBreadcrumb);
		return flag;
	}
	
	public Boolean validateorderHistory() {
		boolean flag = Action.isdisplayed(getDriver(), orderHistory);
		return flag;
	}

 
	

}
