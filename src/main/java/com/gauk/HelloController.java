package com.gauk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    private final MessageProperties properties;

    public HelloController(MessageProperties properties) {
        this.properties = properties;
    }

    @GetMapping
    public String getMessage() {
    	
    	//properties.getMap().forEach((key, value) -> System.out.println(key + " " + value));
    	
    	System.out.println("MAP from AppConfiguration::: " + properties.getMymap());
    	System.out.println("MAP from application.yml::: " + properties.getMessage());
    	
    	return "OK";
    	
    }
}
