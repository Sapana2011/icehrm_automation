package com.icehrm_automation.login;

import org.openqa.selenium.By;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.icehrm_automation.utility.EmpDetails;
import com.icehrm_automation.utility.BaseClass;
import com.icehrm_automation.utility.ExcelUtil;

public class ExcelTestExample extends BaseClass {
			@DataProvider
			public Object [][] getTestData(){
				ExcelUtil excelUtil = new ExcelUtil();
				String filePath="C:/workspace/Automation Program/ExcelHandling.xlsx";
				String sheetName = "Sheet1";
				return excelUtil.getExcelData(filePath, sheetName);
				}
			@Test(dataProvider="getDataTest")
			public void test(String username,String password) {
				System.out.println(username+" "+password);
			}
			@DataProvider
			public Object[][] getEmpData(){
				ExcelUtil excelUtil = new ExcelUtil();
				String filePath="C:/workspace/Automation Program/ExcelHandling.xlsx";
				String sheetName = "TestData";
				return excelUtil.getExcelData(filePath, sheetName);
				}
			@Test(dataProvider="getEmpData")
			public void empTest(EmpDetails empDetails) {
				click(By.id("EmployeeMenu"));
				click(By.id("add_new"));
				enterText(By.id("empNum"),String.valueOf(empDetails.getId()));
				enterText(By.id("firstName"),empDetails.getFirstName());
				enterText(By.id("mname"),empDetails.getMiddleName());
				enterText(By.id("lastName"),empDetails.getLastName());
				click(By.id("save"));
			}
}
