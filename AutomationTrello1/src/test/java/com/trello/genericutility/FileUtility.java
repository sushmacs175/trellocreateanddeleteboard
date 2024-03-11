package com.trello.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("src/test/resources/slinkrdata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		return value;
	}

}
