package com.Selenium.TestCase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Selenium.Utilities.ReadFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	ReadFile read= new ReadFile();
	// application Url
	public String url= read.getUrl();
	
	// valid username and userpassword
	public String validUserName=read.getUsername();
	public String validUserPass= read.getPassword();
	
	// invalid username and userpassword
	public String invalidUserName=read.getIUsername();
	public String invalidUsePass= read.getIPassword();
	
	// Product Name 
	public String partialName= read.getPartialProductName();
	public String fullproductName=read.getProductName();
	
	
	
	
	
	public WebDriver driver;
	
	// method for invoking browser
	@Parameters("Browser")
	@BeforeMethod
	public void setBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
			ChromeOptions opt= new ChromeOptions();
			opt.setPageLoadStrategy(PageLoadStrategy.EAGER);
			driver= new ChromeDriver(opt);
			
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
			FirefoxOptions opt = new FirefoxOptions();
			opt.setPageLoadStrategy(PageLoadStrategy.EAGER);
			driver= new FirefoxDriver(opt);
		}else {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/Drivers/msedgedriver.exe");
			//WebDriverManager.edgedriver().setup();
			EdgeOptions opt= new EdgeOptions();
			driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	// method for closing browser
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	// method for taking screenshot
	public void takescreenshort(WebDriver driver, String name) {
		File path= new File(System.getProperty("user.dir")+"\\Screenshort\\"+name+".png");
		File ss= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(ss, path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshort Taken");
	}
}
