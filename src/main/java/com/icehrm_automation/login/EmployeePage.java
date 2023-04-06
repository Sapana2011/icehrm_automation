package com.icehrm_automation.login;

import org.openqa.selenium.By;

public class EmployeePage {
			public By employeeMenu = By.xpath("//li[@ref='admin_Employees']//span");
			public By employeeSubMenu = By.xpath("//ul[@id='admin_Employees']/li[1]/a");
			public By allEmpInfo = By.xpath("//tbody[@class='ant-table-tbody']/tr/td");
			public By searchBox = By.xpath("advanced_search_searchTerm");
			public By searchButton = By.xpath("//span[text()='Search']");
}
