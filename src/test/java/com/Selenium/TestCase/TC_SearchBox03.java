package com.Selenium.TestCase;

import org.testng.annotations.Test;

import com.Selenium.PageObject.SearchBox;

public class TC_SearchBox03  extends Base{
	
		//Verify the credential with full product name
	@Test
	public void test03() throws Exception {
		driver.get(url);
		SearchBox sb= new SearchBox(driver);
		sb.getCancleBtn();
		sb.getSearchBox(fullproductName);
		sb.getSearchBtn();
		
		Thread.sleep(3000);
	}
}
