package com.hrm.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		WebElement ele=driver.findElement(By.name("q"));
		
		ele.sendKeys("selenium");
		Thread.sleep(3000);
		
		List <WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		
		System.out.println(list.size());
		
		
		

		

	}

}
