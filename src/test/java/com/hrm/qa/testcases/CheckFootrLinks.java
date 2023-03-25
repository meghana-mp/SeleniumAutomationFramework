package com.hrm.qa.testcases;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.hrm.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckFootrLinks {

	
	@Test
	public void test_one() {
		
       System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver=new ChromeDriver();

	
		driver.get("https://www.makemytrip.com/");
		
		WebElement ele= driver.findElement(By.className("footerBottom"));
		List<WebElement> ls=ele.findElements(By.tagName("a"));
		
		
		Iterator it=ls.iterator();
		
		while(it.hasNext()) {
			WebElement ele1=(WebElement) it.next();
			ele1.click();
		}
		
		driver.quit();
		
		
		
	}
}
