package com.cubic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubic.vo.DrugVO;
@Service
public class OrderServiceImpl implements OrderService{
	
@Autowired
private DBService dbService;
	public void order(DrugVO vo) {
	dbService.save(vo);
	System.out.println(vo);
		
	}

	
}
