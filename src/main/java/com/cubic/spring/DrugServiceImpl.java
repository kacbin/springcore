package com.cubic.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import com.cubic.vo.DrugVO;
import com.cubic.vo.Manufacturers;

public class DrugServiceImpl extends AbstractService implements DrugService {

	private List<String> drugContents;
	private Set<Manufacturers> manufacturers;
	private Map<String, String> contentDetatils;

	public DrugVO findDrugById(String drugName) {
		DrugVO vo = new DrugVO();
		vo.setDrugName(drugName);
		vo.setDrugId(UUID.randomUUID().toString());
		return vo;
	}

	public DrugVO orderOnline(DrugVO vo) {
		vo.setDrugId(UUID.randomUUID().toString());
		this.getNotifyService().notifyService();
		return vo;
	}

	public List<DrugVO> search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public DrugVO getDummyDrug() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getDrugContents() {
		return drugContents;
	}

	public void setDrugContents(List<String> drugContents) {
		this.drugContents = drugContents;
	}

	public Set<Manufacturers> getManufacturers() {
		return manufacturers;
	}

	public void setManufacturers(Set<Manufacturers> manufacturers) {
		this.manufacturers = manufacturers;
	}

	public Map<String, String> getContentDetatils() {
		return contentDetatils;
	}

	public void setContentDetatils(Map<String, String> contentDetatils) {
		this.contentDetatils = contentDetatils;
	}

}
