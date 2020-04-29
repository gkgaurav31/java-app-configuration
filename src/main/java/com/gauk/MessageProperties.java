package com.gauk;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@ConfigurationProperties(prefix = "azure")
public class MessageProperties  {     

	private Map<String, String> mymap;     
	private String myStringMap; //	/application/azure.myStringMap is set to::: {"[keypart1/keypart2]":"value1","[keypart3/keypart4]":"value2"}

	public Map<String, String> getMymap() {         
		return mymap;     
	}

	public void setMymap(Map<String, String> mymap) {	         
		this.mymap = mymap;     
	}

	public void setMyStringMap(String myStringMap) throws JsonParseException, JsonMappingException, IOException { 
		this.mymap = new ObjectMapper().readValue(myStringMap, HashMap.class); 
	}          

	public String getMyStringMap() {         
		return myStringMap;     
	}     
	
}
