package com.icehrm_automation.login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icehrm_automation.utility.ExcelUtil;

public class ExcelTest {
		@DataProvider
		public Object[][] getTestData(){
			ExcelUtil excelUtil = new ExcelUtil();
			String filePath = "C:/workspace/Automation Program/ExcelHandling.xlsx";
			String sheetName = "Sheet1";
			return
					excelUtil.getExcelData(filePath, sheetName);
		}
		@Test(dataProvider = "getTestData")
		public void test(String username,String password) {
			System.out.println(username+" "+password);
		}
		}

