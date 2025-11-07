package com.orangehrm.utilslayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static String getProperty(String keyName) {
		Properties prop = new Properties();
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\com\\orangehrm\\config\\config.properties";
			
		try {
			FileInputStream fs = new FileInputStream(path);
			prop.load(fs);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		String value = prop.getProperty(keyName);
		 return value;
		
	}
	

}
