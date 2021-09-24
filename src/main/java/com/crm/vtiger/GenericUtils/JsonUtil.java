package com.crm.vtiger.GenericUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtil {
	/*
	 * this method will return json value based on json key
	 * @param jsonkey
	 * return jsonvalue
	 * @throws throwable
	 * 
	 */
	public String getDataFrom(String jsonkey) throws Throwable
	{
		FileReader reader=new FileReader("./Data/commondata.json");
		JSONParser parser=new JSONParser();
		Object object=parser.parse(reader);
		JSONObject jsonObject=(JSONObject)object;
		String value=jsonObject.get(jsonkey).toString();
		return value;
	}

}
