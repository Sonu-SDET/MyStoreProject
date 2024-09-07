package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass{

	public IndexPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="header_logo") WebElement logo;
	@FindBy(className="login") WebElement signin;
	@FindBy(id="search_query_top") WebElement searchBox;
	@FindBy(name="submit_search") WebElement submit_search;

	
	public boolean validateLogo() {
		return Action.isdisplayed(getDriver(), logo);
	}
	
	public String getMyStoreTitle() {
		return getDriver().getTitle();
	}
	
	public SearchResultPage searchProduct(String productName) {
		Action.type(searchBox, productName);
		Action.click(getDriver(), submit_search);
		return new SearchResultPage();
	}
	
	public LoginPage clickOnSignIn() {
		Action.click(getDriver(), signin);
		return new LoginPage();
	}
	
	

	

	
	
	
	
	
	



}
