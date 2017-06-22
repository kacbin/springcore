package com.cubic.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cubic.service.OrderConfig;
import com.cubic.service.OrderService;

import com.cubic.vo.DrugVO;

public class SpringTest11 {

	public static void main(String[] arg) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("SpringConfigCommon.xml","SpringConfig.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(OrderConfig.class);
		DrugVO vo = new DrugVO();
		vo.setDrugName("DRUG_78");
		OrderService os = context.getBean(OrderService.class);
		os.order(vo);

	}
}
