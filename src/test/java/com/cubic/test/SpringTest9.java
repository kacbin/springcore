package com.cubic.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cubic.spring.DrugServiceImpl;

public class SpringTest9 {

	public static void main(String[] arg) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("SpringConfigCommon.xml","SpringConfig.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationControl.xml");
		DrugServiceImpl drug = context.getBean("ds2", DrugServiceImpl.class);

		System.out.println(drug.getDrugContents());
		System.out.println(drug.getManufacturers());
		System.out.println(drug.getContentDetatils());

	}
}
