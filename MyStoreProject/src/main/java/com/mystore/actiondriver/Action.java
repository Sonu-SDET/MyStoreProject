package com.mystore.actiondriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.mystore.actioninterface.ActionInterface;
import com.mystore.base.BaseClass;

public class Action extends BaseClass{
	
	
	public static boolean checkElementStatus(WebElement element){
		boolean flag = false;
		
		try {
			element.isDisplayed();
			flag=true;
		}catch(Exception e){
			flag = false;
		}
		
		finally {
			if(flag) {
				
			}else {
				System.out.println("Element not Found");
			}
		}
		return flag;
	}
	

	public static boolean findelement(WebDriver driver, WebElement element) {
		boolean flag = false;

		try {
			element.isDisplayed();
			flag = true;
		}catch(Exception e) {
			flag = false;
		}
		
		finally {
			if(flag) {
				
			}else {
				System.out.println("Element not Found");
			}
		}
		return flag;
	}
	

	public static boolean isdisplayed(WebDriver driver, WebElement ele) {
		boolean flag = false;
		flag = findelement(driver,ele);
		
		if(flag) {
			System.out.println("Element is Displayed");
		}else {
			System.out.println("Element is not Displayed");
		}
		return flag;
	}
	
	
	public static boolean selectbyvisibleText(String visibletext, WebElement element) {
		boolean flag = false;
		
		flag = checkElementStatus(element);
		
		if(flag) {
			Select sl = new Select(element);
			sl.selectByVisibleText(visibletext);
			System.out.println("Value Selected");
		}else {
			System.out.println("Value not Selected");
		}
		return false;
	}

	public void scrollByVisibilityOfElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}


	public static void click(WebDriver driver, WebElement element) {
		boolean flag = checkElementStatus(element);
		
		if(flag) {
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		}

	}

	
	public static boolean type(WebElement ele, String text) {
		boolean flag = false;
		
		flag=checkElementStatus(ele);
		
		if(flag) {
			ele.clear();
			ele.sendKeys(text);
		}else {
			System.out.println("Element not found");
		}
		return flag;
	}



	public static boolean isSelected(WebDriver driver, WebElement ele) {
		boolean flag = false;
		flag = findelement(driver,ele);

		if(flag) {
			flag = ele.isSelected();
			if(flag) {
				System.out.println("The element is selected");
			}else {
				System.out.println("The element is not selected");
			}
		}
		return false;
	}



	public static boolean isEnabled(WebDriver ldriver, WebElement ele) {
		boolean flag = false;

		try {
			ele.isEnabled();
			flag = true;
		}catch(Exception e) {
			flag = false;
		}
		if(flag) {
			System.out.println("Element is enabled");
		}else {
			System.out.println("Element is disabled");
		}
		return false;
	}


	public static boolean selectBySendkeys(String value,WebElement ele) {
		boolean flag = false;
		try {
			isdisplayed(getDriver(),ele);
			flag = true;
		}
		catch(Exception e) {
			flag = false;
		}
		finally {
			if(flag) {
				ele.clear();
				ele.sendKeys(value);
				System.out.println("Value added to "+ele.getText());
			}else {
				System.out.println(ele.getText()+"  not found");
			}
		}
		return false;
	}


	public boolean selectByIndex(WebElement element, int index) {
		boolean flag = false;
		try {
			element.isDisplayed();
			Select sl = new Select(element);
			sl.selectByIndex(index);
			flag=true;
		}catch(Exception e){
			flag = false;
		}
		
		if(flag) {
			System.out.println("Element is selected");
		}else {
			System.out.println("Element is not selected");
		}
		
		return false;
	}


	public static boolean selectbyvalue(String value, WebElement element) {
		boolean flag = false;
		try {
			checkElementStatus(element);
			//element.isDisplayed();
			flag=true;
		}catch(Exception e){
			flag = false;
		}
		
		if(flag) {
			Select sl = new Select(element);
			sl.selectByValue(value);
			System.out.println("Value Selected");
		}else {
			System.out.println("Value not Selected");
		}
		return false;
	}


	public boolean mouseHoverByJavaScript(WebElement locator) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean JSClick(WebDriver driver, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean switchToFrameByIndex(WebDriver driver, int index) {
		boolean flag = false;
		try {
		driver.switchTo().frame(index);
		flag = true;
		}catch(Exception e) {
			flag = false;
		}
		if(flag) {
			System.out.println("Frame not Selected");
		}else {
			System.out.println("Frame Selected");
		}
		return false;
	}



	public boolean switchToFrameById(WebDriver driver, String idValue) {
		boolean flag = false;
		try {
		driver.switchTo().frame(idValue);
		flag = true;
		}catch(Exception e) {
			flag = false;
		}
		if(flag) {
			System.out.println("Frame not Selected");
		}else {
			System.out.println("Frame Selected");
		}
		return false;
	}



	public boolean switchToFrameByName(WebDriver driver, String nameValue) {
		boolean flag = false;
		try {
		driver.switchTo().frame(nameValue);
		flag = true;
		}catch(Exception e) {
			flag = false;
		}
		if(flag) {
			System.out.println("Frame not Selected");
		}else {
			System.out.println("Frame Selected");
		}
		return false;
	}



	public boolean switchToDefaultFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
		return false;
	}



	public void mouseOverElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();

	}

	
	public boolean moveToElement(WebDriver driver, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean mouseover(WebDriver driver, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean draggable(WebDriver driver, WebElement source, int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean draganddrop(WebDriver driver, WebElement source, WebElement target) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean slider(WebDriver driver, WebElement ele, int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean rightclick(WebDriver driver, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean switchWindowByTitle(WebDriver driver, String windowTitle, int count) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean switchToNewWindow(WebDriver driver) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean switchToOldWindow(WebDriver driver) {
		// TODO Auto-generated method stub
		return false;
	}



	public int getColumncount(WebElement row) {
		// TODO Auto-generated method stub
		return 0;
	}



	public int getRowCount(WebElement table) {
		// TODO Auto-generated method stub
		return 0;
	}



	public boolean Alert(WebDriver driver) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean launchUrl(WebDriver driver, String url) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean isAlertPresent(WebDriver driver) {
		// TODO Auto-generated method stub
		return false;
	}



	public String getCurrentURL(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}



	public String getTitle(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}



	public boolean click1(WebElement locator, String locatorName) {
		// TODO Auto-generated method stub
		return false;
	}



	public void fluentWait(WebDriver driver, WebElement element, int timeOut) {
		// TODO Auto-generated method stub

	}



	public void implicitWait(WebDriver driver, int timeOut) {
		// TODO Auto-generated method stub

	}



	public void explicitWait(WebDriver driver, WebElement element, int timeOut) {
		// TODO Auto-generated method stub

	}



	public void pageLoadTimeOut(WebDriver driver, int timeOut) {
		// TODO Auto-generated method stub

	}



	public static String screenShot(WebDriver driver, String filename) {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\ScreenShots\\" + filename + "_" + dateName + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
	}



	public String getCurrentTime() {
		String currentDate = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
		return currentDate;
	}

	// https://github.com/hverma22/MyProject/blob/master/MyStoreProject/src/main/java/com/mystore/actiondriver/Action.java
	//Homework



}
