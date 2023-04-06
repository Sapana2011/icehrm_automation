package icehrm_automation.Pages;



import org.openqa.selenium.By;

import com.icehrm_automation.utility.BaseClass;

public class LoginPage extends BaseClass {
		By username = By.name("username");
		By password = By.name("password");
		By loginButton=By.xpath("//button[contains(text(),'Log in')]");
		By resetPasswordLink = By.xpath("//a[contains(text(),'Reset Password')]");
		public By errorMsg = By.xpath("//div[contains(@class,'alert danger')]");
		public void login(String username,String password) {
			enterText(this.username,username);
			enterText(this.password,password);
			click(loginButton);
		}
}
