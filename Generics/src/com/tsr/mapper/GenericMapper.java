package com.tsr.mapper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.tsr.dto.Calculator;

public class GenericMapper {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> clazz = Calculator.class;
		
		// create Object of Calculator class
		Object object = clazz.newInstance();
		
		//get add method
		Method method = clazz.getDeclaredMethod("add", int.class,int.class);
		
		//call add method
		Object val = method.invoke(object, 1,2);
		
		//Output is 3
		System.out.println(val);
	}

}
