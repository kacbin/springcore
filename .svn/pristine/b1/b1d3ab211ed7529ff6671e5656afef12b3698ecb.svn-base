package com.cubic.vo;

import java.util.UUID;

public class DrugVO {

	private String drugId;
	private String drugName;
	private String drugDesc;
	private String manufacturer;

	private Long count;

	public DrugVO() {

	}

	public DrugVO(String drugId, String drugName) {
		super();
		this.drugId = drugId;
		this.drugName = drugName;
	}
	

	public DrugVO(String drugName, Long count) {
		super();
		this.drugName = drugName;
		this.count = count;
	}

	public void callme() {
		System.out.println("Inside callme method..");
		this.setManufacturer("GLAXOSMITH");
		this.setDrugId(UUID.randomUUID().toString());
		this.setDrugName("Dummy Drug");
	}

	public String getDrugId() {
		return drugId;
	}

	public void setDrugId(String drugId) {
		this.drugId = drugId;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getDrugDesc() {
		return drugDesc;
	}

	public void setDrugDesc(String drugDesc) {
		this.drugDesc = drugDesc;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "DrugVO [drugId=" + drugId + ", drugName=" + drugName + ", drugDesc=" + drugDesc + ", manufacturer="
				+ manufacturer + ", count=" + count + "]";
	}

	public void closeme() {
		System.out.println("Closing all..");
	}
}
