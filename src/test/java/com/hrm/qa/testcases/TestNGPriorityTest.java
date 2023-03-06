package com.hrm.qa.testcases;

import org.testng.annotations.Test;

public class TestNGPriorityTest {
	
	
	
	
	@Test(priority=0)
	void testZeroPriority() {
		System.out.println("0");
		
		
	}

	@Test(priority=3)
	void CtestThree() {
		System.out.println("3");

	}
	
	@Test(priority=1)
	void AtestOne() {
		System.out.println("1");

	}
	@Test(priority=2)
	void BtestTwo() {
		System.out.println("2");

	}
	
	@Test(priority=-2)
void DtestFour() {
		System.out.println("-2");

	}
	@Test(enabled=false)//to skip
	void testDefaultPriority() {
		System.out.println("Default");

	}
	
	@Test(priority=2)
	void EtestFive() {
		System.out.println("5");

	}
	
	
	/* Execution Order
	 * 1st pref - negative num, 2nd pref  to default, 3rd pref - positive num
	 * -2
		Default
		0
		1
		2
		3
		
		when 2 tests have same priority or all tests have no priority the test case will be executed inthe alphabetical order
		
		@Test(enabled=false)//to skip the test case execution
		
		
		//priority 0=default priority
		
		*
		*
		*
		*/
	 
}



