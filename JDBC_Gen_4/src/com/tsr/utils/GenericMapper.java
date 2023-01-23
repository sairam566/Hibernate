package com.tsr.utils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class GenericMapper {

	public static Object mapRecordToObject(ResultSet rs, Class<?> clazz)
			throws IOException, InstantiationException, IllegalAccessException, SQLException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {

		Properties ps = null;
		Properties colsToAttributesProps = null;
		Object entityObject = null;
		String attributeName = null;
		String columnValue = null;
		String setterMethod = null;
		String propsFileName = null;

		ps = PropertiesReader.readProperties("orm-config.properties");
		propsFileName = ps.getProperty(clazz.getName());
		colsToAttributesProps = PropertiesReader.readProperties(propsFileName);

		// create object
		entityObject = clazz.newInstance();

		// loop through the methods and initialize them
		for (Object columnName : colsToAttributesProps.keySet()) {
			columnValue = rs.getString(columnName.toString());
			attributeName = colsToAttributesProps.getProperty(columnName.toString());

			setterMethod = "set" + attributeName.substring(0, 1).toUpperCase()
					+ attributeName.substring(1, attributeName.length());
			Method method = null;
			if (setterMethod.contains("AccountNo") || setterMethod.contains("Balance")) {
				method = clazz.getDeclaredMethod(setterMethod, int.class);
				method.invoke(entityObject, Integer.valueOf(columnValue));
			} else {
				method = clazz.getDeclaredMethod(setterMethod, String.class);
				method.invoke(entityObject, columnValue);
			}

		}

		return entityObject;
	}

}
