package com.tsr.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
	public static Properties readProperties(String fileName) throws IOException {
		Properties properties = new Properties();
		InputStream is = PropertiesReader.class.getClassLoader().getResourceAsStream(fileName);
		properties.load(is);
		return properties;
	}
}
