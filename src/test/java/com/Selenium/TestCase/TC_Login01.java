package com.Selenium.TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.lang3.text.WordUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Selenium.PageObject.LoginPage;
import com.Selenium.Utilities.XLRead;

public class TC_Login01 extends Base {
	
	// Testign login page with valid username and valid userpassword
	@Test
	public void test01(){
		
		driver.get(url);
		LoginPage lp= new LoginPage(driver);
		lp.getEmailBtn(validUserName);
		lp.getPasswordBtn(validUserPass);
		lp.getLoginBtn();
		
		
		
		
		
		
		
	}
	
	
}
