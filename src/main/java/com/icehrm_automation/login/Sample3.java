package com.icehrm_automation.login;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class Sample3 {
	
	@BeforeClass
	public void sample3BeforeClass() {
		System.out.println("This is Sample3 BeforeClass Method");
	}
	@Test
	public void sample3Test() {
		System.out.println("This is Sample3 test Method");
	}
	@AfterClass
	public void sample3AfterClass() {
		System.out.println("This is Sample3 AfterClass Method");
	
	
}
}
