package com.icehrm_automation.login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample7 {
		
	
	@DataProvider
	public Object[][] credentials(){
		return new Object[][] {
			{"username1","password1"},
			{"username2","password2"},
			{"username3","password3"},
			{"username4","password4"},
			{"username5","password5"}
		};
		}
		@Test(dataProvider="credentials")
		public void login(String username,String password) {
			System.out.println("username: " +username+ " and password:" +password);
		}
	}

