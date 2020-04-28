package com.gauk;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "azure")
public class MessageProperties {
	
	private Map<String,String> message; //from application.yml
	private Map<String,String> mymap;	//from Azure App Configuration
	
	public Map<String, String> getMymap() {
		return mymap;
	}

	public void setMymap(Map<String, String> mymap) {
		this.mymap = mymap;
	}

	public Map<String, String> getMessage() {
		return message;
	}

	public void setMessage(Map<String, String> message) {
		this.message = message;
	}
	

}