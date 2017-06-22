package com.cubic.spring;

import java.util.List;

import com.cubic.vo.DrugVO;

public interface DrugService {
DrugVO findDrugById(final String name);
DrugVO orderOnline(final DrugVO vo);

List<DrugVO> search(final String name);

DrugVO getDummyDrug();
}
