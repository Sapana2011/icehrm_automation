package com.icehrm_automation.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample2 {
    
	@BeforeClass
	public void sample2BeforeClass() {
		System.out.println("This is Sample2 BeforeClass Method");
	}
	@Test
	public void sample2Test() {
		System.out.println("This is Sample2 test Method");
	}
	@AfterClass
	public void sample2AfterClass() {
		System.out.println("This is Sample2 AfterClass Method");
	}
	
}
