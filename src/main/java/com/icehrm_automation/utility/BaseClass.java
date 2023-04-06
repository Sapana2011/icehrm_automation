package com.icehrm_automation.utility;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ISuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
     
	
	protected static WebDriver driver;
	
     public void launchBrowser(String browser) {
    	 switch (browser) {
    	 case "chrome":
    		 
    		  WebDriverManager.chromedriver().setup();
       		driver=new ChromeDriver(setChromeOptions());
    		break;
    	 case "edge":
    		 WebDriverManager.edgedriver().setup();
     		driver=new EdgeDriver(setEdgeOption());
     		break;
    	 case "firefox":
    		
    		 WebDriverManager.firefoxdriver().setup();
     		driver=new FirefoxDriver();
     		break;
    	 default:
    		 WebDriverManager.chromedriver().setup();
        		driver=new ChromeDriver(setChromeOptions());
     		break;
    	 }
     }
     public void enterText(By by,String text) {
    	 try {
    		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    		 wait.until(ExpectedConditions.presenceOfElementLocated(by));
    		 driver.findElement(by).sendKeys(text);
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }
     }
     public void enterText1(By by, String text) {
		 try {
    		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
    		 driver.findElement(by).sendKeys(text);
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }
     }
	 
     public void click(By by) {
    	 try {
    		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    		 wait.until(ExpectedConditions.elementToBeClickable(by));
    		 driver.findElement(by).click();
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
     }
     }
     public void list(By by,String Text) {
    	 List<WebElement> Allelements=driver.findElements(by);
    	 for(WebElement element:Allelements)
    	 {
    		 String Value = element.getText();
    		 if(Value.equals(Text))
    		 {
    			 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        		 wait.until(ExpectedConditions.elementToBeClickable(element));
        		 element.click();
    		 }
    			 
    	 }
     }
    
     public ChromeOptions setChromeOptions() {
    	 ChromeOptions option=new ChromeOptions();
    	 option.addArguments("start-maximized");
    	 option.addArguments("--remote-allow-origin=*");
    	 option.addArguments("incognito");
    	 option.setHeadless(false);
    	 option.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-clocking"));
    	 Map<String,String> prefs = new HashMap<String, String>();
    	 prefs.put("download.default.directory","C:/workspace/Automation Program");
    	 option.setExperimentalOption("prefs",prefs);
    	 option.setAcceptInsecureCerts(true);
    	 return option;
     }
     
     public FirefoxOptions setFirefoxOption() {
    	 FirefoxOptions option = new FirefoxOptions();
    	 option.addArguments("start-maximized");
    	 option.addArguments("--remote-allow-origins=*");
    	 option.addArguments("incognito");
    	 option.setHeadless(true);
    	 option.addPreference("excludeSwitches", Arrays.asList("disable-popup-clocking"));
    	 Map<String,String> prefs = new HashMap<String, String>();
    	 prefs.put("download.default.directory","C:/workspace/Automation Program");
    	 option.addPreference("prefs",prefs);
    	 option.setAcceptInsecureCerts(true);
    	 return option;
     }
    	 
    	 public EdgeOptions setEdgeOption() {
        	 EdgeOptions option = new EdgeOptions();
        	 option.addArguments("start-maximized");
        	 option.addArguments("--remote-allow-origins=*");
        	 option.addArguments("incognito");
        	 option.setHeadless(true);
        	 option.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-clocking"));
        	 Map<String,String> prefs = new HashMap<String, String>();
        	 prefs.put("download.default.directory","C:/workspace/Automation Program");
        	 option.setExperimentalOption("prefs",prefs);
        	 option.setAcceptInsecureCerts(true);
        	 return option;
     }
  	 public void waitElementToBeClickable(By by) {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); 
  	           wait.until(ExpectedConditions.elementToBeClickable(by));
 	 }
    	 public void waitVisibilityOf(By by) {
    		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
    	 }
    	 public void waitElementIsClickable(By by) {
    		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); 
      	           wait.until(ExpectedConditions.elementToBeClickable(by));
      	         
     	 }
    	 
		}

    	
