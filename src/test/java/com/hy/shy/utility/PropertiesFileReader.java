package com.hy.shy.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	public Properties getProperty() {
		FileInputStream inputStream = null;
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("\\Resources\\config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception:" + e);
		}
		return properties;
	}
}
