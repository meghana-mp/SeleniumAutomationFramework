package com.hrm.qa.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.HomePage;
import com.hrm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws MalformedURLException {
		
		initialization();
		
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void homePageTitleTest() {
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		String title=homePage.validateHomepageTitle();
		Assert.assertEquals(title, "OrangeHRM");
		
	}
	
	
	@Test(priority=2)
	public void homePageClickAboutTest() {
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		String companyname=homePage.clickAbout();
		
		System.out.println(companyname);
		Assert.assertEquals(companyname, "OrangeHRM");
		homePage.closeAbout();
		
	}
	
	
	@Test(priority=3)
	public void homePageClickSupportTest() {
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		boolean flag=homePage.clickSupport();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=4)
	public void homePageClickChangePasswordTest() {
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		homePage.clickProfile();
		homePage.clickChangePassword();
		String str=homePage.getChangePasswordHeader();
		Assert.assertEquals(str, "Update Password");
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
