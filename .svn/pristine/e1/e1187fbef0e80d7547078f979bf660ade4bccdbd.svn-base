package com.cubic.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cubic.spring.DrugService;
import com.cubic.spring.DrugServiceImpl;
import com.cubic.vo.DrugVO;

public class SpringTest7 {

	public static void main(String[] arg) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SampleSpring.xml");
		
		//creating bean
		//DrugVO vo = (DrugVO) context.getBean("drugVO");
		//DrugVO vo = context.getBean("drugVO",DrugVO.class);
		DrugVO drug = new DrugVO();
		drug.setDrugName("TEST DRUG");
		
		DrugServiceImpl ds1 = context.getBean("ds1", DrugServiceImpl.class);
		DrugVO result1=ds1.orderOnline(drug);
		
		System.out.println("OBJETC 1: "+result1);
		
		DrugServiceImpl ds2=context.getBean("ds2", DrugServiceImpl.class);
		DrugVO result2=ds2.orderOnline(drug);
		System.out.println("OBJETC 2: "+result2);
	}
}
