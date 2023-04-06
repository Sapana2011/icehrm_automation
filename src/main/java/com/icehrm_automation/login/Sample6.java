package com.icehrm_automation.login;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample6 {
		@Parameters({"username","passward"})
		@Test
		public void sample6Test1(@Optional String username,@Optional String password) {
			System.out.println("This is test1 from sample6 class");
			System.out.println("This is Test1 sample6 class and username is:"+username+ " and the password is:"+password);
		}
		@Parameters("browser")
		@BeforeClass
		public void beforeClass(String browser) {
			System.out.println("sample6 Before Class");
			System.out.println("This is sample6 Class and browser value is:"+browser);
		}
}
