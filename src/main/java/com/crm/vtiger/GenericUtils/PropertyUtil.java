package com.crm.vtiger.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyUtil {
	/*
	 * This method used to read data from properties and return the value based on key specified
	 * @param key
	 * @throws Throwable
	 * @return values
	 */
	public String getPropertyKeyVaue(String key) throws Throwable{
		FileInputStream file=new FileInputStream("./Data/CommonData.properties");
		Properties prop=new Properties();
		prop.load(file);
		return prop.getProperty(key);
		
	}

}
