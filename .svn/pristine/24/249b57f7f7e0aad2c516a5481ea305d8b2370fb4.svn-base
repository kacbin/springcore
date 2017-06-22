package com.cubic.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cubic.spring.DrugService;
import com.cubic.spring.DrugServiceImpl;
import com.cubic.vo.DrugVO;

public class SpringTest3 {

	public static void main(String[] arg) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SampleSpring.xml");
		
		//creating bean
		//DrugVO vo = (DrugVO) context.getBean("drugVO");
		DrugVO vo = context.getBean("drugVO",DrugVO.class);
		DrugService ds = context.getBean(DrugService.class);
	

		System.out.println(ds.getDummyDrug());
	}
}
