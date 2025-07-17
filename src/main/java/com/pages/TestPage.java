package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestPage {
	private WebDriver driver;
	
	//1. By locators:

	public static By getMenuItem(String itemName){
		By itm = By.xpath("//li[contains(@class,'has-submenu ')]/a[contains(@data-vn, '"+itemName+"')]/span");
		return itm;
	}
	public static By getPopupQC = By.xpath("//h5[contains(text(),\"Danh sách mã khuyến mãi\")]/following-sibling::button[@class ='close']");

	//2. Constructor of the page class:
	public TestPage(WebDriver driver) {
		this.driver = driver;
	}
	//3. page actions: Feature(behavior) of the page the form of method:
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}	

	public void closedPopupQC() {
		driver.findElement(getPopupQC).click();
	}
	public String GetMenuText(String itemName) {
		return driver.findElement(getMenuItem(itemName)).getText();
	}
}
