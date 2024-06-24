package com.Selenium.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Selenium.PageObject.LoginPage;

public class TC_Login04 extends Base {
	
	@Test
	public void test04() {
		driver.get(url);
		LoginPage pl= new LoginPage(driver);
		
		pl.getEmailBtn(invalidUserName);
		pl.getPasswordBtn(invalidUsePass);
		pl.getLoginBtn();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		takescreenshort(driver, "test04");
		
		WebElement userProfile= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div[2]/div[3]/div/div/div/div"));
		if(userProfile.isDisplayed()) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}
}
