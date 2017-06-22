package com.cubic.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cubic.spring.DrugService;
import com.cubic.spring.DrugServiceImpl;
import com.cubic.vo.DrugVO;

public class SpringTest4 {

	public static void main(String[] arg) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SampleSpring.xml");
		
		//creating bean
		//DrugVO vo = (DrugVO) context.getBean("drugVO");
		//DrugVO vo = context.getBean("drugVO",DrugVO.class);
		DrugServiceImpl ds1 = context.getBean("ds1", DrugServiceImpl.class);
		ds1.setManufacturer("GALXOSMITH");
		System.out.println("OBJETC 1: "+ds1.getManufacturer());
		
		DrugServiceImpl ds2=context.getBean("ds1", DrugServiceImpl.class);
		System.out.println("OBJETC 2: "+ds2.getManufacturer());
	}
}
