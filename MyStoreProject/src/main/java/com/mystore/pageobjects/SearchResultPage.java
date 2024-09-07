/**
 * 
 */
package com.mystore.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.*;
/**
 * @author sonu_
 *
 */
public class SearchResultPage extends BaseClass {
	
	public SearchResultPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(className="product-name") List<WebElement> productResult;
	
	@FindBy(xpath="//div[@class='product-container']/div/h5/a")  List<WebElement> productList;
	
	@FindBy(xpath="//p[@class='alert alert-warning']") WebElement noProductFound;
	
	
	public boolean isProductAvailable() {
		return Action.isdisplayed(getDriver(), productList.get(0));
	} 
	
	
	public String warningText() {
		return noProductFound.getText();
	}
	
	public AddToCartPage clickOnProduct(String productname) {
		
		for(int i=0;i<productList.size();i++) {
			String item = productList.get(i).getText();
			if(productname.equalsIgnoreCase(item)) {
				Action.click(getDriver(), productList.get(i));
			}
		}
		
		//Action.click(driver, productList.get(0));
		return new AddToCartPage();
	}
	
	
	

}
