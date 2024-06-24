package com.Selenium.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
	WebDriver driver;
	public ProfilePage(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div[2]/div[3]/div/div/div/div")
	public WebElement dropdownbtn;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[1]/a/div")
	WebElement profilebtn;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/div/div[2]")
	WebElement profileName;
	
	public void getdropDown() {
		
		Actions actions= new Actions(driver);
		actions.moveToElement(dropdownbtn).build().perform();
	}
	public void getProfileBtn() {
		profilebtn.click();
	}
	
	public void getProfileName() {
		System.out.println(profileName.getText());
	}
}
