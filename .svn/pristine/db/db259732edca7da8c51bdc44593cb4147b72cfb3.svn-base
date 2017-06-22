package com.cubic.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cubic.vo.DrugVO;

public class SpringTest {

	public static void main(String[] arg){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SampleSpring.xml");
		DrugVO vo = (DrugVO)context.getBean("drugVO");
		System.out.println(vo);
	    context.close();
	}
}
