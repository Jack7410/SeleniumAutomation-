package com.Selenium.TestCase;

import org.testng.annotations.Test;

import com.Selenium.PageObject.SearchBox;

public class TC_SearchBox02  extends Base{
		
	
		// Varify the credential with partial name of product
	    @Test
		public void test02() {
			driver.get(url);
			SearchBox sb= new SearchBox(driver);
			sb.getCancleBtn();
			sb.getSearchBox(partialName);
			sb.getSearchBtn();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
