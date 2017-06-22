package com.cubic.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration

public class AppDBProperties {

@Value("${app.name}")
	private String appName;
@Value("${app.desc}")
	private String appDesc;
	
	
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppDesc() {
		return appDesc;
	}
	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}
	@Override
	public String toString() {
		return "AppDBProperties [appName=" + appName + ", appDesc=" + appDesc + "]";
	}
	
	
}
