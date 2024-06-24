package com.Selenium.TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Selenium.PageObject.SearchBox;

public class TC_SearchBox01  extends Base{
	
	
	// Varify the credential with empty search box
	@Test
	public void test01() throws Exception {
		driver.get(url);
		SearchBox sb= new SearchBox(driver);
		
		sb.getCancleBtn();
		sb.getSearchBtn();
		
		takescreenshort(driver, "test01");
	}
	
}
