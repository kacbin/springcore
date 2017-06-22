package com.cubic.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.cubic.vo.DrugVO;

public class SpringTest8 {

	public static void main(String[] arg) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfigCommon.xml","SpringConfig.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationControl.xml");
		DrugVO drug1 = context.getBean("drug01", DrugVO.class);

		System.out.println("OBJETC 1: " + drug1);

		DrugVO drug2 = context.getBean("drug02", DrugVO.class);

		System.out.println("OBJETC2: " + drug2);

	}
}
