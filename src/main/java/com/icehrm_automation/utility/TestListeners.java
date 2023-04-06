
package com.icehrm_automation.utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestListeners extends BaseClass implements ITestListener,ISuiteListener {
			String reportPath;
			ExtentReports extentReports;
			private ExtentTest log;
			
			
			public void onStart(ISuite suite) {
				System.out.println("This is onStart of ISuite from TestListeners");
			LocalDateTime dateTime = LocalDateTime.now();
			String currentDateTime=dateTime.format(DateTimeFormatter.ofPattern("dd_MM_yyyy_hh_mm"));
			reportPath=System.getProperty("user.dir")+"/reports/"+"report_"+currentDateTime;
			File file = new File(reportPath);
			if(!file.exists()) {
				file.mkdir();
				String htmlReport = reportPath+"/AutomationReport.html";
				ExtentSparkReporter sparkReporter=new ExtentSparkReporter(htmlReport);
				extentReports = new ExtentReports();
				extentReports.attachReporter(sparkReporter);
				extentReports.setSystemInfo("user","cyber success");
				extentReports.setSystemInfo("os","mac");
				extentReports.setSystemInfo("env","QA");
			}
			}
			public void onFinish(ISuite suite) {
				System.out.println("This is on Finish ISuite from TestListeners");
				extentReports.flush();
			}
			public void onStart(ITestContext context) {
				System.out.println("This is onStart of ITestContext from TestListeners");
			}
			public void onFinish(ITestContext context) {
				System.out.println("This is onFinish of ITestContext from TestListeners");
			}
			public void onTestStart(ITestResult result) {
				System.out.println("This is onTestStart of ITestResult from TestListeners");
				String methodName= result.getMethod().getMethodName();
				log= extentReports.createTest(methodName);
			}
			public void onTestSuccesss(ITestResult result) {
				System.out.println("This is onTestSuccess of ITestResult from TestListeners");
			}
			public void onTestFailure(ITestResult result) {
				System.out.println("This is onTestFailure of ITestResult from TestListeners");
				String screenshot = reportPath+"/"+result.getMethod().getMethodName()+".jpg";
				TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
				File srcFile= takesScreenshot.getScreenshotAs(OutputType.FILE);
				File dstFile= new File(screenshot);
				try {
					FileUtils.copyFile(srcFile, dstFile);
				}catch(IOException e) {
					throw new RuntimeException(e);
				}
			}
			public void onTestSkipped(ITestResult result) {
				System.out.println("This is onTestSkipped of ITestResult from TestListeners");
			}
}

