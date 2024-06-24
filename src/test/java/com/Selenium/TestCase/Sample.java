package com.Selenium.TestCase;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sample extends Base {

		@Test
		public void test() {
			driver.get(url);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			WebElement button= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[1]/div/img"));
			Actions action = new Actions(driver);
			
			
			action.moveToElement(button).build().perform();
			WebElement link= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[1]"));
			
			link.click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
					
					
		}
}	
