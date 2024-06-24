package com.Selenium.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Selenium.PageObject.SearchBox;

public class TC_Search_Product  extends Base{
	
	
	// Varify the credential of home page(varify Glocery button)
	@Test
	public void test01() throws Exception {
		driver.get(url);
		SearchBox sb= new SearchBox(driver);
		sb.getCancleBtn();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(sb.grocerybtn));
		sb.getGroceryBtn();
		
		Thread.sleep(3000);
	}
}
