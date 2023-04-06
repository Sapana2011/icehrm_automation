package com.icehrm_automation.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.icehrm_automation.utility.BaseClass;

public class LoginTest1 extends BaseClass {
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is BeforeClass method");
		launchBrowser("edge");
		driver.navigate().to("https://cybersuccess.icehrm.com/");
		}
	
	
	@AfterClass
	public void AfterClass() {
		System.out.println("This is AfterClass method");
		driver.close();
	}
	
	
	/*@Test
	public void verifyLoginWithValidCred() throws InterruptedException {
		System.out.println("This is verify Login With Valid Credential method from Test");
		enterText(By.id("username"),"admin");
		enterText(By.id("password"),"2zuzfakn");
		click(By.xpath("//button[contains(text(),'Log in')]"));
		Thread.sleep(5000);
  		System.out.println("Test Case is passed");
		driver.findElement(By.xpath("logout xpath")).click();
		
		}
	
		@Test
	public void verifyLoginWithInvalidUsername() throws Exception {
		System.out.println("This is verify Login With Invalid Username method from @Test");
		enterText(By.id("username"),"abcdefghi");
		enterText(By.id("password"),"2zuzfakn");
		click(By.xpath("//button[contains(text(),'Log in')]"));
		String errorMsg = driver.findElement(By.xpath("//div[@class=\"row d-flex justify-content-center\"]")).getText();
  		
		if(errorMsg.equals("Login failed")) {
		 	System.out.println("Passed the test case for invalid username and valid password");
		}else {
			throw new Exception("Failed unable to verify error message for invalid username and valid password");
		}
		}
		
		@Test
		public void verifyLoginWithInvalidPassword() throws Exception {
			System.out.println("This is verify Login With Invalid Password method from @Test");
			enterText(By.id("username"),"admin");
			enterText(By.id("password"),"admin123");
			click(By.xpath("//button[contains(text(),'Log in')]"));
			String errorMsg = driver.findElement(By.xpath("//div[@class=\"row d-flex justify-content-center\"]")).getText();
	  		
			if(errorMsg.equals("Login failed")) {
			 	System.out.println("Passed the test case for valid username and invalid password");
			}else {
				throw new Exception("Failed unable to verify error message for valid username and invalid password");
			}
			}
		@Test
		public void verifyLoginWithInvalidUsernameAndPassword() throws Exception {
			System.out.println("This is verify Login With Invalid Username and Password method from @Test");
			enterText(By.id("username"),"admin@12");
			enterText(By.id("password"),"admin123");
			click(By.xpath("//button[contains(text(),'Log in')]"));
			String errorMsg = driver.findElement(By.xpath("//div[@class=\"row d-flex justify-content-center\"]")).getText();
	  		
			if(errorMsg.equals("Login failed")) {
			 	System.out.println("Passed the test case for invalid username and password");
			}else {
				throw new Exception("Failed unable to verify error message for invalid username and password");
			}
			}
		@Test
		public void verifyLoginWithEmptyPassword() throws Exception {
			System.out.println("This is verify Login With valid Username and Empty Password method from @Test");
			enterText(By.id("username"),"admin");
			enterText(By.id("password"),"");
			click(By.xpath("//button[contains(text(),'Log in')]"));
			String errorMsg = driver.findElement(By.xpath("//div[@class=\"row d-flex justify-content-center\"]")).getText();
	  		
			if(errorMsg.equals("Login failed")) {
			 	System.out.println("Passed the test case for valid username and Empty password");
			}else {
				throw new Exception("Failed unable to verify error message for valid username and Empty password");
			}
			}
			@Test
		public void verifyLoginWithEmptyUsername() throws Exception {
			System.out.println("This is verify Login With Empty Username and valid Password method from @Test");
			enterText(By.id("username"),"");
			enterText(By.id("password"),"2zuzfakn");
			click(By.xpath("//button[contains(text(),'Log in')]"));
			String errorMsg = driver.findElement(By.xpath("//div[@class=\"row d-flex justify-content-center\"]")).getText();
	  		
			if(errorMsg.equals("Login failed")) {
			 	System.out.println("Passed the test case for Empty username and valid password");
			}else {
				throw new Exception("Failed unable to verify error message for Empty username and valid password");
			}
			}*/
	@Test
	public void verifyLoginWithEmptyUsernameAndPassword() throws Exception {
		System.out.println("This is verify Login With Empty Username and Password method from @Test");
		enterText(By.id("username"),"");
		enterText(By.id("password"),"");
		click(By.xpath("//button[contains(text(),'Log in')]"));
		String errorMsg = driver.findElement(By.xpath("//div[@class=\"row d-flex justify-content-center\"]")).getText();
  		
		if(errorMsg.equals("Login failed")) {
		 	System.out.println("Passed the test case for Empty username and password");
		}else {
			throw new Exception("Failed unable to verify error message for Empty username password");
		}
		}

	
	}
	



