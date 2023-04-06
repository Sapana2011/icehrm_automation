package com.icehrm_automation.login;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import com.icehrm_automation.utility.BaseClass;


public class Sample5 extends BaseClass {
	@BeforeGroups(groups= {"sanity"})
	public void beforeGroup() {
		System.out.println("This is before group method");
	}
	@AfterGroups(groups= {"sanity"})
	public void afterGroups() {
		System.out.println("This is after group method");
	}
	@Test(groups= {"sanity"})
	public void sample5Test()  {
		System.out.println("This is Sample5 class Test1 method");
		System.out.println(driver.getTitle());
	}
	@Test(groups= {"sanity"})
	public void sample5Test2() {
		System.out.println("This is Sample5 class Test2 method");
		System.out.println(driver.getTitle());
	}
	@Test(groups= {"regrassion"})
	public void sample5Test3() {
		System.out.println("This is Sample5 class Test3 method");
		System.out.println(driver.getTitle());
	}
	@Test(groups= {"regrassion"})
	public void sample5Test4() {
		System.out.println("This is Sample5 class Test4 method");
		System.out.println(driver.getTitle());
	}
	@BeforeClass(groups= {"sanity"})
	public void beforeClass (){
		System.out.println("This is before Class method");
		launchBrowser("edge");
		driver.get("https://www.google.com");
	}
	@AfterClass(groups= {"sanity"})
	public void afterClass() {
		System.out.println("This is after Class method");
		//driver.quit();
	}

}
