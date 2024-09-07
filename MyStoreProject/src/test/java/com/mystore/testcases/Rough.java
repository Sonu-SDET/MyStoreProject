package com.mystore.testcases;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class Rough {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		
	}
	
	@BeforeMethod(groups="sanity")
	public void bf() {
		System.out.println("bf is running");
	}
	
	@Parameters({"name"})
	@Test(groups="sonu")
	public void method1(String nm) {
		System.out.println(nm);
		System.out.println("m1");
	}
	
	@Test(groups="sonu")
	public void method2() {
		System.out.println("m2");
	}
	
	@Test(groups="sanity")
	public void method3() {
		System.out.println("m3");
	}
	
	

}
