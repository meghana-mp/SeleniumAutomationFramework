package com.hrm.qa.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.HomePage;
import com.hrm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		
		initialization();
		
		loginPage = new LoginPage();
	}
	
	
	@Test(priority=3)
	public void loginPageTitleTest() {
		String title=loginPage.validateLoginpageTitle();
		Assert.assertEquals(title, "OrangeHRM");
		}
	
	@Test(priority=2)
	public void HRMLogoImageTest() {
		
		boolean flag=loginPage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=1)
	public void LoginSuccess() {
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
