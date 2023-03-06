package com.hrm.qa.testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrm.qa.util.TestUtil;

public class Select {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
	
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGELOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICT_WAIT));

		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
		
		/*
		 * driver.findElement(By.
		 * xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("TEst")
		 * ;
		 * 
		 * WebElement
		 * ele2=driver.findElement(By.xpath("(//*[contains(text(),'-- Select --')])[1]")
		 * ); ele2.click(); ele2.sendKeys(Keys.ARROW_DOWN); ele2.click();
		 * 
		 * WebElement
		 * ele3=driver.findElement(By.xpath("(//*[contains(text(),'-- Select --')])[1]")
		 * ); ele3.click(); ele3.sendKeys(Keys.ARROW_DOWN); ele3.click();
		 
		
		WebElement ele4=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		ele4.sendKeys("Odis Adalwin");
		Thread.sleep(3000);
		
	

		List <WebElement> listItems = driver.findElements(By.xpath("//div[@role='listbox']/*"));
		
		listItems.get(0).click();
		//System.out.println(listItems.size());*/
		
//employee_name.sendKeys("Odis Adalwin");
		
		//List <WebElement> listItems = driver.findElements((By) employee_autolist);
		
	//	listItems.get(0).click();
		
	
		
		 
	}
		
}
