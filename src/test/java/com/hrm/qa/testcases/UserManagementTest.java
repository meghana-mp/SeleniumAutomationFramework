package com.hrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.HomePage;
import com.hrm.qa.pages.LoginPage;
import com.hrm.qa.pages.UserManagementPage;
import com.hrm.qa.util.TestUtil;

public class UserManagementTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	UserManagementPage userPage;
	
	String sheetName="AddUser";
	

	public UserManagementTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		
		initialization();
		
		loginPage = new LoginPage();
	}
	
//	@Test
	public void searchUserTest() throws InterruptedException {
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		userPage=homePage.clickAdminLink();
		String records=userPage.SearchUser();
		System.out.println(records);
		
		
	}
	
	
	//@Test(dataProvider="gethrmTestData")
	public void AddUserTest(String userRole, String employeeName, String status, String username,String password, String passwordconfirm) throws InterruptedException{
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		userPage=homePage.clickAdminLink();
		String result=userPage.addUser(userRole, employeeName, status, username, password, passwordconfirm);
		//System.out.println(result);
		//Assert.assertEquals(result, "Success");		
		
	}
	
	@DataProvider
	public Object[][] gethrmTestData() {
		
	Object[][] data=TestUtil.getTestData(sheetName);
	return data;
		
	}
	
	//@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
		
		

	}

}
