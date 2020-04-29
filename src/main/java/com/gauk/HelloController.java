package com.gauk;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
public class HelloController {
	
    private final MessageProperties properties;

    public HelloController(MessageProperties properties) {
        this.properties = properties;
    }
    

    @GetMapping
    public String getMessage() throws JsonParseException, JsonMappingException, IOException {
    	
    	System.out.println("MAP from AppConfiguration::: " + properties.getMymap());
    	
    	return "OK";
    	
    }
}
