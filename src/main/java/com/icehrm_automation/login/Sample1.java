package com.icehrm_automation.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample1 {
		
	
	@BeforeTest
	public void sample1BeforTest() {
		System.out.println("This is Sample1 BeforeTest Method");
	}
	
	@BeforeMethod
	public void sample1BeforeMethod() {
		System.out.println("This is Sample1 BeforeMethod");
	}
	@BeforeClass
	public void sample1BeforeClass() {
		System.out.println("This is Sample1 BeforeClass Method");
	}
	@Test
	public void sample1Test() {
		System.out.println("This is Sample1 test Method");
	}
	@AfterClass
	public void sample1AfterClass() {
		System.out.println("This is Sample1 AfterClass Method");
	}
	@AfterMethod
	public void sample1AfterMethod() {
		System.out.println("This is Sample1 AfterMethod");
	}
	@AfterTest
	public void sample1AfterTest() {
		System.out.println("This is Sample1 AfterTest Method");
	}

}
