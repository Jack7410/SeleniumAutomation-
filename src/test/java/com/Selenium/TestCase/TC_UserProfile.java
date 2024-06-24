package com.Selenium.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Selenium.PageObject.LoginPage;
import com.Selenium.PageObject.ProfilePage;

public class TC_UserProfile  extends Base{
	
	
	@Test
	public void test05() {
		driver.get(url);
		LoginPage lp= new LoginPage(driver);
		lp.getEmailBtn(validUserName);
		lp.getPasswordBtn(validUserPass);
		lp.getLoginBtn();
		
		ProfilePage pp= new ProfilePage(driver);
		
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(pp.dropdownbtn));
		
		pp.getdropDown();
		pp.getProfileBtn();
		pp.getProfileName();
		
	}
}
