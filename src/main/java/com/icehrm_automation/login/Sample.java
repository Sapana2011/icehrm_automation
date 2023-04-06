package com.icehrm_automation.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	@BeforeSuite
	public void sampleBeforeSuite() {
		System.out.println("This is Sample BeforeSuite Method");
	}
	@AfterSuite
	public void sampleAfterSuite() {
		System.out.println("This is Sample AfterSuite Method");
	}
	@BeforeTest
	public void sampleBeforTest(){
		System.out.println("This is Sample BeforeTest Method");
	}
	
	@BeforeMethod
	public void sampleBeforeMethod() {
		System.out.println("This is Sample BeforeMethod");
	}
	@BeforeClass
	public void sampleBeforeClass() {
		System.out.println("This is Sample BeforeClass Method");
	}
	@Test
	public void sampleTest() {
		System.out.println("This is Sample test Method");
	}
	@AfterClass
	public void sampleAfterClass() {
		System.out.println("This is Sample AfterClass Method");
	}
	@AfterMethod
	public void sampleAfterMethod() {
		System.out.println("This is Sample AfterMethod");
	}
	@AfterTest
	public void sampleAfterTest() {
		System.out.println("This is Sample AfterTest Method");
	}
}
