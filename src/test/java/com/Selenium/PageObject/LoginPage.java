   package com.Selenium.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement emailbtn;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement passwordbtn;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement loginbtn;
	
	
	
	public void getEmailBtn(String username) {
		emailbtn.sendKeys(username);
	}
	
	public void getPasswordBtn(String pass) {
		passwordbtn.sendKeys(pass);
	}
	
	public void getLoginBtn() {
		loginbtn.click();
	}
	
}
