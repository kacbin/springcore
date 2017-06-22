package com.cubic.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cubic.spring.DBConnParameters;
import com.cubic.spring.DrugServiceImpl;

public class SpringTest10 {

	public static void main(String[] arg) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("SpringConfigCommon.xml","SpringConfig.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
	//	DrugServiceImpl drug = context.getBean("ds2", DrugServiceImpl.class);
		DBConnParameters dbConn = context.getBean(DBConnParameters.class);

		System.out.println(dbConn);

	}
}
