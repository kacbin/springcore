package com.cubic.spring;

import com.cubic.vo.DrugVO;

public abstract class AbstractService {

	private String manufacturer;
	private DrugVO defaultDrug;
	
	private NotifyService notifyService;

	public DrugVO getDefaultDrug() {
		return defaultDrug;
	}

	public void setDefaultDrug(DrugVO defaultDrug) {
		this.defaultDrug = defaultDrug;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public NotifyService getNotifyService() {
		return notifyService;
	}

	public void setNotifyService(NotifyService notifyService) {
		this.notifyService = notifyService;
	}
}
