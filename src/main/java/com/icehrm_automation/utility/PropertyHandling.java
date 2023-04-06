package com.icehrm_automation.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHandling {
		Properties properties;
		public PropertyHandling() {
			try {
				String filePath = System.getProperty("user.dir")+"/config.properties";
				FileInputStream file = new FileInputStream(filePath);
				properties=new Properties();
				properties.load(file);
			}catch(IOException e) {
				throw new RuntimeException(e);
			}
		}
		public String getProperty(String key) {
			String value=properties.getProperty(key);
			System.out.println(value);
			return value;
		}
}
