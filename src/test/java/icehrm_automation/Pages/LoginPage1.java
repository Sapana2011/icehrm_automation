package icehrm_automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icehrm_automation.utility.BaseClass;

public class LoginPage1 extends BaseClass{
    WebDriver driver;
    @FindBy(name="username")
    public WebElement username;
    
    @FindBy(name="Password")
    public WebElement password;
    
    @FindBy(xpath="//button[contains(text(),'Log in')]") 
    public WebElement loginButton;
    
    public void LoginPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
    public void login(String username,String password) {
    	this.username.sendKeys(username);
    	this.password.sendKeys(password);
    	
    }
    
}
