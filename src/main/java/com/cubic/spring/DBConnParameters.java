package com.cubic.spring;

public class DBConnParameters {

	private String url;
	private String userName;
	private String password;
	private String appName;
	private String appDesc;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
		return "DBConnParameters [url=" + url + ", userName=" + userName + ", password=" + password + ", appName="
				+ appName + ", appDesc=" + appDesc + "]";
	}
	
}
