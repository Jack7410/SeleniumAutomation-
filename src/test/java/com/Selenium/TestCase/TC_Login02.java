package com.Selenium.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Selenium.PageObject.LoginPage;

public class TC_Login02 extends Base {
	
	// Verifying credentials with valid username and invalid password 
	@Test 
	public void test2() {
		driver.get(url);
		LoginPage lp= new LoginPage(driver);
		
		lp.getEmailBtn(validUserName);
		lp.getPasswordBtn(invalidUsePass);
		
		lp.getLoginBtn();
		takescreenshort(driver, "test2");
		
		WebElement userprofile=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div[2]/div[3]/div/div/div/div"));
		if(userprofile.isDisplayed()) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
				
		
		
		
	}
}	
