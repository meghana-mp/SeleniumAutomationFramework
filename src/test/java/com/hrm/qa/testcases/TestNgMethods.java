package com.hrm.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgMethods {
	
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("Before Test");
	}

	
	@AfterTest
	void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	void afterClass() {
		System.out.println("After Class");
	}
	
	@AfterMethod
	void afterMethod() {
		System.out.println("After Method");
	}
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("Before Method");
		
	}
	
	@Test(priority=3)
	void CtestThree() {
		System.out.println("3 @ Test");

	}
	
	@Test(priority=1)
	void AtestOne() {
		System.out.println("1 @ Test");

	}
	@Test(priority=2)
	void BtestTwo() {
		System.out.println("2 @ Test");

	}
	
	@AfterGroups
	void afterGroups() {
		System.out.println("After Groups");
	}
	
	@BeforeGroups
	void beforeGroups() {
		System.out.println("Before Groups");
	}

}
