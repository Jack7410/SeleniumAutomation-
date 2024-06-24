package com.Selenium.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchBox {
	WebDriver driver;
	
	public SearchBox(WebDriver ldriver) {
		driver= ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "//img[@alt='Grocery']")
	public WebElement grocerybtn;
	
	@FindBy(xpath =  "//input[@class='_3704LK']")
	WebElement searchBox;
	
	@FindBy(xpath= "//button[@class='L0Z3Pu']")
	WebElement searchBtn;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	WebElement cancleBtn;
	
	public void getSearchBox(String product) {
		searchBox.sendKeys(product);
	}
	public void getSearchBtn() {
		searchBtn.click();
	}
	public void getCancleBtn() {
		cancleBtn.click();
	}
	
	public void getGroceryBtn() {
		grocerybtn.click();
		
	}
}
