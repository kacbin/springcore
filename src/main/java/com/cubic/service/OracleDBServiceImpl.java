package com.cubic.service;


import org.springframework.stereotype.Component;

import com.cubic.vo.DrugVO;

@Component
public class OracleDBServiceImpl implements DBService {



	public void save(DrugVO vo) {
		vo.setDrugId("AppDBid: " + System.currentTimeMillis());

	}

}
