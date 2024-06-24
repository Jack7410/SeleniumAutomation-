   package com.Selenium.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFile {
	public Properties prop;

	public ReadFile() {
		File  file = new File (System.getProperty("user.dir")+"/src/test/java/com/Selenium/Utilities/Data.properties");
		try {
			FileInputStream input= new FileInputStream(file);
			prop= new Properties();
			prop.load(input);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public String getUsername() {
		String username= prop.getProperty("validusername");
		return username;
	}
	public String getPassword() {
		String password=  prop.getProperty("validuserpass");
		return password;
	}
	public String getUrl() {
		String url= prop.getProperty("Url");
		return url;
	}
	
	public String getIUsername() {
		String username= prop.getProperty("invalidusername");
		return username;
	}
	
	public String getIPassword() {
		String userpass= prop.getProperty("invaliduserpass");
		return userpass;
	}
	
	public String getPartialProductName() {
		String  productName= prop.getProperty("partialProductName");
		return productName;
	}
	
	public  String getProductName() {
		String productName=prop.getProperty("productName");
		return productName;
	}
	
	
}
