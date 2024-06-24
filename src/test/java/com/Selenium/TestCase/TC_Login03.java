package com.Selenium.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Selenium.PageObject.LoginPage;

public class TC_Login03 extends Base {
	
	// verify the credential with invaid username and valid password
		@Test
	    public void test03() {
		driver.get(url);
		LoginPage lp= new LoginPage(driver);
		lp.getEmailBtn(invalidUserName);
		lp.getPasswordBtn(validUserPass);
		lp.getLoginBtn();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		takescreenshort(driver,"test03");
		
		WebElement userProfile= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div[2]/div[3]/div/div/div/div"));
		if(userProfile.isDisplayed()) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		
	}
}
